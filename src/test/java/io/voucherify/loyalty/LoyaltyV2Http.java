package io.voucherify.loyalty;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.voucherify.Utils;
import io.voucherify.client.ApiClient;
import io.voucherify.client.auth.ApiKeyAuth;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Authenticated HTTP helper for Loyalty v2 admin paths that are not published in the Java SDK.
 */
public final class LoyaltyV2Http {
    private static final Gson GSON = new Gson();
    private static final HttpClient HTTP =
            HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(30)).build();

    private LoyaltyV2Http() {}

    public static JsonElement request(String method, String path, JsonObject body, Map<String, ?> query)
            throws LoyaltyV2HttpException {
        String url = buildUrl(path, query);
        HttpRequest.Builder builder =
                HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .timeout(Duration.ofSeconds(120))
                        .header("Accept", "application/json")
                        .header("Content-Type", "application/json")
                        .header("X-App-Id", appId())
                        .header("X-App-Token", appToken());

        String upper = method.toUpperCase();
        if ("GET".equals(upper) || "DELETE".equals(upper)) {
            builder.method(upper, HttpRequest.BodyPublishers.noBody());
        } else {
            String json = body == null ? "{}" : GSON.toJson(body);
            builder.method(upper, HttpRequest.BodyPublishers.ofString(json));
        }

        HttpResponse<String> response;
        try {
            response = HTTP.send(builder.build(), HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new LoyaltyV2HttpException(0, "HTTP transport failed: " + e.getMessage(), null);
        }

        JsonElement data = parseBody(response.body());
        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            String excerpt =
                    data == null
                            ? String.valueOf(response.body()).substring(0, Math.min(500, response.body().length()))
                            : data.toString().substring(0, Math.min(500, data.toString().length()));
            throw new LoyaltyV2HttpException(response.statusCode(), upper + " " + path + ": " + excerpt, data);
        }
        return data == null ? JsonNull.INSTANCE : data;
    }

    public static JsonElement createProgram(JsonObject body) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/programs", body, null);
    }

    public static JsonElement activateProgram(String programId) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/programs/" + programId + "/activate", null, null);
    }

    public static JsonElement deactivateProgram(String programId) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/programs/" + programId + "/deactivate", null, null);
    }

    public static JsonElement deleteProgram(String programId) throws LoyaltyV2HttpException {
        return request("DELETE", "/v2/loyalties/programs/" + programId, null, null);
    }

    public static JsonElement createCardDefinition(JsonObject body) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/card-definitions", body, null);
    }

    public static JsonElement activateCardDefinition(String cardDefinitionId) throws LoyaltyV2HttpException {
        return request(
                "POST", "/v2/loyalties/card-definitions/" + cardDefinitionId + "/activate", null, null);
    }

    public static JsonElement deleteCardDefinition(String cardDefinitionId) throws LoyaltyV2HttpException {
        return request("DELETE", "/v2/loyalties/card-definitions/" + cardDefinitionId, null, null);
    }

    public static JsonElement createEarningRule(JsonObject body) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/earning-rules", body, null);
    }

    public static JsonElement activateEarningRule(String earningRuleId) throws LoyaltyV2HttpException {
        return request(
                "POST", "/v2/loyalties/earning-rules/" + earningRuleId + "/activate", null, null);
    }

    public static JsonElement deactivateEarningRule(String earningRuleId) throws LoyaltyV2HttpException {
        return request(
                "POST", "/v2/loyalties/earning-rules/" + earningRuleId + "/deactivate", null, null);
    }

    public static JsonElement deleteEarningRule(String earningRuleId) throws LoyaltyV2HttpException {
        return request("DELETE", "/v2/loyalties/earning-rules/" + earningRuleId, null, null);
    }

    public static JsonElement createReward(JsonObject body) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/rewards", body, null);
    }

    public static JsonElement activateReward(String rewardId) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/rewards/" + rewardId + "/activate", null, null);
    }

    public static JsonElement deactivateReward(String rewardId) throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/rewards/" + rewardId + "/deactivate", null, null);
    }

    public static JsonElement deleteReward(String rewardId) throws LoyaltyV2HttpException {
        return request("DELETE", "/v2/loyalties/rewards/" + rewardId, null, null);
    }

    public static JsonElement batchAssignCardDefinitions(String programId, JsonObject body)
            throws LoyaltyV2HttpException {
        return request(
                "POST", "/v2/loyalties/programs/" + programId + "/card-definitions/batch", body, null);
    }

    public static JsonElement batchAssignEarningRules(String programId, JsonObject body)
            throws LoyaltyV2HttpException {
        return request(
                "POST", "/v2/loyalties/programs/" + programId + "/earning-rules/batch", body, null);
    }

    public static JsonElement batchAssignRewards(String programId, JsonObject body)
            throws LoyaltyV2HttpException {
        return request("POST", "/v2/loyalties/programs/" + programId + "/rewards/batch", body, null);
    }

    public static String id(JsonElement element) {
        if (element != null && element.isJsonObject()) {
            JsonElement id = element.getAsJsonObject().get("id");
            if (id != null && !id.isJsonNull()) {
                return id.getAsString();
            }
        }
        return null;
    }

    public static boolean hasCredentials() {
        try {
            return appId() != null && !appId().isEmpty() && appToken() != null && !appToken().isEmpty();
        } catch (RuntimeException e) {
            return false;
        }
    }

    private static String appId() {
        ApiKeyAuth auth = (ApiKeyAuth) client().getAuthentication("X-App-Id");
        return auth.getApiKey();
    }

    private static String appToken() {
        ApiKeyAuth auth = (ApiKeyAuth) client().getAuthentication("X-App-Token");
        return auth.getApiKey();
    }

    private static ApiClient client() {
        return Utils.getClient();
    }

    private static String buildUrl(String path, Map<String, ?> query) {
        String base = client().getBasePath();
        if (base == null || base.isEmpty()) {
            base = "https://api.voucherify.io";
        }
        base = base.replaceAll("/+$", "").replaceAll("(?i)/v1$", "");
        String normalizedPath = path.startsWith("/") ? path : "/" + path;
        String url = base + normalizedPath;
        if (query == null || query.isEmpty()) {
            return url;
        }
        StringJoiner joiner = new StringJoiner("&");
        for (Map.Entry<String, ?> entry : query.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            joiner.add(
                    encode(entry.getKey()) + "=" + encode(String.valueOf(entry.getValue())));
        }
        return url + "?" + joiner;
    }

    private static String encode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static JsonElement parseBody(String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        return JsonParser.parseString(text);
    }
}

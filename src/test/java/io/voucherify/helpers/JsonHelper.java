package io.voucherify.helpers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonHelper {
    private static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    public static String readJsonFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public static String validateSnapshotPayloads(String filePath, List<String> keysToRemove) throws IOException {
        String jsonPayload = readJsonFile(filePath);
        JsonNode rootNode = objectMapper.readTree(jsonPayload);
        removeKeys(rootNode, keysToRemove);
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
    }

    public static <T> String validateClassPayloads(T payload, List<String> keysToRemove) throws IOException {
        String jsonPayload = objectMapper.writeValueAsString(payload);
        JsonNode rootNode = objectMapper.readTree(jsonPayload);
        removeKeys(rootNode, keysToRemove);
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
    }

    private static void removeKeys(JsonNode node, List<String> keysToRemove) {
        if (node.isObject()) {
            ObjectNode objectNode = (ObjectNode) node;
            for (String key : keysToRemove) {
                if (objectNode.has(key)) {
                    objectNode.remove(key);
                }
            }
            for (Iterator<Map.Entry<String, JsonNode>> it = objectNode.fields(); it.hasNext();) {
                Map.Entry<String, JsonNode> entry = it.next();
                removeKeys(entry.getValue(), keysToRemove);
            }
        } else if (node.isArray()) {
            ArrayNode arrayNode = (ArrayNode) node;
            for (JsonNode arrayItem : arrayNode) {
                removeKeys(arrayItem, keysToRemove);
            }
        }
    }

    public static <T> String returnJsonResponse(T response) throws IOException {
        return objectMapper.writeValueAsString(response);
    }

    public static <T> void logPureResponseBody(T response) throws IOException {
        System.out.println(returnJsonResponse(response));
    }

}

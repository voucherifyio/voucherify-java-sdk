package io.voucherify.helpers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeepMatch {

    private static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    private static final String DATE_PATTERN = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z";

    private static boolean isDate(String value) {
        return value != null && value.matches(DATE_PATTERN);
    }

    private static boolean valuesMatch(JsonNode snapshot, JsonNode response, List<String> path, List<String> errors) {
        String snapshotValue = snapshot.asText();
        String responseValue = response.asText();

        // Special handling for dates
        if (isDate(snapshotValue) && isDate(responseValue)) {
            return true; // Both are dates, no need to compare values
        }

        // For non-date values, they must be exactly equal
        if (!snapshotValue.equals(responseValue)) {
            errors.add("Mismatch at field: " + String.join("->", path) +
                     ". Snapshot value: " + snapshotValue +
                     ", response value: " + responseValue);
            return false;
        }
        return true;
    }

    public static boolean deepMatch(JsonNode snapshot, JsonNode response, List<String> path, List<String> errors) {
        if (snapshot == null) {
            return true;
        }

        if (response == null) {
            errors.add("Response is null but snapshot is not at: " + String.join("->", path));
            return false;
        }

        if (snapshot.isObject() && response.isObject()) {
            // Check all fields in snapshot exist in response
            Iterator<String> fieldNames = snapshot.fieldNames();
            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                List<String> currentPath = new ArrayList<>(path);
                currentPath.add(fieldName);

                if (!response.has(fieldName)) {
                    errors.add("Missing key in response: " + String.join("->", currentPath));
                    return false;
                }

                JsonNode snapshotField = snapshot.get(fieldName);
                JsonNode responseField = response.get(fieldName);

                if (!deepMatch(snapshotField, responseField, currentPath, errors)) {
                    return false;
                }
            }
            // Don't check for extra fields in response
            return true;

        } else if (snapshot.isArray() && response.isArray()) {
            if (snapshot.size() != response.size()) {
                errors.add("Array length mismatch at field: " + String.join("->", path) +
                          ". Snapshot size: " + snapshot.size() +
                          ", response size: " + response.size());
                return false;
            }
            for (int i = 0; i < snapshot.size(); i++) {
                List<String> currentPath = new ArrayList<>(path);
                currentPath.add("[" + i + "]");
                if (!deepMatch(snapshot.get(i), response.get(i), currentPath, errors)) {
                    return false;
                }
            }
            return true;

        } else if (snapshot.isValueNode() && response.isValueNode()) {
            return valuesMatch(snapshot, response, path, errors);

        } else if (snapshot.getNodeType() != response.getNodeType()) {
            errors.add("Type mismatch at field: " + String.join("->", path) +
                      ". Snapshot type: " + snapshot.getNodeType() +
                      ", response type: " + response.getNodeType());
            return false;
        }

        return true;
    }

    public static <T> boolean validateDeepMatch(String snapshotPath, T responseObject, List<String> keysToRemove)
            throws Exception {
        List<String> errors = new ArrayList<>();

        JsonNode snapshot = readSnapshot(snapshotPath, keysToRemove);
        JsonNode response = objectMapper.valueToTree(responseObject);

        if (deepMatch(snapshot, response, new ArrayList<>(), errors)) {
            return true;
        } else {
            errors.forEach(System.out::println);

            System.out.println("=== SNAPSHOT ===");
            System.out.println(snapshot.toPrettyString());
            System.out.println("=== RESPONSE ===");
            System.out.println(response.toPrettyString());
            System.out.println("================");
            return false;
        }
    }

    public static JsonNode readSnapshot(String snapshotPath, List<String> keysToRemove) throws Exception {
        String jsonPayload = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(snapshotPath)));
        JsonNode snapshot = objectMapper.readTree(jsonPayload);
        removeKeys(snapshot, keysToRemove);
        return snapshot;
    }

    private static void removeKeys(JsonNode node, List<String> keysToRemove) {
        if (node.isObject()) {
            List<String> keysToRemoveInThisPass = new ArrayList<>();
            Iterator<String> fieldNames = node.fieldNames();
            while (fieldNames.hasNext()) {
                String key = fieldNames.next();
                if (keysToRemove.contains(key)) {
                    keysToRemoveInThisPass.add(key);
                } else {
                    removeKeys(node.get(key), keysToRemove);
                }
            }

            for (String keyToRemove : keysToRemoveInThisPass) {
                ((ObjectNode) node).remove(keyToRemove);
            }
        } else if (node.isArray()) {
            for (JsonNode arrayItem : node) {
                removeKeys(arrayItem, keysToRemove);
            }
        }
    }

}

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

    public static boolean deepMatch(JsonNode snapshot, JsonNode response, List<String> path, List<String> errors) {
        if (snapshot.isObject() && response.isObject()) {
            Iterator<String> fieldNames = snapshot.fieldNames();
            while (fieldNames.hasNext()) {
                String fieldName = fieldNames.next();
                List<String> currentPath = new ArrayList<>(path);
                currentPath.add(fieldName);

                if (!response.has(fieldName)) {
                    errors.add("Missing key in response: " + String.join("->", currentPath));
                    return false;
                }
                if (!deepMatch(snapshot.get(fieldName), response.get(fieldName), currentPath, errors)) {
                    return false;
                }
            }
            return true;
        } else if (snapshot.isArray() && response.isArray()) {
            if (snapshot.size() != response.size()) {
                errors.add("Array length mismatch at field: " + String.join("->", path));
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
        } else {
            if (snapshot.isNumber() && response.isNumber()) {
                if (snapshot.asDouble() != response.asDouble()) {
                    errors.add("Mismatch at field: " + String.join("->", path) + ". Snapshot value: "
                            + snapshot.asText() + ", response value: " + response.asText());
                    return false;
                }
            }
            else if (!snapshot.equals(response)) {
                String snapshotValue = snapshot.isValueNode() ? snapshot.asText() : snapshot.toString();
                String responseValue = response.isValueNode() ? response.asText() : response.toString();
                errors.add("Mismatch at field: " + String.join("->", path) + ". Snapshot value: "
                        + snapshotValue + ", response value: " + responseValue);
                return false;
            }
            return true;
        }
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

package io.voucherify;

import io.voucherify.client.ApiClient;
import io.voucherify.client.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
    public static String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static ApiClient getClient() {
        Properties properties = new Properties();
        String dir = System.getProperty("user.dir");
        try (InputStream input = new FileInputStream(dir + "/.env")) {
            properties.load(input);
        } catch (IOException ex) {
            System.out.println("[INFO] No .env file found, using environment variables");
        }

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        String basePath = normalizeBasePath(getConfigValue("VOUCHERIFY_HOST", properties));
        if (basePath != null && !basePath.isEmpty()) {
            defaultClient.setBasePath(basePath);
        }
        defaultClient.setAuthentication("X-App-Id", getConfigValue("X_APP_ID", properties));
        defaultClient.setAuthentication("X-App-Token", getConfigValue("X_APP_TOKEN", properties));
        defaultClient.setAuthentication("X-Management-Id", getConfigValue("X_MANAGEMENT_ID", properties));
        defaultClient.setAuthentication("X-Management-Token", getConfigValue("X_MANAGEMENT_TOKEN", properties));

        return defaultClient;
    }

    private static String normalizeBasePath(String basePath) {
        if (basePath == null) {
            return null;
        }
        return basePath.replaceAll("/+$", "");
    }

    private static String getConfigValue(String key, Properties properties) {
        String envValue = System.getenv(key);
        if (envValue != null && !envValue.isEmpty()) {
            return envValue;
        }

        return properties.getProperty(key);
    }
}

package io.voucherify;

import io.voucherify.client.ApiClient;
import io.voucherify.client.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
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

        try {
            String dir = System.getProperty("user.dir");
            InputStream input = Files.newInputStream(Paths.get(dir + "/.env"));
            properties.load(input);
        } catch (IOException ex) {
            System.out.println("[INFO] Missing .env file");
        }

        String voucherifyHost = Optional
                .ofNullable(System.getenv("VOUCHERIFY_HOST"))
                .orElse(properties.getProperty("VOUCHERIFY_HOST"));

        String xAppId = Optional
                .ofNullable(System.getenv("X_APP_ID"))
                .orElse(properties.getProperty("X_APP_ID"));

        String xAppToken = Optional
                .ofNullable(System.getenv("X_APP_TOKEN"))
                .orElse(properties.getProperty("X_APP_TOKEN"));

        String xManagementId = Optional
                .ofNullable(System.getenv("X_MANAGEMENT_ID"))
                .orElse(properties.getProperty("X_MANAGEMENT_ID"));

        String xManagementToken = Optional
                .ofNullable(System.getenv("X_MANAGEMENT_TOKEN"))
                .orElse(properties.getProperty("X_MANAGEMENT_TOKEN"));

        System.out.println("[INFO] Using HOST " + voucherifyHost);

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(voucherifyHost);
        defaultClient.setAuthentication("X-App-Id", xAppId);
        defaultClient.setAuthentication("X-App-Token", xAppToken);
        defaultClient.setAuthentication("X-Management-Id", xManagementId);
        defaultClient.setAuthentication("X-Management-Token", xManagementToken);

        return defaultClient;
    }
}
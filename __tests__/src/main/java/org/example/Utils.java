package org.example;

import voucherify.client.ApiClient;
import voucherify.client.Configuration;
import voucherify.client.auth.ApiKeyAuth;

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
            int index
                = (int) (AlphaNumericString.length()
                * Math.random());

            sb.append(AlphaNumericString
                .charAt(index));
        }

        return sb.toString();
    }

    public static ApiClient getClient() {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            String dir = System.getProperty("user.dir");
            input = new FileInputStream(dir + "/../.env");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(properties.getProperty("VOUCHERIFY_HOST"));

        ApiKeyAuth id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
        id.setApiKey(properties.getProperty("X_APP_ID"));

        ApiKeyAuth token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
        token.setApiKey(properties.getProperty("X_APP_TOKEN"));

        return defaultClient;
    }
}

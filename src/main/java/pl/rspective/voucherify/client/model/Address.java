package pl.rspective.voucherify.client.model;

import java.util.Map;

public class Address {

    private Map<String, String> values;

    private Address() {}

    private Address(Map<String, String> values) {
        this.values = values;
    }

    public String getCity() {
        return values.get("city");
    }

    public String getCountry() {
        return values.get("country");
    }

    public String getLine1() {
        return values.get("line_1");
    }

    public String getLine2() {
        return values.get("line_2");
    }

    public String getPostalCode() {
        return values.get("postal_code");
    }

    public String getState() {
        return values.get("state");
    }

}

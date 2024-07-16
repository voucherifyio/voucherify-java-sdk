package io.voucherify.data;

import java.util.ArrayList;

public class Campaign {
    private String id;
    private String name;
    private final ArrayList<String> voucherIds = new ArrayList<>();

    private final ArrayList<String> validationRuleIds = new ArrayList<>();

    Campaign() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getVoucherIds() {
        return voucherIds;
    }

    public void addVoucherId(String voucherId) {
        voucherIds.add(voucherId);
    }

    public ArrayList<String> getValidationRuleIds() {
        return validationRuleIds;
    }

    public void addValidationRuleId(String validationRuleId) {
        validationRuleIds.add(validationRuleId);
    }
}

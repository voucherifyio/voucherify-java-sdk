package io.voucherify.data;

public class Management {
    private String id;
    private String name;
    private String userId;
    private String metadataSchemaId;
    private String customEventId;
    private String brandId;

    public void setProjectId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return id;
    }

    public void setProjectName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return name;
    }

    public void setProjectUserId(String userId) {
        this.userId = userId;
    }

    public String getProjectUserId() {
        return userId;
    }

    public void setMetadataSchemaId(String metadataSchemaId) {
        this.metadataSchemaId = metadataSchemaId;
    }

    public String getMetadataSchemaId() {
        return metadataSchemaId;
    }

    public void setCustomEventSchemaId(String customEventId) {
        this.customEventId = customEventId;
    }

    public String getCustomEventSchemaId() {
        return customEventId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getbrandId() {
        return brandId;
    }
}
package io.voucherify.data;

public class Product {
    String id;
    String sourceId;
    String name;


    public Product() {
    }

    public Product(String id, String sourceId, String name) {
        this.id = id;
        this.sourceId = sourceId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getName() {
        return name;
    }
}

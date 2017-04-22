package pl.rspective.voucherify.client.model.order;

import com.google.gson.annotations.SerializedName;

class OrderItem {

    @SerializedName("product_id")
    private String productId;

    @SerializedName("sku_id")
    private String skuId;

    private Integer quantity;

    private OrderItem() {
    }

    private OrderItem(String productId, String skuId, Integer quantity) {
        this.productId = productId;
        this.skuId = skuId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getSkuId() {
        return skuId;
    }

    public Integer getQuantity() {
        return quantity;
    }
}

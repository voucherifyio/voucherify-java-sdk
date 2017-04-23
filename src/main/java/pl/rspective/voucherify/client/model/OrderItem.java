package pl.rspective.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

@Deprecated
public class OrderItem {

    @JsonProperty("product_id")
    private String productId;
    
    @JsonProperty("sku_id")
    private String skuId;
    
    private Integer quantity;
    
    public OrderItem() {
    }
    
    public OrderItem(String productId, String skuId, Integer quantity) {
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

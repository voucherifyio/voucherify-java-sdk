package pl.rspective.voucherify.client.model.order;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class OrderItem {

  @SerializedName("product_id")
  private String productId;

  @SerializedName("sku_id")
  private String skuId;

  private Integer quantity;

}

package pl.rspective.voucherify.client.model.publish;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class PublishEntry {

  @SerializedName("cusomer_id")
  private String customerId;

  private String customer;

  private String channel;

  @SerializedName("published_at")
  private Date publishedAt;

  private Map<String, Object> metadata;

}

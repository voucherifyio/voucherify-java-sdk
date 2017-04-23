package pl.rspective.voucherify.client.model.publish;

import com.fasterxml.jackson.annotation.JsonProperty;
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

  @JsonProperty("cusomer_id")
  private String customerId;

  private String customer;

  private String channel;

  @JsonProperty("published_at")
  private Date publishedAt;

  private Map<String, Object> metadata;

}

package pl.rspective.voucherify.client.model.customer.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import pl.rspective.voucherify.client.model.customer.Address;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class CustomerResponse {

  private String id;

  @JsonProperty("source_id")
  private String sourceId;

  private String name;

  private String email;

  private String description;

  private Address address;

  private String phone;

  private String birthday;

  private CustomerSummary summary;

  private CustomerLoyalty loyalty;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @JsonProperty("system_metadata")
  private Map<String, Object> systemMetadata;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;

  @JsonProperty("email_unsubscribed")
  private Boolean emailUnsubscribed;

  private String object;

}

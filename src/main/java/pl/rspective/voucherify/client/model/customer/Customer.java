package pl.rspective.voucherify.client.model.customer;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.Address;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class Customer {

  private String id;

  @SerializedName("source_id")
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

  @SerializedName("system_metadata")
  private Map<String, Object> systemMetadata;

  @SerializedName("created_at")
  private Date createdAt;

  @SerializedName("updated_at")
  private Date updatedAt;

  @SerializedName("email_unsubscribed")
  private Boolean emailUnsubscribed;

  private String object;

}

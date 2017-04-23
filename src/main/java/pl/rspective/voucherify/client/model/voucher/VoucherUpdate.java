package pl.rspective.voucherify.client.model.voucher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import pl.rspective.voucherify.client.model.Gift;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
public class VoucherUpdate {

  private String category;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private boolean active;

  @JsonProperty("additional_info")
  private String additionalInfo;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  private Gift gift;

}

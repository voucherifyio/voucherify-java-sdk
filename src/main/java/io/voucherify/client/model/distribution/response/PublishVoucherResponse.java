package io.voucherify.client.model.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.voucher.Discount;
import io.voucherify.client.model.voucher.Gift;
import io.voucherify.client.model.voucher.VoucherType;
import io.voucherify.client.model.voucher.response.VoucherPublishResponse;
import io.voucherify.client.model.voucher.response.VoucherRedemptionResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class PublishVoucherResponse {

  private String code;

  private String campaign;

  private String category;

  private VoucherType type;

  private Discount discount;

  private Gift gift;

  @JsonProperty("start_date")
  private Date startDate;

  @JsonProperty("expiration_date")
  private Date expirationDate;

  private VoucherPublishResponse publish;

  private VoucherRedemptionResponse redemption;

  private Boolean active;

  @JsonProperty("additional_info")
  private String additionalInfo;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;

  @Singular("asset")
  private Map<String, Object> assets;

  @JsonProperty("is_referral_code")
  private Boolean isReferralCode;

  @JsonProperty("referrer_id")
  private String referrerId;

  @JsonProperty("updated_at")
  private Date updatedAt;

  private String id;

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("customer_id")
  private String customerId;

  @JsonProperty("tracking_id")
  private String trackingId;

  private VoucherResponse voucher;
}

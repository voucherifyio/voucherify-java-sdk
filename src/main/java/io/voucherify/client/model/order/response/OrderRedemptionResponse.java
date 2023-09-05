package io.voucherify.client.model.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class OrderRedemptionResponse {
  private Date date;

  @JsonProperty("related_object_type")
  private String relatedObjectType;

  @JsonProperty("related_object_id")
  private String relatedObjectId;

  private List<String> stacked;

  //ROLLBACKS

  @JsonProperty("rollback_id")
  private String rollbackId;

  @JsonProperty("rollback_date")
  private Date rollbackDate;

  @JsonProperty("rollback_stacked")
  private List<String> rollbackStacked;
}

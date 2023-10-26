package io.voucherify.client.model.loyalties.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ActivityResponse {
  private String id;

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  private String type;

  private Object data;
}

package io.voucherify.client.model.bulk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@ToString
public class BulkAsyncResponse {

  @JsonProperty("async_action_id")
  private String asyncActionId;

}

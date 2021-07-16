package io.voucherify.client.model.async_actions;

import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class AsyncActionsResponse {

  private List<AsyncActionResponse> asyncActions;

  public static AsyncActionsResponse of(List<AsyncActionResponse> asyncActions) {
    return new AsyncActionsResponse(asyncActions);
  }

}

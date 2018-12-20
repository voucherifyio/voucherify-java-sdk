package io.voucherify.client.model.promotion;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Tier {

  private String name;

  private String banner;

  private Map<String, Object> action;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}

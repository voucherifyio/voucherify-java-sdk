package io.voucherify.client.model.segment;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Segment {

  private String name;

  private SegmentType type;

  @Singular("customer")
  private List<String> customers;

  @Singular("filterEntry")
  private Map<String, Object> filter;

  @Singular("metadataEntry")
  private Map<String, Object> metadata;
}

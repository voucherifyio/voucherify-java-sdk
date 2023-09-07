package io.voucherify.client.model.qualifications;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.voucherify.client.model.qualifications.filters.Filter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Builder
@ToString
public class Option {

  private List<Expand> expand;

  private Long limit;

  @JsonProperty("starting_after")
  private Date startingAfter;

  @JsonProperty("filters")
  private Filter filter;
}

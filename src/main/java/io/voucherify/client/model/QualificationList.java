package io.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class QualificationList<T> {

  private String id;

  @JsonProperty("created_at")
  private Date createdAt;

  private String object;

  @JsonProperty("data_ref")
  private String dataRef;

  private Long total;

  @JsonProperty("has_more")
  private Boolean hasMore;

  private List<T> data;
}

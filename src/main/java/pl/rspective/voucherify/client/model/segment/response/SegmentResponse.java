package pl.rspective.voucherify.client.model.segment.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class SegmentResponse {

  private String id;

  private String name;

  @JsonProperty("created_at")
  private Date createdA;

  private Map<String, Object> metadata;

  private Map<String, Object> filter;

  private List<String> customers;

  private String type;

  private String object;
}

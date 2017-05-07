package io.voucherify.client.model.distribution.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class ExportResponse {

  private String id;

  private String object;

  @JsonProperty("created_at")
  private Date createdAt;

  private String channel;

  private ExportStatus status;

  @JsonProperty("exported_object")
  private String exportedObject;

  private Map<String, Object> parameters;

  private Map<String, Object> result;

}


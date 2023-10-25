package io.voucherify.client.model.consents.response;

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
public class GroupsDataResponse {

  private String id;

  private String name;

  private String description;

  private List<String> consents;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("updated_at")
  private Date updatedAt;

  private String object;
}

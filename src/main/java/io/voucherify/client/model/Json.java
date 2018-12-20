package io.voucherify.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Json {

  private Map<String, Object> json = new HashMap<String, Object>();

  @JsonAnySetter
  public void addEntry(String field, Object value) {
    this.json.put(field, value);
  }

  public Object getEntry(String field) {
    return this.json.get(field);
  }

  @JsonAnyGetter
  public Map<String, Object> getMap() {
    return json;
  }

  public static Json.JsonBuilder builder() {
    return new Json.JsonBuilder();
  }

  public static class JsonBuilder {

    private Map<String, Object> json = new HashMap<String, Object>();

    public JsonBuilder() {}

    public JsonBuilder addEntry(String field, Object value) {
      this.json.put(field, value);
      return this;
    }

    public Json build() {
      return new Json(this.json);
    }
  }
}

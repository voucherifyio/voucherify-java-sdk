package io.voucherify.client.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.List;

public abstract class AbstractListSerializer<T, R> extends JsonSerializer<T> {

  @Override
  public void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
    if (value == null) {
      return;
    }
    List<R> items = getList(value);

    if (items == null) {
      return;
    }

    jgen.writeStartArray();

    for (R item : items) {
      if (item != null) {
        jgen.writeObject(item);
      }
    }

    jgen.writeEndArray();

  }

  protected abstract List<R> getList(T value);
}

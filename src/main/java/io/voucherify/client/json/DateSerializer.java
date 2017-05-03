package io.voucherify.client.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSerializer extends JsonSerializer<Date> {

  private final DateFormat df;

  public DateSerializer(String dateFormat) {
    df = new SimpleDateFormat(dateFormat);
  }

  @Override
  public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
    if (value != null) {
      gen.writeString(df.format(value));
    }
  }
}

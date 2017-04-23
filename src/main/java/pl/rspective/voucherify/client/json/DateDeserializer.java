package pl.rspective.voucherify.client.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateDeserializer extends JsonDeserializer<Date> {

  private final List<DateFormat> dateFormats = new ArrayList<>();

  public DateDeserializer(String... dateFormats) {
    for (String df : dateFormats) {
      this.dateFormats.add(new SimpleDateFormat(df));
    }
  }

  @Override
  public Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
    if (jsonParser != null) {
      return parseDate(jsonParser.getText());
    }
    return null;
  }

  private Date parseDate(String str) {
    for (DateFormat df : dateFormats) {
      try {
        return df.parse(str);
      } catch (ParseException e) {
        // ignore and check next
      }
    }
    throw new IllegalArgumentException("Invalid date format: " + str);
  }

}

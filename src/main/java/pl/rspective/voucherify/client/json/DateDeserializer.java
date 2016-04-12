package pl.rspective.voucherify.client.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateDeserializer implements JsonDeserializer<Date> {
    
    private final List<DateFormat> dateFormats = new ArrayList<>();
    
    public DateDeserializer(String ... dateFormats) {
        for (String df : dateFormats) {
            this.dateFormats.add(new SimpleDateFormat(df));
        }
    }

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (json != null) {
            return parseDate(json.getAsString());
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

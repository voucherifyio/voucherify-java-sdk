package pl.rspective.voucherify.client.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSerializer implements JsonSerializer<Date> {

    private final DateFormat df;
    
    public DateSerializer(String dateFormat) {
        df = new SimpleDateFormat(dateFormat);
    }
    
    @Override
    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
        if (src != null) {
            return new JsonPrimitive(df.format(src));
        }
        return null;
    }

}

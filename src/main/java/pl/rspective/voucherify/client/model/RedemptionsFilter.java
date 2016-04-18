package pl.rspective.voucherify.client.model;

import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.rspective.voucherify.client.Constants;

public class RedemptionsFilter extends AbstractMap<String, Object> {

    private final Integer limit;
    private final Date startDate;
    private final Date endDate;
    private final List<RedemptionResult> results;
    private final String customerId;
    
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(Constants.ENDPOINT_DATE_FORMAT);
    
    private RedemptionsFilter(Integer limit, Date startDate, Date endDate, List<RedemptionResult> results, String customerId) {
        this.limit = limit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.results = results;
        this.customerId = customerId;
    }
    
    public static RedemptionsFilter filter() {
        return new RedemptionsFilter(null, null, null, null, null);
    }
    
    public RedemptionsFilter withLimit(Integer limit) {
        return new RedemptionsFilter(limit, startDate, endDate, results, customerId);
    }
    
    public RedemptionsFilter withStartDate(Date startDate) {
        return new RedemptionsFilter(limit, startDate, endDate, results, customerId);
    }
    
    public RedemptionsFilter withEndDate(Date endDate) {
        return new RedemptionsFilter(limit, startDate, endDate, results, customerId);
    }
    
    public RedemptionsFilter withResult(RedemptionResult ... results) {
        return new RedemptionsFilter(limit, startDate, endDate, Arrays.asList(results), customerId);
    }
    
    public RedemptionsFilter withCustomerId(String customerId) {
        return new RedemptionsFilter(limit, startDate, endDate, results, customerId);
    }
    
    private String formatDate(Date date) {
        if (date != null) {
            return DATE_FORMATTER.format(date);
        } else {
            return null;
        }
    }
    
    private static Map.Entry<String, Object> newEntry(String key, Object value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }
    
    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> entries = new HashSet<>();
        entries.add(newEntry("limit", limit));
        entries.add(newEntry("start_date", formatDate(startDate)));
        entries.add(newEntry("end_date", formatDate(endDate)));
        if (results != null) {
            for (RedemptionResult result: results) {
                entries.add(newEntry("result", result));
            }
        }
        entries.add(newEntry("customer_id", customerId));
        return Collections.unmodifiableSet(entries);
    }

    
}

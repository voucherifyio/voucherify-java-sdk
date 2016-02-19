package pl.rspective.voucherify.client.model;

import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pl.rspective.voucherify.client.Constants;

public class RedemptionsFilter extends AbstractMap<String, Object> {

    private final Integer limit;
    private final Date startDate;
    private final Date endDate;
    private final RedemptionResult result;
    
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(Constants.ENDPOINT_DATE_FORMAT);
    
    private RedemptionsFilter(Integer limit, Date startDate, Date endDate, RedemptionResult result) {
        this.limit = limit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.result = result;
    }
    
    public static RedemptionsFilter filter() {
        return new RedemptionsFilter(null, null, null, null);
    }
    
    public RedemptionsFilter withLimit(Integer limit) {
        return new RedemptionsFilter(limit, startDate, endDate, result);
    }
    
    public RedemptionsFilter withStartDate(Date startDate) {
        return new RedemptionsFilter(limit, startDate, endDate, result);
    }
    
    public RedemptionsFilter withEndDate(Date endDate) {
        return new RedemptionsFilter(limit, startDate, endDate, result);
    }
    
    public RedemptionsFilter withResult(RedemptionResult result) {
        return new RedemptionsFilter(limit, startDate, endDate, result);
    }
    
    private String formatDate(Date date) {
        if (date != null) {
            return DATE_FORMATTER.format(date);
        } else {
            return null;
        }
    }
    
    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        Map<String, Object> map = new HashMap<>();
        map.put("limit", limit);
        map.put("start_date", formatDate(startDate));
        map.put("end_date", formatDate(endDate));
        map.put("result", result);
        return Collections.unmodifiableSet(map.entrySet());
    }

    
}

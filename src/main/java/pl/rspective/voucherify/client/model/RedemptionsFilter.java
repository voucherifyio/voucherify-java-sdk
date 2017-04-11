package pl.rspective.voucherify.client.model;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RedemptionsFilter extends AbstractMap<String, Object> {

    private final Integer limit;
    private final Integer page;
    private final RedemptionResult result;
    private final String customer;
    private final String campaign;
    
    private RedemptionsFilter(Integer limit, Integer page, RedemptionResult result, String customer, String campaign) {
        this.limit = limit;
        this.page = page;
        this.result = result;
        this.customer = customer;
        this.campaign = campaign;
    }
    
    public static RedemptionsFilter filter() {
        return new RedemptionsFilter(null, null, null, null, null);
    }
    
    public RedemptionsFilter withLimit(Integer limit) {
        return new RedemptionsFilter(limit, page, result, customer, campaign);
    }
    
    public RedemptionsFilter withPage(Integer page) {
        return new RedemptionsFilter(limit, page, result, customer, campaign);
    }

    public RedemptionsFilter withResult(RedemptionResult result) {
        return new RedemptionsFilter(limit, page, result, customer, campaign);
    }

    public RedemptionsFilter withCustomer(String customer) {
        return new RedemptionsFilter(limit, page, result, customer, campaign);
    }
    
    public RedemptionsFilter withCampaign(String campaign) {
        return new RedemptionsFilter(limit, page, result, customer, campaign);
    }
        
    private static Map.Entry<String, Object> newEntry(String key, Object value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }
    
    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> entries = new HashSet<>();
        entries.add(newEntry("limit", limit));
        entries.add(newEntry("page", page));
        entries.add(newEntry("result", result));
        entries.add(newEntry("customer", customer));
        entries.add(newEntry("campaign", campaign));
        return Collections.unmodifiableSet(entries);
    }

    
}

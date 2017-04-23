package pl.rspective.voucherify.client.model;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Class represent voucher list filter request
 */

@Deprecated
public class VouchersFilter extends AbstractMap<String, Object> {

    private final Integer limit;
    private final String codeQuery;
    private final Integer page;
    private final Integer skip;
    private final String campaign;
    private final String category;
    private final String customer;

    private VouchersFilter(Integer limit, String codeQuery, Integer page, Integer skip, String campaign, String category, String customer) {
        this.limit = limit;
        this.codeQuery = codeQuery;
        this.page = page;
        this.skip = skip;
        this.campaign = campaign;
        this.category = category;
        this.customer = customer;
    }

    public static VouchersFilter filter() {
        return new VouchersFilter(null, null, null, null, null, null, null);
    }

    public VouchersFilter withLimit(Integer limit) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    public VouchersFilter withCodeQuery(String codeQuery) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    public VouchersFilter withPage(Integer page) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    public VouchersFilter withSkip(Integer skip) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    public VouchersFilter withCampaign(String campaign) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    public VouchersFilter withCategory(String category) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }
    
    public VouchersFilter withCustomer(String customer) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category, customer);
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> entries = new HashSet<>();
        entries.add(newEntry("limit", limit));
        entries.add(newEntry("code_query", codeQuery));
        entries.add(newEntry("page", page));
        entries.add(newEntry("skip", skip));
        entries.add(newEntry("campaign", campaign));
        entries.add(newEntry("category", category));
        entries.add(newEntry("customer", customer));

        return Collections.unmodifiableSet(entries);
    }

    private Map.Entry<String, Object> newEntry(String key, Object value) {
        return new AbstractMap.SimpleEntry<String, Object>(key, value);
    }
}

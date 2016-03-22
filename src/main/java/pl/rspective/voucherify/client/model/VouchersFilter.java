package pl.rspective.voucherify.client.model;

import java.util.*;

/**
 * Class represent voucher list filter request
 */
public class VouchersFilter extends AbstractMap<String, Object> {

    private final Integer limit;
    private final String codeQuery;
    private final Integer page;
    private final Integer skip;
    private final String campaign;
    private final String category;

    private VouchersFilter(Integer limit, String codeQuery, Integer page, Integer skip, String campaign, String category) {
        this.limit = limit;
        this.codeQuery = codeQuery;
        this.page = page;
        this.skip = skip;
        this.campaign = campaign;
        this.category = category;
    }

    public static VouchersFilter filter() {
        return new VouchersFilter(null, null, null, null, null, null);
    }

    public VouchersFilter withLimit(Integer limit) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    public VouchersFilter withCodeQuery(String codeQuery) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    public VouchersFilter withPage(Integer page) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    public VouchersFilter withSkip(Integer skip) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    public VouchersFilter withCampaign(String campaign) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    public VouchersFilter withCategory(String category) {
        return new VouchersFilter(limit, codeQuery, page, skip, campaign, category);
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, Object>> entries = new HashSet();
        entries.add(newEntry("limit", limit));
        entries.add(newEntry("code_query", codeQuery));
        entries.add(newEntry("page", page));
        entries.add(newEntry("skip", skip));
        entries.add(newEntry("campaign", campaign));
        entries.add(newEntry("category", category));

        return Collections.unmodifiableSet(entries);
    }

    private Map.Entry<String, Object> newEntry(String key, Object value) {
        return new AbstractMap.SimpleEntry<String, Object>(key, value);
    }
}

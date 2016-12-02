package pl.rspective.voucherify.client.model;

import java.util.Map;

public class PublishParams {

    private final String campaign;
    private final String voucher;
    private final Customer customer;
    private final String channel;
    private final Map<String, Object> metadata;

    private PublishParams(
            String campaign,
            String voucher,
            Customer customer,
            String channel,
            Map<String, Object> metadata) {
        this.campaign = campaign;
        this.voucher = voucher;
        this.customer = customer;
        this.channel = channel;
        this.metadata = metadata;
    }

    public static PublishParams campaign(
            String campaign,
            Customer customer,
            String channel,
            Map<String, Object> metadata) {
        return new PublishParams(campaign, null, customer, channel, metadata);
    }

    public static PublishParams voucher(
            String voucher,
            Customer customer,
            String channel,
            Map<String, Object> metadata) {
        return new PublishParams(null, voucher, customer, channel, metadata);
    }
    
    public String getCampaign() {
        return campaign;
    }

    public String getVoucher() {
        return voucher;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public String getChannel() {
        return channel;
    }
    
    public Map<String, Object> getMetadata() {
        return metadata;
    }
}

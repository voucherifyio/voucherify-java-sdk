package pl.rspective.voucherify.client.model;

import java.util.Collections;
import java.util.List;

public class VoucherPublish {

    private int count;
    private List<PublishEntry> entries;
    
    public VoucherPublish() {
        this.count = 0;
        this.entries = Collections.emptyList();
    }
    
    public int getCount() {
        return count;
    }
    
    public List<PublishEntry> getEntries() {
        return entries;
    }

}

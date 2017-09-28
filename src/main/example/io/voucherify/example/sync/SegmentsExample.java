package io.voucherify.example.sync;


import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.model.Operator;
import io.voucherify.client.model.segment.Segment;
import io.voucherify.client.model.segment.SegmentType;
import io.voucherify.client.model.segment.response.SegmentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SegmentsExample extends AbsExample {

  public SegmentsExample(VoucherifyClient client) {
    super(client);
  }

  public void example() {
    Map<String, Object> filter = new HashMap<String, Object>();
    Map<Operator, List<String>> condition = new HashMap<Operator, List<String>>();
    List<String> list = new ArrayList<String>();
    list.add("Tom");
    condition.put(Operator.$contains, list);
    filter.put("conditions", condition);

    Segment segment = Segment.builder()
        .type(SegmentType.AUTO_UPDATE)
        .filterEntry("name", filter)
        .build();

    SegmentResponse result = client.segments().create(segment);

    client.segments().get(result.getId());

    client.segments().delete(result.getId());
  }
}

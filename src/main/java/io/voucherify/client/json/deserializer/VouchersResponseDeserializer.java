package io.voucherify.client.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.voucherify.client.ApiVersion;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;

import java.io.IOException;
import java.util.Arrays;

public class VouchersResponseDeserializer extends JsonDeserializer<VouchersResponse> {

  private ApiVersion apiVersion;

  public VouchersResponseDeserializer(ApiVersion apiVersion) {
    this.apiVersion = apiVersion;
  }

  @Override
  public VouchersResponse deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
    if (apiVersion == null) {
      return getDefaultVouchersResponse(jp);
    }

    switch (apiVersion) {
      case V_2017_04_05:
      case V_2017_04_20:
      case V_2018_08_01:
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode root = mapper.readTree(jp);
        JsonNode object = root.get("object");
        JsonNode total = root.get("total");
        JsonNode dataRef = root.get("data_ref");
        JsonNode vouchersNode = root.get("vouchers");
        VoucherResponse[] voucherResponses = mapper.convertValue(vouchersNode, VoucherResponse[].class);

        return VouchersResponse.of(object.asText(), total.asInt(0), dataRef.asText(), Arrays.asList(voucherResponses));
      default:
        return getDefaultVouchersResponse(jp);
    }
  }

  private VouchersResponse getDefaultVouchersResponse(JsonParser jp) throws IOException {
    VoucherResponse[] array = jp.readValueAs(VoucherResponse[].class);
    return VouchersResponse.of(Arrays.asList(array));
  }

}

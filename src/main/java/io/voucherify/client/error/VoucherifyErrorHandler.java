package io.voucherify.client.error;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.Response;

import java.io.IOException;

public class VoucherifyErrorHandler {

  private ObjectMapper mapper = createMapper();

  private ObjectMapper createMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    return mapper;
  }

  public VoucherifyError from(Response response) {
    try {
      if (response.body() != null) {
        return VoucherifyError.from(mapper.readValue(response.body().string(), WrappedError.class));
      }
      return VoucherifyError.from("Error", 500, "Unknown error", "unknown-error");
    } catch (IOException e) {
      return VoucherifyError.from(
          "SDK Error", 500, "Error while parsing error from API", "sdk-parsing-error");
    }
  }

  public VoucherifyError from(Throwable throwable) {
    return VoucherifyError.from(convertValue(throwable, WrappedError.class));
  }

  private <T> T convertValue(Object body, Class<T> clazz) {
    return mapper.convertValue(body, clazz);
  }
}

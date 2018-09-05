package io.voucherify.client.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.voucherify.client.Constants;
import io.voucherify.client.error.VoucherifyError;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Date;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DateSerializerTest {

  @Rule public ExpectedException expectedException = ExpectedException.none();

  @Mock private JsonGenerator jsonGenerator;

  @Mock private SerializerProvider serializers;

  @Test
  public void shouldThrowExceptionWhenNoDateFormatWasProvided() {
    // then
    expectedException.expect(VoucherifyError.class);
    expectedException.expectMessage("Invalid date format: null");

    // when
    new DateSerializer(null);
  }

  @Test
  public void shouldThrowExceptionWhenInvalidDateFormatWasProvided() {
    // then
    expectedException.expect(VoucherifyError.class);
    expectedException.expectMessage("Invalid date format: invalid date format");

    // when
    new DateSerializer("invalid date format");
  }

  @Test
  public void shouldSerializeDateIfPresent() throws IOException {
    // given
    DateSerializer serializer = new DateSerializer(Constants.ENDPOINT_DATE_FORMAT);
    Date date = new Date();

    // when
    serializer.serialize(date, jsonGenerator, serializers);

    // then
    verify(jsonGenerator).writeString(ArgumentMatchers.anyString());
  }

  @Test
  public void shouldNotSerializeDateIfNotPresent() throws IOException {
    // given
    DateSerializer serializer = new DateSerializer(Constants.ENDPOINT_DATE_FORMAT);

    // when
    serializer.serialize(null, jsonGenerator, serializers);

    // then
    verify(jsonGenerator, never()).writeString(ArgumentMatchers.anyString());
  }
}

package io.voucherify.client.json.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import io.voucherify.client.Constants;
import io.voucherify.client.error.VoucherifyError;
import io.voucherify.client.json.deserializer.DateDeserializer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class DateDeserializerTest {

  private DateDeserializer dateDeserializer = new DateDeserializer();

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Mock
  private JsonParser jsonParser;

  @Mock
  private DeserializationContext deserializationContext;

  @Test
  public void shouldThrowExceptionWhenNoDateFormatsWereProvided() throws IOException {
    // given
    given(jsonParser.getText()).willReturn("2017-01-01T00:00:00-01:00");

    // then
    expectedException.expect(VoucherifyError.class);
    expectedException.expectMessage("No date format provided");

    // when
    dateDeserializer.deserialize(jsonParser, deserializationContext);
  }

  @Test
  public void shouldThrowExceptionDateFormatIsInvalid() throws IOException {
    // given
    DateDeserializer deserializer = new DateDeserializer(Constants.ENDPOINT_DATE_FORMAT);
    given(jsonParser.getText()).willReturn("invalid date");

    // then
    expectedException.expect(VoucherifyError.class);
    expectedException.expectMessage("Invalid date format: invalid date");

    // when
    deserializer.deserialize(jsonParser, deserializationContext);
  }

  @Test
  public void shouldReturnNullIfNoJsonParserIsPresent() throws IOException {
    // when
    Date response = dateDeserializer.deserialize(null, deserializationContext);

    // then
    assertThat(response).isNull();
  }

  @Test
  public void shouldDeserializeDate() throws IOException {
    // given
    given(jsonParser.getText()).willReturn("2017-01-01T00:00:00-00:00");
    DateDeserializer deserializer = new DateDeserializer(Constants.ENDPOINT_DATE_FORMAT);

    // when
    Date response = deserializer.deserialize(jsonParser, deserializationContext);

    // then
    assertThat(response).isNotNull();
  }

}

package io.voucherify;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.voucherify.client.ApiClient;
import io.voucherify.client.model.*;
import io.voucherify.client.ApiException;
import io.voucherify.client.api.EventsApi;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import io.voucherify.client.model.EventsCreateRequestBody;
import io.voucherify.client.model.EventsCreateResponseBody;

import io.voucherify.helpers.JsonHelper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Order(12)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EventsTest {
    public static ApiClient defaultClient = null;
    public static EventsApi events = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        events = new EventsApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createAndTrackCustomEventTest() {
        String snapshotPath = "src/test/java/io/voucherify/snapshots/Events/CreatedCustomEvent.snapshot.json";

        EventsCreateRequestBody event = new EventsCreateRequestBody();
        Customer customer = new Customer();

        customer.setSourceId("test-customer");
        event.setEvent("test-event");
        event.setCustomer(customer);
        event.setMetadata(null);
        event.setReferral(null);
        event.setLoyalty(null);

        try {
            EventsCreateResponseBody responseBody = events.trackCustomEvent(event);

            List<String> keysToRemove = Arrays.asList("id", "sourceId");

            String filteredSnapshot = JsonHelper.validateSnapshotPayloads(snapshotPath,
                    keysToRemove);
            String filteredResponse = JsonHelper.validateClassPayloads(responseBody,
                    keysToRemove);

            JSONAssert.assertEquals(filteredSnapshot, filteredResponse, true);
        } catch (ApiException | IOException | JSONException e) {
            System.out.println(e);
            fail();
        }
    }
}

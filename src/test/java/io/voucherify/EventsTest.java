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

import io.voucherify.helpers.JsonHelper;

import java.util.Arrays;
import java.util.List;

@org.junit.jupiter.api.Order(12)
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
    @org.junit.jupiter.api.Order(1)
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
            JsonHelper.checkStrictAssertEquals(snapshotPath, responseBody, keysToRemove);
        } catch (ApiException e) {
            System.out.println(e);
            fail();
        }
    }
}

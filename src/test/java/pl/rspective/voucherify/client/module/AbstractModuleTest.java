package pl.rspective.voucherify.client.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.mockwebserver.MockResponse;
import com.squareup.okhttp.mockwebserver.MockWebServer;
import com.squareup.okhttp.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import pl.rspective.voucherify.client.VoucherifyClient;
import pl.rspective.voucherify.client.callback.VoucherifyCallback;

import java.io.IOException;
import java.util.concurrent.Callable;

public class AbstractModuleTest {

  private static MockWebServer server;
  static VoucherifyClient client;
  ObjectMapper mapper = new ObjectMapper();
  private boolean[] callbackFired = new boolean[]{false};

  @BeforeClass
  public static void onSetup() throws IOException {
    server = new MockWebServer();
    server.play();
    client = new VoucherifyClient.Builder()
            .setAppToken("some token")
            .setAppId("some app id")
            .withoutSSL()
            .setEndpoint(server.getUrl("/").toString().replaceFirst("http://", ""))
            .build();
  }

  void enqueueRequest(Object body) throws JsonProcessingException {
    server.enqueue(new MockResponse().setBody(mapper.writeValueAsString(body)).setResponseCode(200));
  }

  void enqueueRequest(String body) throws JsonProcessingException {
    server.enqueue(new MockResponse().setBody(body).setResponseCode(200));
  }

  RecordedRequest getRequest() {
    try {
      return server.takeRequest();
    } catch (InterruptedException e) {
      return null;
    }
  }

  VoucherifyCallback createCallback() {
    return new VoucherifyCallback<Object>() {
      @Override
      public void onSuccess(Object result) {
        callbackFired[0] = true;
      }
    };
  }

  Callable<Boolean> wasCallbackFired() {
    return new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        return callbackFired[0];
      }
    };
  }

  @After
  public void afterEach() {
    callbackFired[0] = false;
  }

  @AfterClass
  public static void onTeardown() throws IOException {
    server.shutdown();
  }

}

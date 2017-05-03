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
import retrofit.RestAdapter;

import java.io.IOException;
import java.util.concurrent.Callable;

public class AbstractModuleTest {

  ObjectMapper mapper = new ObjectMapper();
  static VoucherifyClient client;
  private static MockWebServer server;
  private boolean[] callbackFired = new boolean[]{false};

  @BeforeClass
  public static void onSetup() throws IOException {
    server = new MockWebServer();
    server.play();
    client = new VoucherifyClient.Builder()
            .setAppToken("some token")
            .setAppId("some app id")
            .withoutSSL()
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setEndpoint(server.getUrl("/").toString().replaceFirst("http://", ""))
            .build();
  }

  void enqueueResponse(Object body) {
    try {
      server.enqueue(new MockResponse().setBody(mapper.writeValueAsString(body)).setResponseCode(200));
    } catch (JsonProcessingException e) {
      // ignore
    }
  }

  void enqueueResponse(String body) {
    server.enqueue(new MockResponse().setBody(body).setResponseCode(200));
  }

  void enqueueEmptyResponse() {
    server.enqueue(new MockResponse().setResponseCode(204));
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

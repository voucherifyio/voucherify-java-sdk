package io.voucherify.client.module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.voucherify.client.LogLevel;
import io.voucherify.client.VoucherifyClient;
import io.voucherify.client.callback.VoucherifyCallback;
import io.voucherify.client.error.VoucherifyError;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.concurrent.Callable;

public class AbstractModuleTest {

  protected static VoucherifyClient client;
  private static MockWebServer server;
  protected ObjectMapper mapper = new ObjectMapper();
  private boolean[] callbackFired = new boolean[] {false};

  @BeforeClass
  public static void onSetup() throws IOException {
    server = new MockWebServer();
    server.start();

    client =
        new VoucherifyClient.Builder()
            .setClientSecretKey("some token")
            .setAppId("some app id")
            .setLogLevel(LogLevel.BODY)
            .withoutSSL()
            .setEndpoint(server.url("/").toString().replaceFirst("http://", ""))
            .build();
  }

  @AfterClass
  public static void onTeardown() throws IOException {
    server.shutdown();
  }

  protected void enqueueResponse(Object body) {
    try {
      server.enqueue(
          new MockResponse().setBody(mapper.writeValueAsString(body)).setResponseCode(200));
    } catch (JsonProcessingException ignore) {
    }
  }

  protected void enqueueResponse(String body) {
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

      @Override
      public void onFailure(VoucherifyError error) {
        System.out.println(error);
      }
    };
  }

  Callable<Boolean> wasCallbackFired() {
    return () -> callbackFired[0];
  }

  @After
  public void afterEach() {
    callbackFired[0] = false;
  }
}

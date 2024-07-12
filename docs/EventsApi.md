# EventsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trackCustomEvent**](EventsApi.md#trackCustomEvent) | **POST** /v1/events | Track Custom Event |


<a id="trackCustomEvent"></a>
# **trackCustomEvent**
> EventsCreateResponseBody trackCustomEvent(eventsCreateRequestBody)

Track Custom Event

To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    EventsCreateRequestBody eventsCreateRequestBody = new EventsCreateRequestBody(); // EventsCreateRequestBody | Specify the details of the custom event.
    try {
      EventsCreateResponseBody result = apiInstance.trackCustomEvent(eventsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#trackCustomEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  |
|------------- | ------------- | ------------- |
| **eventsCreateRequestBody** | [**EventsCreateRequestBody**](EventsCreateRequestBody.md)| Specify the details of the custom event. |

### Return type

[**EventsCreateResponseBody**](EventsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the event type if the event was received by the application. |  -  |


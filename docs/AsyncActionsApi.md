# AsyncActionsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAsyncAction**](AsyncActionsApi.md#getAsyncAction) | **GET** /v1/async-actions/{asyncActionId} | Get Async Action |
| [**listAsyncActions**](AsyncActionsApi.md#listAsyncActions) | **GET** /v1/async-actions | List Async Actions |


<a id="getAsyncAction"></a>
# **getAsyncAction**
> AsyncActionGetResponseBody getAsyncAction(asyncActionId)

Get Async Action

Check the result of a scheduled asynchronous operation.   The table below lists the possible types of async actions. The types are different for each endpoint generating the async action. If you would like to learn more about importing data into Voucherify, read more [here](https://support.voucherify.io/article/574-data-import).       

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.AsyncActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    AsyncActionsApi apiInstance = new AsyncActionsApi(defaultClient);
    String asyncActionId = "asyncActionId_example"; // String | Unique ID of the asynchronous operation.
    try {
      AsyncActionGetResponseBody result = apiInstance.getAsyncAction(asyncActionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsyncActionsApi#getAsyncAction");
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
| **asyncActionId** | **String**| Unique ID of the asynchronous operation. |

### Return type

[**AsyncActionGetResponseBody**](AsyncActionGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns detailed information about the async action result. |  -  |

<a id="listAsyncActions"></a>
# **listAsyncActions**
> AsyncActionsListResponseBody listAsyncActions(limit, endDate)

List Async Actions

Track asynchronous operations scheduled in your project.   The table below lists the possible types of async actions. The types are different for each endpoint generating the async action. If you would like to learn more about importing data into Voucherify, read more [here](https://support.voucherify.io/article/574-data-import).       

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.AsyncActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    AsyncActionsApi apiInstance = new AsyncActionsApi(defaultClient);
    Integer limit = 56; // Integer | Limit the number of asynchronous actions that the API returns in the response.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Limits results to actions scheduled before the end_date. The date format needs to be consistent with ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). 
    try {
      AsyncActionsListResponseBody result = apiInstance.listAsyncActions(limit, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsyncActionsApi#listAsyncActions");
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
| **limit** | **Integer**| Limit the number of asynchronous actions that the API returns in the response. |
| **endDate** | **OffsetDateTime**| Limits results to actions scheduled before the end_date. The date format needs to be consistent with ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16).  |

### Return type

[**AsyncActionsListResponseBody**](AsyncActionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of all scheduled asynchronous actions and detailed information for each scheduled action. Note that a status &#x60;DONE&#x60;doesn&#39;t include the result of the completed action. If you need more information about the result, use the ID of the respective async action to call the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |


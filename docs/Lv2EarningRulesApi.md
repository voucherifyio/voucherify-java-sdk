# Lv2EarningRulesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEarningRule**](Lv2EarningRulesApi.md#getEarningRule) | **GET** /v2/loyalties/earning-rules/{earningRuleId} | Get earning rule |


<a id="getEarningRule"></a>
# **getEarningRule**
> V2LoyaltiesEarningRulesGetResponseBody getEarningRule(earningRuleId)

Get earning rule

Returns a single earning rule by its ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2EarningRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2EarningRulesApi apiInstance = new Lv2EarningRulesApi(defaultClient);
    String earningRuleId = "earningRuleId_example"; // String | Earning rule ID.
    try {
      V2LoyaltiesEarningRulesGetResponseBody result = apiInstance.getEarningRule(earningRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2EarningRulesApi#getEarningRule");
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
| **earningRuleId** | **String**| Earning rule ID. |

### Return type

[**V2LoyaltiesEarningRulesGetResponseBody**](V2LoyaltiesEarningRulesGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Earning rule |  -  |


# Lv2BenefitsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBenefit**](Lv2BenefitsApi.md#getBenefit) | **GET** /v2/loyalties/benefits/{benefitId} | Get benefit |


<a id="getBenefit"></a>
# **getBenefit**
> V2LoyaltiesBenefitsGetResponseBody getBenefit(benefitId)

Get benefit

Returns a single benefit by its ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2BenefitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2BenefitsApi apiInstance = new Lv2BenefitsApi(defaultClient);
    String benefitId = "benefitId_example"; // String | Unique benefit ID, prefixed with lben_.
    try {
      V2LoyaltiesBenefitsGetResponseBody result = apiInstance.getBenefit(benefitId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2BenefitsApi#getBenefit");
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
| **benefitId** | **String**| Unique benefit ID, prefixed with lben_. |

### Return type

[**V2LoyaltiesBenefitsGetResponseBody**](V2LoyaltiesBenefitsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The benefit |  -  |


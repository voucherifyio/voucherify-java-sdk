# ValidationsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**validateStackedDiscounts**](ValidationsApi.md#validateStackedDiscounts) | **POST** /v1/validations | Validate Stackable Discounts |


<a id="validateStackedDiscounts"></a>
# **validateStackedDiscounts**
> ValidationsValidateResponseBody validateStackedDiscounts(validationsValidateRequestBody)

Validate Stackable Discounts

Verify redeemables provided in the request. This method is designed for server side integration which means that it is accessible only through private keys.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ValidationsApi apiInstance = new ValidationsApi(defaultClient);
    ValidationsValidateRequestBody validationsValidateRequestBody = new ValidationsValidateRequestBody(); // ValidationsValidateRequestBody | 
    try {
      ValidationsValidateResponseBody result = apiInstance.validateStackedDiscounts(validationsValidateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationsApi#validateStackedDiscounts");
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
| **validationsValidateRequestBody** | [**ValidationsValidateRequestBody**](ValidationsValidateRequestBody.md)|  |

### Return type

[**ValidationsValidateResponseBody**](ValidationsValidateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid validation. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |


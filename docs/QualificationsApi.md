# QualificationsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkEligibility**](QualificationsApi.md#checkEligibility) | **POST** /v1/qualifications | Check Eligibility |


<a id="checkEligibility"></a>
# **checkEligibility**
> QualificationsCheckEligibilityResponseBody checkEligibility(qualificationsCheckEligibilityRequestBody)

Check Eligibility

&lt;!-- theme: warning --&gt; &gt; 🚧 The Qualifications endpoint ignores the rules checking: &gt;  &gt; - Limit of total redeemed discount amount per campaign &gt; - Limit of total redemptions count per campaign &gt; - Redemptions per customer &gt; - Redemptions per customer in a campaign   Generate a list of redeemables that are applicable in the context of the customer and order.  The new qualifications method is an improved version of [Campaign Qualifications](ref:examine-campaigns-qualification), [Voucher Qualifications](ref:examine-vouchers-qualification), and [Promotions Validation](ref:validate-promotions) API requests. The new qualification method introduces the following improvements:  - Qualification results are returned faster - No limit on the number of returned redeemables - Introduces new qualification scenarios, not available in the previous version  &gt; 👍 Scenario Guide &gt; &gt; Read [the dedicated guide](doc:checking-eligibility) to learn about some use cases this endpoint can cover.  ## Paging   The Voucherify Qualifications API request will return to you all of the redeemables available for the customer in batches of up to 50 redeemables. To get the next batch of redeemables, you need to use the &#x60;starting_after&#x60; cursor.  To process of paging the redeemables works in the following manner:  - You send the first API request for Qualifications without the &#x60;starting_after&#x60; parameter. - The response will contain a parameter named &#x60;has_more&#x60;. If the parameter&#39;s value is set to &#x60;true&#x60;, then more redeemables are available. - Get the value of the &#x60;created_at&#x60; parameter of the last returned redeemable. The value of this parameter will be used as a cursor to retrieve the next page of redeemables. - Send another API request for Qualification with the &#x60;starting_after&#x60; parameter set to the value taken from the &#x60;created_at&#x60; parameter from the last returned redeemable. - Voucherify will return the next page of redeemables. - If the &#x60;has_more&#x60; parameter is set to &#x60;true&#x60;, apply steps 3-5 to get the next page of redeemables.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.QualificationsApi;

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

    QualificationsApi apiInstance = new QualificationsApi(defaultClient);
    QualificationsCheckEligibilityRequestBody qualificationsCheckEligibilityRequestBody = new QualificationsCheckEligibilityRequestBody(); // QualificationsCheckEligibilityRequestBody | Define order and customer context.
    try {
      QualificationsCheckEligibilityResponseBody result = apiInstance.checkEligibility(qualificationsCheckEligibilityRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QualificationsApi#checkEligibility");
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
| **qualificationsCheckEligibilityRequestBody** | [**QualificationsCheckEligibilityRequestBody**](QualificationsCheckEligibilityRequestBody.md)| Define order and customer context. |

### Return type

[**QualificationsCheckEligibilityResponseBody**](QualificationsCheckEligibilityResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a qualifications object. |  -  |


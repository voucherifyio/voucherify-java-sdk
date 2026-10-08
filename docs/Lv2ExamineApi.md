# Lv2ExamineApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**examineEarningRules**](Lv2ExamineApi.md#examineEarningRules) | **POST** /v2/loyalties/examine/earning-rules | Examine earning rules |
| [**examineRewards**](Lv2ExamineApi.md#examineRewards) | **POST** /v2/loyalties/examine/rewards | Examine rewards |


<a id="examineEarningRules"></a>
# **examineEarningRules**
> LoyaltiesExamineEarningRulesExamineResponseBody examineEarningRules(loyaltiesExamineEarningRulesExamineRequestBody)

Examine earning rules

Estimates earning opportunities for a customer without triggering any actual earning for loyalty v2 earning rules. The trigger selects whether all trigger events or one specific event is examined. When a specific event is selected, exactly one matching context object is required: customer_order_paid for customer.order.paid, customer_segment_entered for customer.segment.entered, and customer_custom_event for customer.custom_event. The other context objects must not be present. This endpoint can examine earning rules for all loyalty programs the customer belongs to by using customer_identification with customer_id or customer_source_id. To examine earning rules only for one program, use member_id in customer_identification, as member_id is loyalty program-specific. A customer who exists but has no active membership returns 200 with an empty memberships array.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ExamineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ExamineApi apiInstance = new Lv2ExamineApi(defaultClient);
    LoyaltiesExamineEarningRulesExamineRequestBody loyaltiesExamineEarningRulesExamineRequestBody = new LoyaltiesExamineEarningRulesExamineRequestBody(); // LoyaltiesExamineEarningRulesExamineRequestBody | 
    try {
      LoyaltiesExamineEarningRulesExamineResponseBody result = apiInstance.examineEarningRules(loyaltiesExamineEarningRulesExamineRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ExamineApi#examineEarningRules");
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
| **loyaltiesExamineEarningRulesExamineRequestBody** | [**LoyaltiesExamineEarningRulesExamineRequestBody**](LoyaltiesExamineEarningRulesExamineRequestBody.md)|  |

### Return type

[**LoyaltiesExamineEarningRulesExamineResponseBody**](LoyaltiesExamineEarningRulesExamineResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Earning rules examination result. An empty &#x60;memberships&#x60; array means no active membership has earning rules for the examined trigger. |  -  |

<a id="examineRewards"></a>
# **examineRewards**
> LoyaltiesExamineRewardsExamineResponseBody examineRewards(loyaltiesExamineRewardsExamineRequestBody)

Examine rewards

Evaluates rewards assigned to a customers active Loyalty v2 program memberships. Applies temporary customer and member metadata overrides without updating stored data. Returns reward availability by card, including points costs and applicable unavailability reasons. Omits a reward when it is inactive, out of stock, has no matching cost, or the member has no card for that cost. This endpoint can examine rewards for all loyalty programs the customer belongs to by using customer_identification with customer_id or customer_source_id. To examine rewards only for one program, use member_id in customer_identification, as member_id is loyalty program-specific. A customer who exists but has no active membership returns 200 with an empty memberships array.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ExamineApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ExamineApi apiInstance = new Lv2ExamineApi(defaultClient);
    LoyaltiesExamineRewardsExamineRequestBody loyaltiesExamineRewardsExamineRequestBody = new LoyaltiesExamineRewardsExamineRequestBody(); // LoyaltiesExamineRewardsExamineRequestBody | 
    try {
      LoyaltiesExamineRewardsExamineResponseBody result = apiInstance.examineRewards(loyaltiesExamineRewardsExamineRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ExamineApi#examineRewards");
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
| **loyaltiesExamineRewardsExamineRequestBody** | [**LoyaltiesExamineRewardsExamineRequestBody**](LoyaltiesExamineRewardsExamineRequestBody.md)|  |

### Return type

[**LoyaltiesExamineRewardsExamineResponseBody**](LoyaltiesExamineRewardsExamineResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rewards examination result. An empty &#x60;memberships&#x60; array means the customer has no active membership. An empty &#x60;cards&#x60; array means no assigned reward resolved onto a card. |  -  |


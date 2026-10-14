# Lv2RewardsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReward**](Lv2RewardsApi.md#getReward) | **GET** /v2/loyalties/rewards/{rewardId} | Get reward by ID |


<a id="getReward"></a>
# **getReward**
> V2LoyaltiesRewardsGetResponseBody getReward(rewardId)

Get reward by ID

Returns a single reward by its ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2RewardsApi apiInstance = new Lv2RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | Unique reward identifier, prefixed with lrew_.
    try {
      V2LoyaltiesRewardsGetResponseBody result = apiInstance.getReward(rewardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2RewardsApi#getReward");
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
| **rewardId** | **String**| Unique reward identifier, prefixed with lrew_. |

### Return type

[**V2LoyaltiesRewardsGetResponseBody**](V2LoyaltiesRewardsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The reward. |  -  |


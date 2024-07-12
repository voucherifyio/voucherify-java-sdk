# LoyaltiesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInBulkLoyaltyTiers**](LoyaltiesApi.md#createInBulkLoyaltyTiers) | **POST** /v1/loyalties/{campaignId}/tiers | Create loyalty tiers |
| [**deleteEarningRule**](LoyaltiesApi.md#deleteEarningRule) | **DELETE** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId} | Delete Earning Rule |
| [**deleteLoyaltyProgram**](LoyaltiesApi.md#deleteLoyaltyProgram) | **DELETE** /v1/loyalties/{campaignId} | Delete Loyalty Campaign |
| [**deleteRewardAssignment1**](LoyaltiesApi.md#deleteRewardAssignment1) | **DELETE** /v1/loyalties/{campaignId}/rewards/{assignmentId} | Delete Reward Assignment |
| [**disableEarningRule**](LoyaltiesApi.md#disableEarningRule) | **POST** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/disable | Disable Earning Rule |
| [**enableEarningRule**](LoyaltiesApi.md#enableEarningRule) | **POST** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/enable | Enable Earning Rule |
| [**exportLoyaltyCardTransactions**](LoyaltiesApi.md#exportLoyaltyCardTransactions) | **POST** /v1/loyalties/members/{memberId}/transactions/export | Export Loyalty Card Transactions |
| [**exportLoyaltyCardTransactions1**](LoyaltiesApi.md#exportLoyaltyCardTransactions1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/transactions/export | Export Loyalty Card Transactions |
| [**getEarningRule**](LoyaltiesApi.md#getEarningRule) | **GET** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId} | Get Earning Rule |
| [**getLoyaltyTier**](LoyaltiesApi.md#getLoyaltyTier) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId} | Get Loyalty Tier |
| [**getRewardAssignment1**](LoyaltiesApi.md#getRewardAssignment1) | **GET** /v1/loyalties/{campaignId}/reward-assignments/{assignmentId} | Get Reward Assignment |
| [**getRewardAssignment2**](LoyaltiesApi.md#getRewardAssignment2) | **GET** /v1/loyalties/{campaignId}/rewards/{assignmentId} | Get Reward Assignment |
| [**getRewardDetails**](LoyaltiesApi.md#getRewardDetails) | **GET** /v1/loyalties/{campaignId}/reward-assignments/{assignmentId}/reward | Get Reward Details |
| [**listLoyaltyCardTransactions**](LoyaltiesApi.md#listLoyaltyCardTransactions) | **GET** /v1/loyalties/members/{memberId}/transactions | List Loyalty Card Transactions |
| [**listLoyaltyCardTransactions1**](LoyaltiesApi.md#listLoyaltyCardTransactions1) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/transactions | List Loyalty Card Transactions |
| [**listLoyaltyTierEarningRules**](LoyaltiesApi.md#listLoyaltyTierEarningRules) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/earning-rules | List Loyalty Tier Earning Rules |
| [**listLoyaltyTierRewards**](LoyaltiesApi.md#listLoyaltyTierRewards) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/rewards | List Loyalty Tier Rewards |
| [**listLoyaltyTiers**](LoyaltiesApi.md#listLoyaltyTiers) | **GET** /v1/loyalties/{campaignId}/tiers | List Loyalty Tiers |
| [**listMemberLoyaltyTier**](LoyaltiesApi.md#listMemberLoyaltyTier) | **GET** /v1/loyalties/members/{memberId}/tiers | List Member&#39;s Loyalty Tiers |
| [**listMemberRewards**](LoyaltiesApi.md#listMemberRewards) | **GET** /v1/loyalties/members/{memberId}/rewards | List Member Rewards |
| [**listPointsExpiration**](LoyaltiesApi.md#listPointsExpiration) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/points-expiration | Get Points Expiration |
| [**redeemReward**](LoyaltiesApi.md#redeemReward) | **POST** /v1/loyalties/members/{memberId}/redemption | Redeem Reward |
| [**redeemReward1**](LoyaltiesApi.md#redeemReward1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/redemption | Redeem Reward |
| [**transferPoints**](LoyaltiesApi.md#transferPoints) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/transfers | Transfer Loyalty Points |
| [**updateLoyaltyCardBalance**](LoyaltiesApi.md#updateLoyaltyCardBalance) | **POST** /v1/loyalties/members/{memberId}/balance | Add or Remove Loyalty Card Balance |
| [**updateLoyaltyCardBalance1**](LoyaltiesApi.md#updateLoyaltyCardBalance1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/balance | Add or Remove Loyalty Card Balance |


<a id="createInBulkLoyaltyTiers"></a>
# **createInBulkLoyaltyTiers**
> List&lt;LoyaltyTier&gt; createInBulkLoyaltyTiers(campaignId, loyaltiesTiersCreateInBulkRequestBodyItem)

Create loyalty tiers

Creates loyalty tiers for desired campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique loyalty campaign ID or name.
    List<LoyaltiesTiersCreateInBulkRequestBodyItem> loyaltiesTiersCreateInBulkRequestBodyItem = Arrays.asList(); // List<LoyaltiesTiersCreateInBulkRequestBodyItem> | Provide tier definitions you want to add to existing loyalty campaign.
    try {
      List<LoyaltyTier> result = apiInstance.createInBulkLoyaltyTiers(campaignId, loyaltiesTiersCreateInBulkRequestBodyItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#createInBulkLoyaltyTiers");
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
| **campaignId** | **String**| Unique loyalty campaign ID or name. |
| **loyaltiesTiersCreateInBulkRequestBodyItem** | [**List&lt;LoyaltiesTiersCreateInBulkRequestBodyItem&gt;**](LoyaltiesTiersCreateInBulkRequestBodyItem.md)| Provide tier definitions you want to add to existing loyalty campaign. |

### Return type

[**List&lt;LoyaltyTier&gt;**](LoyaltyTier.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns created loyalty tiers. |  -  |

<a id="deleteEarningRule"></a>
# **deleteEarningRule**
> deleteEarningRule(campaignId, earningRuleId)

Delete Earning Rule

This method deletes an earning rule for a specific loyalty campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String earningRuleId = "earningRuleId_example"; // String | A unique earning rule ID.
    try {
      apiInstance.deleteEarningRule(campaignId, earningRuleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#deleteEarningRule");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **earningRuleId** | **String**| A unique earning rule ID. |

### Return type

null (empty response body)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

<a id="deleteLoyaltyProgram"></a>
# **deleteLoyaltyProgram**
> LoyaltiesDeleteResponseBody deleteLoyaltyProgram(campaignId, force)

Delete Loyalty Campaign

Deletes a loyalty campaign and all related loyalty cards. This action cannot be undone. Also, it immediately removes any redemptions on loyalty cards. If the force parameter is set to false or not set at all, the loyalty campaign and all related loyalty cards will be moved to the bin.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    Boolean force = true; // Boolean | If this flag is set to true, the campaign and related vouchers will be removed permanently. If it is set to false or not set at all, the loyalty campaign and all related loyalty cards will be moved to the bin. Going forward, the user will be able to create the next campaign with the same name.
    try {
      LoyaltiesDeleteResponseBody result = apiInstance.deleteLoyaltyProgram(campaignId, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#deleteLoyaltyProgram");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **force** | **Boolean**| If this flag is set to true, the campaign and related vouchers will be removed permanently. If it is set to false or not set at all, the loyalty campaign and all related loyalty cards will be moved to the bin. Going forward, the user will be able to create the next campaign with the same name. |

### Return type

[**LoyaltiesDeleteResponseBody**](LoyaltiesDeleteResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the ID of the scheduled asynchronous action, informing you that your request has been accepted and the loyalty campaign will be deleted from the repository asynchronously. To check the deletion status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="deleteRewardAssignment1"></a>
# **deleteRewardAssignment1**
> deleteRewardAssignment1(campaignId, assignmentId)

Delete Reward Assignment

This method deletes a reward assignment for a particular loyalty campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      apiInstance.deleteRewardAssignment1(campaignId, assignmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#deleteRewardAssignment1");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **assignmentId** | **String**| A unique reward assignment ID. |

### Return type

null (empty response body)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

<a id="disableEarningRule"></a>
# **disableEarningRule**
> LoyaltiesEarningRulesDisableResponseBody disableEarningRule(campaignId, earningRuleId)

Disable Earning Rule

Disable an earning rule.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String earningRuleId = "earningRuleId_example"; // String | Unique earning rule ID.
    try {
      LoyaltiesEarningRulesDisableResponseBody result = apiInstance.disableEarningRule(campaignId, earningRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#disableEarningRule");
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
| **campaignId** | **String**| Unique campaign ID or name. |
| **earningRuleId** | **String**| Unique earning rule ID. |

### Return type

[**LoyaltiesEarningRulesDisableResponseBody**](LoyaltiesEarningRulesDisableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an earning rule object with the &#x60;active&#x60; parameter set to &#x60;false&#x60;. |  -  |

<a id="enableEarningRule"></a>
# **enableEarningRule**
> LoyaltiesEarningRulesEnableResponseBody enableEarningRule(campaignId, earningRuleId)

Enable Earning Rule

Enable an earning rule.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String earningRuleId = "earningRuleId_example"; // String | Unique earning rule ID.
    try {
      LoyaltiesEarningRulesEnableResponseBody result = apiInstance.enableEarningRule(campaignId, earningRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#enableEarningRule");
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
| **campaignId** | **String**| Unique campaign ID or name. |
| **earningRuleId** | **String**| Unique earning rule ID. |

### Return type

[**LoyaltiesEarningRulesEnableResponseBody**](LoyaltiesEarningRulesEnableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an earning rule object with the &#x60;active&#x60; parameter set to &#x60;true&#x60;. |  -  |

<a id="exportLoyaltyCardTransactions"></a>
# **exportLoyaltyCardTransactions**
> LoyaltiesMembersTransactionsExportCreateResponseBody exportLoyaltyCardTransactions(memberId, loyaltiesMembersTransactionsExportCreateRequestBody)

Export Loyalty Card Transactions

Export transactions that are associated with point movements on a loyalty card.   

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to export transaction data for.
    LoyaltiesMembersTransactionsExportCreateRequestBody loyaltiesMembersTransactionsExportCreateRequestBody = new LoyaltiesMembersTransactionsExportCreateRequestBody(); // LoyaltiesMembersTransactionsExportCreateRequestBody | Specify the parameters and filters for the transaction export.
    try {
      LoyaltiesMembersTransactionsExportCreateResponseBody result = apiInstance.exportLoyaltyCardTransactions(memberId, loyaltiesMembersTransactionsExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#exportLoyaltyCardTransactions");
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
| **memberId** | **String**| A unique code identifying the loyalty card that you are looking to export transaction data for. |
| **loyaltiesMembersTransactionsExportCreateRequestBody** | [**LoyaltiesMembersTransactionsExportCreateRequestBody**](LoyaltiesMembersTransactionsExportCreateRequestBody.md)| Specify the parameters and filters for the transaction export. |

### Return type

[**LoyaltiesMembersTransactionsExportCreateResponseBody**](LoyaltiesMembersTransactionsExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an export object. |  -  |

<a id="exportLoyaltyCardTransactions1"></a>
# **exportLoyaltyCardTransactions1**
> LoyaltiesMembersTransactionsExportCreateResponseBody exportLoyaltyCardTransactions1(campaignId, memberId, loyaltiesMembersTransactionsExportCreateRequestBody)

Export Loyalty Card Transactions

Export transactions that are associated with point movements on a loyalty card.   

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique identifier of the loyalty campaign containing the voucher whose transactions you would like to export.
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to export transaction data for.
    LoyaltiesMembersTransactionsExportCreateRequestBody loyaltiesMembersTransactionsExportCreateRequestBody = new LoyaltiesMembersTransactionsExportCreateRequestBody(); // LoyaltiesMembersTransactionsExportCreateRequestBody | Specify the parameters and filters for the transaction export.
    try {
      LoyaltiesMembersTransactionsExportCreateResponseBody result = apiInstance.exportLoyaltyCardTransactions1(campaignId, memberId, loyaltiesMembersTransactionsExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#exportLoyaltyCardTransactions1");
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
| **campaignId** | **String**| A unique identifier of the loyalty campaign containing the voucher whose transactions you would like to export. |
| **memberId** | **String**| A unique code identifying the loyalty card that you are looking to export transaction data for. |
| **loyaltiesMembersTransactionsExportCreateRequestBody** | [**LoyaltiesMembersTransactionsExportCreateRequestBody**](LoyaltiesMembersTransactionsExportCreateRequestBody.md)| Specify the parameters and filters for the transaction export. |

### Return type

[**LoyaltiesMembersTransactionsExportCreateResponseBody**](LoyaltiesMembersTransactionsExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an export object. |  -  |

<a id="getEarningRule"></a>
# **getEarningRule**
> LoyaltiesEarningRulesGetResponseBody getEarningRule(campaignId, earningRuleId)

Get Earning Rule

Retrieves an earning rule assigned to a campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String earningRuleId = "earningRuleId_example"; // String | A unique earning rule ID.
    try {
      LoyaltiesEarningRulesGetResponseBody result = apiInstance.getEarningRule(campaignId, earningRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getEarningRule");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **earningRuleId** | **String**| A unique earning rule ID. |

### Return type

[**LoyaltiesEarningRulesGetResponseBody**](LoyaltiesEarningRulesGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an earning rule object with the earning rule details. |  -  |

<a id="getLoyaltyTier"></a>
# **getLoyaltyTier**
> LoyaltiesTiersGetResponseBody getLoyaltyTier(campaignId, loyaltyTierId)

Get Loyalty Tier

Retrieve a loyalty tier from a loyalty campaign by the loyalty tier ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique loyalty campaign ID or name.
    String loyaltyTierId = "loyaltyTierId_example"; // String | Unique loyalty tier ID.
    try {
      LoyaltiesTiersGetResponseBody result = apiInstance.getLoyaltyTier(campaignId, loyaltyTierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getLoyaltyTier");
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
| **campaignId** | **String**| Unique loyalty campaign ID or name. |
| **loyaltyTierId** | **String**| Unique loyalty tier ID. |

### Return type

[**LoyaltiesTiersGetResponseBody**](LoyaltiesTiersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a loyalty tier object. |  -  |

<a id="getRewardAssignment1"></a>
# **getRewardAssignment1**
> LoyaltiesRewardAssignmentsGetResponseBody getRewardAssignment1(campaignId, assignmentId)

Get Reward Assignment

Retrieve specific reward assignment.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String assignmentId = "assignmentId_example"; // String | Unique reward assignment ID.
    try {
      LoyaltiesRewardAssignmentsGetResponseBody result = apiInstance.getRewardAssignment1(campaignId, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getRewardAssignment1");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **assignmentId** | **String**| Unique reward assignment ID. |

### Return type

[**LoyaltiesRewardAssignmentsGetResponseBody**](LoyaltiesRewardAssignmentsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specific reward assignment. |  -  |

<a id="getRewardAssignment2"></a>
# **getRewardAssignment2**
> LoyaltiesRewardsGetResponseBody getRewardAssignment2(campaignId, assignmentId)

Get Reward Assignment

Retrieve specific reward assignment.  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. 

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      LoyaltiesRewardsGetResponseBody result = apiInstance.getRewardAssignment2(campaignId, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getRewardAssignment2");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **assignmentId** | **String**| A unique reward assignment ID. |

### Return type

[**LoyaltiesRewardsGetResponseBody**](LoyaltiesRewardsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns specific reward assignment. |  -  |

<a id="getRewardDetails"></a>
# **getRewardDetails**
> LoyaltiesRewardAssignmentsRewardGetResponseBody getRewardDetails(campaignId, assignmentId)

Get Reward Details

Get reward details in the context of a loyalty campaign and reward assignment ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String assignmentId = "assignmentId_example"; // String | Unique reward assignment ID.
    try {
      LoyaltiesRewardAssignmentsRewardGetResponseBody result = apiInstance.getRewardDetails(campaignId, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getRewardDetails");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **assignmentId** | **String**| Unique reward assignment ID. |

### Return type

[**LoyaltiesRewardAssignmentsRewardGetResponseBody**](LoyaltiesRewardAssignmentsRewardGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns reward details in the context of a loyalty *campaign* and reward assignment ID. |  -  |

<a id="listLoyaltyCardTransactions"></a>
# **listLoyaltyCardTransactions**
> LoyaltiesMembersTransactionsListResponseBody listLoyaltyCardTransactions(memberId, limit, page)

List Loyalty Card Transactions

Retrieve transaction data related to point movements for a specific loyalty card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to retrieve transaction data for.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      LoyaltiesMembersTransactionsListResponseBody result = apiInstance.listLoyaltyCardTransactions(memberId, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyCardTransactions");
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
| **memberId** | **String**| A unique code identifying the loyalty card that you are looking to retrieve transaction data for. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**LoyaltiesMembersTransactionsListResponseBody**](LoyaltiesMembersTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of loyalty card transaction objects. |  -  |

<a id="listLoyaltyCardTransactions1"></a>
# **listLoyaltyCardTransactions1**
> LoyaltiesMembersTransactionsListResponseBody listLoyaltyCardTransactions1(campaignId, memberId, limit, page)

List Loyalty Card Transactions

Retrieve transaction data related to point movements for a specific loyalty card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique identifier of the loyalty campaign containing the voucher whose transactions you would like to return.
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to retrieve transaction data for.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      LoyaltiesMembersTransactionsListResponseBody result = apiInstance.listLoyaltyCardTransactions1(campaignId, memberId, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyCardTransactions1");
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
| **campaignId** | **String**| A unique identifier of the loyalty campaign containing the voucher whose transactions you would like to return. |
| **memberId** | **String**| A unique code identifying the loyalty card that you are looking to retrieve transaction data for. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**LoyaltiesMembersTransactionsListResponseBody**](LoyaltiesMembersTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of loyalty card transaction objects. |  -  |

<a id="listLoyaltyTierEarningRules"></a>
# **listLoyaltyTierEarningRules**
> LoyaltiesTiersEarningRulesListResponseBody listLoyaltyTierEarningRules(campaignId, loyaltyTierId, limit, page)

List Loyalty Tier Earning Rules

Retrieve available earning rules for a given tier and the calculation method for earning points.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String loyaltyTierId = "loyaltyTierId_example"; // String | Unique loyalty tier ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      LoyaltiesTiersEarningRulesListResponseBody result = apiInstance.listLoyaltyTierEarningRules(campaignId, loyaltyTierId, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyTierEarningRules");
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
| **campaignId** | **String**| Unique campaign ID or name. |
| **loyaltyTierId** | **String**| Unique loyalty tier ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**LoyaltiesTiersEarningRulesListResponseBody**](LoyaltiesTiersEarningRulesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of earning rules for a given tier. The object for each earning rule also contains information about how the points are calculated; this includes mapping. If a specific multiplier was used to calculate points for a given tier, then the &#x60;loyalty.points&#x60; parameter will account for this calculation. |  -  |

<a id="listLoyaltyTierRewards"></a>
# **listLoyaltyTierRewards**
> LoyaltiesTiersRewardsListResponseBody listLoyaltyTierRewards(campaignId, loyaltyTierId)

List Loyalty Tier Rewards

Get available rewards for a given tier.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String loyaltyTierId = "loyaltyTierId_example"; // String | Unique loyalty tier ID.
    try {
      LoyaltiesTiersRewardsListResponseBody result = apiInstance.listLoyaltyTierRewards(campaignId, loyaltyTierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyTierRewards");
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
| **campaignId** | **String**| Unique campaign ID or name. |
| **loyaltyTierId** | **String**| Unique loyalty tier ID. |

### Return type

[**LoyaltiesTiersRewardsListResponseBody**](LoyaltiesTiersRewardsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of loyalty tier reward objects. |  -  |

<a id="listLoyaltyTiers"></a>
# **listLoyaltyTiers**
> LoyaltiesTiersListResponseBody listLoyaltyTiers(campaignId, limit, order)

List Loyalty Tiers

Retrieve a list of loyalty tiers which were added to the loyalty program.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique loyalty campaign ID or name.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListLoyaltyTiers order = ParameterOrderListLoyaltyTiers.fromValue("created_at"); // ParameterOrderListLoyaltyTiers | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      LoyaltiesTiersListResponseBody result = apiInstance.listLoyaltyTiers(campaignId, limit, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyTiers");
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
| **campaignId** | **String**| Unique loyalty campaign ID or name. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderListLoyaltyTiers**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**LoyaltiesTiersListResponseBody**](LoyaltiesTiersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of loyalty tier objects. |  -  |

<a id="listMemberLoyaltyTier"></a>
# **listMemberLoyaltyTier**
> LoyaltiesMembersTiersListResponseBody listMemberLoyaltyTier(memberId)

List Member&#39;s Loyalty Tiers

Retrieve member tiers using the loyalty card ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card assigned to a particular customer.
    try {
      LoyaltiesMembersTiersListResponseBody result = apiInstance.listMemberLoyaltyTier(memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberLoyaltyTier");
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
| **memberId** | **String**| Unique loyalty card assigned to a particular customer. |

### Return type

[**LoyaltiesMembersTiersListResponseBody**](LoyaltiesMembersTiersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a data array containing the member&#39;s loyalty tiers. |  -  |

<a id="listMemberRewards"></a>
# **listMemberRewards**
> LoyaltiesMembersRewardsListResponseBody listMemberRewards(memberId, affordableOnly)

List Member Rewards

Retrieves the list of rewards that the given customer (identified by member_id, which is a loyalty card assigned to a particular customer) **can get in exchange for loyalty points**.   You can use the affordable_only parameter to limit the results to rewards that the customer can actually afford (only rewards whose price in points is not higher than the loyalty points balance on a loyalty card).   Please note that rewards that are disabled (i.e. set to Not Available in the Dashboard) for a given loyalty tier reward mapping will not be returned in this endpoint.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card assigned to a particular customer.
    Boolean affordableOnly = true; // Boolean | Limit the results to rewards that the customer can actually afford (only rewards whose price in points is not higher than the loyalty points balance on a loyalty card). Set this flag to true to return rewards which the customer can actually afford.
    try {
      LoyaltiesMembersRewardsListResponseBody result = apiInstance.listMemberRewards(memberId, affordableOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberRewards");
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
| **memberId** | **String**| Unique loyalty card assigned to a particular customer. |
| **affordableOnly** | **Boolean**| Limit the results to rewards that the customer can actually afford (only rewards whose price in points is not higher than the loyalty points balance on a loyalty card). Set this flag to true to return rewards which the customer can actually afford. |

### Return type

[**LoyaltiesMembersRewardsListResponseBody**](LoyaltiesMembersRewardsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of rewards for the given &#x60;member_id&#x60;. Returns a filtered list if the query parameter &#x60;affordable_only&#x60; is set to &#x60;true&#x60;. |  -  |

<a id="listPointsExpiration"></a>
# **listPointsExpiration**
> LoyaltiesMembersPointsExpirationListResponseBody listPointsExpiration(campaignId, memberId, limit, page)

Get Points Expiration

Retrieve loyalty point expiration buckets for a given loyalty card. Expired point buckets are not returned in this endpoint. You can use the Exports API to retrieve a list of both ACTIVE and EXPIRED point buckets.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String memberId = "memberId_example"; // String | Loyalty card code.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      LoyaltiesMembersPointsExpirationListResponseBody result = apiInstance.listPointsExpiration(campaignId, memberId, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listPointsExpiration");
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
| **campaignId** | **String**| The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **memberId** | **String**| Loyalty card code. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**LoyaltiesMembersPointsExpirationListResponseBody**](LoyaltiesMembersPointsExpirationListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of loyalty points expiration buckets along with an expiration date if the points are due to expire. No expiration date parameter is returned if the loyalty points bucket does not expire. |  -  |

<a id="redeemReward"></a>
# **redeemReward**
> LoyaltiesMembersRedemptionRedeemResponseBody redeemReward(memberId, loyaltiesMembersRedemptionRedeemRequestBody)

Redeem Reward

  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to allow you to redeem a reward without having to provide the campaignId as a path parameter.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card assigned to a particular customer.
    LoyaltiesMembersRedemptionRedeemRequestBody loyaltiesMembersRedemptionRedeemRequestBody = new LoyaltiesMembersRedemptionRedeemRequestBody(); // LoyaltiesMembersRedemptionRedeemRequestBody | Specify the reward to be redeemed. In case of a pay with points reward, specify the order and the number of points to be applied to the order. Please note that if you do not specify the amount of points, the application will default to applying the number of points to pay for the remainder of the order. If the limit of available points on the card is reached, then only the available points on the card will be applied to the order.
    try {
      LoyaltiesMembersRedemptionRedeemResponseBody result = apiInstance.redeemReward(memberId, loyaltiesMembersRedemptionRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#redeemReward");
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
| **memberId** | **String**| Unique loyalty card assigned to a particular customer. |
| **loyaltiesMembersRedemptionRedeemRequestBody** | [**LoyaltiesMembersRedemptionRedeemRequestBody**](LoyaltiesMembersRedemptionRedeemRequestBody.md)| Specify the reward to be redeemed. In case of a pay with points reward, specify the order and the number of points to be applied to the order. Please note that if you do not specify the amount of points, the application will default to applying the number of points to pay for the remainder of the order. If the limit of available points on the card is reached, then only the available points on the card will be applied to the order. |

### Return type

[**LoyaltiesMembersRedemptionRedeemResponseBody**](LoyaltiesMembersRedemptionRedeemResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a redemption object. |  -  |

<a id="redeemReward1"></a>
# **redeemReward1**
> LoyaltiesMembersRedemptionRedeemResponseBody redeemReward1(campaignId, memberId, loyaltiesMembersRedemptionRedeemRequestBody)

Redeem Reward

Exchange points from a loyalty card for a specified reward. This API method returns an assigned award in the response. It means that if a requesting customer gets a coupon code with a discount for the next order, that discount code will be visible in response as part of the reward object definition.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    String memberId = "memberId_example"; // String | A code that identifies the loyalty card.
    LoyaltiesMembersRedemptionRedeemRequestBody loyaltiesMembersRedemptionRedeemRequestBody = new LoyaltiesMembersRedemptionRedeemRequestBody(); // LoyaltiesMembersRedemptionRedeemRequestBody | Specify the reward to be redeemed. In case of a pay with points reward, specify the order and the number of points to be applied to the order. Please note that if you do not specify the amount of points, the application will default to applying the number of points to pay for the remainder of the order. If the limit of available points on the card is reached, then only the available points on the card will be applied to the order.
    try {
      LoyaltiesMembersRedemptionRedeemResponseBody result = apiInstance.redeemReward1(campaignId, memberId, loyaltiesMembersRedemptionRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#redeemReward1");
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
| **campaignId** | **String**| Unique campaign ID. |
| **memberId** | **String**| A code that identifies the loyalty card. |
| **loyaltiesMembersRedemptionRedeemRequestBody** | [**LoyaltiesMembersRedemptionRedeemRequestBody**](LoyaltiesMembersRedemptionRedeemRequestBody.md)| Specify the reward to be redeemed. In case of a pay with points reward, specify the order and the number of points to be applied to the order. Please note that if you do not specify the amount of points, the application will default to applying the number of points to pay for the remainder of the order. If the limit of available points on the card is reached, then only the available points on the card will be applied to the order. |

### Return type

[**LoyaltiesMembersRedemptionRedeemResponseBody**](LoyaltiesMembersRedemptionRedeemResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a redemption object. |  -  |

<a id="transferPoints"></a>
# **transferPoints**
> LoyaltiesMembersTransfersCreateResponseBody transferPoints(campaignId, memberId, loyaltiesTransferPoints)

Transfer Loyalty Points

Transfer points between different loyalty cards. You need to provide the campaign ID and the loyalty card ID you want the points to be transferred to as path parameters in the URL. In the request body, you provide the loyalty cards you want the points to be transferred from and the number of points to transfer from each card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique identifier of the loyalty campaign containing the voucher to which the loyalty points will be sent (destination).
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card to which the user wants to transfer loyalty points (destination).
    List<LoyaltiesTransferPoints> loyaltiesTransferPoints = Arrays.asList(); // List<LoyaltiesTransferPoints> | Provide the loyalty cards you want the points to be transferred from and the number of points to transfer from each card.
    try {
      LoyaltiesMembersTransfersCreateResponseBody result = apiInstance.transferPoints(campaignId, memberId, loyaltiesTransferPoints);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#transferPoints");
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
| **campaignId** | **String**| A unique identifier of the loyalty campaign containing the voucher to which the loyalty points will be sent (destination). |
| **memberId** | **String**| A unique code identifying the loyalty card to which the user wants to transfer loyalty points (destination). |
| **loyaltiesTransferPoints** | [**List&lt;LoyaltiesTransferPoints&gt;**](LoyaltiesTransferPoints.md)| Provide the loyalty cards you want the points to be transferred from and the number of points to transfer from each card. |

### Return type

[**LoyaltiesMembersTransfersCreateResponseBody**](LoyaltiesMembersTransfersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a loyalty card object for the loaded loyalty card, ie. the one that that points were transferred to from the other cards(s). |  -  |

<a id="updateLoyaltyCardBalance"></a>
# **updateLoyaltyCardBalance**
> LoyaltiesMembersBalanceUpdateResponseBody updateLoyaltyCardBalance(memberId, loyaltiesMembersBalanceUpdateRequestBody)

Add or Remove Loyalty Card Balance

This method gives adds or removes balance to an existing loyalty card. The removal of points will consume the points that expire the soonest.   &gt;🚧 Async Action    This is an async action. If you want to perform several add or remove loyalty card balance actions in a short time and their order matters, set up sufficient time-out between the calls.  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to allow you to add or remove loyalty card balance without having to provide the campaignId as a path parameter.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card assigned to a particular customer.
    LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody(); // LoyaltiesMembersBalanceUpdateRequestBody | Specify the point adjustment along with the expiration mechanism.
    try {
      LoyaltiesMembersBalanceUpdateResponseBody result = apiInstance.updateLoyaltyCardBalance(memberId, loyaltiesMembersBalanceUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#updateLoyaltyCardBalance");
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
| **memberId** | **String**| Unique loyalty card assigned to a particular customer. |
| **loyaltiesMembersBalanceUpdateRequestBody** | [**LoyaltiesMembersBalanceUpdateRequestBody**](LoyaltiesMembersBalanceUpdateRequestBody.md)| Specify the point adjustment along with the expiration mechanism. |

### Return type

[**LoyaltiesMembersBalanceUpdateResponseBody**](LoyaltiesMembersBalanceUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a balance object. |  -  |

<a id="updateLoyaltyCardBalance1"></a>
# **updateLoyaltyCardBalance1**
> LoyaltiesMembersBalanceUpdateResponseBody updateLoyaltyCardBalance1(campaignId, memberId, loyaltiesMembersBalanceUpdateRequestBody)

Add or Remove Loyalty Card Balance

This method adds or removes balance to an existing loyalty card. The removal of points will consume the points that expire the soonest.   &gt;🚧 Async Action    This is an async action. If you want to perform several add or remove loyalty card balance actions in a short time and their order matters, set up sufficient time-out between the calls.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.LoyaltiesApi;

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

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    String memberId = "memberId_example"; // String | A code that identifies the loyalty card.
    LoyaltiesMembersBalanceUpdateRequestBody loyaltiesMembersBalanceUpdateRequestBody = new LoyaltiesMembersBalanceUpdateRequestBody(); // LoyaltiesMembersBalanceUpdateRequestBody | Specify the point adjustment along with the expiration mechanism.
    try {
      LoyaltiesMembersBalanceUpdateResponseBody result = apiInstance.updateLoyaltyCardBalance1(campaignId, memberId, loyaltiesMembersBalanceUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#updateLoyaltyCardBalance1");
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
| **campaignId** | **String**| Unique campaign ID. |
| **memberId** | **String**| A code that identifies the loyalty card. |
| **loyaltiesMembersBalanceUpdateRequestBody** | [**LoyaltiesMembersBalanceUpdateRequestBody**](LoyaltiesMembersBalanceUpdateRequestBody.md)| Specify the point adjustment along with the expiration mechanism. |

### Return type

[**LoyaltiesMembersBalanceUpdateResponseBody**](LoyaltiesMembersBalanceUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a balance object. |  -  |


# LoyaltiesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateMemberPendingPoints**](LoyaltiesApi.md#activateMemberPendingPoints) | **POST** /v1/loyalties/members/{memberId}/pending-points/{pendingPointsId}/activate | Activate Member Pending Points |
| [**addMember**](LoyaltiesApi.md#addMember) | **POST** /v1/loyalties/{campaignId}/members | Add Member |
| [**adjustMemberPendingPoints**](LoyaltiesApi.md#adjustMemberPendingPoints) | **POST** /v1/loyalties/members/{memberId}/pending-points/{pendingPointsId}/balance | Adjust Member Pending Points |
| [**cancelMemberPendingPoints**](LoyaltiesApi.md#cancelMemberPendingPoints) | **POST** /v1/loyalties/members/{memberId}/pending-points/{pendingPointsId}/cancel | Cancel Member Pending Points |
| [**createEarningRule**](LoyaltiesApi.md#createEarningRule) | **POST** /v1/loyalties/{campaignId}/earning-rules | Create Earning Rule |
| [**createInBulkLoyaltyTiers**](LoyaltiesApi.md#createInBulkLoyaltyTiers) | **POST** /v1/loyalties/{campaignId}/tiers | Create loyalty tiers |
| [**createLoyaltyProgram**](LoyaltiesApi.md#createLoyaltyProgram) | **POST** /v1/loyalties | Create Loyalty Campaign |
| [**createPointsExpirationExport**](LoyaltiesApi.md#createPointsExpirationExport) | **POST** /v1/loyalties/{campaignId}/points-expiration/export | Export Loyalty Campaign Point Expiration |
| [**createRewardAssignment1**](LoyaltiesApi.md#createRewardAssignment1) | **POST** /v1/loyalties/{campaignId}/rewards | Create Reward Assignment |
| [**deleteEarningRule**](LoyaltiesApi.md#deleteEarningRule) | **DELETE** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId} | Delete Earning Rule |
| [**deleteLoyaltyProgram**](LoyaltiesApi.md#deleteLoyaltyProgram) | **DELETE** /v1/loyalties/{campaignId} | Delete Loyalty Campaign |
| [**deleteRewardAssignment1**](LoyaltiesApi.md#deleteRewardAssignment1) | **DELETE** /v1/loyalties/{campaignId}/rewards/{assignmentId} | Delete Reward Assignment |
| [**disableEarningRule**](LoyaltiesApi.md#disableEarningRule) | **POST** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/disable | Disable Earning Rule |
| [**enableEarningRule**](LoyaltiesApi.md#enableEarningRule) | **POST** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/enable | Enable Earning Rule |
| [**exportLoyaltyCampaignTransactions**](LoyaltiesApi.md#exportLoyaltyCampaignTransactions) | **POST** /v1/loyalties/{campaignId}/transactions/export | Export Loyalty Campaign Transactions |
| [**exportLoyaltyCardTransactions**](LoyaltiesApi.md#exportLoyaltyCardTransactions) | **POST** /v1/loyalties/members/{memberId}/transactions/export | Export Loyalty Card Transactions |
| [**exportLoyaltyCardTransactions1**](LoyaltiesApi.md#exportLoyaltyCardTransactions1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/transactions/export | Export Loyalty Card Transactions |
| [**getEarningRule**](LoyaltiesApi.md#getEarningRule) | **GET** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId} | Get Earning Rule |
| [**getLoyaltyProgram**](LoyaltiesApi.md#getLoyaltyProgram) | **GET** /v1/loyalties/{campaignId} | Get Loyalty Campaign |
| [**getLoyaltyTier**](LoyaltiesApi.md#getLoyaltyTier) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId} | Get Loyalty Tier |
| [**getMember**](LoyaltiesApi.md#getMember) | **GET** /v1/loyalties/members/{memberId} | Get Member |
| [**getMember1**](LoyaltiesApi.md#getMember1) | **GET** /v1/loyalties/{campaignId}/members/{memberId} | Get Member |
| [**getRewardAssignment1**](LoyaltiesApi.md#getRewardAssignment1) | **GET** /v1/loyalties/{campaignId}/reward-assignments/{assignmentId} | Get Reward Assignment |
| [**getRewardAssignment2**](LoyaltiesApi.md#getRewardAssignment2) | **GET** /v1/loyalties/{campaignId}/rewards/{assignmentId} | Get Reward Assignment |
| [**getRewardDetails**](LoyaltiesApi.md#getRewardDetails) | **GET** /v1/loyalties/{campaignId}/reward-assignments/{assignmentId}/reward | Get Reward Details |
| [**listCampaignPendingPoints**](LoyaltiesApi.md#listCampaignPendingPoints) | **GET** /v1/loyalties/{campaignId}/pending-points | List Campaign Pending Points |
| [**listEarningRules**](LoyaltiesApi.md#listEarningRules) | **GET** /v1/loyalties/{campaignId}/earning-rules | List Earning Rules |
| [**listLoyaltyCampaignTransactions**](LoyaltiesApi.md#listLoyaltyCampaignTransactions) | **GET** /v1/loyalties/{campaignId}/transactions | List Loyalty Campaign Transactions |
| [**listLoyaltyCardTransactions**](LoyaltiesApi.md#listLoyaltyCardTransactions) | **GET** /v1/loyalties/members/{memberId}/transactions | List Loyalty Card Transactions |
| [**listLoyaltyCardTransactions1**](LoyaltiesApi.md#listLoyaltyCardTransactions1) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/transactions | List Loyalty Card Transactions |
| [**listLoyaltyPrograms**](LoyaltiesApi.md#listLoyaltyPrograms) | **GET** /v1/loyalties | List Loyalty Campaigns |
| [**listLoyaltyTierEarningRules**](LoyaltiesApi.md#listLoyaltyTierEarningRules) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/earning-rules | List Loyalty Tier Earning Rules |
| [**listLoyaltyTierRewards**](LoyaltiesApi.md#listLoyaltyTierRewards) | **GET** /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/rewards | List Loyalty Tier Rewards |
| [**listLoyaltyTiers**](LoyaltiesApi.md#listLoyaltyTiers) | **GET** /v1/loyalties/{campaignId}/tiers | List Loyalty Tiers |
| [**listMemberActivity**](LoyaltiesApi.md#listMemberActivity) | **GET** /v1/loyalties/members/{memberId}/activity | List Member Activity |
| [**listMemberActivity1**](LoyaltiesApi.md#listMemberActivity1) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/activity | List Member Activity |
| [**listMemberLoyaltyTier**](LoyaltiesApi.md#listMemberLoyaltyTier) | **GET** /v1/loyalties/members/{memberId}/tiers | List Member&#39;s Loyalty Tiers |
| [**listMemberPendingPoints**](LoyaltiesApi.md#listMemberPendingPoints) | **GET** /v1/loyalties/members/{memberId}/pending-points | List Member Pending Points |
| [**listMemberPendingPoints1**](LoyaltiesApi.md#listMemberPendingPoints1) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/pending-points | List Member Pending Points |
| [**listMemberRewards**](LoyaltiesApi.md#listMemberRewards) | **GET** /v1/loyalties/members/{memberId}/rewards | List Member Rewards |
| [**listMembers**](LoyaltiesApi.md#listMembers) | **GET** /v1/loyalties/{campaignId}/members | List Members |
| [**listPointsExpiration**](LoyaltiesApi.md#listPointsExpiration) | **GET** /v1/loyalties/{campaignId}/members/{memberId}/points-expiration | List Loyalty Card Point Expiration |
| [**listRewardAssignments1**](LoyaltiesApi.md#listRewardAssignments1) | **GET** /v1/loyalties/{campaignId}/reward-assignments | List Reward Assignments |
| [**listRewardAssignments2**](LoyaltiesApi.md#listRewardAssignments2) | **GET** /v1/loyalties/{campaignId}/rewards | List Reward Assignments |
| [**redeemReward**](LoyaltiesApi.md#redeemReward) | **POST** /v1/loyalties/members/{memberId}/redemption | Redeem Reward |
| [**redeemReward1**](LoyaltiesApi.md#redeemReward1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/redemption | Redeem Reward |
| [**transferPoints**](LoyaltiesApi.md#transferPoints) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/transfers | Transfer Loyalty Points |
| [**updateEarningRule**](LoyaltiesApi.md#updateEarningRule) | **PUT** /v1/loyalties/{campaignId}/earning-rules/{earningRuleId} | Update Earning Rule |
| [**updateLoyaltyCardBalance**](LoyaltiesApi.md#updateLoyaltyCardBalance) | **POST** /v1/loyalties/members/{memberId}/balance | Adjust Loyalty Card Balance |
| [**updateLoyaltyCardBalance1**](LoyaltiesApi.md#updateLoyaltyCardBalance1) | **POST** /v1/loyalties/{campaignId}/members/{memberId}/balance | Adjust Loyalty Card Balance |
| [**updateLoyaltyProgram**](LoyaltiesApi.md#updateLoyaltyProgram) | **PUT** /v1/loyalties/{campaignId} | Update Loyalty Campaign |
| [**updateRewardAssignment1**](LoyaltiesApi.md#updateRewardAssignment1) | **PUT** /v1/loyalties/{campaignId}/rewards/{assignmentId} | Update Reward Assignment |


<a id="activateMemberPendingPoints"></a>
# **activateMemberPendingPoints**
> LoyaltiesMembersPendingPointsActivateResponseBody activateMemberPendingPoints(memberId, pendingPointsId)

Activate Member Pending Points

Activate manually the pending points and add them to the loyalty card. The pending points are determined by the pending point ID. Once activated, the pending point entry with that ID is not listed by the endpoints: List member (with campaign ID, without campaign ID), List campaign pending points. This **POST** method does not require a request body. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    String pendingPointsId = "pendingPointsId_example"; // String | Unique pending point identifier, assigned by Voucherify.
    try {
      LoyaltiesMembersPendingPointsActivateResponseBody result = apiInstance.activateMemberPendingPoints(memberId, pendingPointsId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#activateMemberPendingPoints");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |
| **pendingPointsId** | **String**| Unique pending point identifier, assigned by Voucherify. |

### Return type

[**LoyaltiesMembersPendingPointsActivateResponseBody**](LoyaltiesMembersPendingPointsActivateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns details about the activated pending points, the current point balance, and loyalty card in general. |  -  |

<a id="addMember"></a>
# **addMember**
> LoyaltiesMembersCreateResponseBody addMember(campaignId, loyaltiesMembersCreateRequestBody)

Add Member

This method assigns a loyalty card to a customer. It selects a loyalty card suitable for publication, adds a publish entry, and returns the published voucher.   A voucher is suitable for publication when its active and hasnt been published yet.    📘 Auto-update campaign  In case you want to ensure the number of publishable codes increases automatically with the number of customers, you should use **auto-update** campaign.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID of the loyalty program.
    LoyaltiesMembersCreateRequestBody loyaltiesMembersCreateRequestBody = new LoyaltiesMembersCreateRequestBody(); // LoyaltiesMembersCreateRequestBody | Provide details to whom the loyalty card should be assigned.     You can choose to either specify the exact loyalty card code that you want to publish from existin (non-assigned) codes, or choose not to specify a voucher code. If you choose not to specify a code in the request paylaod, then the system will choose the next available voucher code available to be assigned to a customer.   You can also include metadata in the request payload. This metadata will be assigned to the publication object, but will not be returned in the response to this endpoint. To see of publications (assignments of particular codes to customers) and publication metadata, use the List Publications endpoint.
    try {
      LoyaltiesMembersCreateResponseBody result = apiInstance.addMember(campaignId, loyaltiesMembersCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#addMember");
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
| **campaignId** | **String**| Unique campaign ID of the loyalty program. |
| **loyaltiesMembersCreateRequestBody** | [**LoyaltiesMembersCreateRequestBody**](LoyaltiesMembersCreateRequestBody.md)| Provide details to whom the loyalty card should be assigned.     You can choose to either specify the exact loyalty card code that you want to publish from existin (non-assigned) codes, or choose not to specify a voucher code. If you choose not to specify a code in the request paylaod, then the system will choose the next available voucher code available to be assigned to a customer.   You can also include metadata in the request payload. This metadata will be assigned to the publication object, but will not be returned in the response to this endpoint. To see of publications (assignments of particular codes to customers) and publication metadata, use the List Publications endpoint. |

### Return type

[**LoyaltiesMembersCreateResponseBody**](LoyaltiesMembersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the voucher object that was published to the customer provided in the request payload. |  -  |

<a id="adjustMemberPendingPoints"></a>
# **adjustMemberPendingPoints**
> LoyaltiesMembersPendingPointsBalanceResponseBody adjustMemberPendingPoints(memberId, pendingPointsId, loyaltiesMembersPendingPointsBalanceRequestBody)

Adjust Member Pending Points

Adjusts the pending points with a given ID. You can add or subtract the number of points. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    String pendingPointsId = "pendingPointsId_example"; // String | Unique pending point identifier, assigned by Voucherify.
    LoyaltiesMembersPendingPointsBalanceRequestBody loyaltiesMembersPendingPointsBalanceRequestBody = new LoyaltiesMembersPendingPointsBalanceRequestBody(); // LoyaltiesMembersPendingPointsBalanceRequestBody | Define the number of pending points to be added or subtracted.
    try {
      LoyaltiesMembersPendingPointsBalanceResponseBody result = apiInstance.adjustMemberPendingPoints(memberId, pendingPointsId, loyaltiesMembersPendingPointsBalanceRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#adjustMemberPendingPoints");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |
| **pendingPointsId** | **String**| Unique pending point identifier, assigned by Voucherify. |
| **loyaltiesMembersPendingPointsBalanceRequestBody** | [**LoyaltiesMembersPendingPointsBalanceRequestBody**](LoyaltiesMembersPendingPointsBalanceRequestBody.md)| Define the number of pending points to be added or subtracted. |

### Return type

[**LoyaltiesMembersPendingPointsBalanceResponseBody**](LoyaltiesMembersPendingPointsBalanceResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the balance adjustment of the pending points with a given ID for a loyalty card. |  -  |

<a id="cancelMemberPendingPoints"></a>
# **cancelMemberPendingPoints**
> cancelMemberPendingPoints(memberId, pendingPointsId)

Cancel Member Pending Points

Cancel manually the pending points for the loyalty card. The pending points are determined by the pending point ID. Once canceled, the pending point entry with that ID is not listed by the endpoints: List member (with campaign ID, without campaign ID), List campaign pending points. This **POST** method does not require a request body and it returns an empty, 204, response. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    String pendingPointsId = "pendingPointsId_example"; // String | Unique pending point identifier, assigned by Voucherify.
    try {
      apiInstance.cancelMemberPendingPoints(memberId, pendingPointsId);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#cancelMemberPendingPoints");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |
| **pendingPointsId** | **String**| Unique pending point identifier, assigned by Voucherify. |

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
| **204** | Returns no content if the pending points are canceled successfully. |  -  |

<a id="createEarningRule"></a>
# **createEarningRule**
> List&lt;LoyaltiesEarningRulesCreateResponseBody&gt; createEarningRule(campaignId, loyaltiesEarningRulesCreateRequestBodyItem)

Create Earning Rule

Create earning rules for a loyalty campaign.  🚧 Maximum number of earning rules  You can create up to 100 earning rules per project. The limit can be customized for clients with a single-tenant setup.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    List<LoyaltiesEarningRulesCreateRequestBodyItem> loyaltiesEarningRulesCreateRequestBodyItem = Arrays.asList(); // List<LoyaltiesEarningRulesCreateRequestBodyItem> | Customize the request body based on the type of earning rules you would like to create. The request body is an array of objects. The required minimum properties to include in the payload for each object are event and loyalty. Additionally, if you choose to add a validity_timeframe, you must include a start_date. Furthermore, an earning rule event type:   - customer.segment.entered requires a segment object - a custom event requires a custom_event object - a customer.loyalty.tier.joined, customer.loyalty.tier.left, customer.loyalty.tier.upgraded, customer.loyalty.tier.downgraded, customer.loyalty.tier.prolonged requires a loyalty_tier object
    try {
      List<LoyaltiesEarningRulesCreateResponseBody> result = apiInstance.createEarningRule(campaignId, loyaltiesEarningRulesCreateRequestBodyItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#createEarningRule");
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
| **loyaltiesEarningRulesCreateRequestBodyItem** | [**List&lt;LoyaltiesEarningRulesCreateRequestBodyItem&gt;**](LoyaltiesEarningRulesCreateRequestBodyItem.md)| Customize the request body based on the type of earning rules you would like to create. The request body is an array of objects. The required minimum properties to include in the payload for each object are event and loyalty. Additionally, if you choose to add a validity_timeframe, you must include a start_date. Furthermore, an earning rule event type:   - customer.segment.entered requires a segment object - a custom event requires a custom_event object - a customer.loyalty.tier.joined, customer.loyalty.tier.left, customer.loyalty.tier.upgraded, customer.loyalty.tier.downgraded, customer.loyalty.tier.prolonged requires a loyalty_tier object |

### Return type

[**List&lt;LoyaltiesEarningRulesCreateResponseBody&gt;**](LoyaltiesEarningRulesCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of earning rule objects. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="createLoyaltyProgram"></a>
# **createLoyaltyProgram**
> LoyaltiesCreateCampaignResponseBody createLoyaltyProgram(loyaltiesCreateCampaignRequestBody)

Create Loyalty Campaign

Creates a batch of loyalty cards aggregated in a single loyalty campaign. It also allows you to define a custom codes pattern.    📘 Global uniqueness  All codes are unique across the whole project. Voucherify wont allow to generate the same codes in any of your campaigns.  🚧 Asynchronous action!  This is an asynchronous action, you cant read or modify a newly created campaign until the code generation is completed. See creation_status field in the loyalty campaign object description.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    LoyaltiesCreateCampaignRequestBody loyaltiesCreateCampaignRequestBody = new LoyaltiesCreateCampaignRequestBody(); // LoyaltiesCreateCampaignRequestBody | Specify the loyalty campaign details.
    try {
      LoyaltiesCreateCampaignResponseBody result = apiInstance.createLoyaltyProgram(loyaltiesCreateCampaignRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#createLoyaltyProgram");
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
| **loyaltiesCreateCampaignRequestBody** | [**LoyaltiesCreateCampaignRequestBody**](LoyaltiesCreateCampaignRequestBody.md)| Specify the loyalty campaign details. |

### Return type

[**LoyaltiesCreateCampaignResponseBody**](LoyaltiesCreateCampaignResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object with its settings but without the loyalty card codes. |  -  |

<a id="createPointsExpirationExport"></a>
# **createPointsExpirationExport**
> LoyaltiesPointsExpirationExportCreateResponseBody createPointsExpirationExport(campaignId, loyaltiesPointsExpirationExportCreateRequestBody)

Export Loyalty Campaign Point Expiration

Schedule the generation of a point expiration CSV file for a particular campaign. It can list point buckets, which can have an ACTIVE or EXPIRED status.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    LoyaltiesPointsExpirationExportCreateRequestBody loyaltiesPointsExpirationExportCreateRequestBody = new LoyaltiesPointsExpirationExportCreateRequestBody(); // LoyaltiesPointsExpirationExportCreateRequestBody | Specify the data filters, types of data to return and order in which the results should be returned.
    try {
      LoyaltiesPointsExpirationExportCreateResponseBody result = apiInstance.createPointsExpirationExport(campaignId, loyaltiesPointsExpirationExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#createPointsExpirationExport");
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
| **loyaltiesPointsExpirationExportCreateRequestBody** | [**LoyaltiesPointsExpirationExportCreateRequestBody**](LoyaltiesPointsExpirationExportCreateRequestBody.md)| Specify the data filters, types of data to return and order in which the results should be returned. |

### Return type

[**LoyaltiesPointsExpirationExportCreateResponseBody**](LoyaltiesPointsExpirationExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an object with the export ID of the scheduled generation of CSV file with exported points expirations. You can use either the &lt;!-- [Get Export](OpenAPI.json/paths/~1exports~1{exportId}/get) --&gt;[Get Export](ref:get-export) endpoint to view the status and obtain the URL of the CSV file or &lt;!-- [Download Export](OpenAPI.json/paths/~1exports~1{export_Id}/get) --&gt;[Download Export](ref:download-export) endpoint to download the CSV file. |  -  |

<a id="createRewardAssignment1"></a>
# **createRewardAssignment1**
> LoyaltiesRewardsCreateAssignmentResponseBody createRewardAssignment1(campaignId, loyaltiesRewardsCreateAssignmentItemRequestBody)

Create Reward Assignment

Add rewards to a loyalty campaign.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    List<LoyaltiesRewardsCreateAssignmentItemRequestBody> loyaltiesRewardsCreateAssignmentItemRequestBody = Arrays.asList(); // List<LoyaltiesRewardsCreateAssignmentItemRequestBody> | Define the cost of the rewards in loyalty points.
    try {
      LoyaltiesRewardsCreateAssignmentResponseBody result = apiInstance.createRewardAssignment1(campaignId, loyaltiesRewardsCreateAssignmentItemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#createRewardAssignment1");
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
| **campaignId** | **String**| Unique campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **loyaltiesRewardsCreateAssignmentItemRequestBody** | [**List&lt;LoyaltiesRewardsCreateAssignmentItemRequestBody&gt;**](LoyaltiesRewardsCreateAssignmentItemRequestBody.md)| Define the cost of the rewards in loyalty points. |

### Return type

[**LoyaltiesRewardsCreateAssignmentResponseBody**](LoyaltiesRewardsCreateAssignmentResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of reward assignment objects. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String earningRuleId = "earningRuleId_example"; // String | Unique identifier of an earning rule, assigned by Voucherify.
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
| **earningRuleId** | **String**| Unique identifier of an earning rule, assigned by Voucherify. |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name.
    String earningRuleId = "earningRuleId_example"; // String | Unique identifier of an earning rule, assigned by Voucherify.
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
| **earningRuleId** | **String**| Unique identifier of an earning rule, assigned by Voucherify. |

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

<a id="exportLoyaltyCampaignTransactions"></a>
# **exportLoyaltyCampaignTransactions**
> CampaignsTransactionsExportCreateResponseBody exportLoyaltyCampaignTransactions(campaignId, loyaltiesTransactionsExportCreateRequestBody)

Export Loyalty Campaign Transactions

Export transactions is an asynchronous process that generates a CSV file with the data about or point movements on all loyalty cards in a given campaign. To export transactions: 1. In the export request, use parameters to select which fields will be exported, in what order, and which data will be filtered. 2. Use the returned id to track the export status with the GET Export method. 3. In the GET Export method, when the returned status field has the DONE value, the export file has been generated. 4. Use the URL in the result property to download the file. You must be logged to your Voucherify account on a given cluster in the browser to be able to download the file. An export request will almost always result in a single file being generated by the system. However, when the data volume is large, the system may split the results into multiple files. An example export file can look as follows:    👍 Export Campaign Transactions  This method works in the same way the POST Export Campaign Transactions does, but it is limited to loyalty campaigns only. The POST Export Campaign Transactions method can also export gift card campaign transactions.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    LoyaltiesTransactionsExportCreateRequestBody loyaltiesTransactionsExportCreateRequestBody = new LoyaltiesTransactionsExportCreateRequestBody(); // LoyaltiesTransactionsExportCreateRequestBody | Specify the parameters for the transaction export.
    try {
      CampaignsTransactionsExportCreateResponseBody result = apiInstance.exportLoyaltyCampaignTransactions(campaignId, loyaltiesTransactionsExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#exportLoyaltyCampaignTransactions");
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
| **campaignId** | **String**| You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **loyaltiesTransactionsExportCreateRequestBody** | [**LoyaltiesTransactionsExportCreateRequestBody**](LoyaltiesTransactionsExportCreateRequestBody.md)| Specify the parameters for the transaction export. |

### Return type

[**CampaignsTransactionsExportCreateResponseBody**](CampaignsTransactionsExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An object representing an export. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="getLoyaltyProgram"></a>
# **getLoyaltyProgram**
> LoyaltiesGetCampaignResponseBody getLoyaltyProgram(campaignId)

Get Loyalty Campaign

Retrieve a specific loyalty campaign.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    try {
      LoyaltiesGetCampaignResponseBody result = apiInstance.getLoyaltyProgram(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getLoyaltyProgram");
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

### Return type

[**LoyaltiesGetCampaignResponseBody**](LoyaltiesGetCampaignResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a loyalty campaign object for a given loyalty campaign ID.  |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="getMember"></a>
# **getMember**
> LoyaltiesMembersGetResponseBody getMember(memberId)

Get Member

Retrieve loyalty card with the given member ID (i.e. voucher code).      📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to allow you to retrieve loyalty card details without having to provide the campaignId as a path parameter.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    try {
      LoyaltiesMembersGetResponseBody result = apiInstance.getMember(memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getMember");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |

### Return type

[**LoyaltiesMembersGetResponseBody**](LoyaltiesMembersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns loyalty card details. |  -  |

<a id="getMember1"></a>
# **getMember1**
> LoyaltiesMembersGetResponseBody getMember1(campaignId, memberId)

Get Member

Retrieves the loyalty card with the given member ID (i.e. voucher code).

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    String memberId = "memberId_example"; // String | Unique code that identifies the loyalty card.
    try {
      LoyaltiesMembersGetResponseBody result = apiInstance.getMember1(campaignId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#getMember1");
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
| **memberId** | **String**| Unique code that identifies the loyalty card. |

### Return type

[**LoyaltiesMembersGetResponseBody**](LoyaltiesMembersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns loyalty card details. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listCampaignPendingPoints"></a>
# **listCampaignPendingPoints**
> LoyaltiesPendingPointsListResponseBody listCampaignPendingPoints(campaignId, limit, order, startingAfterId)

List Campaign Pending Points

Lists all pending points that are currently assigned to all loyalty cards in a campaign. Once the points are added to the card, the entry is no longer returned. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    Integer limit = 56; // Integer | Limit the number of the pending point entries that the API returns in the response.
    ParameterOrderListPendingPoints order = ParameterOrderListPendingPoints.fromValue("id"); // ParameterOrderListPendingPoints | Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after a result with the given ID.
    try {
      LoyaltiesPendingPointsListResponseBody result = apiInstance.listCampaignPendingPoints(campaignId, limit, order, startingAfterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listCampaignPendingPoints");
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
| **limit** | **Integer**| Limit the number of the pending point entries that the API returns in the response. |
| **order** | [**ParameterOrderListPendingPoints**](.md)| Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after a result with the given ID. |

### Return type

[**LoyaltiesPendingPointsListResponseBody**](LoyaltiesPendingPointsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all pending point entries for all loyalty cards in the campaign. |  -  |

<a id="listEarningRules"></a>
# **listEarningRules**
> LoyaltiesEarningRulesListResponseBody listEarningRules(campaignId, limit, page, order)

List Earning Rules

Returns a list of all earning rules within a given campaign.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListEarningRules order = ParameterOrderListEarningRules.fromValue("created_at"); // ParameterOrderListEarningRules | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      LoyaltiesEarningRulesListResponseBody result = apiInstance.listEarningRules(campaignId, limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listEarningRules");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrderListEarningRules**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**LoyaltiesEarningRulesListResponseBody**](LoyaltiesEarningRulesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of earning rules. |  -  |

<a id="listLoyaltyCampaignTransactions"></a>
# **listLoyaltyCampaignTransactions**
> LoyaltiesTransactionsListResponseBody listLoyaltyCampaignTransactions(campaignId, limit, order, startingAfterId, filters)

List Loyalty Campaign Transactions

Retrieves all transactions for the campaign with the given campaign ID or campaign name.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListTransactions order = ParameterOrderListTransactions.fromValue("id"); // ParameterOrderListTransactions | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID.
    ParametersFiltersListCampaignTransactions filters = new ParametersFiltersListCampaignTransactions(); // ParametersFiltersListCampaignTransactions | Filters for listing responses. The id filter denotes the unique transaction identifier.
    try {
      LoyaltiesTransactionsListResponseBody result = apiInstance.listLoyaltyCampaignTransactions(campaignId, limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyCampaignTransactions");
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
| **campaignId** | **String**| You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderListTransactions**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID. |
| **filters** | [**ParametersFiltersListCampaignTransactions**](.md)| Filters for listing responses. The id filter denotes the unique transaction identifier. |

### Return type

[**LoyaltiesTransactionsListResponseBody**](LoyaltiesTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a &#x60;data&#x60; property that contains an array of transactions. The maximum number of transactions returned is determined by the &#x60;limit&#x60; query parameter. Each entry in the array is a separate transaction object. If more results are available, the &#x60;has_more&#x60; flag has value &#x60;true&#x60; and the value of the &#x60;more_starting_after&#x60; property can be used to retrieve another page of results. |  -  |

<a id="listLoyaltyCardTransactions"></a>
# **listLoyaltyCardTransactions**
> LoyaltiesMembersTransactionsListResponseBody listLoyaltyCardTransactions(memberId, limit, order, filters, startingAfterId)

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to retrieve transaction data for.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListTransactions order = ParameterOrderListTransactions.fromValue("id"); // ParameterOrderListTransactions | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    ParameterFiltersListMemberTransactions filters = new ParameterFiltersListMemberTransactions(); // ParameterFiltersListMemberTransactions | Filters for listing member transactions. id is the unique identifier of the transaction.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID.
    try {
      LoyaltiesMembersTransactionsListResponseBody result = apiInstance.listLoyaltyCardTransactions(memberId, limit, order, filters, startingAfterId);
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
| **order** | [**ParameterOrderListTransactions**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **filters** | [**ParameterFiltersListMemberTransactions**](.md)| Filters for listing member transactions. id is the unique identifier of the transaction. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID. |

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
> LoyaltiesMembersTransactionsListResponseBody listLoyaltyCardTransactions1(campaignId, memberId, limit, order, filters, startingAfterId)

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | A unique identifier of the loyalty campaign containing the voucher whose transactions you would like to return.
    String memberId = "memberId_example"; // String | A unique code identifying the loyalty card that you are looking to retrieve transaction data for.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListTransactions order = ParameterOrderListTransactions.fromValue("id"); // ParameterOrderListTransactions | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    ParameterFiltersListMemberTransactions filters = new ParameterFiltersListMemberTransactions(); // ParameterFiltersListMemberTransactions | Filters for listing member transactions. id is the unique identifier of the transaction.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID.
    try {
      LoyaltiesMembersTransactionsListResponseBody result = apiInstance.listLoyaltyCardTransactions1(campaignId, memberId, limit, order, filters, startingAfterId);
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
| **order** | [**ParameterOrderListTransactions**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **filters** | [**ParameterFiltersListMemberTransactions**](.md)| Filters for listing member transactions. id is the unique identifier of the transaction. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the transactions starting after a transaction with the given ID. |

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

<a id="listLoyaltyPrograms"></a>
# **listLoyaltyPrograms**
> LoyaltiesListCampaignsResponseBody listLoyaltyPrograms(limit, page, expand, order)

List Loyalty Campaigns

Returns a list of your loyalty campaigns.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterExpandListCampaigns expand = ParameterExpandListCampaigns.fromValue("category"); // ParameterExpandListCampaigns | Includes an expanded categories object in the response. If the [Areas and Stores](https://support.voucherify.io/article/623-areas-and-stores) Enterprise feature is enabled, add access_settings_assignments to return assigned areas and stores.
    ParameterOrderListCampaigns order = ParameterOrderListCampaigns.fromValue("created_at"); // ParameterOrderListCampaigns | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      LoyaltiesListCampaignsResponseBody result = apiInstance.listLoyaltyPrograms(limit, page, expand, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listLoyaltyPrograms");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **expand** | [**ParameterExpandListCampaigns**](.md)| Includes an expanded categories object in the response. If the [Areas and Stores](https://support.voucherify.io/article/623-areas-and-stores) Enterprise feature is enabled, add access_settings_assignments to return assigned areas and stores. |
| **order** | [**ParameterOrderListCampaigns**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**LoyaltiesListCampaignsResponseBody**](LoyaltiesListCampaignsResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with loyalty program objects. The loyalty campaigns are returned sorted by creation date, with the most recent campaigns appearing first. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listMemberActivity"></a>
# **listMemberActivity**
> LoyaltiesMemberActivityListResponseBody listMemberActivity(memberId, limit, order, startingAfterId)

List Member Activity

  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to allow you to get member activities without having to provide the campaignId as a path parameter. Retrieves the list of activities for the given member ID related to a voucher and customer who is the holder of the voucher.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card assigned to a particular customer.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderCreatedAt order = ParameterOrderCreatedAt.fromValue("created_at"); // ParameterOrderCreatedAt | Apply this filter to order the events according the date and time when it was created. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    try {
      LoyaltiesMemberActivityListResponseBody result = apiInstance.listMemberActivity(memberId, limit, order, startingAfterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberActivity");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderCreatedAt**](.md)| Apply this filter to order the events according the date and time when it was created. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |

### Return type

[**LoyaltiesMemberActivityListResponseBody**](LoyaltiesMemberActivityListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of event objects related to the loyalty card. |  -  |

<a id="listMemberActivity1"></a>
# **listMemberActivity1**
> LoyaltiesMemberActivityListResponseBody listMemberActivity1(campaignId, memberId, limit, order, startingAfterId)

List Member Activity

Retrieves the list of activities for the given member ID related to a voucher and customer who is the holder of the voucher.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    String memberId = "memberId_example"; // String | A code that identifies the loyalty card.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderCreatedAt order = ParameterOrderCreatedAt.fromValue("created_at"); // ParameterOrderCreatedAt | Apply this filter to order the events according the date and time when it was created. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    try {
      LoyaltiesMemberActivityListResponseBody result = apiInstance.listMemberActivity1(campaignId, memberId, limit, order, startingAfterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberActivity1");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderCreatedAt**](.md)| Apply this filter to order the events according the date and time when it was created. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |

### Return type

[**LoyaltiesMemberActivityListResponseBody**](LoyaltiesMemberActivityListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of event objects related to the loyalty card. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listMemberPendingPoints"></a>
# **listMemberPendingPoints**
> LoyaltiesMembersPendingPointsListResponseBody listMemberPendingPoints(memberId, limit, order, startingAfterId)

List Member Pending Points

  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to list member pending points without having to provide the campaignId as a path parameter. Lists all pending points that are currently assigned to the loyalty card. Once the points are added to the card, the entry is no longer returned. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    Integer limit = 56; // Integer | Limit the number of the pending point entries that the API returns in the response.
    ParameterOrderListPendingPoints order = ParameterOrderListPendingPoints.fromValue("id"); // ParameterOrderListPendingPoints | Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after a result with the given ID.
    try {
      LoyaltiesMembersPendingPointsListResponseBody result = apiInstance.listMemberPendingPoints(memberId, limit, order, startingAfterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberPendingPoints");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |
| **limit** | **Integer**| Limit the number of the pending point entries that the API returns in the response. |
| **order** | [**ParameterOrderListPendingPoints**](.md)| Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after a result with the given ID. |

### Return type

[**LoyaltiesMembersPendingPointsListResponseBody**](LoyaltiesMembersPendingPointsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all pending point entries. |  -  |

<a id="listMemberPendingPoints1"></a>
# **listMemberPendingPoints1**
> LoyaltiesMembersPendingPointsListResponseBody listMemberPendingPoints1(campaignId, memberId, limit, order, startingAfterId)

List Member Pending Points

Lists all pending points that are currently assigned to the loyalty card. Once the points are added to the card, the entry is no longer returned. 👍 Configuring pending points Pending points are configured as part of an earning rule with POST Create earning rule or PUT Update earning rule.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    String memberId = "memberId_example"; // String | Unique loyalty card code assigned to a particular customer.
    Integer limit = 56; // Integer | Limit the number of the pending point entries that the API returns in the response.
    ParameterOrderListPendingPoints order = ParameterOrderListPendingPoints.fromValue("id"); // ParameterOrderListPendingPoints | Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the results starting after a result with the given ID.
    try {
      LoyaltiesMembersPendingPointsListResponseBody result = apiInstance.listMemberPendingPoints1(campaignId, memberId, limit, order, startingAfterId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMemberPendingPoints1");
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
| **memberId** | **String**| Unique loyalty card code assigned to a particular customer. |
| **limit** | **Integer**| Limit the number of the pending point entries that the API returns in the response. |
| **order** | [**ParameterOrderListPendingPoints**](.md)| Orders the pending point entries according the pending point entry ID. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the results starting after a result with the given ID. |

### Return type

[**LoyaltiesMembersPendingPointsListResponseBody**](LoyaltiesMembersPendingPointsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all pending point entries. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listMembers"></a>
# **listMembers**
> LoyaltiesListMembersResponseBody listMembers(campaignId, limit, page, customer, createdAt, updatedAt, order, code, ids)

List Members

Returns a list of your loyalty cards. The loyalty cards are sorted by creation date, with the most recent loyalty cards appearing first.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID of the loyalty program.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String customer = "customer_example"; // String | A tracking identifier of a customer who is the holder of the vouchers. It can be an id generated by Voucherify or the source_id. Remember to use the proper URL escape codes if the source_id contains special characters.
    ParameterCreatedBeforeAfter createdAt = new ParameterCreatedBeforeAfter(); // ParameterCreatedBeforeAfter | A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z
    ParameterUpdatedBeforeAfter updatedAt = new ParameterUpdatedBeforeAfter(); // ParameterUpdatedBeforeAfter | A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z
    ParameterOrderVouchers order = ParameterOrderVouchers.fromValue("created_at"); // ParameterOrderVouchers | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String code = "code_example"; // String | 
    List<String> ids = Arrays.asList(); // List<String> | 
    try {
      LoyaltiesListMembersResponseBody result = apiInstance.listMembers(campaignId, limit, page, customer, createdAt, updatedAt, order, code, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listMembers");
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
| **campaignId** | **String**| Unique campaign ID of the loyalty program. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **customer** | **String**| A tracking identifier of a customer who is the holder of the vouchers. It can be an id generated by Voucherify or the source_id. Remember to use the proper URL escape codes if the source_id contains special characters. |
| **createdAt** | [**ParameterCreatedBeforeAfter**](.md)| A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z |
| **updatedAt** | [**ParameterUpdatedBeforeAfter**](.md)| A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z |
| **order** | [**ParameterOrderVouchers**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **code** | **String**|  |
| **ids** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**LoyaltiesListMembersResponseBody**](LoyaltiesListMembersResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of loyalty cards within a campaign. |  -  |

<a id="listPointsExpiration"></a>
# **listPointsExpiration**
> LoyaltiesMembersPointsExpirationListResponseBody listPointsExpiration(campaignId, memberId, limit, page)

List Loyalty Card Point Expiration

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listRewardAssignments1"></a>
# **listRewardAssignments1**
> LoyaltiesRewardAssignmentsListResponseBody listRewardAssignments1(campaignId, limit, page, assignmentId)

List Reward Assignments

Returns reward assignments from a given loyalty campaign.  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to be more contextual to the type of data returned in the response.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      LoyaltiesRewardAssignmentsListResponseBody result = apiInstance.listRewardAssignments1(campaignId, limit, page, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listRewardAssignments1");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **assignmentId** | **String**| A unique reward assignment ID. |

### Return type

[**LoyaltiesRewardAssignmentsListResponseBody**](LoyaltiesRewardAssignmentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with reward assignment objects. |  -  |

<a id="listRewardAssignments2"></a>
# **listRewardAssignments2**
> LoyaltiesRewardsListAssignmentsResponseBody listRewardAssignments2(campaignId, limit, page, assignmentId)

List Reward Assignments

Returns active rewards from a given loyalty campaign.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      LoyaltiesRewardsListAssignmentsResponseBody result = apiInstance.listRewardAssignments2(campaignId, limit, page, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#listRewardAssignments2");
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
| **campaignId** | **String**| Unique campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign.  |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **assignmentId** | **String**| A unique reward assignment ID. |

### Return type

[**LoyaltiesRewardsListAssignmentsResponseBody**](LoyaltiesRewardsListAssignmentsResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with reward assignment objects. |  -  |

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

Transfer points between different loyalty cards which have holders. You need to provide the campaign ID and the loyalty card ID you want the points to be transferred to as path parameters in the URL. In the request body, you provide the loyalty cards you want the points to be transferred from and the number of points to transfer from each card. Transfer works only for loyalty cards that have holders, meaning they were published to customers.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="updateEarningRule"></a>
# **updateEarningRule**
> LoyaltiesEarningRulesUpdateResponseBody updateEarningRule(campaignId, earningRuleId, loyaltiesEarningRulesUpdateRequestBody)

Update Earning Rule

Update an earning rule definition.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String earningRuleId = "earningRuleId_example"; // String | A unique earning rule ID.
    LoyaltiesEarningRulesUpdateRequestBody loyaltiesEarningRulesUpdateRequestBody = new LoyaltiesEarningRulesUpdateRequestBody(); // LoyaltiesEarningRulesUpdateRequestBody | Specify the parameters that you would like to update for the given earning rule.
    try {
      LoyaltiesEarningRulesUpdateResponseBody result = apiInstance.updateEarningRule(campaignId, earningRuleId, loyaltiesEarningRulesUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#updateEarningRule");
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
| **loyaltiesEarningRulesUpdateRequestBody** | [**LoyaltiesEarningRulesUpdateRequestBody**](LoyaltiesEarningRulesUpdateRequestBody.md)| Specify the parameters that you would like to update for the given earning rule. |

### Return type

[**LoyaltiesEarningRulesUpdateResponseBody**](LoyaltiesEarningRulesUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated earning rule object. |  -  |

<a id="updateLoyaltyCardBalance"></a>
# **updateLoyaltyCardBalance**
> LoyaltiesMembersBalanceUpdateResponseBody updateLoyaltyCardBalance(memberId, loyaltiesMembersBalanceUpdateRequestBody)

Adjust Loyalty Card Balance

This method gives adds or removes balance to an existing loyalty card that is assigned to a holder. The removal of points will consume the points that expire the soonest.   &gt;🚧 Async Action    This is an async action. If you want to perform several add or remove loyalty card balance actions in a short time and their order matters, set up sufficient time-out between the calls.  📘 Alternative endpoint  This endpoint is an alternative to this endpoint. The URL was re-designed to allow you to add or remove loyalty card balance without having to provide the campaignId as a path parameter.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

Adjust Loyalty Card Balance

This method adds or removes balance to an existing loyalty card that is assigned to a holder. The removal of points will consume the points that expire the soonest.   &gt;🚧 Async Action    This is an async action. If you want to perform several add or remove loyalty card balance actions in a short time and their order matters, set up sufficient time-out between the calls.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="updateLoyaltyProgram"></a>
# **updateLoyaltyProgram**
> LoyaltiesUpdateCampaignResponseBody updateLoyaltyProgram(campaignId, loyaltiesUpdateCampaignRequestBody)

Update Loyalty Campaign

Updates a loyalty program.  Fields other than those specified in the allowed request body payload wont be modified (even if provided they are silently skipped). Any parameters not provided will be left unchanged.  This method will update the loyalty cards which have not been published or redeemed yet.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    LoyaltiesUpdateCampaignRequestBody loyaltiesUpdateCampaignRequestBody = new LoyaltiesUpdateCampaignRequestBody(); // LoyaltiesUpdateCampaignRequestBody | Specify the new values for the parameters that you would like to update for the given loyalty campaign.
    try {
      LoyaltiesUpdateCampaignResponseBody result = apiInstance.updateLoyaltyProgram(campaignId, loyaltiesUpdateCampaignRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#updateLoyaltyProgram");
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
| **loyaltiesUpdateCampaignRequestBody** | [**LoyaltiesUpdateCampaignRequestBody**](LoyaltiesUpdateCampaignRequestBody.md)| Specify the new values for the parameters that you would like to update for the given loyalty campaign. |

### Return type

[**LoyaltiesUpdateCampaignResponseBody**](LoyaltiesUpdateCampaignResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the loyalty campaign object if the update succeeded. |  -  |

<a id="updateRewardAssignment1"></a>
# **updateRewardAssignment1**
> LoyaltiesRewardsUpdateAssignmentResponseBody updateRewardAssignment1(campaignId, assignmentId, loyaltiesRewardsUpdateAssignmentRequestBody)

Update Reward Assignment

Updates rewards parameters, i.e. the points cost for the specific reward.

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
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    LoyaltiesApi apiInstance = new LoyaltiesApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the loyalty campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty%20Campaign. 
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    LoyaltiesRewardsUpdateAssignmentRequestBody loyaltiesRewardsUpdateAssignmentRequestBody = new LoyaltiesRewardsUpdateAssignmentRequestBody(); // LoyaltiesRewardsUpdateAssignmentRequestBody | Update the points cost for the reward assignment.
    try {
      LoyaltiesRewardsUpdateAssignmentResponseBody result = apiInstance.updateRewardAssignment1(campaignId, assignmentId, loyaltiesRewardsUpdateAssignmentRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltiesApi#updateRewardAssignment1");
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
| **loyaltiesRewardsUpdateAssignmentRequestBody** | [**LoyaltiesRewardsUpdateAssignmentRequestBody**](LoyaltiesRewardsUpdateAssignmentRequestBody.md)| Update the points cost for the reward assignment. |

### Return type

[**LoyaltiesRewardsUpdateAssignmentResponseBody**](LoyaltiesRewardsUpdateAssignmentResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a reward assignment with an updated points value. |  -  |


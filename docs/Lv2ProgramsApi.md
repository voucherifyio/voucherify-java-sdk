# Lv2ProgramsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateCardPendingPointsBucket**](Lv2ProgramsApi.md#activateCardPendingPointsBucket) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points/{bucketId}/activate | Activate pending point bucket |
| [**activateProgramMember**](Lv2ProgramsApi.md#activateProgramMember) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/activate | Activate program member |
| [**adjustCardPoints**](Lv2ProgramsApi.md#adjustCardPoints) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/points | Adjust card points |
| [**batchCreateProgramMembers**](Lv2ProgramsApi.md#batchCreateProgramMembers) | **POST** /v2/loyalties/programs/{programId}/members/batch | Batch create program members |
| [**cancelCardPendingPointsBucket**](Lv2ProgramsApi.md#cancelCardPendingPointsBucket) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points/{bucketId}/cancel | Cancel pending point bucket |
| [**createMemberOrderPayment**](Lv2ProgramsApi.md#createMemberOrderPayment) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/orders/payments | Pay for order with points |
| [**createProgramMember**](Lv2ProgramsApi.md#createProgramMember) | **POST** /v2/loyalties/programs/{programId}/members | Create program member |
| [**deactivateProgramMember**](Lv2ProgramsApi.md#deactivateProgramMember) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/deactivate | Deactivate program member |
| [**deleteProgramMember**](Lv2ProgramsApi.md#deleteProgramMember) | **DELETE** /v2/loyalties/programs/{programId}/members/{memberId} | Delete program member |
| [**expireCardPointsBucket**](Lv2ProgramsApi.md#expireCardPointsBucket) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/expiring-points/{bucketId}/expire | Expire point bucket |
| [**getMemberEarningRuleDailyReport**](Lv2ProgramsApi.md#getMemberEarningRuleDailyReport) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/earning-rules/{earningRuleId}/reports/daily | List member earning-rule daily reports |
| [**getProgramMember**](Lv2ProgramsApi.md#getProgramMember) | **GET** /v2/loyalties/programs/{programId}/members/{memberId} | Get program member |
| [**getProgramMembership**](Lv2ProgramsApi.md#getProgramMembership) | **GET** /v2/loyalties/programs/{programId}/memberships/{customerId} | Get program membership |
| [**getProgramPointsEarningsDailyReport**](Lv2ProgramsApi.md#getProgramPointsEarningsDailyReport) | **GET** /v2/loyalties/programs/{programId}/reports/points-earnings/daily | List program points-earnings daily reports |
| [**getProgramPointsEarningsSummaryReport**](Lv2ProgramsApi.md#getProgramPointsEarningsSummaryReport) | **GET** /v2/loyalties/programs/{programId}/reports/points-earnings/summary | List program points-earnings summary reports |
| [**listCardActivities**](Lv2ProgramsApi.md#listCardActivities) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/activities | List card activities |
| [**listCardExpiringPoints**](Lv2ProgramsApi.md#listCardExpiringPoints) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/expiring-points | List card expiring points buckets |
| [**listCardPendingPoints**](Lv2ProgramsApi.md#listCardPendingPoints) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points | List card pending point buckets |
| [**listCardTransactions**](Lv2ProgramsApi.md#listCardTransactions) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/transactions | List card transactions |
| [**listMemberBenefitTransactions**](Lv2ProgramsApi.md#listMemberBenefitTransactions) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/benefits/transactions | List member benefit transactions |
| [**listMemberCardDailyReports**](Lv2ProgramsApi.md#listMemberCardDailyReports) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/reports/daily | List card daily points reports |
| [**listMemberOrderPayments**](Lv2ProgramsApi.md#listMemberOrderPayments) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/orders/payments | List member order payments |
| [**listMemberRewardPurchases**](Lv2ProgramsApi.md#listMemberRewardPurchases) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases | List member reward purchases |
| [**listMemberTierTransactions**](Lv2ProgramsApi.md#listMemberTierTransactions) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/tiers/transactions | List member tier transactions |
| [**listProgramEarningRuleAssignments**](Lv2ProgramsApi.md#listProgramEarningRuleAssignments) | **GET** /v2/loyalties/programs/{programId}/earning-rules | List program earning rule assignments |
| [**listProgramEarningRulesDailyReports**](Lv2ProgramsApi.md#listProgramEarningRulesDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/earning-rules/daily | List program earning-rules daily reports |
| [**listProgramEarningRulesSummaryReports**](Lv2ProgramsApi.md#listProgramEarningRulesSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/earning-rules/summary | List program earning-rules summary reports |
| [**listProgramMemberActivities**](Lv2ProgramsApi.md#listProgramMemberActivities) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/activities | List program member activities |
| [**listProgramMembers**](Lv2ProgramsApi.md#listProgramMembers) | **GET** /v2/loyalties/programs/{programId}/members | List program members |
| [**listProgramMembersDailyReports**](Lv2ProgramsApi.md#listProgramMembersDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/members/daily | List program members daily reports |
| [**listProgramMembersSummaryReports**](Lv2ProgramsApi.md#listProgramMembersSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/members/summary | List program members summary reports |
| [**listProgramRewardAssignments**](Lv2ProgramsApi.md#listProgramRewardAssignments) | **GET** /v2/loyalties/programs/{programId}/rewards | List program reward assignments |
| [**listProgramRewardsDailyReports**](Lv2ProgramsApi.md#listProgramRewardsDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/rewards/daily | List program rewards daily reports |
| [**listProgramRewardsSpendingsDailyReports**](Lv2ProgramsApi.md#listProgramRewardsSpendingsDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/rewards/spendings/daily | List program rewards spendings daily reports |
| [**listProgramRewardsSpendingsSummaryReports**](Lv2ProgramsApi.md#listProgramRewardsSpendingsSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/rewards/spendings/summary | List program rewards spendings summary reports |
| [**listProgramRewardsSummaryReports**](Lv2ProgramsApi.md#listProgramRewardsSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/rewards/summary | List program rewards summary reports |
| [**listProgramSpendingDailyReports**](Lv2ProgramsApi.md#listProgramSpendingDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/spending/daily | List program spending daily reports |
| [**listProgramSpendingSummaryReports**](Lv2ProgramsApi.md#listProgramSpendingSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/spending/summary | List program spending summary reports |
| [**listProgramTierStructureAssignments**](Lv2ProgramsApi.md#listProgramTierStructureAssignments) | **GET** /v2/loyalties/programs/{programId}/tier-structures | List program tier structure assignments |
| [**listProgramTiersDailyReports**](Lv2ProgramsApi.md#listProgramTiersDailyReports) | **GET** /v2/loyalties/programs/{programId}/reports/tiers/daily | List program tiers daily reports |
| [**listProgramTiersSummaryReports**](Lv2ProgramsApi.md#listProgramTiersSummaryReports) | **GET** /v2/loyalties/programs/{programId}/reports/tiers/summary | List program tiers summary reports |
| [**purchaseMemberReward**](Lv2ProgramsApi.md#purchaseMemberReward) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases | Purchase reward with points |
| [**refundRewardPurchase**](Lv2ProgramsApi.md#refundRewardPurchase) | **POST** /v2/loyalties/programs/{programId}/rewards/purchases/{rewardTransactionId}/refund | Refund reward purchase |
| [**updateProgramMember**](Lv2ProgramsApi.md#updateProgramMember) | **PUT** /v2/loyalties/programs/{programId}/members/{memberId} | Update program member |


<a id="activateCardPendingPointsBucket"></a>
# **activateCardPendingPointsBucket**
> V2LoyaltiesProgramsMembersCardsPendingPointsActivateResponseBody activateCardPendingPointsBucket(programId, memberId, cardId, bucketId)

Activate pending point bucket

Activates a pending points bucket and creates a PENDING_POINTS_ACTIVATED card transaction. The transaction is created with status PENDING and processed asynchronously. No request body. The bucket must be PENDING, and its date must be after the current project day. The program and the member must be ACTIVE, and the program must be inside its validity window. Otherwise the response is 423. Returns 404 when the program or the member doesnt exist, when the card isnt assigned to that member, or when the bucket isnt on that card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    String bucketId = "bucketId_example"; // String | Pending points bucket ID (format lcppb_[a-f0-9]+).
    try {
      V2LoyaltiesProgramsMembersCardsPendingPointsActivateResponseBody result = apiInstance.activateCardPendingPointsBucket(programId, memberId, cardId, bucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#activateCardPendingPointsBucket");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **bucketId** | **String**| Pending points bucket ID (format lcppb_[a-f0-9]+). |

### Return type

[**V2LoyaltiesProgramsMembersCardsPendingPointsActivateResponseBody**](V2LoyaltiesProgramsMembersCardsPendingPointsActivateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the pending points activation. |  -  |

<a id="activateProgramMember"></a>
# **activateProgramMember**
> V2LoyaltiesProgramsMembersActivateResponseBody activateProgramMember(programId, memberId)

Activate program member

Moves an INACTIVE member to ACTIVE and sets updated_at. Records a vl.member.activated activity. No request body. Returns the member without a cards array. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first. A DELETED member returns 404. Returns 400 with key invalid_state_transition when the member is already ACTIVE.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format lprg_[a-f0-9]+. Required.
    String memberId = "memberId_example"; // String | Identifies the member. Format lmbr_[a-f0-9]+. Required.
    try {
      V2LoyaltiesProgramsMembersActivateResponseBody result = apiInstance.activateProgramMember(programId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#activateProgramMember");
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
| **programId** | **String**| Identifies the loyalty program. Format lprg_[a-f0-9]+. Required. |
| **memberId** | **String**| Identifies the member. Format lmbr_[a-f0-9]+. Required. |

### Return type

[**V2LoyaltiesProgramsMembersActivateResponseBody**](V2LoyaltiesProgramsMembersActivateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The activated member, without cards. Status is always &#x60;ACTIVE&#x60;. |  -  |

<a id="adjustCardPoints"></a>
# **adjustCardPoints**
> V2LoyaltiesProgramsMembersCardsPointsAdjustResponseBody adjustCardPoints(programId, memberId, cardId, v2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody)

Adjust card points

Manually adjusts the points balance of the members card. A positive points value creates an ADMIN_CREDIT card transaction. The expiration date comes from the member tier when that tier defines its own points expiration. Otherwise the date comes from the card definition. expiration_date is null when points dont expire. A negative points value creates an ADMIN_DEBIT card transaction. When points is 0, no transaction is created and status is NO_CHANGE. The transaction is created with status PENDING and processed asynchronously. The program and the member must be ACTIVE. The program must also be inside its validity window. Otherwise the response is 423. The response is 404 when the program or the member doesnt exist, or when the card isnt assigned to that member.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody v2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody = new V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody(); // V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody | 
    try {
      V2LoyaltiesProgramsMembersCardsPointsAdjustResponseBody result = apiInstance.adjustCardPoints(programId, memberId, cardId, v2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#adjustCardPoints");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **v2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody** | [**V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody**](V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody.md)|  |

### Return type

[**V2LoyaltiesProgramsMembersCardsPointsAdjustResponseBody**](V2LoyaltiesProgramsMembersCardsPointsAdjustResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the points adjustment. |  -  |

<a id="batchCreateProgramMembers"></a>
# **batchCreateProgramMembers**
> V2LoyaltiesProgramsMembersCreateInBulkResponseBody batchCreateProgramMembers(programId, memberCreate)

Batch create program members

Schedules creation of program members from a JSON array and returns 202 with async_action_id. The program must exist, be ACTIVE, and be inside its validity window. The body isnt checked before that response. Entries are processed in batches of 100. The raw body must be at most 10 MB. Each entry uses the same fields as [Create program member](/api-reference/programs/create-program-member). A failed entry is skipped. Its report row sets created to false and explains the failure in error. Skipped cases include an invalid customer_identification, an unknown customer, an invalid status, a duplicate customer in the batch (Duplicate customer ID), a customer who is already a member (Member already exists), metadata that doesnt match the vl_member schema, and entries past the loyalty members plan limit. Successful entries enroll the customer and create a loyalty card for each card definition on the program. Report columns are identification_type, customer_id, customer_source_id, program_id, member_id, created, and error. An empty array or a null entry fails the async action with invalid_request_payload. A body that isnt a JSON array fails it with top_level_object_should_be_an_array. Use [Get async action](/api-reference/async-actions/get-async-action) to read the status and the report. You can also open the result from Audit log, [Background tasks](/analyze/audit-logs#background-tasks).

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    List<MemberCreate> memberCreate = Arrays.asList(); // List<MemberCreate> | 
    try {
      V2LoyaltiesProgramsMembersCreateInBulkResponseBody result = apiInstance.batchCreateProgramMembers(programId, memberCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#batchCreateProgramMembers");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberCreate** | [**List&lt;MemberCreate&gt;**](MemberCreate.md)|  |

### Return type

[**V2LoyaltiesProgramsMembersCreateInBulkResponseBody**](V2LoyaltiesProgramsMembersCreateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The batch is scheduled. Use &#x60;async_action_id&#x60; to follow processing. |  -  |

<a id="cancelCardPendingPointsBucket"></a>
# **cancelCardPendingPointsBucket**
> V2LoyaltiesProgramsMembersCardsPendingPointsCancelResponseBody cancelCardPendingPointsBucket(programId, memberId, cardId, bucketId)

Cancel pending point bucket

Cancels a pending points bucket so its points arent activated. Creates a PENDING_POINTS_CANCELED card transaction. The transaction is created with status PENDING and processed asynchronously. No request body. The bucket must be PENDING, and its date must be after the current project day. The program and the member must be ACTIVE, and the program must be inside its validity window. Otherwise the response is 423. Returns 404 when the program or the member doesnt exist, when the card isnt assigned to that member, or when the bucket isnt on that card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    String bucketId = "bucketId_example"; // String | Pending points bucket ID (format lcppb_[a-f0-9]+).
    try {
      V2LoyaltiesProgramsMembersCardsPendingPointsCancelResponseBody result = apiInstance.cancelCardPendingPointsBucket(programId, memberId, cardId, bucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#cancelCardPendingPointsBucket");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **bucketId** | **String**| Pending points bucket ID (format lcppb_[a-f0-9]+). |

### Return type

[**V2LoyaltiesProgramsMembersCardsPendingPointsCancelResponseBody**](V2LoyaltiesProgramsMembersCardsPendingPointsCancelResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the pending points cancellation. |  -  |

<a id="createMemberOrderPayment"></a>
# **createMemberOrderPayment**
> LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody createMemberOrderPayment(programId, memberId, v2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody)

Pay for order with points

Pays for an order with points from the members card. The amount and points come from the card definitions pay-with-points exchange ratio, limited by the order total, the card balance, card spending caps, and the optional payment_limit. The binding cap is returned as details.spending_cap. The program and member must be ACTIVE, and the program must be inside its validity window. The card must belong to the member. The card definition must have pay-with-points enabled and an exchange-ratio formula. The order must already exist, identified by id or source_id. Modes: - TRANSACTION (default): creates a PENDING order transaction and a PENDING card transaction. Returns 202. The same order can be paid again; each call creates a new transaction. - DRY_RUN: simulates the payment and doesnt create a transaction. Returns 200 with status SIMULATED.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Identifies the program member (lmbr_[a-f0-9]+).
    V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody v2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody = new V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody(); // V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody | 
    try {
      LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody result = apiInstance.createMemberOrderPayment(programId, memberId, v2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#createMemberOrderPayment");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Identifies the program member (lmbr_[a-f0-9]+). |
| **v2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody** | [**V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody**](V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody.md)|  |

### Return type

[**LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody**](LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dry run result (mode &#x60;DRY_RUN&#x60;). No transaction was created; the returned transaction has status &#x60;SIMULATED&#x60; and no &#x60;id&#x60;. and Payment accepted (mode &#x60;TRANSACTION&#x60;). A &#x60;PENDING&#x60; order transaction was created and will be processed asynchronously. |  -  |

<a id="createProgramMember"></a>
# **createProgramMember**
> V2LoyaltiesProgramsMembersCreateResponseBody createProgramMember(programId, v2LoyaltiesProgramsMembersCreateRequestBody)

Create program member

Enrolls an existing customer as a member of the loyalty program and creates a loyalty card for each card definition assigned to the program. Card code generation is asynchronous, so code can be null right after creation. The program must be ACTIVE and inside its validity window, and the customer must already exist. A customer can be a member of a program only once. Identify the customer with customer_identification. status defaults to ACTIVE.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    V2LoyaltiesProgramsMembersCreateRequestBody v2LoyaltiesProgramsMembersCreateRequestBody = new V2LoyaltiesProgramsMembersCreateRequestBody(); // V2LoyaltiesProgramsMembersCreateRequestBody | 
    try {
      V2LoyaltiesProgramsMembersCreateResponseBody result = apiInstance.createProgramMember(programId, v2LoyaltiesProgramsMembersCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#createProgramMember");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **v2LoyaltiesProgramsMembersCreateRequestBody** | [**V2LoyaltiesProgramsMembersCreateRequestBody**](V2LoyaltiesProgramsMembersCreateRequestBody.md)|  |

### Return type

[**V2LoyaltiesProgramsMembersCreateResponseBody**](V2LoyaltiesProgramsMembersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created member with its automatically created cards. |  -  |

<a id="deactivateProgramMember"></a>
# **deactivateProgramMember**
> V2LoyaltiesProgramsMembersDeactivateResponseBody deactivateProgramMember(programId, memberId)

Deactivate program member

Moves an ACTIVE member to INACTIVE and sets updated_at. Records a vl.member.deactivated activity. An INACTIVE member cant earn or spend points. No request body. Returns the member without a cards array. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first. A DELETED member returns 404. Returns 400 with key invalid_state_transition when the member is already INACTIVE.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Unique identifier in lprg_[a-f0-9]+ format.
    String memberId = "memberId_example"; // String | Identifies the member. Unique identifier in lmbr_[a-f0-9]+ format.
    try {
      V2LoyaltiesProgramsMembersDeactivateResponseBody result = apiInstance.deactivateProgramMember(programId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#deactivateProgramMember");
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
| **programId** | **String**| Identifies the loyalty program. Unique identifier in lprg_[a-f0-9]+ format. |
| **memberId** | **String**| Identifies the member. Unique identifier in lmbr_[a-f0-9]+ format. |

### Return type

[**V2LoyaltiesProgramsMembersDeactivateResponseBody**](V2LoyaltiesProgramsMembersDeactivateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deactivated member, without cards. Status is always &#x60;INACTIVE&#x60;. |  -  |

<a id="deleteProgramMember"></a>
# **deleteProgramMember**
> V2LoyaltiesProgramsMembersDeleteResponseBody deleteProgramMember(programId, memberId)

Delete program member

Deletes the member and sets status to DELETED. Removes the members card assignments in this program. Returns the member without a cards array. Delete doesnt change updated_at. Records a vl.member.deleted activity. Each unassigned card also records vl.member.card.unassigned and vl.card.unassigned. When an assignment has a tier, the delete records a LEFT tier transaction with origin member_card_deleted. The same customer can join the program again. The new member gets a new ID. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first. Deleting a member that is already DELETED returns 404.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    try {
      V2LoyaltiesProgramsMembersDeleteResponseBody result = apiInstance.deleteProgramMember(programId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#deleteProgramMember");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |

### Return type

[**V2LoyaltiesProgramsMembersDeleteResponseBody**](V2LoyaltiesProgramsMembersDeleteResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The deleted member (without cards). |  -  |

<a id="expireCardPointsBucket"></a>
# **expireCardPointsBucket**
> V2LoyaltiesProgramsMembersCardsExpiringPointsExpireResponseBody expireCardPointsBucket(programId, memberId, cardId, bucketId)

Expire point bucket

Expires an ACTIVE points bucket. Creates an ADMIN_POINTS_EXPIRATION card transaction. The transaction is created with status PENDING and processed asynchronously. No request body. The bucket must be ACTIVE, and its expiration_date must be on or after the current project day. The program and the member must be ACTIVE, and the program must be inside its validity window. Otherwise the response is 423. Returns 404 when the program, the member, or the card definition doesnt exist, when the card isnt assigned to that member, or when the bucket isnt on that card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    String bucketId = "bucketId_example"; // String | Points expiration bucket ID (format lcpeb_[a-f0-9]+).
    try {
      V2LoyaltiesProgramsMembersCardsExpiringPointsExpireResponseBody result = apiInstance.expireCardPointsBucket(programId, memberId, cardId, bucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#expireCardPointsBucket");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **bucketId** | **String**| Points expiration bucket ID (format lcpeb_[a-f0-9]+). |

### Return type

[**V2LoyaltiesProgramsMembersCardsExpiringPointsExpireResponseBody**](V2LoyaltiesProgramsMembersCardsExpiringPointsExpireResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of the points expiration. |  -  |

<a id="getMemberEarningRuleDailyReport"></a>
# **getMemberEarningRuleDailyReport**
> V2LoyaltiesProgramsMembersEarningRulesReportsDailyListResponseBody getMemberEarningRuleDailyReport(programId, memberId, earningRuleId, startDate, endDate, resolution)

List member earning-rule daily reports

Returns aggregated daily usage statistics for a specific earning rule and member over the given date range and resolution. Each entry sums successful earning-rule triggers recorded in one period. Periods without recorded activity are omitted. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program or member does not exist, or when the earning rule does not exist or is not assigned to the program.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Unique loyalty member identifier (format: lmbr_ followed by hexadecimal characters).
    String earningRuleId = "earningRuleId_example"; // String | Unique earning rule identifier (format: lern_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Start of the report date range (inclusive), in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date.
    String resolution = "day"; // String | Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters.
    try {
      V2LoyaltiesProgramsMembersEarningRulesReportsDailyListResponseBody result = apiInstance.getMemberEarningRuleDailyReport(programId, memberId, earningRuleId, startDate, endDate, resolution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#getMemberEarningRuleDailyReport");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Unique loyalty member identifier (format: lmbr_ followed by hexadecimal characters). |
| **earningRuleId** | **String**| Unique earning rule identifier (format: lern_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Start of the report date range (inclusive), in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date. |
| **resolution** | **String**| Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters. |

### Return type

[**V2LoyaltiesProgramsMembersEarningRulesReportsDailyListResponseBody**](V2LoyaltiesProgramsMembersEarningRulesReportsDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member earning-rule daily report. |  -  |

<a id="getProgramMember"></a>
# **getProgramMember**
> V2LoyaltiesProgramsMembersGetResponseBody getProgramMember(programId, memberId)

Get program member

Returns one member of the program together with that members loyalty cards. Each card includes balance, lifetime_bucket, next_expiration, and next_activation. tier_progress is not included. Use [Get program membership](/api-reference/programs/get-program-membership) when you need tier progress. card.code can be null shortly after member creation, while code generation is still running. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    try {
      V2LoyaltiesProgramsMembersGetResponseBody result = apiInstance.getProgramMember(programId, memberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#getProgramMember");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |

### Return type

[**V2LoyaltiesProgramsMembersGetResponseBody**](V2LoyaltiesProgramsMembersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The member with its cards. |  -  |

<a id="getProgramMembership"></a>
# **getProgramMembership**
> V2LoyaltiesProgramsMembershipsGetResponseBody getProgramMembership(programId, customerId, identificationType)

Get program membership

Returns the membership for one customer in the program: the member, the program, and the members loyalty cards. A card includes tier_progress when its card definition has a tier structure and the member has a tier on that card. Otherwise tier_progress is omitted. identification_type chooses how customerId is read. It defaults to customer_id.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String customerId = "customerId_example"; // String | Unique identifier of the customer or member, interpreted according to identification_type: a Voucherify customer ID (cust_...), a customer source_id, or a loyalty member ID (lmbr_...).
    String identificationType = "customer_id"; // String | Chooses how customerId is read. customer_id is the Voucherify customer ID and the default. customer_source_id is the customers source_id. member_id is the loyalty member ID.
    try {
      V2LoyaltiesProgramsMembershipsGetResponseBody result = apiInstance.getProgramMembership(programId, customerId, identificationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#getProgramMembership");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **customerId** | **String**| Unique identifier of the customer or member, interpreted according to identification_type: a Voucherify customer ID (cust_...), a customer source_id, or a loyalty member ID (lmbr_...). |
| **identificationType** | **String**| Chooses how customerId is read. customer_id is the Voucherify customer ID and the default. customer_source_id is the customers source_id. member_id is the loyalty member ID. |

### Return type

[**V2LoyaltiesProgramsMembershipsGetResponseBody**](V2LoyaltiesProgramsMembershipsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The membership in the program. |  -  |

<a id="getProgramPointsEarningsDailyReport"></a>
# **getProgramPointsEarningsDailyReport**
> V2LoyaltiesProgramsReportsPointsEarningsDailyListResponseBody getProgramPointsEarningsDailyReport(programId, startDate, endDate, resolution, filters)

List program points-earnings daily reports

Returns aggregated daily points-earnings statistics for the program over the given date range and resolution, optionally filtered by earning rule and card definition. Each entry sums earning operations recorded for one period, earning rule, earning item, and card definition. Periods without recorded activity are omitted. A filter that matches no rows returns an empty data array. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters.
    LocalDate startDate = LocalDate.now(); // LocalDate | Start of the report date range (inclusive), in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date.
    String resolution = "day"; // String | Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters.
    PointsEarningsReportListFilters filters = new PointsEarningsReportListFilters(); // PointsEarningsReportListFilters | Filters rows by earning rule ID and card definition ID. Each field takes a conditions object. Omitting filters or setting it to null applies no field filters.
    try {
      V2LoyaltiesProgramsReportsPointsEarningsDailyListResponseBody result = apiInstance.getProgramPointsEarningsDailyReport(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#getProgramPointsEarningsDailyReport");
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
| **programId** | **String**| Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters. |
| **startDate** | **LocalDate**| Start of the report date range (inclusive), in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date. |
| **resolution** | **String**| Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters. |
| **filters** | [**PointsEarningsReportListFilters**](.md)| Filters rows by earning rule ID and card definition ID. Each field takes a conditions object. Omitting filters or setting it to null applies no field filters. |

### Return type

[**V2LoyaltiesProgramsReportsPointsEarningsDailyListResponseBody**](V2LoyaltiesProgramsReportsPointsEarningsDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program points-earnings daily report. |  -  |

<a id="getProgramPointsEarningsSummaryReport"></a>
# **getProgramPointsEarningsSummaryReport**
> V2LoyaltiesProgramsReportsPointsEarningsSummaryListResponseBody getProgramPointsEarningsSummaryReport(programId, filters)

List program points-earnings summary reports

Returns total points-earnings statistics for the program (all time), optionally filtered by earning rule or card definition. Each entry sums earning operations for one earning rule, earning item, and card definition. Returns at most 100 rows, ordered by id descending. limit and order are not query parameters. A filter that matches no rows returns an empty data array. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters.
    PointsEarningsReportListFilters filters = new PointsEarningsReportListFilters(); // PointsEarningsReportListFilters | Filters rows by earning rule ID and card definition ID. Each field takes a conditions object. Omitting filters or setting it to null applies no field filters.
    try {
      V2LoyaltiesProgramsReportsPointsEarningsSummaryListResponseBody result = apiInstance.getProgramPointsEarningsSummaryReport(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#getProgramPointsEarningsSummaryReport");
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
| **programId** | **String**| Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters. |
| **filters** | [**PointsEarningsReportListFilters**](.md)| Filters rows by earning rule ID and card definition ID. Each field takes a conditions object. Omitting filters or setting it to null applies no field filters. |

### Return type

[**V2LoyaltiesProgramsReportsPointsEarningsSummaryListResponseBody**](V2LoyaltiesProgramsReportsPointsEarningsSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program points-earnings summary report. |  -  |

<a id="listCardActivities"></a>
# **listCardActivities**
> V2LoyaltiesProgramsMembersCardsActivitiesListResponseBody listCardActivities(programId, memberId, cardId, limit, order, cursor, filters)

List card activities

Returns a cursor-paginated list of activities recorded for the members card. The card must still be assigned to that member. Filters are id, type, and created_at. Default order is -created_at, then id ascending. Returns 404 when the program doesnt exist, when the member doesnt exist in that program, or when the card isnt currently assigned to that member. The program is checked first, then the member. A DELETED member returns 404 with resource_type member. A missing assignment and a missing or deleted card both return 404 with resource_type card. Returns 400 with key invalid_query_params when the query fails validation. That check runs before the program, member, and card lookup. A cursor that doesnt match ^lcrsacrd_[a-f0-9]+$, a limit outside 1 to 100, an order other than created_at or -created_at, or an array that orders by both directions fails here. After the program, member, and card are found, an unknown or expired cursor returns invalid_or_expired_cursor. A cursor recorded for different filters or order returns cursor_and_query_mismatch. The cursor stays valid when only limit changes.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of activities to return. An integer from 1 to 100. Numeric strings are accepted and rounded to the nearest integer. Defaults to 10 when omitted.
    String order = "created_at"; // String | Sort field. Allowed values are created_at and -created_at. Defaults to -created_at when omitted, null, or an empty array. Accepts one value or an array of those values. Any other value is rejected. An array that contains both directions is rejected. Rows that share a created_at millisecond are then ordered by id ascending.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsacrd_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFilters filters = new V2LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFilters(); // V2LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFilters | Field-specific filter conditions, passed as a deep object, e.g. filters[type][conditions][$is] vl.card.created.
    try {
      V2LoyaltiesProgramsMembersCardsActivitiesListResponseBody result = apiInstance.listCardActivities(programId, memberId, cardId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listCardActivities");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of activities to return. An integer from 1 to 100. Numeric strings are accepted and rounded to the nearest integer. Defaults to 10 when omitted. |
| **order** | **String**| Sort field. Allowed values are created_at and -created_at. Defaults to -created_at when omitted, null, or an empty array. Accepts one value or an array of those values. Any other value is rejected. An array that contains both directions is rejected. Rows that share a created_at millisecond are then ordered by id ascending. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsacrd_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersCardsActivitiesListRequestQueryFilters**](.md)| Field-specific filter conditions, passed as a deep object, e.g. filters[type][conditions][$is] vl.card.created. |

### Return type

[**V2LoyaltiesProgramsMembersCardsActivitiesListResponseBody**](V2LoyaltiesProgramsMembersCardsActivitiesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of card activities. |  -  |

<a id="listCardExpiringPoints"></a>
# **listCardExpiringPoints**
> V2LoyaltiesProgramsMembersCardsExpiringPointsListResponseBody listCardExpiringPoints(programId, memberId, cardId, limit, order, cursor, filters)

List card expiring points buckets

Returns a cursor-paginated list of ACTIVE point expiration buckets for the members card. Each bucket groups points that share an expiration date and expiration type, including points from separate transactions. The list starts on the current project day. Earlier buckets are omitted. Results can be filtered by card definition ID and expiration date, and ordered by expiration_date. Returns an empty list when the card has no matching buckets. Returns 400 when the query is invalid or the cursor is invalid, expired, or doesnt match the query. Returns 404 when the program or the member doesnt exist, or when the card isnt assigned to that member.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of buckets to return. Must be between 1 and 100. Defaults to 10 when not provided.
    String order = "expiration_date"; // String | Field(s) to order results by. Valid orders are expiration_date and -expiration_date; defaults to expiration_date (soonest expiration first). Ordering by the same field in both directions simultaneously is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrspeb_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersCardsExpiringPointsListRequestQuery filters = new V2LoyaltiesProgramsMembersCardsExpiringPointsListRequestQuery(); // V2LoyaltiesProgramsMembersCardsExpiringPointsListRequestQuery | Field-specific filter conditions, passed as a deep object, for example filters[card_definition_id][conditions][$is] lcdef_1297339938ae248cea.
    try {
      V2LoyaltiesProgramsMembersCardsExpiringPointsListResponseBody result = apiInstance.listCardExpiringPoints(programId, memberId, cardId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listCardExpiringPoints");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of buckets to return. Must be between 1 and 100. Defaults to 10 when not provided. |
| **order** | **String**| Field(s) to order results by. Valid orders are expiration_date and -expiration_date; defaults to expiration_date (soonest expiration first). Ordering by the same field in both directions simultaneously is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrspeb_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersCardsExpiringPointsListRequestQuery**](.md)| Field-specific filter conditions, passed as a deep object, for example filters[card_definition_id][conditions][$is] lcdef_1297339938ae248cea. |

### Return type

[**V2LoyaltiesProgramsMembersCardsExpiringPointsListResponseBody**](V2LoyaltiesProgramsMembersCardsExpiringPointsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of points expiration buckets. |  -  |

<a id="listCardPendingPoints"></a>
# **listCardPendingPoints**
> V2LoyaltiesProgramsMembersCardsPendingPointsListResponseBody listCardPendingPoints(programId, memberId, cardId, limit, order, cursor, filters)

List card pending point buckets

Returns a cursor-paginated list of pending point buckets for the members card. Every bucket has status PENDING. Pending points wait for activation (PERIOD_BASED, FIXED_DATES, or EVENT_BASED), following the card definition. The list starts on the next project day. The current days bucket is omitted because its still accumulating. Results can be filtered by card definition ID and ordered by date. Returns 404 when the program or the member doesnt exist, or when the card isnt assigned to that member. Bucket IDs from this list are the bucketId for [Activate pending point bucket](/api-reference/programs/activate-pending-point-bucket) and [Cancel pending point bucket](/api-reference/programs/cancel-pending-point-bucket).

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of buckets to return. Must be between 1 and 100. Defaults to 10 when not provided.
    String order = "date"; // String | Field(s) to order results by. Valid orders are date and -date; defaults to date (soonest activation first). Ordering by the same field in both directions simultaneously is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrscppb_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery filters = new V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery(); // V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery | Field-specific filter conditions, passed as a deep object, for example filters[card_definition_id][conditions][$is] lcdef_128f495f720c4bec8c.
    try {
      V2LoyaltiesProgramsMembersCardsPendingPointsListResponseBody result = apiInstance.listCardPendingPoints(programId, memberId, cardId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listCardPendingPoints");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of buckets to return. Must be between 1 and 100. Defaults to 10 when not provided. |
| **order** | **String**| Field(s) to order results by. Valid orders are date and -date; defaults to date (soonest activation first). Ordering by the same field in both directions simultaneously is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrscppb_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersCardsPendingPointsListRequestQuery**](.md)| Field-specific filter conditions, passed as a deep object, for example filters[card_definition_id][conditions][$is] lcdef_128f495f720c4bec8c. |

### Return type

[**V2LoyaltiesProgramsMembersCardsPendingPointsListResponseBody**](V2LoyaltiesProgramsMembersCardsPendingPointsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of pending point buckets. |  -  |

<a id="listCardTransactions"></a>
# **listCardTransactions**
> V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody listCardTransactions(programId, memberId, cardId, limit, order, cursor, filters)

List card transactions

Returns a cursor-paginated list of transactions on the members card. Filter by id, card_definition_id, and created_at. Order by id (default -id, newest first). Returns 404 when the program, member, or card doesnt exist. The program is checked first, then the member, then the card. A member of another program, or a card that isnt assigned to this member, is not found.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    String cardId = "cardId_example"; // String | Loyalty card ID (format lcrd_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of transactions to return. Must be between 1 and 100. Defaults to 10 when not provided.
    String order = "-id"; // String | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsctx_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery filters = new V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery(); // V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery | Field-specific filter conditions, passed as a deep object, e.g. filters[id][conditions][$is] lctx_0f5d0a8878caa3ee5c.
    try {
      V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody result = apiInstance.listCardTransactions(programId, memberId, cardId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listCardTransactions");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **cardId** | **String**| Loyalty card ID (format lcrd_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of transactions to return. Must be between 1 and 100. Defaults to 10 when not provided. |
| **order** | **String**| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsctx_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersCardsTransactionsListRequestQuery**](.md)| Field-specific filter conditions, passed as a deep object, e.g. filters[id][conditions][$is] lctx_0f5d0a8878caa3ee5c. |

### Return type

[**V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody**](V2LoyaltiesProgramsMembersCardsTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of card transactions. |  -  |

<a id="listMemberBenefitTransactions"></a>
# **listMemberBenefitTransactions**
> V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBody listMemberBenefitTransactions(programId, memberId, limit, order, cursor, filters)

List member benefit transactions

Lists benefit transactions (benefit fulfillments) for a given program member, with cursor-based pagination. Supports filtering by benefit ID and creation date.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10.
    String order = "id"; // String | Field(s) to order results by. Valid orders are id and -id; defaults to -id (newest first). Ordering by the same field in both directions simultaneously is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrsbtx_ followed by hexadecimal characters).
    V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery filters = new V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery(); // V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery | Field filters, e.g. filters[benefit_id][conditions][$is] lben_.... Each field accepts a conditions object with condition operators.
    try {
      V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBody result = apiInstance.listMemberBenefitTransactions(programId, memberId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listMemberBenefitTransactions");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10. |
| **order** | **String**| Field(s) to order results by. Valid orders are id and -id; defaults to -id (newest first). Ordering by the same field in both directions simultaneously is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrsbtx_ followed by hexadecimal characters). |
| **filters** | [**V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery**](.md)| Field filters, e.g. filters[benefit_id][conditions][$is] lben_.... Each field accepts a conditions object with condition operators. |

### Return type

[**V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBody**](V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of benefit transactions. |  -  |

<a id="listMemberCardDailyReports"></a>
# **listMemberCardDailyReports**
> LoyaltiesProgramsMembersCardsReportsDailyListResponseBody listMemberCardDailyReports(programId, memberId, cardId, startDate, endDate, resolution)

List card daily points reports

Returns aggregated points statistics for a members loyalty card over the given date range and resolution. Each entry sums the point operations recorded in one period. Periods without recorded activity are omitted. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program or member does not exist, or when the card does not exist or is not assigned to the member in the program.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Unique loyalty member identifier (format: lmbr_ followed by hexadecimal characters).
    String cardId = "cardId_example"; // String | Unique loyalty card identifier (format: lcrd_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Start of the report date range (inclusive), in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date.
    String resolution = "day"; // String | Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters.
    try {
      LoyaltiesProgramsMembersCardsReportsDailyListResponseBody result = apiInstance.listMemberCardDailyReports(programId, memberId, cardId, startDate, endDate, resolution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listMemberCardDailyReports");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Unique loyalty member identifier (format: lmbr_ followed by hexadecimal characters). |
| **cardId** | **String**| Unique loyalty card identifier (format: lcrd_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Start of the report date range (inclusive), in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date. |
| **resolution** | **String**| Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters. |

### Return type

[**LoyaltiesProgramsMembersCardsReportsDailyListResponseBody**](LoyaltiesProgramsMembersCardsReportsDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card daily points report. |  -  |

<a id="listMemberOrderPayments"></a>
# **listMemberOrderPayments**
> V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody listMemberOrderPayments(programId, memberId, limit, order, cursor, filters)

List member order payments

Lists stored PAY_WITH_POINTS order transactions for the program member, with cursor pagination. Filter by id, card_definition_id, and created_at. Order by id (default -id, newest first). Dry-run (SIMULATED) results arent stored and dont appear. Returns 404 when the program or the member doesnt exist. The program is checked first.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Identifies the program member (lmbr_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10.
    String order = "-id"; // String | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrsotx_ followed by hexadecimal characters).
    V2LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery filters = new V2LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery(); // V2LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery | Filters results by field, e.g. filters[id][conditions][$is] lotx_.... Each field accepts a conditions object with condition operators.
    try {
      V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody result = apiInstance.listMemberOrderPayments(programId, memberId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listMemberOrderPayments");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Identifies the program member (lmbr_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10. |
| **order** | **String**| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrsotx_ followed by hexadecimal characters). |
| **filters** | [**V2LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery**](.md)| Filters results by field, e.g. filters[id][conditions][$is] lotx_.... Each field accepts a conditions object with condition operators. |

### Return type

[**V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody**](V2LoyaltiesProgramsMembersOrdersPaymentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a paginated list of persisted order payment transactions. |  -  |

<a id="listMemberRewardPurchases"></a>
# **listMemberRewardPurchases**
> V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody listMemberRewardPurchases(programId, memberId, limit, order, cursor, filters)

List member reward purchases

Lists stored PURCHASE reward transactions for the program member, with cursor pagination. Filter by id, reward_id, card_definition_id, and created_at. Order by id (default -id, newest first). Purchases rejected before a transaction is stored dont appear. A purchase accepted with 202 that later fails is stored as REJECTED with details.rejection. Returns 404 when the program or the member doesnt exist. The program is checked first.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10.
    String order = "-id"; // String | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrstrx_ followed by hexadecimal characters).
    V2LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery filters = new V2LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery(); // V2LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery | Field filters, e.g. filters[reward_id][conditions][$is] lrew_.... Each field accepts a conditions object with condition operators.
    try {
      V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody result = apiInstance.listMemberRewardPurchases(programId, memberId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listMemberRewardPurchases");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10. |
| **order** | **String**| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrstrx_ followed by hexadecimal characters). |
| **filters** | [**V2LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery**](.md)| Field filters, e.g. filters[reward_id][conditions][$is] lrew_.... Each field accepts a conditions object with condition operators. |

### Return type

[**V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody**](V2LoyaltiesProgramsMembersRewardsPurchasesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of reward purchase transactions. |  -  |

<a id="listMemberTierTransactions"></a>
# **listMemberTierTransactions**
> V2LoyaltiesProgramsMembersTiersTransactionsListResponseBody listMemberTierTransactions(programId, memberId, limit, order, cursor, filters)

List member tier transactions

Lists tier transactions for the member: joins, leaves, upgrades, downgrades, expiration changes, and evaluation refreshes. Results use cursor pagination. Default order is -id, newest first. Filters are card_id, card_definition_id, and created_at. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first. A DELETED member returns 404. Returns 400 with key invalid_query_params when the query fails validation. That check runs before the program and member lookup. order must be id or -id. An array that orders by both directions is rejected. A cursor that doesnt match ^lcrsttx_[a-f0-9]+$ fails here. After the program and member are found, an unknown or expired cursor returns invalid_or_expired_cursor. A cursor recorded for different filters or order returns cursor_and_query_mismatch. The cursor stays valid when only limit changes.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10.
    String order = "-id"; // String | Sort field. Allowed values are id and -id. Defaults to -id, newest first, when omitted, null, or an empty array. Accepts one value or an array of those values. An array that contains both directions is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrsttx_ followed by hexadecimal characters).
    V2LoyaltiesProgramsMembersTiersTransactionsListRequestQuery filters = new V2LoyaltiesProgramsMembersTiersTransactionsListRequestQuery(); // V2LoyaltiesProgramsMembersTiersTransactionsListRequestQuery | Field filters. card_id, card_definition_id, and created_at. Example: filters[card_id][conditions][$is] lcrd_....
    try {
      V2LoyaltiesProgramsMembersTiersTransactionsListResponseBody result = apiInstance.listMemberTierTransactions(programId, memberId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listMemberTierTransactions");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of items to return. An integer between 1 and 100; numeric strings are also accepted. Defaults to 10. |
| **order** | **String**| Sort field. Allowed values are id and -id. Defaults to -id, newest first, when omitted, null, or an empty array. Accepts one value or an array of those values. An array that contains both directions is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrsttx_ followed by hexadecimal characters). |
| **filters** | [**V2LoyaltiesProgramsMembersTiersTransactionsListRequestQuery**](.md)| Field filters. card_id, card_definition_id, and created_at. Example: filters[card_id][conditions][$is] lcrd_.... |

### Return type

[**V2LoyaltiesProgramsMembersTiersTransactionsListResponseBody**](V2LoyaltiesProgramsMembersTiersTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of tier transactions. |  -  |

<a id="listProgramEarningRuleAssignments"></a>
# **listProgramEarningRuleAssignments**
> V2LoyaltiesProgramsEarningRulesListResponseBody listProgramEarningRuleAssignments(programId, limit, order, cursor)

List program earning rule assignments

Returns a cursor-paginated list of earning rules assigned to the program.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique program identifier.
    String limit = "10"; // String | Maximum number of items to return. Between 1 and 100. Defaults to 10.
    String order = "-created_at"; // String | Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once.
    String cursor = "cursor_example"; // String | Pagination cursor returned by a previous call (cursor.next).
    try {
      V2LoyaltiesProgramsEarningRulesListResponseBody result = apiInstance.listProgramEarningRuleAssignments(programId, limit, order, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramEarningRuleAssignments");
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
| **programId** | **String**| Unique program identifier. |
| **limit** | **String**| Maximum number of items to return. Between 1 and 100. Defaults to 10. |
| **order** | **String**| Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once. |
| **cursor** | **String**| Pagination cursor returned by a previous call (cursor.next). |

### Return type

[**V2LoyaltiesProgramsEarningRulesListResponseBody**](V2LoyaltiesProgramsEarningRulesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of earning rule assignments. |  -  |

<a id="listProgramEarningRulesDailyReports"></a>
# **listProgramEarningRulesDailyReports**
> V2LoyaltiesProgramsReportsEarningRulesDailyListResponseBody listProgramEarningRulesDailyReports(programId, startDate, endDate, resolution, filters)

List program earning-rules daily reports

Returns aggregated daily earning-rule evaluation statistics for the program over the given date range and resolution, optionally filtered by earning rule. Each entry counts eligibility checks for one period and earning rule. Periods without recorded activity are omitted. failures_breakdown is always an empty object. A filter that matches no rows returns an empty data array. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Start of the report date range (inclusive), in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date.
    String resolution = "day"; // String | Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters.
    EarningRulesReportListFilters filters = new EarningRulesReportListFilters(); // EarningRulesReportListFilters | Field filters. Each field accepts a conditions object with condition operators.
    try {
      V2LoyaltiesProgramsReportsEarningRulesDailyListResponseBody result = apiInstance.listProgramEarningRulesDailyReports(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramEarningRulesDailyReports");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Start of the report date range (inclusive), in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| End of the report date range (inclusive), in YYYY-MM-DD format. Must be after start_date. |
| **resolution** | **String**| Aggregation resolution of the report. The allowed date range depends on the resolution: day – max 90 days; week – max 12 weeks; month – max 12 months; quarter – max 4 quarters. |
| **filters** | [**EarningRulesReportListFilters**](.md)| Field filters. Each field accepts a conditions object with condition operators. |

### Return type

[**V2LoyaltiesProgramsReportsEarningRulesDailyListResponseBody**](V2LoyaltiesProgramsReportsEarningRulesDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program earning-rules daily report. |  -  |

<a id="listProgramEarningRulesSummaryReports"></a>
# **listProgramEarningRulesSummaryReports**
> V2LoyaltiesProgramsReportsEarningRulesSummaryListResponseBody listProgramEarningRulesSummaryReports(programId, filters)

List program earning-rules summary reports

Returns total earning-rule evaluation statistics for the program (all time), optionally filtered by earning rule. Includes success and failure counts with a failures breakdown. Each entry counts eligibility checks for one earning rule. Returns at most 100 rows, ordered by id descending. limit and order are not query parameters. A filter that matches no rows returns an empty data array. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters.
    EarningRulesReportListFilters filters = new EarningRulesReportListFilters(); // EarningRulesReportListFilters | Filters rows by field. Each field accepts a conditions object with condition operators.
    try {
      V2LoyaltiesProgramsReportsEarningRulesSummaryListResponseBody result = apiInstance.listProgramEarningRulesSummaryReports(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramEarningRulesSummaryReports");
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
| **programId** | **String**| Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters. |
| **filters** | [**EarningRulesReportListFilters**](.md)| Filters rows by field. Each field accepts a conditions object with condition operators. |

### Return type

[**V2LoyaltiesProgramsReportsEarningRulesSummaryListResponseBody**](V2LoyaltiesProgramsReportsEarningRulesSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program earning-rules summary report. |  -  |

<a id="listProgramMemberActivities"></a>
# **listProgramMemberActivities**
> V2LoyaltiesProgramsMembersActivitiesListResponseBody listProgramMemberActivities(programId, memberId, limit, order, cursor, filters)

List program member activities

Returns a cursor-paginated list of lifecycle and card-assignment activities recorded for the member. Filters are id, type, and created_at. Default order is -created_at, then id ascending. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first. A DELETED member returns 404. Returns 400 with key invalid_query_params when the query fails validation. That check runs before the program and member lookup. A cursor that doesnt match ^lcrsambr_[a-f0-9]+$, a limit outside 1 to 100, an order other than created_at or -created_at, or an array that orders by both directions fails here. After the program and member are found, an unknown or expired cursor returns invalid_or_expired_cursor. A cursor recorded for different filters or order returns cursor_and_query_mismatch. The cursor stays valid when only limit changes.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of activities to return. An integer from 1 to 100. Numeric strings are accepted and rounded to the nearest integer. Defaults to 10 when omitted.
    String order = "created_at"; // String | Sort field. Allowed values are created_at and -created_at. Defaults to -created_at when omitted, null, or an empty array. Accepts one value or an array of those values. Any other value is rejected. An array that contains both directions is rejected. Rows that share a created_at millisecond are then ordered by id ascending.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsambr_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersActivitiesListRequestQueryFilters filters = new V2LoyaltiesProgramsMembersActivitiesListRequestQueryFilters(); // V2LoyaltiesProgramsMembersActivitiesListRequestQueryFilters | Field-specific filter conditions, passed as a deep object, e.g. filters[type][conditions][$is] vl.member.created.
    try {
      V2LoyaltiesProgramsMembersActivitiesListResponseBody result = apiInstance.listProgramMemberActivities(programId, memberId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramMemberActivities");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of activities to return. An integer from 1 to 100. Numeric strings are accepted and rounded to the nearest integer. Defaults to 10 when omitted. |
| **order** | **String**| Sort field. Allowed values are created_at and -created_at. Defaults to -created_at when omitted, null, or an empty array. Accepts one value or an array of those values. Any other value is rejected. An array that contains both directions is rejected. Rows that share a created_at millisecond are then ordered by id ascending. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsambr_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersActivitiesListRequestQueryFilters**](.md)| Field-specific filter conditions, passed as a deep object, e.g. filters[type][conditions][$is] vl.member.created. |

### Return type

[**V2LoyaltiesProgramsMembersActivitiesListResponseBody**](V2LoyaltiesProgramsMembersActivitiesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of member activities. |  -  |

<a id="listProgramMembers"></a>
# **listProgramMembers**
> V2LoyaltiesProgramsMembersListResponseBody listProgramMembers(programId, limit, order, cursor, filters)

List program members

Returns a cursor-paginated list of members of the program. Deleted members are omitted. Results can be filtered by ID, status, customer ID and creation date. Results can be ordered by creation date, status, or customer ID (ascending or descending). The same field cannot be ordered both ascending and descending at the same time. Returns 404 when the program does not exist. List items do not include the cards array. Use the following endpoints to retrieve cards for a given member: - [Get customer memberships](/api-reference/programs/get-customer-memberships), - [Get program member](/api-reference/programs/get-program-member), - [Get program membership](/api-reference/programs/get-program-membership).

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    Integer limit = 10; // Integer | Maximum number of members to return. Must be between 1 and 100. Defaults to 10 when not provided.
    String order = "-created_at"; // String | Field(s) to order results by. Prefix with - for descending order. Accepts a single value or an array of values. Defaults to -created_at. Ordering by the same field in both directions simultaneously is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsmbr_[a-f0-9]+$.
    V2LoyaltiesProgramsMembersListRequestQuery filters = new V2LoyaltiesProgramsMembersListRequestQuery(); // V2LoyaltiesProgramsMembersListRequestQuery | Field-specific filter conditions, passed as a deep object, e.g. filters[status][conditions][$is] ACTIVE.
    try {
      V2LoyaltiesProgramsMembersListResponseBody result = apiInstance.listProgramMembers(programId, limit, order, cursor, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramMembers");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **limit** | **Integer**| Maximum number of members to return. Must be between 1 and 100. Defaults to 10 when not provided. |
| **order** | **String**| Field(s) to order results by. Prefix with - for descending order. Accepts a single value or an array of values. Defaults to -created_at. Ordering by the same field in both directions simultaneously is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsmbr_[a-f0-9]+$. |
| **filters** | [**V2LoyaltiesProgramsMembersListRequestQuery**](.md)| Field-specific filter conditions, passed as a deep object, e.g. filters[status][conditions][$is] ACTIVE. |

### Return type

[**V2LoyaltiesProgramsMembersListResponseBody**](V2LoyaltiesProgramsMembersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of members. |  -  |

<a id="listProgramMembersDailyReports"></a>
# **listProgramMembersDailyReports**
> LoyaltiesProgramsReportsMembersDailyListResponseBody listProgramMembersDailyReports(programId, startDate, endDate, resolution)

List program members daily reports

Returns member and card changes for the program over the given date range and resolution. Each row covers one period with recorded activity. Periods without activity are omitted. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Sets the inclusive start of the report date range, in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date.
    String resolution = "day"; // String | Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter.
    try {
      LoyaltiesProgramsReportsMembersDailyListResponseBody result = apiInstance.listProgramMembersDailyReports(programId, startDate, endDate, resolution);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramMembersDailyReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Sets the inclusive start of the report date range, in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date. |
| **resolution** | **String**| Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter. |

### Return type

[**LoyaltiesProgramsReportsMembersDailyListResponseBody**](LoyaltiesProgramsReportsMembersDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program members daily report. |  -  |

<a id="listProgramMembersSummaryReports"></a>
# **listProgramMembersSummaryReports**
> LoyaltiesProgramsReportsMembersSummaryListResponseBody listProgramMembersSummaryReports(programId)

List program members summary reports

Returns all-time member and card totals for the program. The response contains one row when activity was recorded, and an empty data array otherwise. limit and order are not query parameters. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    try {
      LoyaltiesProgramsReportsMembersSummaryListResponseBody result = apiInstance.listProgramMembersSummaryReports(programId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramMembersSummaryReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |

### Return type

[**LoyaltiesProgramsReportsMembersSummaryListResponseBody**](LoyaltiesProgramsReportsMembersSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program members summary report. |  -  |

<a id="listProgramRewardAssignments"></a>
# **listProgramRewardAssignments**
> V2LoyaltiesProgramsRewardsListResponseBody listProgramRewardAssignments(programId, limit, order, cursor)

List program reward assignments

Returns a cursor-paginated list of rewards assigned to the program, including their stock configuration and redemption counters.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique program identifier.
    String limit = "10"; // String | Maximum number of items to return. Between 1 and 100. Defaults to 10. Non-integer values are rounded.
    String order = "-created_at"; // String | Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once.
    String cursor = "cursor_example"; // String | Pagination cursor returned by a previous call (cursor.next).
    try {
      V2LoyaltiesProgramsRewardsListResponseBody result = apiInstance.listProgramRewardAssignments(programId, limit, order, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramRewardAssignments");
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
| **programId** | **String**| Unique program identifier. |
| **limit** | **String**| Maximum number of items to return. Between 1 and 100. Defaults to 10. Non-integer values are rounded. |
| **order** | **String**| Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once. |
| **cursor** | **String**| Pagination cursor returned by a previous call (cursor.next). |

### Return type

[**V2LoyaltiesProgramsRewardsListResponseBody**](V2LoyaltiesProgramsRewardsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of reward assignments. |  -  |

<a id="listProgramRewardsDailyReports"></a>
# **listProgramRewardsDailyReports**
> LoyaltiesProgramsReportsRewardsDailyListResponseBody listProgramRewardsDailyReports(programId, startDate, endDate, resolution, filters)

List program rewards daily reports

Returns aggregated reward-purchase statistics for the program over the given date range and resolution, optionally filtered by reward. Each row covers one reward and one period with recorded purchases. Periods without recorded purchases are omitted. failures_breakdown is always an empty object. A filter that matches no rows returns an empty data array. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Sets the inclusive start of the report date range, in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date.
    String resolution = "day"; // String | Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter.
    RewardsReportListFilters filters = new RewardsReportListFilters(); // RewardsReportListFilters | Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_....
    try {
      LoyaltiesProgramsReportsRewardsDailyListResponseBody result = apiInstance.listProgramRewardsDailyReports(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramRewardsDailyReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Sets the inclusive start of the report date range, in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date. |
| **resolution** | **String**| Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter. |
| **filters** | [**RewardsReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_.... |

### Return type

[**LoyaltiesProgramsReportsRewardsDailyListResponseBody**](LoyaltiesProgramsReportsRewardsDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program rewards daily report. |  -  |

<a id="listProgramRewardsSpendingsDailyReports"></a>
# **listProgramRewardsSpendingsDailyReports**
> LoyaltiesProgramsReportsRewardsSpendingsDailyListResponseBody listProgramRewardsSpendingsDailyReports(programId, startDate, endDate, resolution, filters)

List program rewards spendings daily reports

Returns aggregated points spent on reward purchases for the program over the given date range and resolution. Each row covers one reward, reward cost, reward spending, card definition, and period with an approved point spend. Periods without an approved point spend are omitted. Optionally filters by reward, cost, spending, and card definition. A filter that matches no rows returns an empty data array. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Sets the inclusive start of the report date range, in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date.
    String resolution = "day"; // String | Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter.
    RewardsSpendingsReportListFilters filters = new RewardsSpendingsReportListFilters(); // RewardsSpendingsReportListFilters | Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_....
    try {
      LoyaltiesProgramsReportsRewardsSpendingsDailyListResponseBody result = apiInstance.listProgramRewardsSpendingsDailyReports(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramRewardsSpendingsDailyReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Sets the inclusive start of the report date range, in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| Sets the inclusive end of the report date range, in YYYY-MM-DD format. Requires start_date to be before end_date. |
| **resolution** | **String**| Sets the aggregation resolution. Allows at most 90 days for day, 12 weeks for week, 12 months for month, and 4 quarters for quarter. |
| **filters** | [**RewardsSpendingsReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_.... |

### Return type

[**LoyaltiesProgramsReportsRewardsSpendingsDailyListResponseBody**](LoyaltiesProgramsReportsRewardsSpendingsDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program rewards spendings daily report. |  -  |

<a id="listProgramRewardsSpendingsSummaryReports"></a>
# **listProgramRewardsSpendingsSummaryReports**
> LoyaltiesProgramsReportsRewardsSpendingsSummaryListResponseBody listProgramRewardsSpendingsSummaryReports(programId, filters)

List program rewards spendings summary reports

Returns all-time points spent on reward purchases for the program. Each row covers one reward, reward cost, reward spending, and card definition with an approved point spend. Filters rows by reward, cost, spending, and card definition. Returns at most 100 rows, ordered by id descending. limit and order are not query parameters. A filter that matches no rows returns an empty data array. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    RewardsSpendingsReportListFilters filters = new RewardsSpendingsReportListFilters(); // RewardsSpendingsReportListFilters | Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_....
    try {
      LoyaltiesProgramsReportsRewardsSpendingsSummaryListResponseBody result = apiInstance.listProgramRewardsSpendingsSummaryReports(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramRewardsSpendingsSummaryReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **filters** | [**RewardsSpendingsReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_.... |

### Return type

[**LoyaltiesProgramsReportsRewardsSpendingsSummaryListResponseBody**](LoyaltiesProgramsReportsRewardsSpendingsSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program rewards spendings summary report. |  -  |

<a id="listProgramRewardsSummaryReports"></a>
# **listProgramRewardsSummaryReports**
> LoyaltiesProgramsReportsRewardsSummaryListResponseBody listProgramRewardsSummaryReports(programId, filters)

List program rewards summary reports

Returns all-time reward-purchase totals for the program, one row per reward with a recorded purchase attempt. Filters rows with filters[reward_id]. Returns at most 100 rows, ordered by id descending. limit and order are not query parameters. A filter that matches no rows returns an empty data array. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program (lprg_ followed by hexadecimal characters).
    RewardsReportListFilters filters = new RewardsReportListFilters(); // RewardsReportListFilters | Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_....
    try {
      LoyaltiesProgramsReportsRewardsSummaryListResponseBody result = apiInstance.listProgramRewardsSummaryReports(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramRewardsSummaryReports");
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
| **programId** | **String**| Identifies the loyalty program (lprg_ followed by hexadecimal characters). |
| **filters** | [**RewardsReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[reward_id][conditions][$is] lrew_.... |

### Return type

[**LoyaltiesProgramsReportsRewardsSummaryListResponseBody**](LoyaltiesProgramsReportsRewardsSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program rewards summary report. |  -  |

<a id="listProgramSpendingDailyReports"></a>
# **listProgramSpendingDailyReports**
> LoyaltiesProgramsReportsSpendingDailyListResponseBody listProgramSpendingDailyReports(programId, startDate, endDate, resolution, filters)

List program spending daily reports

Returns aggregated points-spending statistics for the program over the given date range and resolution. Each row covers one card definition and one period with recorded spending. Periods without recorded spending are omitted. Optionally filters by card definition. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    LocalDate startDate = LocalDate.now(); // LocalDate | Sets the inclusive start of the report date range (YYYY-MM-DD). Must be before end_date.
    LocalDate endDate = LocalDate.now(); // LocalDate | Sets the inclusive end of the report date range (YYYY-MM-DD). Must be after start_date.
    String resolution = "day"; // String | Sets the aggregation resolution. Allowed date range: day max 90 days, week max 12 weeks, month max 12 months, quarter max 4 quarters.
    SpendingReportListFilters filters = new SpendingReportListFilters(); // SpendingReportListFilters | Filters rows by field conditions, e.g. filters[card_definition_id][conditions][$is] lcdef_....
    try {
      LoyaltiesProgramsReportsSpendingDailyListResponseBody result = apiInstance.listProgramSpendingDailyReports(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramSpendingDailyReports");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **startDate** | **LocalDate**| Sets the inclusive start of the report date range (YYYY-MM-DD). Must be before end_date. |
| **endDate** | **LocalDate**| Sets the inclusive end of the report date range (YYYY-MM-DD). Must be after start_date. |
| **resolution** | **String**| Sets the aggregation resolution. Allowed date range: day max 90 days, week max 12 weeks, month max 12 months, quarter max 4 quarters. |
| **filters** | [**SpendingReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[card_definition_id][conditions][$is] lcdef_.... |

### Return type

[**LoyaltiesProgramsReportsSpendingDailyListResponseBody**](LoyaltiesProgramsReportsSpendingDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program spending daily report. |  -  |

<a id="listProgramSpendingSummaryReports"></a>
# **listProgramSpendingSummaryReports**
> LoyaltiesProgramsReportsSpendingSummaryListResponseBody listProgramSpendingSummaryReports(programId, filters)

List program spending summary reports

Returns all-time point-spending totals for the program, one row per card definition that has recorded spending. Filters rows with filters[card_definition_id]. Returns at most 10 rows (max number of card definitions per program), ordered by id descending. limit and order are not query parameters. Returns 200 with an empty data array when no spending is recorded. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    SpendingReportListFilters filters = new SpendingReportListFilters(); // SpendingReportListFilters | Filters rows by field conditions, e.g. filters[card_definition_id][conditions][$is] lcdef_....
    try {
      LoyaltiesProgramsReportsSpendingSummaryListResponseBody result = apiInstance.listProgramSpendingSummaryReports(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramSpendingSummaryReports");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **filters** | [**SpendingReportListFilters**](.md)| Filters rows by field conditions, e.g. filters[card_definition_id][conditions][$is] lcdef_.... |

### Return type

[**LoyaltiesProgramsReportsSpendingSummaryListResponseBody**](LoyaltiesProgramsReportsSpendingSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program spending summary report. |  -  |

<a id="listProgramTierStructureAssignments"></a>
# **listProgramTierStructureAssignments**
> V2LoyaltiesProgramsTierStructuresListResponseBody listProgramTierStructureAssignments(programId, limit, order, cursor)

List program tier structure assignments

Returns a cursor-paginated list of tier structures assigned to the program. Currently, a program can have only one tier structure assigned.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique program identifier.
    String limit = "10"; // String | Maximum number of items to return. Between 1 and 100. Defaults to 10. Non-integer values are rounded.
    String order = "-created_at"; // String | Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once.
    String cursor = "cursor_example"; // String | Pagination cursor returned by a previous call (cursor.next).
    try {
      V2LoyaltiesProgramsTierStructuresListResponseBody result = apiInstance.listProgramTierStructureAssignments(programId, limit, order, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramTierStructureAssignments");
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
| **programId** | **String**| Unique program identifier. |
| **limit** | **String**| Maximum number of items to return. Between 1 and 100. Defaults to 10. Non-integer values are rounded. |
| **order** | **String**| Sorting order. A single value or an array of values. Prefix with - for descending. Defaults to -created_at. The same field cannot be used in both ascending and descending order at once. |
| **cursor** | **String**| Pagination cursor returned by a previous call (cursor.next). |

### Return type

[**V2LoyaltiesProgramsTierStructuresListResponseBody**](V2LoyaltiesProgramsTierStructuresListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of tier structure assignments. |  -  |

<a id="listProgramTiersDailyReports"></a>
# **listProgramTiersDailyReports**
> V2LoyaltiesProgramsReportsTiersDailyListResponseBody listProgramTiersDailyReports(programId, startDate, endDate, resolution, filters)

List program tiers daily reports

Returns aggregated tier-movement statistics for the program over the given date range and resolution, optionally filtered by tier structure and tier. Each row covers one tier structure, one tier, and one period with recorded movement. Periods without recorded movement are omitted. A filter that matches no rows returns an empty data array. The date range is limited per resolution: - 90 days for day, - 12 weeks for week, - 12 months for month, - 4 quarters for quarter, - start_date must be before end_date, - start_date and end_date are inclusive. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters.
    LocalDate startDate = LocalDate.now(); // LocalDate | Sets the inclusive start of the range, in YYYY-MM-DD format.
    LocalDate endDate = LocalDate.now(); // LocalDate | Sets the inclusive end of the range, in YYYY-MM-DD format. Must be after start_date.
    String resolution = "day"; // String | Sets the aggregation resolution. Allowed range: day up to 90 days, week up to 12 weeks, month up to 12 months, quarter up to 4 quarters.
    TiersReportListFilters filters = new TiersReportListFilters(); // TiersReportListFilters | Filters rows by tier_structure_id and tier_id. Example: filters[tier_structure_id][conditions][$is] lts_....
    try {
      V2LoyaltiesProgramsReportsTiersDailyListResponseBody result = apiInstance.listProgramTiersDailyReports(programId, startDate, endDate, resolution, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramTiersDailyReports");
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
| **programId** | **String**| Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters. |
| **startDate** | **LocalDate**| Sets the inclusive start of the range, in YYYY-MM-DD format. |
| **endDate** | **LocalDate**| Sets the inclusive end of the range, in YYYY-MM-DD format. Must be after start_date. |
| **resolution** | **String**| Sets the aggregation resolution. Allowed range: day up to 90 days, week up to 12 weeks, month up to 12 months, quarter up to 4 quarters. |
| **filters** | [**TiersReportListFilters**](.md)| Filters rows by tier_structure_id and tier_id. Example: filters[tier_structure_id][conditions][$is] lts_.... |

### Return type

[**V2LoyaltiesProgramsReportsTiersDailyListResponseBody**](V2LoyaltiesProgramsReportsTiersDailyListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program tiers daily report. |  -  |

<a id="listProgramTiersSummaryReports"></a>
# **listProgramTiersSummaryReports**
> V2LoyaltiesProgramsReportsTiersSummaryListResponseBody listProgramTiersSummaryReports(programId, filters)

List program tiers summary reports

Returns all-time tier-movement totals for the program, one row per tier structure and tier that has recorded movement. Filters rows with filters[tier_structure_id] and filters[tier_id]. Returns at most 100 rows, ordered by id descending. limit and order are not query parameters. A filter that matches no rows returns an empty data array. Returns 400 when query validation fails. Returns 404 when the program does not exist.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters.
    TiersReportListFilters filters = new TiersReportListFilters(); // TiersReportListFilters | Filters rows by tier_structure_id and tier_id. Omitting filters or setting it to null applies no field filter. Example: filters[tier_id][conditions][$is] lt_....
    try {
      V2LoyaltiesProgramsReportsTiersSummaryListResponseBody result = apiInstance.listProgramTiersSummaryReports(programId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#listProgramTiersSummaryReports");
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
| **programId** | **String**| Identifies the loyalty program. Format: lprg_ followed by hexadecimal characters. |
| **filters** | [**TiersReportListFilters**](.md)| Filters rows by tier_structure_id and tier_id. Omitting filters or setting it to null applies no field filter. Example: filters[tier_id][conditions][$is] lt_.... |

### Return type

[**V2LoyaltiesProgramsReportsTiersSummaryListResponseBody**](V2LoyaltiesProgramsReportsTiersSummaryListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Program tiers summary report. |  -  |

<a id="purchaseMemberReward"></a>
# **purchaseMemberReward**
> LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody purchaseMemberReward(programId, memberId, v2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody)

Purchase reward with points

Purchases a reward for the program member by spending points from the members card. The card comes from the matching reward costs card definition. The program, reward, and member must be ACTIVE. The program and reward must be inside their validity windows. The reward must be assigned to the program with stock available, a cost must match the customer, and the purchase must stay inside frequency, cooldown, balance, and spending limits. Modes: - TRANSACTION (default): creates a PENDING reward transaction and a PENDING card transaction. Returns 202. - DRY_RUN: simulates the purchase and doesnt create a transaction. Returns 200 with status SIMULATED.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody v2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody = new V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody(); // V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody | 
    try {
      LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody result = apiInstance.purchaseMemberReward(programId, memberId, v2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#purchaseMemberReward");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **v2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody** | [**V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody**](V2LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody.md)|  |

### Return type

[**LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody**](LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dry run result (mode &#x60;DRY_RUN&#x60;). No transaction was created; the returned transaction has status &#x60;SIMULATED&#x60; and no &#x60;id&#x60;. and Purchase accepted (mode &#x60;TRANSACTION&#x60;). A &#x60;PENDING&#x60; reward transaction was created and will be processed asynchronously. |  -  |

<a id="refundRewardPurchase"></a>
# **refundRewardPurchase**
> V2LoyaltiesProgramsRewardsPurchasesRefundResponseBody refundRewardPurchase(programId, rewardTransactionId, v2LoyaltiesProgramsRewardsPurchasesRefundRequestBody)

Refund reward purchase

Refunds an APPROVED reward purchase made by a program member. The purchase transaction is marked REFUNDED, a new REFUND reward transaction is created with status APPROVED, and the points spent on the purchase are returned to the members card. The request body is optional and an empty payload is allowed. Policies default to refund: DEFAULT and stock: DEFAULT. The endpoint responds with 202 before the card balance changes. A POINTS_RETURNED card transaction is created for the members card and processed shortly after the response. When the members tier or the card definition expires points, returned points receive a new expiration date from that setting. They dont inherit the expiration of the originally spent points. A NO_EXPIRATION setting leaves the returned points without an expiration date. Card earning limits dont block the refund. For a LOYALTY_CARD_POINTS reward, the points credited to the target card are also reversed, with a POINTS_PURCHASE_REVERSED card transaction on that card. That transaction is processed shortly after the response. Its expiration is copied from the original points-purchased transaction. A DISCOUNT_COUPONS refund deletes the issued vouchers. details.result.digital.discount_coupons[].result is DELETED, or SKIPPED when the voucher isnt deleted. A GIFT_VOUCHERS refund subtracts the credited amount. details.result.digital.gift_vouchers[].result is CREDITS_SUBTRACTED, or SKIPPED when the balance update is rejected. The refund reverses that purchase in the rewards purchase limits for the project-local day of the original purchase. A day whose purchases are all refunded no longer counts as the members last purchase. Only rewards whose refunds.type is REFUNDABLE can be refunded. Any other reward is rejected with 423 and key reward_refund_policy_does_not_allow_refunds. policies.refund set to ALLOW refunds it anyway. The program must exist, and the reward transaction must belong to that program. Otherwise the request fails with 404. The program is checked first. The request is rejected with 423 when: - The program isnt ACTIVE (non_active_program) or is outside its validity window (program_outside_validity_window), - The transaction isnt a purchase (non_purchase_reward_transaction) or isnt APPROVED (non_approved_reward_transaction); refunding the same purchase twice fails here, - The reward no longer exists (reward_not_found), isnt assigned to the program (refund_reward_not_assigned_to_program), the members card is gone (refund_card_not_found), or the card definition is gone (refund_card_definition_not_found), - The reward type isnt supported (reward_type_not_supported_for_refunds), - For a LOYALTY_CARD_POINTS reward, the purchase result is missing (loyalty_card_points_purchase_result_not_found), the target card is gone (loyalty_card_points_target_card_not_found), the points-purchased card transaction is missing (loyalty_card_points_purchase_not_found), the target cards available balance is lower than the purchased points (loyalty_card_points_insufficient_balance), or the target card definition is gone (loyalty_card_points_target_card_definition_not_found).

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters).
    String rewardTransactionId = "rewardTransactionId_example"; // String | Unique reward transaction identifier of the purchase to refund (format: lrtx_ followed by hexadecimal characters).
    V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody v2LoyaltiesProgramsRewardsPurchasesRefundRequestBody = new V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody(); // V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody | Optional refund policies. An empty payload is allowed.
    try {
      V2LoyaltiesProgramsRewardsPurchasesRefundResponseBody result = apiInstance.refundRewardPurchase(programId, rewardTransactionId, v2LoyaltiesProgramsRewardsPurchasesRefundRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#refundRewardPurchase");
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
| **programId** | **String**| Unique loyalty program identifier (format: lprg_ followed by hexadecimal characters). |
| **rewardTransactionId** | **String**| Unique reward transaction identifier of the purchase to refund (format: lrtx_ followed by hexadecimal characters). |
| **v2LoyaltiesProgramsRewardsPurchasesRefundRequestBody** | [**V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody**](V2LoyaltiesProgramsRewardsPurchasesRefundRequestBody.md)| Optional refund policies. An empty payload is allowed. |

### Return type

[**V2LoyaltiesProgramsRewardsPurchasesRefundResponseBody**](V2LoyaltiesProgramsRewardsPurchasesRefundResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Refund accepted. The refund reward transaction has been created with status APPROVED and points will be returned to the member&#39;s card asynchronously. |  -  |

<a id="updateProgramMember"></a>
# **updateProgramMember**
> V2LoyaltiesProgramsMembersUpdateResponseBody updateProgramMember(programId, memberId, v2LoyaltiesProgramsMembersUpdateRequestBody)

Update program member

Updates a program members metadata. Provided object keys are merged into the existing metadata; omitted keys are preserved. Pass metadata: null to clear all metadata (sets it to an empty object). This endpoint cannot change status. Use [Activate program member](/api-reference/programs/activate-program-member) or [Deactivate program member](/api-reference/programs/deactivate-program-member) for status transitions. Records a vl.member.updated activity. Returns the updated member without the cards array. Returns 404 when the program or member does not exist. Returns 400 when the request body fails validation or the project vl_member metadata schema rejects the payload.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.Lv2ProgramsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    Lv2ProgramsApi apiInstance = new Lv2ProgramsApi(defaultClient);
    String programId = "programId_example"; // String | Unique loyalty program ID (format lprg_[a-f0-9]+).
    String memberId = "memberId_example"; // String | Program member ID (format lmbr_[a-f0-9]+).
    V2LoyaltiesProgramsMembersUpdateRequestBody v2LoyaltiesProgramsMembersUpdateRequestBody = new V2LoyaltiesProgramsMembersUpdateRequestBody(); // V2LoyaltiesProgramsMembersUpdateRequestBody | 
    try {
      V2LoyaltiesProgramsMembersUpdateResponseBody result = apiInstance.updateProgramMember(programId, memberId, v2LoyaltiesProgramsMembersUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Lv2ProgramsApi#updateProgramMember");
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
| **programId** | **String**| Unique loyalty program ID (format lprg_[a-f0-9]+). |
| **memberId** | **String**| Program member ID (format lmbr_[a-f0-9]+). |
| **v2LoyaltiesProgramsMembersUpdateRequestBody** | [**V2LoyaltiesProgramsMembersUpdateRequestBody**](V2LoyaltiesProgramsMembersUpdateRequestBody.md)|  |

### Return type

[**V2LoyaltiesProgramsMembersUpdateResponseBody**](V2LoyaltiesProgramsMembersUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated member (without cards). |  -  |


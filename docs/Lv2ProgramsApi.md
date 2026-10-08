# Lv2ProgramsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchCreateProgramMembers**](Lv2ProgramsApi.md#batchCreateProgramMembers) | **POST** /v2/loyalties/programs/{programId}/members/batch | Batch create program members |
| [**createMemberOrderPayment**](Lv2ProgramsApi.md#createMemberOrderPayment) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/orders/payments | Pay for order with points |
| [**createProgramMember**](Lv2ProgramsApi.md#createProgramMember) | **POST** /v2/loyalties/programs/{programId}/members | Create program member |
| [**getProgramMember**](Lv2ProgramsApi.md#getProgramMember) | **GET** /v2/loyalties/programs/{programId}/members/{memberId} | Get program member |
| [**getProgramMembership**](Lv2ProgramsApi.md#getProgramMembership) | **GET** /v2/loyalties/programs/{programId}/memberships/{customerId} | Get program membership |
| [**listCardTransactions**](Lv2ProgramsApi.md#listCardTransactions) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/transactions | List card transactions |
| [**listMemberOrderPayments**](Lv2ProgramsApi.md#listMemberOrderPayments) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/orders/payments | List member order payments |
| [**listMemberRewardPurchases**](Lv2ProgramsApi.md#listMemberRewardPurchases) | **GET** /v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases | List member reward purchases |
| [**purchaseMemberReward**](Lv2ProgramsApi.md#purchaseMemberReward) | **POST** /v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases | Purchase reward with points |


<a id="batchCreateProgramMembers"></a>
# **batchCreateProgramMembers**
> LoyaltiesProgramsMembersCreateInBulkResponseBody batchCreateProgramMembers(programId, memberCreate)

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
      LoyaltiesProgramsMembersCreateInBulkResponseBody result = apiInstance.batchCreateProgramMembers(programId, memberCreate);
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

[**LoyaltiesProgramsMembersCreateInBulkResponseBody**](LoyaltiesProgramsMembersCreateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The batch is scheduled. Use &#x60;async_action_id&#x60; to follow processing. |  -  |

<a id="createMemberOrderPayment"></a>
# **createMemberOrderPayment**
> LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody createMemberOrderPayment(programId, memberId, loyaltiesProgramsMembersOrdersPaymentsCreateRequestBody)

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
    LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody loyaltiesProgramsMembersOrdersPaymentsCreateRequestBody = new LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody(); // LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody | 
    try {
      LoyaltiesProgramsMembersOrdersPaymentsCreateCombinedResponseBody result = apiInstance.createMemberOrderPayment(programId, memberId, loyaltiesProgramsMembersOrdersPaymentsCreateRequestBody);
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
| **loyaltiesProgramsMembersOrdersPaymentsCreateRequestBody** | [**LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody**](LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody.md)|  |

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
> LoyaltiesProgramsMembersCreateResponseBody createProgramMember(programId, loyaltiesProgramsMembersCreateRequestBody)

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
    LoyaltiesProgramsMembersCreateRequestBody loyaltiesProgramsMembersCreateRequestBody = new LoyaltiesProgramsMembersCreateRequestBody(); // LoyaltiesProgramsMembersCreateRequestBody | 
    try {
      LoyaltiesProgramsMembersCreateResponseBody result = apiInstance.createProgramMember(programId, loyaltiesProgramsMembersCreateRequestBody);
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
| **loyaltiesProgramsMembersCreateRequestBody** | [**LoyaltiesProgramsMembersCreateRequestBody**](LoyaltiesProgramsMembersCreateRequestBody.md)|  |

### Return type

[**LoyaltiesProgramsMembersCreateResponseBody**](LoyaltiesProgramsMembersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created member with its automatically created cards. |  -  |

<a id="getProgramMember"></a>
# **getProgramMember**
> MemberWithCards getProgramMember(programId, memberId)

Get program member

 &lt;Info&gt; &lt;Badge color gray&gt;Documentation in progress&lt;/Badge&gt; This documentation is in progress. The parameters, fields, request and response bodies, and other data may be subject to change. If you need more information or you want to share feedback, contact [Voucherify support](https://www.voucherify.io/contact-support) or your Technical Account Manager. &lt;/Info&gt; Returns one member of the program together with that members loyalty cards. Each card includes balance, lifetime_bucket, next_expiration, and next_activation. tier_progress is not included. Use [Get program membership](/api-reference/programs/get-program-membership) when you need tier progress. card.code can be null shortly after member creation, while code generation is still running. Returns 404 when the program doesnt exist, or when the member doesnt exist in that program. The program is checked first.

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
      MemberWithCards result = apiInstance.getProgramMember(programId, memberId);
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

[**MemberWithCards**](MemberWithCards.md)

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
> LoyaltiesProgramsMembershipsGetResponseBody getProgramMembership(programId, customerId, identificationType)

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
      LoyaltiesProgramsMembershipsGetResponseBody result = apiInstance.getProgramMembership(programId, customerId, identificationType);
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

[**LoyaltiesProgramsMembershipsGetResponseBody**](LoyaltiesProgramsMembershipsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The membership in the program. |  -  |

<a id="listCardTransactions"></a>
# **listCardTransactions**
> LoyaltiesProgramsMembersCardsTransactionsListResponseBody listCardTransactions(programId, memberId, cardId, limit, order, cursor, filters)

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
    ListCardTransactionsOrderParameter order = new ListCardTransactionsOrderParameter(); // ListCardTransactionsOrderParameter | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsctx_[a-f0-9]+$.
    LoyaltiesProgramsMembersCardsTransactionsListRequestQuery filters = new LoyaltiesProgramsMembersCardsTransactionsListRequestQuery(); // LoyaltiesProgramsMembersCardsTransactionsListRequestQuery | Field-specific filter conditions, passed as a deep object, e.g. filters[id][conditions][$is] lctx_0f5d0a8878caa3ee5c.
    try {
      LoyaltiesProgramsMembersCardsTransactionsListResponseBody result = apiInstance.listCardTransactions(programId, memberId, cardId, limit, order, cursor, filters);
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
| **order** | [**ListCardTransactionsOrderParameter**](.md)| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response. Must match the pattern ^lcrsctx_[a-f0-9]+$. |
| **filters** | [**LoyaltiesProgramsMembersCardsTransactionsListRequestQuery**](.md)| Field-specific filter conditions, passed as a deep object, e.g. filters[id][conditions][$is] lctx_0f5d0a8878caa3ee5c. |

### Return type

[**LoyaltiesProgramsMembersCardsTransactionsListResponseBody**](LoyaltiesProgramsMembersCardsTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cursor-paginated list of card transactions. |  -  |

<a id="listMemberOrderPayments"></a>
# **listMemberOrderPayments**
> LoyaltiesProgramsMembersOrdersPaymentsListResponseBody listMemberOrderPayments(programId, memberId, limit, order, cursor, filters)

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
    ListCardTransactionsOrderParameter order = new ListCardTransactionsOrderParameter(); // ListCardTransactionsOrderParameter | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrsotx_ followed by hexadecimal characters).
    LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery filters = new LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery(); // LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery | Filters results by field, e.g. filters[id][conditions][$is] lotx_.... Each field accepts a conditions object with condition operators.
    try {
      LoyaltiesProgramsMembersOrdersPaymentsListResponseBody result = apiInstance.listMemberOrderPayments(programId, memberId, limit, order, cursor, filters);
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
| **order** | [**ListCardTransactionsOrderParameter**](.md)| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrsotx_ followed by hexadecimal characters). |
| **filters** | [**LoyaltiesProgramsMembersOrdersPaymentsListRequestQuery**](.md)| Filters results by field, e.g. filters[id][conditions][$is] lotx_.... Each field accepts a conditions object with condition operators. |

### Return type

[**LoyaltiesProgramsMembersOrdersPaymentsListResponseBody**](LoyaltiesProgramsMembersOrdersPaymentsListResponseBody.md)

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
> LoyaltiesProgramsMembersRewardsPurchasesListResponseBody listMemberRewardPurchases(programId, memberId, limit, order, cursor, filters)

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
    ListCardTransactionsOrderParameter order = new ListCardTransactionsOrderParameter(); // ListCardTransactionsOrderParameter | Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected.
    String cursor = "cursor_example"; // String | Pagination cursor returned in the cursor.next field of a previous response (format: lcrstrx_ followed by hexadecimal characters).
    LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery filters = new LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery(); // LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery | Field filters, e.g. filters[reward_id][conditions][$is] lrew_.... Each field accepts a conditions object with condition operators.
    try {
      LoyaltiesProgramsMembersRewardsPurchasesListResponseBody result = apiInstance.listMemberRewardPurchases(programId, memberId, limit, order, cursor, filters);
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
| **order** | [**ListCardTransactionsOrderParameter**](.md)| Orders results by transaction id. -id is newest first and the default. id is oldest first. An array that orders by id and -id together is rejected. |
| **cursor** | **String**| Pagination cursor returned in the cursor.next field of a previous response (format: lcrstrx_ followed by hexadecimal characters). |
| **filters** | [**LoyaltiesProgramsMembersRewardsPurchasesListRequestQuery**](.md)| Field filters, e.g. filters[reward_id][conditions][$is] lrew_.... Each field accepts a conditions object with condition operators. |

### Return type

[**LoyaltiesProgramsMembersRewardsPurchasesListResponseBody**](LoyaltiesProgramsMembersRewardsPurchasesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated list of reward purchase transactions. |  -  |

<a id="purchaseMemberReward"></a>
# **purchaseMemberReward**
> LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody purchaseMemberReward(programId, memberId, loyaltiesProgramsMembersRewardsPurchasesCreateRequestBody)

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
    LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody loyaltiesProgramsMembersRewardsPurchasesCreateRequestBody = new LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody(); // LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody | 
    try {
      LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBody result = apiInstance.purchaseMemberReward(programId, memberId, loyaltiesProgramsMembersRewardsPurchasesCreateRequestBody);
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
| **loyaltiesProgramsMembersRewardsPurchasesCreateRequestBody** | [**LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody**](LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody.md)|  |

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


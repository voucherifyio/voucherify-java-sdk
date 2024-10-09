# ReferralsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**referralsAddHolders**](ReferralsApi.md#referralsAddHolders) | **POST** /v1/referrals/members/{memberId}/holders | Add Referral Code Holders |
| [**referralsAddHolders1**](ReferralsApi.md#referralsAddHolders1) | **POST** /v1/referrals/{campaignId}/members/{memberId}/holders | Add Referral Code Holders |
| [**referralsCodeHolders**](ReferralsApi.md#referralsCodeHolders) | **GET** /v1/referrals/{campaignId}/members/{memberId}/holders | List Referral Code Holders |
| [**referralsCodeHolders1**](ReferralsApi.md#referralsCodeHolders1) | **GET** /v1/referrals/members/{memberId}/holders | List Referral Code Holders |
| [**referralsRemoveHolder**](ReferralsApi.md#referralsRemoveHolder) | **DELETE** /v1/referrals/members/{memberId}/holders/{holderId} | Remove Referral Card Holder |
| [**referralsRemoveHolder1**](ReferralsApi.md#referralsRemoveHolder1) | **DELETE** /v1/referrals/{campaignId}/members/{memberId}/holders/{holderId} | Remove Referral Card Holder |


<a id="referralsAddHolders"></a>
# **referralsAddHolders**
> ReferralsMembersHoldersCreateInBulkResponseBody referralsAddHolders(memberId, referralsMembersHoldersCreateInBulkRequestBody)

Add Referral Code Holders

Adds new holders to a referral code as referees. The data sent in the request is upserted into the customer data. If the request returns an error even for one customer, you have to resend the whole request. Customer data is upserted if the data for all customers is correct. To use this endpoint, you must have the following permissions: - Create and modify Customers and Segments (customers.modify) - Publish Voucher (vouchers.publish)  📘 Alternative endpoint This endpoint is an alternative to the Add Referral Code Holders endpoint. The URL was re-designed to retrieve the referral member holders without providing the campaignId as a path paremeter.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    ReferralsMembersHoldersCreateInBulkRequestBody referralsMembersHoldersCreateInBulkRequestBody = new ReferralsMembersHoldersCreateInBulkRequestBody(); // ReferralsMembersHoldersCreateInBulkRequestBody | Specify the customer data to be upserted as redeemable holders.
    try {
      ReferralsMembersHoldersCreateInBulkResponseBody result = apiInstance.referralsAddHolders(memberId, referralsMembersHoldersCreateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsAddHolders");
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
| **memberId** | **String**| Unique referral code or its identifier. |
| **referralsMembersHoldersCreateInBulkRequestBody** | [**ReferralsMembersHoldersCreateInBulkRequestBody**](ReferralsMembersHoldersCreateInBulkRequestBody.md)| Specify the customer data to be upserted as redeemable holders. |

### Return type

[**ReferralsMembersHoldersCreateInBulkResponseBody**](ReferralsMembersHoldersCreateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of redeemable holder objects. |  -  |

<a id="referralsAddHolders1"></a>
# **referralsAddHolders1**
> ReferralsMembersHoldersCreateInBulkResponseBody referralsAddHolders1(campaignId, memberId, referralsMembersHoldersCreateInBulkRequestBody)

Add Referral Code Holders

Adds new holders to a referral code as referees. The data sent in the request is upserted into the customer data. If the request returns an error even for one customer, you have to resend the whole request. Customer data is upserted if the data for all customers is correct. To use this endpoint, you must have the following permissions: - Create and modify Customers and Segments (customers.modify) - Publish Voucher (vouchers.publish)

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique identifier of a referral program campaign.
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    ReferralsMembersHoldersCreateInBulkRequestBody referralsMembersHoldersCreateInBulkRequestBody = new ReferralsMembersHoldersCreateInBulkRequestBody(); // ReferralsMembersHoldersCreateInBulkRequestBody | Specify the customer data to be upserted as redeemable holders.
    try {
      ReferralsMembersHoldersCreateInBulkResponseBody result = apiInstance.referralsAddHolders1(campaignId, memberId, referralsMembersHoldersCreateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsAddHolders1");
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
| **campaignId** | **String**| Unique identifier of a referral program campaign. |
| **memberId** | **String**| Unique referral code or its identifier. |
| **referralsMembersHoldersCreateInBulkRequestBody** | [**ReferralsMembersHoldersCreateInBulkRequestBody**](ReferralsMembersHoldersCreateInBulkRequestBody.md)| Specify the customer data to be upserted as redeemable holders. |

### Return type

[**ReferralsMembersHoldersCreateInBulkResponseBody**](ReferralsMembersHoldersCreateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of redeemable holder objects. |  -  |

<a id="referralsCodeHolders"></a>
# **referralsCodeHolders**
> ReferralsMembersHoldersListResponseBody referralsCodeHolders(campaignId, memberId, limit, order, startingAfterId, filters)

List Referral Code Holders

Retrieves all the redeemables that have been assigned to the customer. To use this endpoint, you must have the following permissions: - Read Customers (customers.details.read)

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique identifier of a referral program campaign.
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListRedeemables order = ParameterOrderListRedeemables.fromValue("id"); // ParameterOrderListRedeemables | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    ParameterFiltersListReferralsRedeemableHolders filters = new ParameterFiltersListReferralsRedeemableHolders(); // ParameterFiltersListReferralsRedeemableHolders | Filters for listing customer redeemables.
    try {
      ReferralsMembersHoldersListResponseBody result = apiInstance.referralsCodeHolders(campaignId, memberId, limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsCodeHolders");
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
| **campaignId** | **String**| Unique identifier of a referral program campaign. |
| **memberId** | **String**| Unique referral code or its identifier. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderListRedeemables**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |
| **filters** | [**ParameterFiltersListReferralsRedeemableHolders**](.md)| Filters for listing customer redeemables. |

### Return type

[**ReferralsMembersHoldersListResponseBody**](ReferralsMembersHoldersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the holders of the redeemable that is assigned to the referral campaign. |  -  |

<a id="referralsCodeHolders1"></a>
# **referralsCodeHolders1**
> ReferralsMembersHoldersListResponseBody referralsCodeHolders1(memberId, limit, order, startingAfterId, filters)

List Referral Code Holders

Retrieves the holders of the referral code from a referral campaign. To use this endpoint, you must have the following permissions: - Read Customers (customers.details.read)  📘 Alternative endpoint This endpoint is an alternative to the List Member Holders endpoint. The URL was re-designed to retrieve the referral member holders without providing the campaignId as a path paremeter.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListRedeemables order = ParameterOrderListRedeemables.fromValue("id"); // ParameterOrderListRedeemables | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    ParameterFiltersListReferralsRedeemableHolders filters = new ParameterFiltersListReferralsRedeemableHolders(); // ParameterFiltersListReferralsRedeemableHolders | Filters for listing customer redeemables.
    try {
      ReferralsMembersHoldersListResponseBody result = apiInstance.referralsCodeHolders1(memberId, limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsCodeHolders1");
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
| **memberId** | **String**| Unique referral code or its identifier. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderListRedeemables**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |
| **filters** | [**ParameterFiltersListReferralsRedeemableHolders**](.md)| Filters for listing customer redeemables. |

### Return type

[**ReferralsMembersHoldersListResponseBody**](ReferralsMembersHoldersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the holders of the redeemable that is assigned to the referral campaign. |  -  |

<a id="referralsRemoveHolder"></a>
# **referralsRemoveHolder**
> referralsRemoveHolder(memberId, holderId)

Remove Referral Card Holder

Removes the holder from a referral card. You can remove a referee only. To use this endpoint, you must have the following permissions: - Create and modify Customers and Segments (customers.modify) - Publish Voucher (vouchers.publish)  📘 Alternative endpoint This endpoint is an alternative to the Remove Referral Card Holder endpoint. The URL was re-designed to retrieve the referral member holders without providing the campaignId as a path paremeter.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    String holderId = "holderId_example"; // String | Unique identifier of a redeemable holder.
    try {
      apiInstance.referralsRemoveHolder(memberId, holderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsRemoveHolder");
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
| **memberId** | **String**| Unique referral code or its identifier. |
| **holderId** | **String**| Unique identifier of a redeemable holder. |

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
| **204** | Returns no content if removal is successful. |  -  |

<a id="referralsRemoveHolder1"></a>
# **referralsRemoveHolder1**
> referralsRemoveHolder1(campaignId, memberId, holderId)

Remove Referral Card Holder

Removes the holder from a referral card. You can remove a referee only. To use this endpoint, you must have the following permissions: - Create and modify Customers and Segments (customers.modify) - Publish Voucher (vouchers.publish)

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ReferralsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ReferralsApi apiInstance = new ReferralsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique identifier of a referral program campaign.
    String memberId = "memberId_example"; // String | Unique referral code or its identifier.
    String holderId = "holderId_example"; // String | Unique identifier of a redeemable holder.
    try {
      apiInstance.referralsRemoveHolder1(campaignId, memberId, holderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferralsApi#referralsRemoveHolder1");
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
| **campaignId** | **String**| Unique identifier of a referral program campaign. |
| **memberId** | **String**| Unique referral code or its identifier. |
| **holderId** | **String**| Unique identifier of a redeemable holder. |

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
| **204** | Returns no content if removal is successful. |  -  |


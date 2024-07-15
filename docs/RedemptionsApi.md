# RedemptionsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRedemption**](RedemptionsApi.md#getRedemption) | **GET** /v1/redemptions/{redemptionId} | Get Redemption |
| [**getVoucherRedemptions**](RedemptionsApi.md#getVoucherRedemptions) | **GET** /v1/vouchers/{code}/redemption | Get Voucher&#39;s Redemptions |
| [**listRedemptions**](RedemptionsApi.md#listRedemptions) | **GET** /v1/redemptions | List Redemptions |
| [**redeemStackedDiscounts**](RedemptionsApi.md#redeemStackedDiscounts) | **POST** /v1/redemptions | Redeem Stackable Discounts |
| [**rollbackRedemption**](RedemptionsApi.md#rollbackRedemption) | **POST** /v1/redemptions/{redemptionId}/rollback | Rollback Redemption |
| [**rollbackStackedRedemptions**](RedemptionsApi.md#rollbackStackedRedemptions) | **POST** /v1/redemptions/{parentRedemptionId}/rollbacks | Rollback Stackable Redemptions |


<a id="getRedemption"></a>
# **getRedemption**
> RedemptionsGetResponseBody getRedemption(redemptionId)

Get Redemption

Return a redemption or redemption rollback object. This object can either be a successfull or failed redemption or redemption rollback.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String redemptionId = "redemptionId_example"; // String | ID of previously created redemption.
    try {
      RedemptionsGetResponseBody result = apiInstance.getRedemption(redemptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#getRedemption");
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
| **redemptionId** | **String**| ID of previously created redemption. |

### Return type

[**RedemptionsGetResponseBody**](RedemptionsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a redemption object. |  -  |

<a id="getVoucherRedemptions"></a>
# **getVoucherRedemptions**
> VouchersRedemptionGetResponseBody getVoucherRedemptions(code)

Get Voucher&#39;s Redemptions

Retrieve the number of times a voucher was redeemed and each of the redemption details.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher.
    try {
      VouchersRedemptionGetResponseBody result = apiInstance.getVoucherRedemptions(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#getVoucherRedemptions");
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
| **code** | **String**| A **code** that identifies the voucher. |

### Return type

[**VouchersRedemptionGetResponseBody**](VouchersRedemptionGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a &#x60;redemption_entries&#x60; property that contains an array of voucher&#39;s redemptions. |  -  |

<a id="listRedemptions"></a>
# **listRedemptions**
> RedemptionsListResponseBody listRedemptions(limit, page, result, campaign, customer, order, createdAt, filters)

List Redemptions

Returns a list of redemptions previously created. The redemptions are returned in a sorted order, with the most recent redemptions appearing first. The response returns a list of redemptions of all vouchers.  # Filtering results The result can be narrowed according to specified (or default) filters, for example, you can sort redemptions by date: https://api.voucherify.io/v1/redemptions?limit 3&amp;[created_at][before] 2017-09-08T13:52:18.227Z. A filter based on the object created_at field narrows down the results and lists redemptions done before or after a particular date time. You can use the following options: [created_at][after], [created_at][before]. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z. # Failed Redemptions A redemption may fail for various reasons. You can figure out an exact reason from the failure_code: - resource_not_found - voucher with given code does not exist - voucher_not_active - voucher is not active yet (before start date) - voucher_expired - voucher has already expired (after expiration date) - voucher_disabled -  voucher has been disabled (active: false) - quantity_exceeded - vouchers redemptions limit has been exceeded - gift_amount_exceeded - gift amount has been exceeded - customer_rules_violated - customer did not match the segment - order_rules_violated - order did not match validation rules - invalid_order - order was specified incorrectly - invalid_amount - order amount was specified incorrectly - missing_amount - order amount was not specified - missing_order_items - order items were not specified - missing_customer - customer was not specified

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String result = "result_example"; // String | A filter on the list based on the redemption result. Available options are: SUCCESS, FAILURE. You can provide multiple values by repeating the param.
    String campaign = "campaign_example"; // String | A filter by the campaign **name** that the redemption resources originate from.
    String customer = "customer_example"; // String | Return redemptions performed by the customer with given id or source_id.
    ParameterOrderListRedemptions order = ParameterOrderListRedemptions.fromValue("created_at"); // ParameterOrderListRedemptions | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    ParameterCreatedBeforeAfter createdAt = new ParameterCreatedBeforeAfter(); // ParameterCreatedBeforeAfter | A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z
    ParameterFiltersListRedemptions filters = new ParameterFiltersListRedemptions(); // ParameterFiltersListRedemptions | Filters for listing responses.
    try {
      RedemptionsListResponseBody result = apiInstance.listRedemptions(limit, page, result, campaign, customer, order, createdAt, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#listRedemptions");
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
| **result** | **String**| A filter on the list based on the redemption result. Available options are: SUCCESS, FAILURE. You can provide multiple values by repeating the param. |
| **campaign** | **String**| A filter by the campaign **name** that the redemption resources originate from. |
| **customer** | **String**| Return redemptions performed by the customer with given id or source_id. |
| **order** | [**ParameterOrderListRedemptions**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **createdAt** | [**ParameterCreatedBeforeAfter**](.md)| A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z |
| **filters** | [**ParameterFiltersListRedemptions**](.md)| Filters for listing responses. |

### Return type

[**RedemptionsListResponseBody**](RedemptionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of redemption objects. Each entry in the array is a separate redemption object. If no more redemptions are available, the resulting array will be empty. If you provide a non-existent customer ID, this call returns an empty object. |  -  |

<a id="redeemStackedDiscounts"></a>
# **redeemStackedDiscounts**
> RedemptionsRedeemResponseBody redeemStackedDiscounts(redemptionsRedeemRequestBody)

Redeem Stackable Discounts

# How API returns calculated discounts and order amounts in the response In the table below, you can see the logic the API follows to calculate discounts and amounts:    📘 Rollbacks  You cant roll back a child redemption. When you call rollback on a stacked redemption, all child redemptions will be rolled back. You need to refer to a parent redemption ID in your rollback request.      📘 Also available on client-side  This method is also accessible through public keys which you can use in client-side​ apps: mobile and web browser apps. Go to the dedicated endpoint to learn more.  - Use X-Client-Application-Id as the application ID header.  - Use X-Client-Token as the appliction secret key header.  - Use client-side base URL.  - Use an origin header for your custom domain.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    RedemptionsRedeemRequestBody redemptionsRedeemRequestBody = new RedemptionsRedeemRequestBody(); // RedemptionsRedeemRequestBody | 
    try {
      RedemptionsRedeemResponseBody result = apiInstance.redeemStackedDiscounts(redemptionsRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#redeemStackedDiscounts");
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
| **redemptionsRedeemRequestBody** | [**RedemptionsRedeemRequestBody**](RedemptionsRedeemRequestBody.md)|  |

### Return type

[**RedemptionsRedeemResponseBody**](RedemptionsRedeemResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid redemption. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

<a id="rollbackRedemption"></a>
# **rollbackRedemption**
> RedemptionsRollbackCreateResponseBody rollbackRedemption(redemptionId, reason, trackingId, redemptionsRollbackCreateRequestBody)

Rollback Redemption

Your business logic may include a case when you need to undo a redemption. You can revert a redemption by calling this API endpoint.  🚧  You can roll back a redemption up to 3 months back.   # Effect  The operation  - creates a rollback entry in vouchers redemption history (redemption.redemption_entries) and  - gives 1 redemption back to the pool (decreases redeemed_quantity by 1).  # Returned funds  In case of *gift card vouchers*, this method returns funds back according to the source redemption. In case of *loyalty card vouchers*, this method returns points back according to the source redemption.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String redemptionId = "redemptionId_example"; // String | The original redemption ID to be rolled back (undone).
    String reason = "reason_example"; // String | Reason for the rollback.
    String trackingId = "trackingId_example"; // String | Customers source_id.
    RedemptionsRollbackCreateRequestBody redemptionsRollbackCreateRequestBody = new RedemptionsRollbackCreateRequestBody(); // RedemptionsRollbackCreateRequestBody | Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body.
    try {
      RedemptionsRollbackCreateResponseBody result = apiInstance.rollbackRedemption(redemptionId, reason, trackingId, redemptionsRollbackCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#rollbackRedemption");
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
| **redemptionId** | **String**| The original redemption ID to be rolled back (undone). |
| **reason** | **String**| Reason for the rollback. |
| **trackingId** | **String**| Customers source_id. |
| **redemptionsRollbackCreateRequestBody** | [**RedemptionsRollbackCreateRequestBody**](RedemptionsRollbackCreateRequestBody.md)| Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body. |

### Return type

[**RedemptionsRollbackCreateResponseBody**](RedemptionsRollbackCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a redemption rollback object indicating the result of the rollback. |  -  |

<a id="rollbackStackedRedemptions"></a>
# **rollbackStackedRedemptions**
> RedemptionsRollbacksCreateResponseBody rollbackStackedRedemptions(parentRedemptionId, reason, trackingId, redemptionsRollbacksCreateRequestBody)

Rollback Stackable Redemptions

Rollback a stackable redemption. When you rollback a stacked redemption, all child redemptions will be rolled back. Provide the parent redemption ID as the path parameter.  🚧   You can roll back a redemption up to 3 months back.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RedemptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RedemptionsApi apiInstance = new RedemptionsApi(defaultClient);
    String parentRedemptionId = "parentRedemptionId_example"; // String | Unique identifier of a parent redemption, e.g. r_JQfm73zWSJFQxs3bGxweYjgm.
    String reason = "reason_example"; // String | Reason for the rollback.
    String trackingId = "trackingId_example"; // String | Customers source_id.
    RedemptionsRollbacksCreateRequestBody redemptionsRollbacksCreateRequestBody = new RedemptionsRollbacksCreateRequestBody(); // RedemptionsRollbacksCreateRequestBody | Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body.
    try {
      RedemptionsRollbacksCreateResponseBody result = apiInstance.rollbackStackedRedemptions(parentRedemptionId, reason, trackingId, redemptionsRollbacksCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedemptionsApi#rollbackStackedRedemptions");
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
| **parentRedemptionId** | **String**| Unique identifier of a parent redemption, e.g. r_JQfm73zWSJFQxs3bGxweYjgm. |
| **reason** | **String**| Reason for the rollback. |
| **trackingId** | **String**| Customers source_id. |
| **redemptionsRollbacksCreateRequestBody** | [**RedemptionsRollbacksCreateRequestBody**](RedemptionsRollbacksCreateRequestBody.md)| Add information about the original customer and order. Customer data and Redemption metadata can be updated in Voucherify when passing the customer data in the request body. |

### Return type

[**RedemptionsRollbacksCreateResponseBody**](RedemptionsRollbacksCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array with the individual redemption rollback results along with the parent rollback result and related order. |  -  |


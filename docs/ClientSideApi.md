# ClientSideApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkEligibilityClientSide**](ClientSideApi.md#checkEligibilityClientSide) | **POST** /client/v1/qualifications | Check Eligibility (client-side) |
| [**listPromotionTiersClientSide**](ClientSideApi.md#listPromotionTiersClientSide) | **GET** /client/v1/promotions/tiers | List Promotion Tiers (client-side) |
| [**redeemStackedDiscountsClientSide**](ClientSideApi.md#redeemStackedDiscountsClientSide) | **POST** /client/v1/redemptions | Redeem Stackable Discounts (client-side) |
| [**trackCustomEventClientSide**](ClientSideApi.md#trackCustomEventClientSide) | **POST** /client/v1/events | Track Custom Event (client-side) |
| [**validateStackedDiscountsClientSide**](ClientSideApi.md#validateStackedDiscountsClientSide) | **POST** /client/v1/validations | Validate Stackable Discounts (client-side) |


<a id="checkEligibilityClientSide"></a>
# **checkEligibilityClientSide**
> ClientQualificationsCheckEligibilityResponseBody checkEligibilityClientSide(clientQualificationsCheckEligibilityRequestBody)

Check Eligibility (client-side)

Generate a list of redeemables that are applicable in the context of the customer and order. The new qualifications method is an improved version of Campaign Qualifications, Voucher Qualifications, and Promotions Validation API requests. The new qualification method introduces the following improvements: - Qualification results are returned faster - No limit on the number of returned redeemables - Introduces new qualification scenarios, not available in the previous version  👍 Scenario Guide  Read our dedicated guide to learn about some use cases this endpoint can cover here. # Paging  The Voucherify Qualifications API request will return to you all of the redeemables available for the customer in batches of up to 50 redeemables. To get the next batch of redeemables, you need to use the starting_after cursor. To process of paging the redeemables works in the following manner: - You send the first API request for Qualifications without the starting_after parameter. - The response will contain a parameter named has_more. If the parameters value is set to true, then more redeemables are available. - Get the value of the created_at parameter of the last returned redeemable. The value of this parameter will be used as a cursor to retrieve the next page of redeemables. - Send another API request for Qualification with the starting_after parameter set to the value taken from the created_at parameter from the last returned redeemable. - Voucherify will return the next page of redeemables. - If the has_more parameter is set to true, apply steps 3-5 to get the next page of redeemables.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id
    defaultClient.setAuthentication("X-Client-Application-Id", "YOUR API KEY");

    // Configure API key authorization: X-Client-Token
    defaultClient.setAuthentication("X-Client-Token", "YOUR API KEY");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    ClientQualificationsCheckEligibilityRequestBody clientQualificationsCheckEligibilityRequestBody = new ClientQualificationsCheckEligibilityRequestBody(); // ClientQualificationsCheckEligibilityRequestBody | Define order and customer context.
    try {
      ClientQualificationsCheckEligibilityResponseBody result = apiInstance.checkEligibilityClientSide(clientQualificationsCheckEligibilityRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#checkEligibilityClientSide");
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
| **clientQualificationsCheckEligibilityRequestBody** | [**ClientQualificationsCheckEligibilityRequestBody**](ClientQualificationsCheckEligibilityRequestBody.md)| Define order and customer context. |

### Return type

[**ClientQualificationsCheckEligibilityResponseBody**](ClientQualificationsCheckEligibilityResponseBody.md)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a qualifications object. |  -  |

<a id="listPromotionTiersClientSide"></a>
# **listPromotionTiersClientSide**
> ClientPromotionsTiersListResponseBody listPromotionTiersClientSide(origin, isAvailable, limit, page, order)

List Promotion Tiers (client-side)

This method enables you to list promotion tiers.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id
    defaultClient.setAuthentication("X-Client-Application-Id", "YOUR API KEY");

    // Configure API key authorization: X-Client-Token
    defaultClient.setAuthentication("X-Client-Token", "YOUR API KEY");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    Boolean isAvailable = true; // Boolean | This parameter allows filtering promotions that are only available at the moment. When set to true, it selects only non-expired and active promotions.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListPromotionTiersClientSide order = ParameterOrderListPromotionTiersClientSide.fromValue("created_at"); // ParameterOrderListPromotionTiersClientSide | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      ClientPromotionsTiersListResponseBody result = apiInstance.listPromotionTiersClientSide(origin, isAvailable, limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#listPromotionTiersClientSide");
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
| **origin** | **String**| Indicates the origin (scheme, hostname, and port). |
| **isAvailable** | **Boolean**| This parameter allows filtering promotions that are only available at the moment. When set to true, it selects only non-expired and active promotions. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrderListPromotionTiersClientSide**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**ClientPromotionsTiersListResponseBody**](ClientPromotionsTiersListResponseBody.md)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a &#x60;tiers&#x60; property that contains an array of promotion tiers. |  -  |

<a id="redeemStackedDiscountsClientSide"></a>
# **redeemStackedDiscountsClientSide**
> ClientRedemptionsRedeemResponseBody redeemStackedDiscountsClientSide(origin, clientRedemptionsRedeemRequestBody)

Redeem Stackable Discounts (client-side)

This method is accessible through public keys which you can use in client side requests coming from mobile and web browser applications. # How API returns calculated discounts and order amounts in the response In the table below, you can see the logic the API follows to calculate discounts and amounts:    📘 Rollbacks  You cant roll back a child redemption. When you call rollback on a stacked redemption, all child redemptions will be rolled back. You need to refer to a parent redemption ID in your rollback request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id
    defaultClient.setAuthentication("X-Client-Application-Id", "YOUR API KEY");

    // Configure API key authorization: X-Client-Token
    defaultClient.setAuthentication("X-Client-Token", "YOUR API KEY");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientRedemptionsRedeemRequestBody clientRedemptionsRedeemRequestBody = new ClientRedemptionsRedeemRequestBody(); // ClientRedemptionsRedeemRequestBody | 
    try {
      ClientRedemptionsRedeemResponseBody result = apiInstance.redeemStackedDiscountsClientSide(origin, clientRedemptionsRedeemRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#redeemStackedDiscountsClientSide");
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
| **origin** | **String**| Indicates the origin (scheme, hostname, and port). |
| **clientRedemptionsRedeemRequestBody** | [**ClientRedemptionsRedeemRequestBody**](ClientRedemptionsRedeemRequestBody.md)|  |

### Return type

[**ClientRedemptionsRedeemResponseBody**](ClientRedemptionsRedeemResponseBody.md)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid redemption. Read more in the [Stacking Rule Documentation](https://support.voucherify.io/article/604-stacking-rules). |  -  |

<a id="trackCustomEventClientSide"></a>
# **trackCustomEventClientSide**
> ClientEventsCreateResponseBody trackCustomEventClientSide(origin, clientEventsCreateRequestBody)

Track Custom Event (client-side)

To track a custom event, you create an event object.   The event object must be linked to the customer who performs the action. If a customer doesnt exist in Voucherify, the customer will be created.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id
    defaultClient.setAuthentication("X-Client-Application-Id", "YOUR API KEY");

    // Configure API key authorization: X-Client-Token
    defaultClient.setAuthentication("X-Client-Token", "YOUR API KEY");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientEventsCreateRequestBody clientEventsCreateRequestBody = new ClientEventsCreateRequestBody(); // ClientEventsCreateRequestBody | Specify the details of the custom event.
    try {
      ClientEventsCreateResponseBody result = apiInstance.trackCustomEventClientSide(origin, clientEventsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#trackCustomEventClientSide");
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
| **origin** | **String**| Indicates the origin (scheme, hostname, and port). |
| **clientEventsCreateRequestBody** | [**ClientEventsCreateRequestBody**](ClientEventsCreateRequestBody.md)| Specify the details of the custom event. |

### Return type

[**ClientEventsCreateResponseBody**](ClientEventsCreateResponseBody.md)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the event type if the event was received by the application. |  -  |

<a id="validateStackedDiscountsClientSide"></a>
# **validateStackedDiscountsClientSide**
> ClientValidationsValidateResponseBody validateStackedDiscountsClientSide(origin, clientValidationsValidateRequestBody)

Validate Stackable Discounts (client-side)

Verify redeemables provided in the request. This method is accessible through public keys which you can use in client side requests coming from mobile and web browser applications.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ClientSideApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Client-Application-Id
    defaultClient.setAuthentication("X-Client-Application-Id", "YOUR API KEY");

    // Configure API key authorization: X-Client-Token
    defaultClient.setAuthentication("X-Client-Token", "YOUR API KEY");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    String origin = "origin_example"; // String | Indicates the origin (scheme, hostname, and port).
    ClientValidationsValidateRequestBody clientValidationsValidateRequestBody = new ClientValidationsValidateRequestBody(); // ClientValidationsValidateRequestBody | 
    try {
      ClientValidationsValidateResponseBody result = apiInstance.validateStackedDiscountsClientSide(origin, clientValidationsValidateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#validateStackedDiscountsClientSide");
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
| **origin** | **String**| Indicates the origin (scheme, hostname, and port). |
| **clientValidationsValidateRequestBody** | [**ClientValidationsValidateRequestBody**](ClientValidationsValidateRequestBody.md)|  |

### Return type

[**ClientValidationsValidateResponseBody**](ClientValidationsValidateResponseBody.md)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid validation. Read more in the [Stacking Rule Documentation](https://support.voucherify.io/article/604-stacking-rules). |  -  |


# ClientSideApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkEligibilityClientSide**](ClientSideApi.md#checkEligibilityClientSide) | **POST** /client/v1/qualifications | Check Eligibility (client-side) |
| [**redeemStackedDiscountsClientSide**](ClientSideApi.md#redeemStackedDiscountsClientSide) | **POST** /client/v1/redemptions | Redeem Stackable Discounts (client-side) |
| [**trackCustomEventClientSide**](ClientSideApi.md#trackCustomEventClientSide) | **POST** /client/v1/events | Track Custom Event (client-side) |
| [**updateCustomersConsentsClientSide**](ClientSideApi.md#updateCustomersConsentsClientSide) | **PUT** /client/v1/customers/{customerId}/consents | Update Customer&#39;s consents (client-side) |
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
    ApiKeyAuth X-Client-Application-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id");
    X-Client-Application-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token
    ApiKeyAuth X-Client-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token");
    X-Client-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token.setApiKeyPrefix("Token");

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
    ApiKeyAuth X-Client-Application-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id");
    X-Client-Application-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token
    ApiKeyAuth X-Client-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token");
    X-Client-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token.setApiKeyPrefix("Token");

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
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid redemption. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |

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
    ApiKeyAuth X-Client-Application-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id");
    X-Client-Application-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token
    ApiKeyAuth X-Client-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token");
    X-Client-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token.setApiKeyPrefix("Token");

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

<a id="updateCustomersConsentsClientSide"></a>
# **updateCustomersConsentsClientSide**
> updateCustomersConsentsClientSide(customerId, body)

Update Customer&#39;s consents (client-side)

Update marketing permissions for the specified customer.

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
    ApiKeyAuth X-Client-Application-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id");
    X-Client-Application-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token
    ApiKeyAuth X-Client-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token");
    X-Client-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token.setApiKeyPrefix("Token");

    ClientSideApi apiInstance = new ClientSideApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customer identifier or source_id
    Object body = {"cnst_6jQ5XcUOLnj5L7ImQAdBsJ1I":true,"cnst_VCmucIvAsmDYw2PPAok6bcYy":false}; // Object | Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use unsubscribed as a consent identifier and true as its value.   ## Examples  Opt-out from all communication: 
    try {
      apiInstance.updateCustomersConsentsClientSide(customerId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientSideApi#updateCustomersConsentsClientSide");
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
| **customerId** | **String**| A Voucherify customer identifier or source_id |
| **body** | **Object**| Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use unsubscribed as a consent identifier and true as its value.   ## Examples  Opt-out from all communication:  |

### Return type

null (empty response body)

### Authorization

[X-Client-Application-Id](../README.md#X-Client-Application-Id), [X-Client-Token](../README.md#X-Client-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the consents were updated successfully. |  -  |

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
    ApiKeyAuth X-Client-Application-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Application-Id");
    X-Client-Application-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Application-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-Client-Token
    ApiKeyAuth X-Client-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-Client-Token");
    X-Client-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-Client-Token.setApiKeyPrefix("Token");

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
| **200** | Depending on your project settings: all redeemables must be valid or just one must be valid to result as valid validation. See https://support.voucherify.io/article/604-stacking-rules#application-rules |  -  |


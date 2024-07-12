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

Generate a list of redeemables that are applicable in the context of the customer and order.  The new qualifications method is an improved version of [Campaign Qualifications](ref:examine-campaigns-qualification), [Voucher Qualifications](ref:examine-vouchers-qualification), and [Promotions Validation](ref:validate-promotions) API requests. The new qualification method introduces the following improvements:  - Qualification results are returned faster - No limit on the number of returned redeemables - Introduces new qualification scenarios, not available in the previous version  &gt; 👍 Scenario Guide &gt; &gt; Read our dedicated guide to learn about some use cases this endpoint can cover [here](doc:checking-eligibility).  ## Paging   The Voucherify Qualifications API request will return to you all of the redeemables available for the customer in batches of up to 50 redeemables. To get the next batch of redeemables, you need to use the &#x60;starting_after&#x60; cursor.  To process of paging the redeemables works in the following manner:  - You send the first API request for Qualifications without the &#x60;starting_after&#x60; parameter. - The response will contain a parameter named &#x60;has_more&#x60;. If the parameter&#39;s value is set to &#x60;true&#x60;, then more redeemables are available. - Get the value of the &#x60;created_at&#x60; parameter of the last returned redeemable. The value of this parameter will be used as a cursor to retrieve the next page of redeemables. - Send another API request for Qualification with the &#x60;starting_after&#x60; parameter set to the value taken from the &#x60;created_at&#x60; parameter from the last returned redeemable. - Voucherify will return the next page of redeemables. - If the &#x60;has_more&#x60; parameter is set to &#x60;true&#x60;, apply steps 3-5 to get the next page of redeemables.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ClientSideApi;

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

This method is accessible through public keys which you can use in client side requests coming from mobile and web browser applications.  ## How API returns calculated discounts and order amounts in the response  In the table below, you can see the logic the API follows to calculate discounts and amounts:  | **Field** | **Calculation** | **Description** | |:---|:---|:---| | amount | N/A | This field shows the order amount before applying any discount | | total_amount | &#x60;total_amount&#x60; &#x3D; &#x60;amount&#x60; - &#x60;total_discount_amount&#x60; | This field shows the order amount after applying all the discounts | | discount_amount | &#x60;discount_amount&#x60; &#x3D; &#x60;previous_discount_amount&#x60; + &#x60;applied_discount_amount&#x60; | This field sums up all order-level discounts up to and including the specific discount being calculated for the stacked redemption. | | items_discount_amount | sum(items, i &#x3D;&gt; i.discount_amount) | This field sums up all product-specific discounts | | total_discount_amount | &#x60;total_discount_amount&#x60; &#x3D; &#x60;discount_amount&#x60; + &#x60;items_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts | | applied_discount_amount | N/A | This field shows the order-level discount applied in a particular request | | items_applied_discount_amount | sum(items, i &#x3D;&gt; i.applied_discount_amount) | This field sums up all product-specific discounts applied in a particular request | | total_applied_discount_amount | &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60; | This field sums up all order-level and all product-specific discounts applied in a particular request |  &lt;!-- theme: info --&gt; &gt; 📘 Rollbacks &gt; &gt; You can&#39;t roll back a child redemption. When you call rollback on a stacked redemption, all child redemptions will be rolled back. You need to refer to a parent redemption ID in your &lt;!-- [rollback request](OpenAPI.json/paths/~1redemptions~1{parentRedemptionId}~1rollbacks/post) --&gt;[rollback request](ref:rollback-stacked-redemptions).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ClientSideApi;

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

To track a custom event, you create an event object.    The event object must be linked to the customer who performs the action. If a customer doesn&#39;t exist in Voucherify, the customer will be created.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ClientSideApi;

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ClientSideApi;

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
    String customerId = "customerId_example"; // String | A Voucherify customer identifier or `source_id`
    Object body = {"cnst_6jQ5XcUOLnj5L7ImQAdBsJ1I":true,"cnst_VCmucIvAsmDYw2PPAok6bcYy":false}; // Object | Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use \"unsubscribed\" as a consent identifier and \"true\" as its value.    #### Examples  <!-- title: \"Request Body\" lineNumbers: true --> ```json {     \"cnst_aIdUulAh0SCsOCaS3005y7yS\": true,     \"cnst_aIdUulAhwewqaS31213fdsfds\": false } ```  Opt-out from all communication:  <!-- title: \"Request Body\" lineNumbers: true --> ```json {     \"unsubscribed\": true } ```
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
| **customerId** | **String**| A Voucherify customer identifier or &#x60;source_id&#x60; |
| **body** | **Object**| Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use \&quot;unsubscribed\&quot; as a consent identifier and \&quot;true\&quot; as its value.    #### Examples  &lt;!-- title: \&quot;Request Body\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;cnst_aIdUulAh0SCsOCaS3005y7yS\&quot;: true,     \&quot;cnst_aIdUulAhwewqaS31213fdsfds\&quot;: false } &#x60;&#x60;&#x60;  Opt-out from all communication:  &lt;!-- title: \&quot;Request Body\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;unsubscribed\&quot;: true } &#x60;&#x60;&#x60; |

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ClientSideApi;

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


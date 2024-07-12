# PromotionsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPromotionStack**](PromotionsApi.md#createPromotionStack) | **POST** /v1/promotions/{campaignId}/stacks | Create Promotion Stack |
| [**deletePromotionStack**](PromotionsApi.md#deletePromotionStack) | **DELETE** /v1/promotions/{campaignId}/stacks/{stackId} | Delete Promotion Stack |
| [**deletePromotionTier**](PromotionsApi.md#deletePromotionTier) | **DELETE** /v1/promotions/tiers/{promotionTierId} | Delete Promotion Tier |
| [**disablePromotionTier**](PromotionsApi.md#disablePromotionTier) | **POST** /v1/promotions/tiers/{promotionTierId}/disable | Disable Promotion Tier |
| [**enablePromotionTier**](PromotionsApi.md#enablePromotionTier) | **POST** /v1/promotions/tiers/{promotionTierId}/enable | Enable Promotion Tier |
| [**getPromotionStack**](PromotionsApi.md#getPromotionStack) | **GET** /v1/promotions/{campaignId}/stacks/{stackId} | Get Promotion Stack |
| [**getPromotionTier**](PromotionsApi.md#getPromotionTier) | **GET** /v1/promotions/tiers/{promotionTierId} | Get Promotion Tier |
| [**listAllPromotionStacks**](PromotionsApi.md#listAllPromotionStacks) | **GET** /v1/promotions/stacks | List Promotion Stacks |
| [**listPromotionStacksInCampaign**](PromotionsApi.md#listPromotionStacksInCampaign) | **GET** /v1/promotions/{campaignId}/stacks | List Promotion Stacks in Campaign |
| [**listPromotionTiersFromCampaign**](PromotionsApi.md#listPromotionTiersFromCampaign) | **GET** /v1/promotions/{campaignId}/tiers | List Promotion Tiers from Campaign |
| [**updatePromotionStack**](PromotionsApi.md#updatePromotionStack) | **PUT** /v1/promotions/{campaignId}/stacks/{stackId} | Update Promotion Stack |


<a id="createPromotionStack"></a>
# **createPromotionStack**
> PromotionsStacksCreateResponseBody createPromotionStack(campaignId, promotionsStacksCreateRequestBody)

Create Promotion Stack

This method creates one promotion stack. The sequence of promotion tier IDs will determine the promotion stacking order.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    PromotionsStacksCreateRequestBody promotionsStacksCreateRequestBody = new PromotionsStacksCreateRequestBody(); // PromotionsStacksCreateRequestBody | Specify the order of promotion tiers for the promotion stack.
    try {
      PromotionsStacksCreateResponseBody result = apiInstance.createPromotionStack(campaignId, promotionsStacksCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#createPromotionStack");
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
| **promotionsStacksCreateRequestBody** | [**PromotionsStacksCreateRequestBody**](PromotionsStacksCreateRequestBody.md)| Specify the order of promotion tiers for the promotion stack. |

### Return type

[**PromotionsStacksCreateResponseBody**](PromotionsStacksCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a new stack object if a valid promotion campaign identifier was provided in the path and available promotion IDs in the payload. |  -  |

<a id="deletePromotionStack"></a>
# **deletePromotionStack**
> deletePromotionStack(campaignId, stackId)

Delete Promotion Stack

This method deletes a promotion stack.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign. 
    String stackId = "stackId_example"; // String | Promotion stack ID.
    try {
      apiInstance.deletePromotionStack(campaignId, stackId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#deletePromotionStack");
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
| **campaignId** | **String**| ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign.  |
| **stackId** | **String**| Promotion stack ID. |

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

<a id="deletePromotionTier"></a>
# **deletePromotionTier**
> deletePromotionTier(promotionTierId)

Delete Promotion Tier

This method deletes a promotion tier.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String promotionTierId = "promotionTierId_example"; // String | Unique promotion tier ID.
    try {
      apiInstance.deletePromotionTier(promotionTierId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#deletePromotionTier");
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
| **promotionTierId** | **String**| Unique promotion tier ID. |

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

<a id="disablePromotionTier"></a>
# **disablePromotionTier**
> PromotionsTiersDisableResponseBody disablePromotionTier(promotionTierId)

Disable Promotion Tier

This method disables a promotion tier, i.e. makes the active parameter   false.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String promotionTierId = "promotionTierId_example"; // String | Unique promotion tier ID.
    try {
      PromotionsTiersDisableResponseBody result = apiInstance.disablePromotionTier(promotionTierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#disablePromotionTier");
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
| **promotionTierId** | **String**| Unique promotion tier ID. |

### Return type

[**PromotionsTiersDisableResponseBody**](PromotionsTiersDisableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the promotion tier object with an updated &#x60;active&#x60; parameter. |  -  |

<a id="enablePromotionTier"></a>
# **enablePromotionTier**
> PromotionsTiersEnableResponseBody enablePromotionTier(promotionTierId)

Enable Promotion Tier

This method enables a promotion tier, i.e. makes the active parameter   true.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String promotionTierId = "promotionTierId_example"; // String | Unique promotion tier ID.
    try {
      PromotionsTiersEnableResponseBody result = apiInstance.enablePromotionTier(promotionTierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#enablePromotionTier");
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
| **promotionTierId** | **String**| Unique promotion tier ID. |

### Return type

[**PromotionsTiersEnableResponseBody**](PromotionsTiersEnableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the promotion tier object with an updated &#x60;active&#x60; parameter. |  -  |

<a id="getPromotionStack"></a>
# **getPromotionStack**
> PromotionsStacksGetResponseBody getPromotionStack(campaignId, stackId)

Get Promotion Stack

This method returns the details of a promotion stack, including the promotion tiers grouped within the stack.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign. 
    String stackId = "stackId_example"; // String | Promotion stack ID.
    try {
      PromotionsStacksGetResponseBody result = apiInstance.getPromotionStack(campaignId, stackId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#getPromotionStack");
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
| **campaignId** | **String**| ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign.  |
| **stackId** | **String**| Promotion stack ID. |

### Return type

[**PromotionsStacksGetResponseBody**](PromotionsStacksGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a stack object if valid identifiers were provided in the path. |  -  |

<a id="getPromotionTier"></a>
# **getPromotionTier**
> PromotionsTiersGetResponseBody getPromotionTier(promotionTierId)

Get Promotion Tier

This method enables you to retrieve a specific promotion tier.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String promotionTierId = "promotionTierId_example"; // String | Unique promotion tier ID.
    try {
      PromotionsTiersGetResponseBody result = apiInstance.getPromotionTier(promotionTierId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#getPromotionTier");
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
| **promotionTierId** | **String**| Unique promotion tier ID. |

### Return type

[**PromotionsTiersGetResponseBody**](PromotionsTiersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a promotion tier object. |  -  |

<a id="listAllPromotionStacks"></a>
# **listAllPromotionStacks**
> PromotionsStacksListResponseBody listAllPromotionStacks(limit, page, order, createdAt, updatedAt)

List Promotion Stacks

This method enables you to list promotion stacks irrespective of the campaign they are associated with.  You can use filters in the query parameters to specify the stacks to be returned in the response. # Advanced filters for fetching promotion stacks  

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListAllPromotionStacks order = ParameterOrderListAllPromotionStacks.fromValue("created_at"); // ParameterOrderListAllPromotionStacks | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    ParameterCreatedBeforeAfter createdAt = new ParameterCreatedBeforeAfter(); // ParameterCreatedBeforeAfter | A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z
    ParameterUpdatedBeforeAfter updatedAt = new ParameterUpdatedBeforeAfter(); // ParameterUpdatedBeforeAfter | A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z
    try {
      PromotionsStacksListResponseBody result = apiInstance.listAllPromotionStacks(limit, page, order, createdAt, updatedAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#listAllPromotionStacks");
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
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrderListAllPromotionStacks**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **createdAt** | [**ParameterCreatedBeforeAfter**](.md)| A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z |
| **updatedAt** | [**ParameterUpdatedBeforeAfter**](.md)| A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z |

### Return type

[**PromotionsStacksListResponseBody**](PromotionsStacksListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a &#x60;data&#x60; property that contains an array of promotion stacks across all your campaigns. |  -  |

<a id="listPromotionStacksInCampaign"></a>
# **listPromotionStacksInCampaign**
> PromotionsStacksListResponseBody listPromotionStacksInCampaign(campaignId)

List Promotion Stacks in Campaign

This method enables you to list promotion stacks from a specified campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID.
    try {
      PromotionsStacksListResponseBody result = apiInstance.listPromotionStacksInCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#listPromotionStacksInCampaign");
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

### Return type

[**PromotionsStacksListResponseBody**](PromotionsStacksListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of promotion stack objects. |  -  |

<a id="listPromotionTiersFromCampaign"></a>
# **listPromotionTiersFromCampaign**
> PromotionsTiersListResponseBody listPromotionTiersFromCampaign(campaignId)

List Promotion Tiers from Campaign

This method enables you to list promotion tiers from a specified campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | Unique campaign ID assigned by Voucherify.
    try {
      PromotionsTiersListResponseBody result = apiInstance.listPromotionTiersFromCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#listPromotionTiersFromCampaign");
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
| **campaignId** | **String**| Unique campaign ID assigned by Voucherify. |

### Return type

[**PromotionsTiersListResponseBody**](PromotionsTiersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a &#x60;tiers&#x60; property that contains an array of promotion tiers. |  -  |

<a id="updatePromotionStack"></a>
# **updatePromotionStack**
> PromotionsStacksUpdateResponseBody updatePromotionStack(campaignId, stackId, promotionsStacksUpdateRequestBody)

Update Promotion Stack

This methods allows for editing an existing stack.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PromotionsApi;

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

    PromotionsApi apiInstance = new PromotionsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign. 
    String stackId = "stackId_example"; // String | Promotion stack ID.
    PromotionsStacksUpdateRequestBody promotionsStacksUpdateRequestBody = new PromotionsStacksUpdateRequestBody(); // PromotionsStacksUpdateRequestBody | Specify the promotion stack parameters that you would like to update.
    try {
      PromotionsStacksUpdateResponseBody result = apiInstance.updatePromotionStack(campaignId, stackId, promotionsStacksUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromotionsApi#updatePromotionStack");
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
| **campaignId** | **String**| ID of the promotion campaign. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value, e.g., Loyalty Campaign.  |
| **stackId** | **String**| Promotion stack ID. |
| **promotionsStacksUpdateRequestBody** | [**PromotionsStacksUpdateRequestBody**](PromotionsStacksUpdateRequestBody.md)| Specify the promotion stack parameters that you would like to update. |

### Return type

[**PromotionsStacksUpdateResponseBody**](PromotionsStacksUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a promotion stack with updated parameters if the update was successful. |  -  |


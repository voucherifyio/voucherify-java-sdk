# CategoriesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCategory**](CategoriesApi.md#createCategory) | **POST** /v1/categories | Create Category |
| [**deleteCategory**](CategoriesApi.md#deleteCategory) | **DELETE** /v1/categories/{categoryId} | Delete Category |
| [**getCategory**](CategoriesApi.md#getCategory) | **GET** /v1/categories/{categoryId} | Get Category |
| [**listCategories**](CategoriesApi.md#listCategories) | **GET** /v1/categories | List Categories |
| [**updateCategory**](CategoriesApi.md#updateCategory) | **PUT** /v1/categories/{categoryId} | Update Category |


<a id="createCategory"></a>
# **createCategory**
> CategoriesCreateResponseBody createCategory(categoriesCreateRequestBody)

Create Category

Create category with a specific name and hierarchy.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    CategoriesCreateRequestBody categoriesCreateRequestBody = new CategoriesCreateRequestBody(); // CategoriesCreateRequestBody | Specify the details of the category that you would like to create.
    try {
      CategoriesCreateResponseBody result = apiInstance.createCategory(categoriesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#createCategory");
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
| **categoriesCreateRequestBody** | [**CategoriesCreateRequestBody**](CategoriesCreateRequestBody.md)| Specify the details of the category that you would like to create. |

### Return type

[**CategoriesCreateResponseBody**](CategoriesCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a newly created category object. |  -  |

<a id="deleteCategory"></a>
# **deleteCategory**
> deleteCategory(categoryId)

Delete Category

Delete a category by the category ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Unique category ID assigned by Voucherify.
    try {
      apiInstance.deleteCategory(categoryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#deleteCategory");
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
| **categoryId** | **String**| Unique category ID assigned by Voucherify. |

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
| **204** | No content is returned. |  -  |

<a id="getCategory"></a>
# **getCategory**
> CategoriesGetResponseBody getCategory(categoryId)

Get Category

Retrieve a category by the category ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Unique category ID assigned by Voucherify.
    try {
      CategoriesGetResponseBody result = apiInstance.getCategory(categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#getCategory");
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
| **categoryId** | **String**| Unique category ID assigned by Voucherify. |

### Return type

[**CategoriesGetResponseBody**](CategoriesGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a category object. |  -  |

<a id="listCategories"></a>
# **listCategories**
> CategoriesListResponseBody listCategories()

List Categories

List all categories.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    try {
      CategoriesListResponseBody result = apiInstance.listCategories();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#listCategories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CategoriesListResponseBody**](CategoriesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of category objects. |  -  |

<a id="updateCategory"></a>
# **updateCategory**
> CategoriesUpdateResponseBody updateCategory(categoryId, categoriesUpdateRequestBody)

Update Category

Update category using the category ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CategoriesApi;

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

    CategoriesApi apiInstance = new CategoriesApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Unique category ID assigned by Voucherify.
    CategoriesUpdateRequestBody categoriesUpdateRequestBody = new CategoriesUpdateRequestBody(); // CategoriesUpdateRequestBody | Specify the details of the category that you would like to update.
    try {
      CategoriesUpdateResponseBody result = apiInstance.updateCategory(categoryId, categoriesUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CategoriesApi#updateCategory");
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
| **categoryId** | **String**| Unique category ID assigned by Voucherify. |
| **categoriesUpdateRequestBody** | [**CategoriesUpdateRequestBody**](CategoriesUpdateRequestBody.md)| Specify the details of the category that you would like to update. |

### Return type

[**CategoriesUpdateResponseBody**](CategoriesUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a category object with a refreshed &#x60;updated_at&#x60; property. |  -  |


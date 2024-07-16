# ProductCollectionsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProductCollection**](ProductCollectionsApi.md#createProductCollection) | **POST** /v1/product-collections | Create Product Collection |
| [**deleteProductCollection**](ProductCollectionsApi.md#deleteProductCollection) | **DELETE** /v1/product-collections/{productCollectionId} | Delete Product Collection |
| [**getProductCollection**](ProductCollectionsApi.md#getProductCollection) | **GET** /v1/product-collections/{productCollectionId} | Get Product Collection |
| [**listProductCollections**](ProductCollectionsApi.md#listProductCollections) | **GET** /v1/product-collections | List Product Collections |
| [**listProductsInCollection**](ProductCollectionsApi.md#listProductsInCollection) | **GET** /v1/product-collections/{productCollectionId}/products | List Products in Collection |


<a id="createProductCollection"></a>
# **createProductCollection**
> ProductCollectionsCreateResponseBody createProductCollection(productCollectionsCreateRequestBody)

Create Product Collection

This method creates a new product collection.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductCollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductCollectionsApi apiInstance = new ProductCollectionsApi(defaultClient);
    ProductCollectionsCreateRequestBody productCollectionsCreateRequestBody = new ProductCollectionsCreateRequestBody(); // ProductCollectionsCreateRequestBody | 
    try {
      ProductCollectionsCreateResponseBody result = apiInstance.createProductCollection(productCollectionsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCollectionsApi#createProductCollection");
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
| **productCollectionsCreateRequestBody** | [**ProductCollectionsCreateRequestBody**](ProductCollectionsCreateRequestBody.md)|  |

### Return type

[**ProductCollectionsCreateResponseBody**](ProductCollectionsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns information about the newly created collection, as well as an array containing the products. |  -  |

<a id="deleteProductCollection"></a>
# **deleteProductCollection**
> deleteProductCollection(productCollectionId)

Delete Product Collection

This method deletes a product collection.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductCollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductCollectionsApi apiInstance = new ProductCollectionsApi(defaultClient);
    String productCollectionId = "productCollectionId_example"; // String | A unique product collection ID.
    try {
      apiInstance.deleteProductCollection(productCollectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCollectionsApi#deleteProductCollection");
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
| **productCollectionId** | **String**| A unique product collection ID. |

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

<a id="getProductCollection"></a>
# **getProductCollection**
> ProductCollectionsGetResponseBody getProductCollection(productCollectionId)

Get Product Collection

Retrieves the product collection.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductCollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductCollectionsApi apiInstance = new ProductCollectionsApi(defaultClient);
    String productCollectionId = "productCollectionId_example"; // String | A unique product collection ID.
    try {
      ProductCollectionsGetResponseBody result = apiInstance.getProductCollection(productCollectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCollectionsApi#getProductCollection");
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
| **productCollectionId** | **String**| A unique product collection ID. |

### Return type

[**ProductCollectionsGetResponseBody**](ProductCollectionsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a product collection object if a valid identifier was provided in the path. |  -  |

<a id="listProductCollections"></a>
# **listProductCollections**
> ProductCollectionsListResponseBody listProductCollections(limit, page, order)

List Product Collections

This method returns a list of product collections.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductCollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductCollectionsApi apiInstance = new ProductCollectionsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      ProductCollectionsListResponseBody result = apiInstance.listProductCollections(limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCollectionsApi#listProductCollections");
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
| **order** | [**ParameterOrder**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**ProductCollectionsListResponseBody**](ProductCollectionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary containing a list of product collections and details about each product collection. |  -  |

<a id="listProductsInCollection"></a>
# **listProductsInCollection**
> ProductCollectionsProductsListResponseBody listProductsInCollection(productCollectionId, limit, page, order, startingAfter)

List Products in Collection

Retrieves list of products from a product collection; works for both dynamic and static product collections.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductCollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductCollectionsApi apiInstance = new ProductCollectionsApi(defaultClient);
    String productCollectionId = "productCollectionId_example"; // String | Unique product collection ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    OffsetDateTime startingAfter = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time to use in starting_after cursor to get more data. Represented in ISO 8601 format.
    try {
      ProductCollectionsProductsListResponseBody result = apiInstance.listProductsInCollection(productCollectionId, limit, page, order, startingAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCollectionsApi#listProductsInCollection");
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
| **productCollectionId** | **String**| Unique product collection ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrder**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startingAfter** | **OffsetDateTime**| Timestamp representing the date and time to use in starting_after cursor to get more data. Represented in ISO 8601 format. |

### Return type

[**ProductCollectionsProductsListResponseBody**](ProductCollectionsProductsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of products and/or SKUs grouped in the collection with each product&#39;s/SKU&#39;s details. |  -  |


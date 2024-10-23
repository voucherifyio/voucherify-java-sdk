# ProductsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProduct**](ProductsApi.md#createProduct) | **POST** /v1/products | Create Product |
| [**createSku**](ProductsApi.md#createSku) | **POST** /v1/products/{productId}/skus | Create SKU |
| [**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | Delete Product |
| [**deleteSku**](ProductsApi.md#deleteSku) | **DELETE** /v1/products/{productId}/skus/{skuId} | Delete SKU |
| [**getProduct**](ProductsApi.md#getProduct) | **GET** /v1/products/{productId} | Get Product |
| [**getSku**](ProductsApi.md#getSku) | **GET** /v1/skus/{skuId} | Get SKU |
| [**importProductsUsingCsv**](ProductsApi.md#importProductsUsingCsv) | **POST** /v1/products/importCSV | Import Products using CSV |
| [**importSkusUsingCsv**](ProductsApi.md#importSkusUsingCsv) | **POST** /v1/skus/importCSV | Import SKUs using CSV |
| [**listProducts**](ProductsApi.md#listProducts) | **GET** /v1/products | List Products |
| [**listSkusInProduct**](ProductsApi.md#listSkusInProduct) | **GET** /v1/products/{productId}/skus | List SKUs in Product |
| [**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /v1/products/{productId} | Update Product |
| [**updateProductsInBulk**](ProductsApi.md#updateProductsInBulk) | **POST** /v1/products/bulk/async | Update Products in Bulk |
| [**updateProductsMetadataInBulk**](ProductsApi.md#updateProductsMetadataInBulk) | **POST** /v1/products/metadata/async | Update Products&#39; Metadata in Bulk |
| [**updateSku**](ProductsApi.md#updateSku) | **PUT** /v1/products/{productId}/skus/{skuId} | Update SKU |


<a id="createProduct"></a>
# **createProduct**
> ProductsCreateResponseBody createProduct(productsCreateRequestBody)

Create Product

Creates a product object.  📘 Upsert Mode  If you pass an id or a source_id that already exists in the product database, Voucherify will return a related product object with updated fields.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductsCreateRequestBody productsCreateRequestBody = new ProductsCreateRequestBody(); // ProductsCreateRequestBody | Specify the product parameters.
    try {
      ProductsCreateResponseBody result = apiInstance.createProduct(productsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#createProduct");
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
| **productsCreateRequestBody** | [**ProductsCreateRequestBody**](ProductsCreateRequestBody.md)| Specify the product parameters. |

### Return type

[**ProductsCreateResponseBody**](ProductsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a product object if the operation succeeded. |  -  |

<a id="createSku"></a>
# **createSku**
> ProductsSkusCreateResponseBody createSku(productId, productsSkusCreateRequestBody)

Create SKU

This method adds product variants to a created product.   📘 Upsert Mode  If you pass an id or a source_id that already exists in the sku database, Voucherify will return a related sku object with updated fields.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or product source ID.
    ProductsSkusCreateRequestBody productsSkusCreateRequestBody = new ProductsSkusCreateRequestBody(); // ProductsSkusCreateRequestBody | Specify the SKU parameters to be created.
    try {
      ProductsSkusCreateResponseBody result = apiInstance.createSku(productId, productsSkusCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#createSku");
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
| **productId** | **String**| A Voucherify product ID or product source ID. |
| **productsSkusCreateRequestBody** | [**ProductsSkusCreateRequestBody**](ProductsSkusCreateRequestBody.md)| Specify the SKU parameters to be created. |

### Return type

[**ProductsSkusCreateResponseBody**](ProductsSkusCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the created SKU object. |  -  |

<a id="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(productId, force)

Delete Product

Deletes a product and all related SKUs. This operation cannot be undone.  If the force parameter is set to false or not set at all, the product and all related SKUs will be moved to the bin.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or source ID.
    Boolean force = true; // Boolean | If this flag is set to true, the product and all related SKUs will be removed permanently. If it is set to false or not set at all, the product and all related SKUs will be moved to the bin. Going forward, the user will be able to create another product with exactly the same source_id.
    try {
      apiInstance.deleteProduct(productId, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteProduct");
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
| **productId** | **String**| A Voucherify product ID or source ID. |
| **force** | **Boolean**| If this flag is set to true, the product and all related SKUs will be removed permanently. If it is set to false or not set at all, the product and all related SKUs will be moved to the bin. Going forward, the user will be able to create another product with exactly the same source_id. |

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

<a id="deleteSku"></a>
# **deleteSku**
> deleteSku(productId, skuId, force)

Delete SKU

Deletes a product SKU. This operation cannot be undone.  If the force parameter is set to false or not set at all, the SKU will be moved to the bin.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A unique Voucherify product ID or product source ID.
    String skuId = "skuId_example"; // String | A Voucherify SKU ID or SKU source ID.
    Boolean force = true; // Boolean | If this flag is set to true, the SKU will be removed permanently. If it is set to false or not set at all, the SKU will be moved to the bin. Going forward, the user will be able to create another SKU with exactly the same source_id.
    try {
      apiInstance.deleteSku(productId, skuId, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteSku");
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
| **productId** | **String**| A unique Voucherify product ID or product source ID. |
| **skuId** | **String**| A Voucherify SKU ID or SKU source ID. |
| **force** | **Boolean**| If this flag is set to true, the SKU will be removed permanently. If it is set to false or not set at all, the SKU will be moved to the bin. Going forward, the user will be able to create another SKU with exactly the same source_id. |

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

<a id="getProduct"></a>
# **getProduct**
> ProductsGetResponseBody getProduct(productId)

Get Product

Retrieve product details.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or source ID.
    try {
      ProductsGetResponseBody result = apiInstance.getProduct(productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProduct");
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
| **productId** | **String**| A Voucherify product ID or source ID. |

### Return type

[**ProductsGetResponseBody**](ProductsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a product object if a valid identifier was provided. |  -  |

<a id="getSku"></a>
# **getSku**
> SkusGetResponseBody getSku(skuId)

Get SKU

Retrieve details of a SKU.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String skuId = "skuId_example"; // String | A Voucherify SKU identifier or SKU source ID.
    try {
      SkusGetResponseBody result = apiInstance.getSku(skuId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getSku");
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
| **skuId** | **String**| A Voucherify SKU identifier or SKU source ID. |

### Return type

[**SkusGetResponseBody**](SkusGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns requested SKU object. |  -  |

<a id="importProductsUsingCsv"></a>
# **importProductsUsingCsv**
> ProductsImportCsvCreateResponseBody importProductsUsingCsv(_file)

Import Products using CSV

Import products into the repository using a CSV file.   This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File path.
    try {
      ProductsImportCsvCreateResponseBody result = apiInstance.importProductsUsingCsv(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#importProductsUsingCsv");
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
| **_file** | **File**| File path. |

### Return type

[**ProductsImportCsvCreateResponseBody**](ProductsImportCsvCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and products will be added to the repository asynchronously. To check the import status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="importSkusUsingCsv"></a>
# **importSkusUsingCsv**
> SkusImportCsvCreateResponseBody importSkusUsingCsv(_file)

Import SKUs using CSV

Import SKUs into the repository using a CSV file. The CSV file has to include headers in the first line. All properties which cannot be mapped to standard SKU fields will be added to the metadata object. You can find an example template [here](https://s3.amazonaws.com/helpscout.net/docs/assets/5902f1c12c7d3a057f88a36d/attachments/627b98d08c9b585083488a4c/Import_SKUS_template.csv).  This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File path.
    try {
      SkusImportCsvCreateResponseBody result = apiInstance.importSkusUsingCsv(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#importSkusUsingCsv");
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
| **_file** | **File**| File path. |

### Return type

[**SkusImportCsvCreateResponseBody**](SkusImportCsvCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and SKUs will be added to the repository asynchronously. To check the import status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="listProducts"></a>
# **listProducts**
> ProductsListResponseBody listProducts(limit, page, order, startDate, endDate)

List Products

Retrieve a list of products.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    try {
      ProductsListResponseBody result = apiInstance.listProducts(limit, page, order, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#listProducts");
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
| **startDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |
| **endDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |

### Return type

[**ProductsListResponseBody**](ProductsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with product objects. The products are returned sorted by creation date by default, with the most recent products appearing last, unless you specify another sequence using the &#x60;order&#x60; query parameter. |  -  |

<a id="listSkusInProduct"></a>
# **listSkusInProduct**
> ProductsSkusListResponseBody listSkusInProduct(productId, limit, page, order, startDate, endDate)

List SKUs in Product

Retrieve all SKUs for a given product.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or product source ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    try {
      ProductsSkusListResponseBody result = apiInstance.listSkusInProduct(productId, limit, page, order, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#listSkusInProduct");
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
| **productId** | **String**| A Voucherify product ID or product source ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrder**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |
| **endDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |

### Return type

[**ProductsSkusListResponseBody**](ProductsSkusListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of SKUs. |  -  |

<a id="updateProduct"></a>
# **updateProduct**
> ProductsUpdateResponseBody updateProduct(productId, productsUpdateRequestBody)

Update Product

Updates the specified product by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or source ID.
    ProductsUpdateRequestBody productsUpdateRequestBody = new ProductsUpdateRequestBody(); // ProductsUpdateRequestBody | Specify the parameters of the product that are to be updated.
    try {
      ProductsUpdateResponseBody result = apiInstance.updateProduct(productId, productsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProduct");
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
| **productId** | **String**| A Voucherify product ID or source ID. |
| **productsUpdateRequestBody** | [**ProductsUpdateRequestBody**](ProductsUpdateRequestBody.md)| Specify the parameters of the product that are to be updated. |

### Return type

[**ProductsUpdateResponseBody**](ProductsUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an updated product object. |  -  |

<a id="updateProductsInBulk"></a>
# **updateProductsInBulk**
> ProductsUpdateInBulkResponseBody updateProductsInBulk(productsUpdateInBulkRequestBody)

Update Products in Bulk

Update products in one asynchronous operation. The request can include up to **10 MB** of data. The response returns a unique asynchronous action ID. Use this ID in the query paramater of the GET Async Action endpoint to check, e.g.: - The status of your request (in queue, in progress, done, or failed) - Resources that failed to be updated - The report file with details about the update If a product object is not found, it is **upserted**. This is shown in the report file in the **GET** Async Action endpoint. The upserted resources have value false in the found column and true in the updated column. This API request starts a process that affects Voucherify data in bulk. In the case of small jobs (like bulk update), the request is put into a queue and processed when every other bulk request placed in the queue prior to this request is finished.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    List<ProductsUpdateInBulkRequestBody> productsUpdateInBulkRequestBody = Arrays.asList(); // List<ProductsUpdateInBulkRequestBody> | List the product fields to be updated in each customer object.
    try {
      ProductsUpdateInBulkResponseBody result = apiInstance.updateProductsInBulk(productsUpdateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProductsInBulk");
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
| **productsUpdateInBulkRequestBody** | [**List&lt;ProductsUpdateInBulkRequestBody&gt;**](ProductsUpdateInBulkRequestBody.md)| List the product fields to be updated in each customer object. |

### Return type

[**ProductsUpdateInBulkResponseBody**](ProductsUpdateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the ID of the scheduled asynchronous action. The response informs you that the request has been accepted and the resources will be updated in the repository asynchronously. To check the status and result, copy the &#x60;async_action_id&#x60; from the response and use it as a query parameter in the [GET Async Action](ref:get-async-action) endpoint. |  -  |

<a id="updateProductsMetadataInBulk"></a>
# **updateProductsMetadataInBulk**
> ProductsMetadataUpdateInBulkResponseBody updateProductsMetadataInBulk(productsMetadataUpdateInBulkRequestBody)

Update Products&#39; Metadata in Bulk

Updates metadata parameters for a list of products. Every resource in the list will receive the metadata defined in the request. The request can include up to **10 MB** of data. The response returns a unique asynchronous action ID. Use this ID in the query paramater of the GET Async Action endpoint to check, e.g.: - The status of your request (in queue, in progress, done, or failed) - Resources that failed to be updated - The report file with details about the update If a product object is not found, it is **upserted**. This is shown in the report file in the **GET** Async Action endpoint. The upserted resources have value false in the found column and true in the updated column. This API request starts a process that affects Voucherify data in bulk. In the case of small jobs (like bulk update), the request is put into a queue and processed when every other bulk request placed in the queue prior to this request is finished.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductsMetadataUpdateInBulkRequestBody productsMetadataUpdateInBulkRequestBody = new ProductsMetadataUpdateInBulkRequestBody(); // ProductsMetadataUpdateInBulkRequestBody | List the source_ids of the products you would like to update with the metadata key/value pairs.
    try {
      ProductsMetadataUpdateInBulkResponseBody result = apiInstance.updateProductsMetadataInBulk(productsMetadataUpdateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProductsMetadataInBulk");
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
| **productsMetadataUpdateInBulkRequestBody** | [**ProductsMetadataUpdateInBulkRequestBody**](ProductsMetadataUpdateInBulkRequestBody.md)| List the source_ids of the products you would like to update with the metadata key/value pairs. |

### Return type

[**ProductsMetadataUpdateInBulkResponseBody**](ProductsMetadataUpdateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the ID of the scheduled asynchronous action. The response informs you that the request has been accepted and the resources will be updated in the repository asynchronously. To check the status and result, copy the &#x60;async_action_id&#x60; from the response and use it as a query parameter in the [GET Async Action](ref:get-async-action) endpoint. |  -  |

<a id="updateSku"></a>
# **updateSku**
> ProductsSkusUpdateResponseBody updateSku(productId, skuId, productsSkusUpdateRequestBody)

Update SKU

Updates the specified SKU by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged. Fields other than the ones listed in the request body schema wont be modified. Even if provided, they will be silently skipped.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A unique Voucherify product ID or product source ID.
    String skuId = "skuId_example"; // String | A Voucherify SKU ID or SKU source ID.
    ProductsSkusUpdateRequestBody productsSkusUpdateRequestBody = new ProductsSkusUpdateRequestBody(); // ProductsSkusUpdateRequestBody | Specify the parameters to be updated.
    try {
      ProductsSkusUpdateResponseBody result = apiInstance.updateSku(productId, skuId, productsSkusUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateSku");
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
| **productId** | **String**| A unique Voucherify product ID or product source ID. |
| **skuId** | **String**| A Voucherify SKU ID or SKU source ID. |
| **productsSkusUpdateRequestBody** | [**ProductsSkusUpdateRequestBody**](ProductsSkusUpdateRequestBody.md)| Specify the parameters to be updated. |

### Return type

[**ProductsSkusUpdateResponseBody**](ProductsSkusUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the SKU object with the updated parameters. |  -  |


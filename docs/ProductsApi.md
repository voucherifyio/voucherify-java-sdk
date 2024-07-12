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
| [**updateProductsInBulk**](ProductsApi.md#updateProductsInBulk) | **POST** /v1/products/bulk/async | Update Products in bulk |
| [**updateProductsMetadataInBulk**](ProductsApi.md#updateProductsMetadataInBulk) | **POST** /v1/products/metadata/async | Update Products&#39; Metadata in bulk |
| [**updateSku**](ProductsApi.md#updateSku) | **PUT** /v1/products/{productId}/skus/{skuId} | Update SKU |


<a id="createProduct"></a>
# **createProduct**
> ProductsCreateResponseBody createProduct(productsCreateRequestBody)

Create Product

Creates a product object.  &lt;!-- theme: info --&gt;  &gt; 📘 Upsert Mode &gt; &gt; If you pass an &#x60;id&#x60; or a &#x60;source_id&#x60; that already exists in the product database, Voucherify will return a related product object with updated fields.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

This method adds product variants to a &lt;!-- [created product](OpenAPI.json/paths/~1products/post) --&gt;[created product](ref:create-product).   &lt;!-- theme: info --&gt;  &gt; 📘 Upsert Mode &gt; &gt; If you pass an &#x60;id&#x60; or a &#x60;source_id&#x60; that already exists in the sku database, Voucherify will return a related sku object with updated fields.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify <!-- [product](OpenAPI.json/components/schemas/Product) -->[product](ref:get-product) ID or product source ID.
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
| **productId** | **String**| A Voucherify &lt;!-- [product](OpenAPI.json/components/schemas/Product) --&gt;[product](ref:get-product) ID or product source ID. |
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

Deletes a product and all related SKUs. This operation cannot be undone.   If the &#x60;force&#x60; parameter is set to &#x60;false&#x60; or not set at all, the product and all related SKUs will be moved to [the bin](ref:list-bin-entries).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify product ID or source ID.
    Boolean force = true; // Boolean | If this flag is set to `true`, the product and all related SKUs will be removed permanently. If it is set to `false` or not set at all, the product and all related SKUs will be moved to the bin. Going forward, the user will be able to create another product with exactly the same `source_id`.
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
| **force** | **Boolean**| If this flag is set to &#x60;true&#x60;, the product and all related SKUs will be removed permanently. If it is set to &#x60;false&#x60; or not set at all, the product and all related SKUs will be moved to the bin. Going forward, the user will be able to create another product with exactly the same &#x60;source_id&#x60;. |

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

Deletes a product SKU. This operation cannot be undone.   If the &#x60;force&#x60; parameter is set to &#x60;false&#x60; or not set at all, the SKU will be moved to [the bin](ref:list-bin-entries).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A unique Voucherify <!-- [product](OpenAPI.json/components/schemas/Product) -->[product](ref:get-product) ID or product source ID.
    String skuId = "skuId_example"; // String | A Voucherify <!-- [SKU](OpenAPI.json/components/schemas/Sku) -->[SKU ID](ref:get-sku) or SKU source ID.
    Boolean force = true; // Boolean | If this flag is set to `true`, the SKU will be removed permanently. If it is set to `false` or not set at all, the SKU will be moved to the bin. Going forward, the user will be able to create another SKU with exactly the same `source_id`.
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
| **productId** | **String**| A unique Voucherify &lt;!-- [product](OpenAPI.json/components/schemas/Product) --&gt;[product](ref:get-product) ID or product source ID. |
| **skuId** | **String**| A Voucherify &lt;!-- [SKU](OpenAPI.json/components/schemas/Sku) --&gt;[SKU ID](ref:get-sku) or SKU source ID. |
| **force** | **Boolean**| If this flag is set to &#x60;true&#x60;, the SKU will be removed permanently. If it is set to &#x60;false&#x60; or not set at all, the SKU will be moved to the bin. Going forward, the user will be able to create another SKU with exactly the same &#x60;source_id&#x60;. |

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

Import products into the repository using a CSV file.    Curl Example &lt;!-- title: \&quot;Example Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;cURL curl -X POST \\   https://api.voucherify.io/v1/products/importCSV \\   -F file&#x3D;@/path/to/products.csv \\   -H \&quot;X-App-Id: c70a6f00-cf91-4756-9df5-47628850002b\&quot; \\   -H \&quot;X-App-Token: 3266b9f8-e246-4f79-bdf0-833929b1380c\&quot; &#x60;&#x60;&#x60;  The CSV file has to include headers in the first line.  &lt;!-- theme: info --&gt;  &gt; 📘 Standard product fields mapping &gt; &gt; - Create a **comma separated value (CSV) file** or download our CSV import template. You can find an example template [here](https://s3.amazonaws.com/helpscout.net/docs/assets/5902f1c12c7d3a057f88a36d/attachments/627b82ed68d51e779443f550/Import_products_template.csv). &gt; - Supported CSV file headers: &#x60;name,source_id,price,attributes,image_url,Metadata_property_name&#x60; &gt; - **Name** is a **required** field. The remaining fields in the CSV template are optional. &gt; - Override/Update products&#39; **names** in Voucherify using this method. Data will be updated for each product included in the CSV file whose **source_id** matches a source ID in Voucherify. No other data can be updated other than the product name. &gt; - Note that dates and date-time attributes need to be provided in compliance with the **ISO 8601 norms**. For example, 2022-03-11T09:00:00.000Z or 2022-03-11 &gt;    - &#x60;YYYY-MM-DD&#x60; &gt;    - &#x60;YYYY-MM-DDTHH&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ss&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ss.SSSZ&#x60; &gt; - Columns that cannot be mapped to standard fields, will be mapped to **Custom attributes** and added as **products&#39; metadata**. There is no limit on the number of custom attributes that you can import as metadata.  &gt; - To provide the proper data type, you need to add all custom attributes to the metadata schema **before importing the file**. Read more [here](https://support.voucherify.io/article/99-schema-validation-metadata#add-metadata). &gt; - **Product attributes** (not custom attributes) need to be separated by a comma and enclosed in double quotes, i.e \&quot;attribute1,attribute2\&quot;. &gt; - Headers with metadata names **can&#39;t contain white-space characters**. &gt; - If you import metadata defined in the schema as **arrays (multiple)**, you need to separate each value using a comma, for example:   &gt;    - array of strings: \&quot;subscribed,premium\&quot;   &gt;    - array of numbers: \&quot;123,234\&quot;.  &gt;    - array of dates: \&quot;2000-01-01,2000-01-02\&quot;  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

Import SKUs into the repository using a CSV file.  The CSV file has to include headers in the first line. All properties which cannot be mapped to standard SKU fields will be added to the metadata object. You can find an example template [here](https://s3.amazonaws.com/helpscout.net/docs/assets/5902f1c12c7d3a057f88a36d/attachments/627b98d08c9b585083488a4c/Import_SKUS_template.csv).   Curl Example &lt;!-- title: \&quot;Example Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;cURL curl -X POST \\   https://api.voucherify.io/v1/skus/importCSV \\   -F file&#x3D;@/path/to/skus.csv \\   -H \&quot;X-App-Id: c70a6f00-cf91-4756-9df5-47628850002b\&quot; \\   -H \&quot;X-App-Token: 3266b9f8-e246-4f79-bdf0-833929b1380c\&quot; &#x60;&#x60;&#x60; &gt; 🚧 Import sequence &gt; &gt; First import products using the [dedicated endpoint](ref:import-products-using-csv), then import SKUs using this endpoint to properly match SKUs to products.  &lt;!-- theme: info --&gt;  &gt; 📘 Standard SKU fields mapping &gt; &gt; - **Required** fields are &#x60;source_id&#x60; and &#x60;product_id&#x60;. &gt; - Supported CSV file headers: &#x60;product_id,sku,source_id,price,image_url,attributes&#x60; &gt; - SKU **source_id** must be unique in the entire product catalog, no duplicates are allowed. &gt; - SKU attributes need to be in the form of a stringy-fied json, i.e.&#x60;\&quot;{&#39;color&#39;:&#39;blue&#39;}\&quot;&#x60;. These attributes must be defined in the **product** beforehand so you can import them to the SKU. &gt; - You can use this method to update the following parameters in bulk: **sku** and the sku **price**. &gt; - Columns that cannot be mapped to standard fields will be mapped to Custom attributes and added as product metadata. There is no limit on the number of custom attributes that you can import as metadata.  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
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
| **page** | **Integer**| Which page of results to return. The lowest value is &#x60;1&#x60;. |
| **order** | [**ParameterOrder**](.md)| Sorts the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A Voucherify <!-- [product](OpenAPI.json/components/schemas/Product) -->[product](ref:get-product) ID or product source ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    ParameterOrder order = ParameterOrder.fromValue("created_at"); // ParameterOrder | Sorts the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
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
| **productId** | **String**| A Voucherify &lt;!-- [product](OpenAPI.json/components/schemas/Product) --&gt;[product](ref:get-product) ID or product source ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is &#x60;1&#x60;. |
| **order** | [**ParameterOrder**](.md)| Sorts the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

Update Products in bulk

Update several products in one asynchronous operation.   In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier. If a requested product object is not found, then an **upsert** occurs. This is reflected in the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint as follows:    &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;found\&quot;: false,     \&quot;updated\&quot;: true } &#x60;&#x60;&#x60;  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    List<ProductsUpdateInBulkRequestBody> productsUpdateInBulkRequestBody = Arrays.asList(); // List<ProductsUpdateInBulkRequestBody> | Create an array of product objects, each with the parameters which you want to update.
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
| **productsUpdateInBulkRequestBody** | [**List&lt;ProductsUpdateInBulkRequestBody&gt;**](ProductsUpdateInBulkRequestBody.md)| Create an array of product objects, each with the parameters which you want to update. |

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
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and updates will be added to the repository asynchronously. To check the update status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="updateProductsMetadataInBulk"></a>
# **updateProductsMetadataInBulk**
> ProductsMetadataUpdateInBulkResponseBody updateProductsMetadataInBulk(productsMetadataUpdateInBulkRequestBody)

Update Products&#39; Metadata in bulk

Update several product metadata properties in one asynchronous operation.   In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier. If a requested product object is not found, then an **upsert** occurs. This is reflected in the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint as follows:    &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;found\&quot;: false,     \&quot;updated\&quot;: true } &#x60;&#x60;&#x60;  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductsMetadataUpdateInBulkRequestBody productsMetadataUpdateInBulkRequestBody = new ProductsMetadataUpdateInBulkRequestBody(); // ProductsMetadataUpdateInBulkRequestBody | Specify the list of product source IDs and the metadata key value pairs to be udpated for these products.
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
| **productsMetadataUpdateInBulkRequestBody** | [**ProductsMetadataUpdateInBulkRequestBody**](ProductsMetadataUpdateInBulkRequestBody.md)| Specify the list of product source IDs and the metadata key value pairs to be udpated for these products. |

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
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and updates will be added to the repository asynchronously. To check the update status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="updateSku"></a>
# **updateSku**
> ProductsSkusUpdateResponseBody updateSku(productId, skuId, productsSkusUpdateRequestBody)

Update SKU

Updates the specified SKU by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged.  Fields other than the ones listed in the request body schema won&#39;t be modified. Even if provided, they will be silently skipped.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ProductsApi;

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

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    String productId = "productId_example"; // String | A unique Voucherify <!-- [product](OpenAPI.json/components/schemas/Product) -->[product](ref:get-product) ID or product source ID.
    String skuId = "skuId_example"; // String | A Voucherify <!-- [SKU](OpenAPI.json/components/schemas/Sku) -->[SKU ID](ref:get-sku) or SKU source ID.
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
| **productId** | **String**| A unique Voucherify &lt;!-- [product](OpenAPI.json/components/schemas/Product) --&gt;[product](ref:get-product) ID or product source ID. |
| **skuId** | **String**| A Voucherify &lt;!-- [SKU](OpenAPI.json/components/schemas/Sku) --&gt;[SKU ID](ref:get-sku) or SKU source ID. |
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


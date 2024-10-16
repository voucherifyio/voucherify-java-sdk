# MetadataSchemasApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetadataSchema**](MetadataSchemasApi.md#getMetadataSchema) | **GET** /v1/metadata-schemas/{resource} | Get Metadata Schema |
| [**listMetadataSchemas**](MetadataSchemasApi.md#listMetadataSchemas) | **GET** /v1/metadata-schemas | List Metadata Schemas |


<a id="getMetadataSchema"></a>
# **getMetadataSchema**
> MetadataSchemasGetResponseBody getMetadataSchema(resource)

Get Metadata Schema

Retrieves a metadata schema per resource type. # Resource types ## Standard You can retrieve metadata schemas for the standard metadata schema definitions listed below. Add one of these types as the resource path parameter. - campaign - customer - earning_rule - loyalty_tier - order - order_item - product - promotion_tier - publication - redemption - reward - voucher ## Custom If you have defined a [custom metadata schema](https://support.voucherify.io/article/99-schema-validation-metadata#add-metadata), provide its name in the resource field to retrieve its details. 📘 Management API If you have Management API enabled, you can also use the Get Metadata Schemas endpoint to retrieve a metadata schema using its ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.MetadataSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    MetadataSchemasApi apiInstance = new MetadataSchemasApi(defaultClient);
    String resource = "resource_example"; // String | There is an infinite number of possibilities for retrieving metadata schemas by the resource type because you can define custom metadata schemas.
    try {
      MetadataSchemasGetResponseBody result = apiInstance.getMetadataSchema(resource);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataSchemasApi#getMetadataSchema");
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
| **resource** | **String**| There is an infinite number of possibilities for retrieving metadata schemas by the resource type because you can define custom metadata schemas. |

### Return type

[**MetadataSchemasGetResponseBody**](MetadataSchemasGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The response does not include unknown metadata properties in the response, i.e. those that have been defined outside of the **Project Settings** &gt; **Metadata Schema** definitions. For example, an unknown metadata property can be defined in the campaign manager. |  -  |

<a id="listMetadataSchemas"></a>
# **listMetadataSchemas**
> MetadataSchemasListResponseBody listMetadataSchemas()

List Metadata Schemas

Retrieve metadata schema definitions. 📘 Management API If you have Management API enabled, you can also use the List Metadata Schemas endpoint to list all metadata schemas.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.MetadataSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    MetadataSchemasApi apiInstance = new MetadataSchemasApi(defaultClient);
    try {
      MetadataSchemasListResponseBody result = apiInstance.listMetadataSchemas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataSchemasApi#listMetadataSchemas");
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

[**MetadataSchemasListResponseBody**](MetadataSchemasListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of metadata schema definitions. The response does not include unknown metadata properties in the response, i.e. those that have been defined outside of the **Project Settings** &gt; **Metadata Schema** definitions. For example, an unknown metadata property can be defined in the campaign manager while creating a campaign. |  -  |


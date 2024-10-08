# SegmentsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSegment**](SegmentsApi.md#createSegment) | **POST** /v1/segments | Create Segment |
| [**deleteSegment**](SegmentsApi.md#deleteSegment) | **DELETE** /v1/segments/{segmentId} | Delete Segment |
| [**getSegment**](SegmentsApi.md#getSegment) | **GET** /v1/segments/{segmentId} | Get Segment |


<a id="createSegment"></a>
# **createSegment**
> SegmentsCreateResponseBody createSegment(segmentsCreateRequestBody)

Create Segment

Create a customer segment.  🚧 Limit on Static Segments  There is a cap on the number of customers that you can assign to a static segment: **20,000**. If you would like to create a bigger segment, then you can use the unlimited auto-update segment instead and use some customer metadata to build this segment.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    SegmentsCreateRequestBody segmentsCreateRequestBody = new SegmentsCreateRequestBody(); // SegmentsCreateRequestBody | Specify the boundary conditions for the customer segment.
    try {
      SegmentsCreateResponseBody result = apiInstance.createSegment(segmentsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createSegment");
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
| **segmentsCreateRequestBody** | [**SegmentsCreateRequestBody**](SegmentsCreateRequestBody.md)| Specify the boundary conditions for the customer segment. |

### Return type

[**SegmentsCreateResponseBody**](SegmentsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a customer segment object. |  -  |

<a id="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(segmentId)

Delete Segment

This method deletes a customer segment.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    String segmentId = "segmentId_example"; // String | A unique customer segment ID.
    try {
      apiInstance.deleteSegment(segmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#deleteSegment");
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
| **segmentId** | **String**| A unique customer segment ID. |

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

<a id="getSegment"></a>
# **getSegment**
> SegmentsGetResponseBody getSegment(segmentId)

Get Segment

Retrieves the segment with given segment ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    SegmentsApi apiInstance = new SegmentsApi(defaultClient);
    String segmentId = "segmentId_example"; // String | A unique customer segment ID.
    try {
      SegmentsGetResponseBody result = apiInstance.getSegment(segmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getSegment");
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
| **segmentId** | **String**| A unique customer segment ID. |

### Return type

[**SegmentsGetResponseBody**](SegmentsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns segment object. |  -  |


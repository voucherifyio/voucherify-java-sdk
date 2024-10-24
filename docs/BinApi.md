# BinApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBinEntry**](BinApi.md#deleteBinEntry) | **DELETE** /v1/trash-bin/{binEntryId} | Delete Bin Entry |
| [**listBinEntries**](BinApi.md#listBinEntries) | **GET** /v1/trash-bin | List Bin Entries |


<a id="deleteBinEntry"></a>
# **deleteBinEntry**
> deleteBinEntry(binEntryId)

Delete Bin Entry

Deletes permanently a bin entry with a given ID.The following resources can be moved to the bin and permanently deleted: - campaigns - vouchers - products - SKUs To use this endpoint and delete a given resource type, you must have the following permissions: - vouchers.delete to delete a voucher, - campaigns.delete to delete a campaign, - products.delete to delete a product or SKU.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.BinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    BinApi apiInstance = new BinApi(defaultClient);
    String binEntryId = "binEntryId_example"; // String | Provide the unique identifier of the bin entry.
    try {
      apiInstance.deleteBinEntry(binEntryId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinApi#deleteBinEntry");
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
| **binEntryId** | **String**| Provide the unique identifier of the bin entry. |

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

<a id="listBinEntries"></a>
# **listBinEntries**
> TrashBinListResponseBody listBinEntries(limit, order, startingAfterId, filters)

List Bin Entries

Retrieves a list of resources moved to the bin. The following resources can be moved to the bin: - campaigns - vouchers - products - SKUs To use this endpoint, you must have the following permissions: - vouchers.read - campaigns.read - products.read

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.BinApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    BinApi apiInstance = new BinApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderListBin order = ParameterOrderListBin.fromValue("id"); // ParameterOrderListBin | Orders the bin entries according the date and time when they were moved to the bin or according to the bin entry ID. The dash - preceding a sorting option means sorting in a descending order.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    ParameterFiltersListBin filters = new ParameterFiltersListBin(); // ParameterFiltersListBin | Filters for listing bin entries.
    try {
      TrashBinListResponseBody result = apiInstance.listBinEntries(limit, order, startingAfterId, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinApi#listBinEntries");
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
| **order** | [**ParameterOrderListBin**](.md)| Orders the bin entries according the date and time when they were moved to the bin or according to the bin entry ID. The dash - preceding a sorting option means sorting in a descending order. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |
| **filters** | [**ParameterFiltersListBin**](.md)| Filters for listing bin entries. |

### Return type

[**TrashBinListResponseBody**](TrashBinListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all the bin entries matching the query parameters. |  -  |


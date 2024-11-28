# CampaignsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVoucherWithSpecificCodeToCampaign**](CampaignsApi.md#addVoucherWithSpecificCodeToCampaign) | **POST** /v1/campaigns/{campaignId}/vouchers/{code} | Add Voucher with Specific Code to Campaign |
| [**addVouchersToCampaign**](CampaignsApi.md#addVouchersToCampaign) | **POST** /v1/campaigns/{campaignId}/vouchers | Add Vouchers to Campaign |
| [**createCampaign**](CampaignsApi.md#createCampaign) | **POST** /v1/campaigns | Create Campaign |
| [**deleteCampaign**](CampaignsApi.md#deleteCampaign) | **DELETE** /v1/campaigns/{campaignId} | Delete Campaign |
| [**disableCampaign**](CampaignsApi.md#disableCampaign) | **POST** /v1/campaigns/{campaignId}/disable | Disable Campaign |
| [**enableCampaign**](CampaignsApi.md#enableCampaign) | **POST** /v1/campaigns/{campaignId}/enable | Enable Campaign |
| [**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /v1/campaigns/{campaignId} | Get Campaign |
| [**importVouchersToCampaign**](CampaignsApi.md#importVouchersToCampaign) | **POST** /v1/campaigns/{campaignId}/import | Import Vouchers to Campaign |
| [**importVouchersToCampaignUsingCsv**](CampaignsApi.md#importVouchersToCampaignUsingCsv) | **POST** /v1/campaigns/{campaignId}/importCSV | Import Vouchers to Campaign by CSV |
| [**listCampaigns**](CampaignsApi.md#listCampaigns) | **GET** /v1/campaigns | List Campaigns |
| [**updateCampaign**](CampaignsApi.md#updateCampaign) | **PUT** /v1/campaigns/{campaignId} | Update Campaign |


<a id="addVoucherWithSpecificCodeToCampaign"></a>
# **addVoucherWithSpecificCodeToCampaign**
> CampaignsVouchersCreateResponseBody addVoucherWithSpecificCodeToCampaign(campaignId, code, campaignsVouchersCreateRequestBody)

Add Voucher with Specific Code to Campaign

This method gives a possibility to add a new voucher to an existing campaign. The voucher definition will be inherited from the definition kept in the campaign profile. However, you are able to overwrite a few properties inherited from the campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the campaign to which voucher will be added. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    String code = "code_example"; // String | A custom **code** that identifies the voucher.
    CampaignsVouchersCreateRequestBody campaignsVouchersCreateRequestBody = new CampaignsVouchersCreateRequestBody(); // CampaignsVouchersCreateRequestBody | Specify the voucher parameters that you would like to overwrite.
    try {
      CampaignsVouchersCreateResponseBody result = apiInstance.addVoucherWithSpecificCodeToCampaign(campaignId, code, campaignsVouchersCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#addVoucherWithSpecificCodeToCampaign");
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
| **campaignId** | **String**| The campaign ID or name of the campaign to which voucher will be added. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **code** | **String**| A custom **code** that identifies the voucher. |
| **campaignsVouchersCreateRequestBody** | [**CampaignsVouchersCreateRequestBody**](CampaignsVouchersCreateRequestBody.md)| Specify the voucher parameters that you would like to overwrite. |

### Return type

[**CampaignsVouchersCreateResponseBody**](CampaignsVouchersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object if the call succeeded. |  -  |

<a id="addVouchersToCampaign"></a>
# **addVouchersToCampaign**
> CampaignsVouchersCreateCombinedResponseBody addVouchersToCampaign(campaignId, vouchersCount, campaignsVouchersCreateInBulkRequestBody)

Add Vouchers to Campaign

This method gives the possibility to push new vouchers to an existing campaign. New vouchers will inherit properties from the campaign profile. However, it is possible to overwrite some of them in the request body. If you provide an optional code_config parameter with a voucher code configuration, then it will be used to generate new voucher codes. Otherwise, the voucher code configuration from the campaign will be used. This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the campaign to which voucher(s) will be added. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    Integer vouchersCount = 56; // Integer | Number of vouchers that should be added.
    CampaignsVouchersCreateInBulkRequestBody campaignsVouchersCreateInBulkRequestBody = new CampaignsVouchersCreateInBulkRequestBody(); // CampaignsVouchersCreateInBulkRequestBody | Specify the voucher parameters that you would like to overwrite.
    try {
      CampaignsVouchersCreateCombinedResponseBody result = apiInstance.addVouchersToCampaign(campaignId, vouchersCount, campaignsVouchersCreateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#addVouchersToCampaign");
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
| **campaignId** | **String**| The campaign ID or name of the campaign to which voucher(s) will be added. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **vouchersCount** | **Integer**| Number of vouchers that should be added. |
| **campaignsVouchersCreateInBulkRequestBody** | [**CampaignsVouchersCreateInBulkRequestBody**](CampaignsVouchersCreateInBulkRequestBody.md)| Specify the voucher parameters that you would like to overwrite. |

### Return type

[**CampaignsVouchersCreateCombinedResponseBody**](CampaignsVouchersCreateCombinedResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object if the call succeeded for a voucher count of 1. and Returns an &#x60;async_action_id&#x60; if the request was made to create more than 1 voucher. |  -  |

<a id="createCampaign"></a>
# **createCampaign**
> CampaignsCreateResponseBody createCampaign(campaignsCreateRequestBody)

Create Campaign

Method to create a batch of vouchers aggregated in one campaign. You can choose a variety of voucher types and define a unique pattern for generating codes.    📘 Global uniqueness  All campaign codes are unique across the whole project. Voucherify will not allow you to generate 2 campaigns with the same coupon code.    🚧 Code generation status  This is an asynchronous action; you cant read or modify a newly created campaign until the code generation is completed. See the creation_status field in the campaign object description. 🚧 Standalone Vouchers and Campaigns In version [v20241004](https://support.voucherify.io/article/23-whats-new-in-voucherify#v20241004), standalone vouchers created through the Voucherify dashboard create a campaign for that voucher. However, you cannot create a standalone discount or gift voucher campaign with the type: STANDALONE through the API. Voucherify developers work on adding that feature. Follow the [Voucherify Release Notes](https://support.voucherify.io/article/23-whats-new-in-voucherify#v20241004) for more details about released features.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    CampaignsCreateRequestBody campaignsCreateRequestBody = new CampaignsCreateRequestBody(); // CampaignsCreateRequestBody | Specify the details of the campaign that you would like to create.
    try {
      CampaignsCreateResponseBody result = apiInstance.createCampaign(campaignsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#createCampaign");
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
| **campaignsCreateRequestBody** | [**CampaignsCreateRequestBody**](CampaignsCreateRequestBody.md)| Specify the details of the campaign that you would like to create. |

### Return type

[**CampaignsCreateResponseBody**](CampaignsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object if the call succeeded. |  -  |

<a id="deleteCampaign"></a>
# **deleteCampaign**
> CampaignsDeleteResponseBody deleteCampaign(campaignId, force)

Delete Campaign

Deletes a campaign and all related vouchers. This action cannot be undone. Also, this method immediately removes any redemptions on the voucher. If the force parameter is set to false or not set at all, the campaign and all related vouchers will be moved to the bin. This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    Boolean force = true; // Boolean | If this flag is set to true, the campaign and related vouchers will be removed permanently. If it is set to false or not set at all, the campaign and related vouchers will be moved to the bin. Going forward, the user will be able to create the next campaign with exactly the same name.
    try {
      CampaignsDeleteResponseBody result = apiInstance.deleteCampaign(campaignId, force);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#deleteCampaign");
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
| **campaignId** | **String**| You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **force** | **Boolean**| If this flag is set to true, the campaign and related vouchers will be removed permanently. If it is set to false or not set at all, the campaign and related vouchers will be moved to the bin. Going forward, the user will be able to create the next campaign with exactly the same name. |

### Return type

[**CampaignsDeleteResponseBody**](CampaignsDeleteResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the ID of the scheduled asynchronous action, informing you that your request has been accepted and the campaign will be deleted from the repository asynchronously. To check the deletion status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="disableCampaign"></a>
# **disableCampaign**
> Object disableCampaign(campaignId)

Disable Campaign

There are various times when youll want to manage a campaigns accessibility. This can be done by two API methods for managing the campaign state - *enable* and *disable*.   Sets campaign state to **inactive**. The vouchers in this campaign can no longer be redeemed.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the campaign being disabled. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    try {
      Object result = apiInstance.disableCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#disableCampaign");
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
| **campaignId** | **String**| The campaign ID or name of the campaign being disabled. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |

### Return type

**Object**

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an empty json &#x60;{}&#x60;. |  -  |

<a id="enableCampaign"></a>
# **enableCampaign**
> Object enableCampaign(campaignId)

Enable Campaign

There are various times when youll want to manage a campaigns accessibility. This can be done by two API methods for managing the campaign state - *enable* and *disable*.   Sets campaign state to **active**. The vouchers in this campaign can be redeemed - only if the redemption occurs after the start date of the campaign and voucher and the voucher and campaign are not expired.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the campaign being enabled. You can either pass the campaign ID, which was assigned by Voucherify or the name of the campaign as the path parameter value.
    try {
      Object result = apiInstance.enableCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#enableCampaign");
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
| **campaignId** | **String**| The campaign ID or name of the campaign being enabled. You can either pass the campaign ID, which was assigned by Voucherify or the name of the campaign as the path parameter value. |

### Return type

**Object**

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an empty json &#x60;{}&#x60;. |  -  |

<a id="getCampaign"></a>
# **getCampaign**
> CampaignsGetResponseBody getCampaign(campaignId)

Get Campaign

Retrieves the campaign with the given campaign ID or campaign name.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    try {
      CampaignsGetResponseBody result = apiInstance.getCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getCampaign");
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
| **campaignId** | **String**| You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |

### Return type

[**CampaignsGetResponseBody**](CampaignsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object if a valid identifier was provided. |  -  |

<a id="importVouchersToCampaign"></a>
# **importVouchersToCampaign**
> CampaignsImportCreateResponseBody importVouchersToCampaign(campaignId, campaignsImportVoucherItem)

Import Vouchers to Campaign

Imports vouchers to an **existing** campaign. This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The ID of an existing campaign to which youre importing the codes. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    List<CampaignsImportVoucherItem> campaignsImportVoucherItem = Arrays.asList(); // List<CampaignsImportVoucherItem> | Discount type, expiration date and the remaining attributes will be taken from the Campaign settings.
    try {
      CampaignsImportCreateResponseBody result = apiInstance.importVouchersToCampaign(campaignId, campaignsImportVoucherItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#importVouchersToCampaign");
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
| **campaignId** | **String**| The ID of an existing campaign to which youre importing the codes. You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **campaignsImportVoucherItem** | [**List&lt;CampaignsImportVoucherItem&gt;**](CampaignsImportVoucherItem.md)| Discount type, expiration date and the remaining attributes will be taken from the Campaign settings. |

### Return type

[**CampaignsImportCreateResponseBody**](CampaignsImportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns the ID of the scheduled asynchronous action, informing you that your request has been accepted and the vouchers will be imported to the repository asynchronously. To check the status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="importVouchersToCampaignUsingCsv"></a>
# **importVouchersToCampaignUsingCsv**
> CampaignsImportCsvCreateResponseBody importVouchersToCampaignUsingCsv(campaignId, _file)

Import Vouchers to Campaign by CSV

Imports vouchers to an **existing** campaign.   The CSV file has to include headers in the first line.  This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The campaign ID or name of the campaign being enabled. You can either pass the campaign ID, which was assigned by Voucherify or the name of the campaign as the path parameter value.
    File _file = new File("/path/to/file"); // File | File path.
    try {
      CampaignsImportCsvCreateResponseBody result = apiInstance.importVouchersToCampaignUsingCsv(campaignId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#importVouchersToCampaignUsingCsv");
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
| **campaignId** | **String**| The campaign ID or name of the campaign being enabled. You can either pass the campaign ID, which was assigned by Voucherify or the name of the campaign as the path parameter value. |
| **_file** | **File**| File path. |

### Return type

[**CampaignsImportCsvCreateResponseBody**](CampaignsImportCsvCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the ID of the scheduled asynchronous action, informing you that your request has been accepted and the vouchers will be imported to the repository asynchronously. To check the status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="listCampaigns"></a>
# **listCampaigns**
> CampaignsListResponseBody listCampaigns(limit, page, campaignType, expand, order, filters)

List Campaigns

Retrieve a list of campaigns in a project.  The campaigns are returned sorted by creation date, with the most recent campaigns appearing first.   When you get a list of campaigns, you can optionally specify query parameters to customize the amount of campaigns returned per call using limit, which page of campaigns to return using page, sort the campaigns using the order query parameter and filter the results by the campaign_type. This method will return an error when trying to return a limit of more than 100 campaigns.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterCampaignType campaignType = ParameterCampaignType.fromValue("PROMOTION"); // ParameterCampaignType | This attribute allows filtering by campaign type.
    ParameterExpandListCampaigns expand = ParameterExpandListCampaigns.fromValue("category"); // ParameterExpandListCampaigns | Includes an expanded categories object in the response. If the [Areas and Stores](https://support.voucherify.io/article/623-areas-and-stores) Enterprise feature is enabled, add access_settings_assignments to return assigned areas and stores.
    ParameterOrderListCampaigns order = ParameterOrderListCampaigns.fromValue("created_at"); // ParameterOrderListCampaigns | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    ParameterFiltersListCampaigns filters = new ParameterFiltersListCampaigns(); // ParameterFiltersListCampaigns | Filters the results by campaign status or whether the campaign is a referral campaign.
    try {
      CampaignsListResponseBody result = apiInstance.listCampaigns(limit, page, campaignType, expand, order, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#listCampaigns");
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
| **campaignType** | [**ParameterCampaignType**](.md)| This attribute allows filtering by campaign type. |
| **expand** | [**ParameterExpandListCampaigns**](.md)| Includes an expanded categories object in the response. If the [Areas and Stores](https://support.voucherify.io/article/623-areas-and-stores) Enterprise feature is enabled, add access_settings_assignments to return assigned areas and stores. |
| **order** | [**ParameterOrderListCampaigns**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **filters** | [**ParameterFiltersListCampaigns**](.md)| Filters the results by campaign status or whether the campaign is a referral campaign. |

### Return type

[**CampaignsListResponseBody**](CampaignsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a &#x60;campaign&#x60; property that contains an array of campaigns. The maximum number of campaigns returned is determined by the &#x60;limit&#x60; query parameter. Each entry in the array is a separate campaign object. If no more campaigns are available, the resulting array on a given page will be empty. |  -  |

<a id="updateCampaign"></a>
# **updateCampaign**
> CampaignsUpdateResponseBody updateCampaign(campaignId, campaignsUpdateRequestBody)

Update Campaign

Updates the specified campaign by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged.  Fields other than the ones listed in the request body wont be modified. Even if provided, they will be silently skipped.     ## Vouchers will be affected  This method will update vouchers aggregated in the campaign. It will affect all vouchers that are not published or redeemed yet.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value.
    CampaignsUpdateRequestBody campaignsUpdateRequestBody = new CampaignsUpdateRequestBody(); // CampaignsUpdateRequestBody | Specify the campaign parameters to be updated.
    try {
      CampaignsUpdateResponseBody result = apiInstance.updateCampaign(campaignId, campaignsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateCampaign");
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
| **campaignId** | **String**| You can either pass the campaign ID, which was assigned by Voucherify, or the name of the campaign as the path parameter value. |
| **campaignsUpdateRequestBody** | [**CampaignsUpdateRequestBody**](CampaignsUpdateRequestBody.md)| Specify the campaign parameters to be updated. |

### Return type

[**CampaignsUpdateResponseBody**](CampaignsUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the campaign object if the update succeeded. |  -  |


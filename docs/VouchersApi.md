# VouchersApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVoucher**](VouchersApi.md#createVoucher) | **POST** /v1/vouchers/{code} | Create Voucher |
| [**deleteVoucher**](VouchersApi.md#deleteVoucher) | **DELETE** /v1/vouchers/{code} | Delete Voucher |
| [**disableVoucher**](VouchersApi.md#disableVoucher) | **POST** /v1/vouchers/{code}/disable | Disable Voucher |
| [**enableVoucher**](VouchersApi.md#enableVoucher) | **POST** /v1/vouchers/{code}/enable | Enable Voucher |
| [**exportVoucherTransactions**](VouchersApi.md#exportVoucherTransactions) | **POST** /v1/vouchers/{code}/transactions/export | Export Voucher Transactions |
| [**generateRandomCode**](VouchersApi.md#generateRandomCode) | **POST** /v1/vouchers | Generate Random Code |
| [**getVoucher**](VouchersApi.md#getVoucher) | **GET** /v1/vouchers/{code} | Get Voucher |
| [**importVouchersUsingCsv**](VouchersApi.md#importVouchersUsingCsv) | **POST** /v1/vouchers/importCSV | Import Vouchers using CSV |
| [**listVoucherTransactions**](VouchersApi.md#listVoucherTransactions) | **GET** /v1/vouchers/{code}/transactions | List Voucher Transactions |
| [**listVouchers**](VouchersApi.md#listVouchers) | **GET** /v1/vouchers | List Vouchers |
| [**releaseValidationSession**](VouchersApi.md#releaseValidationSession) | **DELETE** /v1/vouchers/{code}/sessions/{sessionKey} | Release Validation Session |
| [**updateVoucher**](VouchersApi.md#updateVoucher) | **PUT** /v1/vouchers/{code} | Update Voucher |
| [**updateVoucherBalance**](VouchersApi.md#updateVoucherBalance) | **POST** /v1/vouchers/{code}/balance | Add or Remove Voucher Balance |


<a id="createVoucher"></a>
# **createVoucher**
> VouchersCreateResponseBody createVoucher(code, vouchersCreateWithWithSpecificCodeRequestBody)

Create Voucher

Create a standalone voucher. You can choose to create a GIFT_VOUCHER, a DISCOUNT_VOUCHER, or a LOYALTY_CARD. The code path parameter can use all letters of the English alphabet, Arabic numerals and special characters.   When you create a new voucher, you can specify a type to create it. Creating a new voucher will create a new stand alone voucher if no campaign name or campaign_id is provided. In case of the loyalty card, a campaign name is required.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A unique **code** that identifies the voucher.
    VouchersCreateWithWithSpecificCodeRequestBody vouchersCreateWithWithSpecificCodeRequestBody = new VouchersCreateWithWithSpecificCodeRequestBody(); // VouchersCreateWithWithSpecificCodeRequestBody | Specify the details of the voucher that you would like to create.
    try {
      VouchersCreateResponseBody result = apiInstance.createVoucher(code, vouchersCreateWithWithSpecificCodeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#createVoucher");
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
| **code** | **String**| A unique **code** that identifies the voucher. |
| **vouchersCreateWithWithSpecificCodeRequestBody** | [**VouchersCreateWithWithSpecificCodeRequestBody**](VouchersCreateWithWithSpecificCodeRequestBody.md)| Specify the details of the voucher that you would like to create. |

### Return type

[**VouchersCreateResponseBody**](VouchersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object if the call succeeded. |  -  |

<a id="deleteVoucher"></a>
# **deleteVoucher**
> deleteVoucher(code, force)

Delete Voucher

Deletes a voucher. This operation cannot be undone. Additionally, this operation removes any redemptions on the voucher. If the force parameter is set to false or not set at all, the voucher will be moved to the bin.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A unique **code** that identifies the voucher.
    Boolean force = true; // Boolean | If this flag is set to true, the voucher will be removed permanently. If it is set to false or not set at all, the voucher will be moved to the bin. Going forward, the user will be able to create another voucher with exactly the same code.
    try {
      apiInstance.deleteVoucher(code, force);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#deleteVoucher");
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
| **code** | **String**| A unique **code** that identifies the voucher. |
| **force** | **Boolean**| If this flag is set to true, the voucher will be removed permanently. If it is set to false or not set at all, the voucher will be moved to the bin. Going forward, the user will be able to create another voucher with exactly the same code. |

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

<a id="disableVoucher"></a>
# **disableVoucher**
> VouchersDisableResponseBody disableVoucher(code)

Disable Voucher

There are various times when youll want to manage a vouchers accessibility. This can be done by two API methods for managing the voucher state - *enable* and *disable*.   ___ This method sets the voucher state to **inactive**. The voucher cannot be redeemed.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u.
    try {
      VouchersDisableResponseBody result = apiInstance.disableVoucher(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#disableVoucher");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u. |

### Return type

[**VouchersDisableResponseBody**](VouchersDisableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object. |  -  |

<a id="enableVoucher"></a>
# **enableVoucher**
> VouchersEnableResponseBody enableVoucher(code)

Enable Voucher

There are various times when youll want to manage a vouchers accessibility. This can be done by two API methods for managing the voucher state - *enable* and *disable*.   ___ The method sets the voucher state to **active**. The voucher can be redeemed - only if the redemption occurs after the start date and the voucher is not expired.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u.
    try {
      VouchersEnableResponseBody result = apiInstance.enableVoucher(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#enableVoucher");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u. |

### Return type

[**VouchersEnableResponseBody**](VouchersEnableResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object. |  -  |

<a id="exportVoucherTransactions"></a>
# **exportVoucherTransactions**
> VouchersTransactionsExportCreateResponseBody exportVoucherTransactions(code, vouchersTransactionsExportCreateRequestBody)

Export Voucher Transactions

Export transactions that are associated with credit movements on a gift card or loyalty card.   

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "GIFT-CARD-1"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u.
    VouchersTransactionsExportCreateRequestBody vouchersTransactionsExportCreateRequestBody = new VouchersTransactionsExportCreateRequestBody(); // VouchersTransactionsExportCreateRequestBody | Specify the parameters for the transaction export.
    try {
      VouchersTransactionsExportCreateResponseBody result = apiInstance.exportVoucherTransactions(code, vouchersTransactionsExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#exportVoucherTransactions");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u. |
| **vouchersTransactionsExportCreateRequestBody** | [**VouchersTransactionsExportCreateRequestBody**](VouchersTransactionsExportCreateRequestBody.md)| Specify the parameters for the transaction export. |

### Return type

[**VouchersTransactionsExportCreateResponseBody**](VouchersTransactionsExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an export object. |  -  |

<a id="generateRandomCode"></a>
# **generateRandomCode**
> VouchersCreateResponseBody generateRandomCode(body)

Generate Random Code

Create a standalone voucher. You can choose to create a GIFT_VOUCHER, a DISCOUNT_VOUCHER, or a LOYALTY_CARD.  When you create a new voucher, you can specify a type to create it. Creating a new voucher will create a new stand alone voucher if no campaign name or campaign_id is provided. In case of the loyalty card, a campaign name is required. You can optionally use the code parameter to define a specific code or the code_config parameter to design rules for Voucherify API to create a random code. If neither of the two parameters are passed, then a random code is generated by the Voucherify API. This method will return an error when trying to create a voucher that already exists.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Object body = {"category":"New Customers","code":"NEW-WELCOME-COUPON","type":"DISCOUNT_VOUCHER","campaign_id":"camp_Y6dLsYIZloGqP8izufXY6SSJ","discount":{"percent_off":10,"type":"PERCENT","effect":"APPLY_TO_ORDER"},"start_date":"2016-01-01T00:00:00Z","expiration_date":"2022-12-31T23:59:59Z","validity_timeframe":{"duration":"PT1H","interval":"P2D"},"validity_day_of_week":[1,2,3,4,5],"active":false,"additional_info":"This voucher will remain inactive until enabled.","redemption":{"quantity":10},"metadata":{"test":true,"locale":"de-en"},"validation_rules":["val_4j7DCRm2IS59"]}; // Object | Specify the details of the voucher that you would like to create.
    try {
      VouchersCreateResponseBody result = apiInstance.generateRandomCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#generateRandomCode");
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
| **body** | **Object**| Specify the details of the voucher that you would like to create. |

### Return type

[**VouchersCreateResponseBody**](VouchersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object if the call succeeded. |  -  |

<a id="getVoucher"></a>
# **getVoucher**
> VouchersGetResponseBody getVoucher(code)

Get Voucher

Retrieves the voucher with the given code or unique Voucherify ID. You can either pass the voucher ID which was assigned by Voucherify, e.g., v_7HxHkf4VAkMuc8u4lZs78lyRwhRze5UE, or the code of the voucher as the path parameter value, e.g., 7fjWdr.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A unique **code** that identifies the voucher.
    try {
      VouchersGetResponseBody result = apiInstance.getVoucher(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#getVoucher");
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
| **code** | **String**| A unique **code** that identifies the voucher. |

### Return type

[**VouchersGetResponseBody**](VouchersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a voucher object if a valid identifier was provided.   Additionally, the response returns validation rules related to the voucher object. They can be inherited from a campaign. |  -  |

<a id="importVouchersUsingCsv"></a>
# **importVouchersUsingCsv**
> VouchersImportCsvCreateResponseBody importVouchersUsingCsv(_file)

Import Vouchers using CSV

Import standalone vouchers into the repository using a CSV file. The CSV file has to include headers in the first line. All properties listed in the file headers that cannot be mapped to standard voucher fields will be added to the metadata object.   You can find an example CSV file [here](https://support.voucherify.io/article/45-import-codes-and-share-them-digitally#coupons). ___  📘 Standard voucher fields mapping  - Go to the import vouchers endpoint to see all standard CSV fields description (body params section).  - Supported CSV file headers: Code,Voucher Type,Value,Discount Type,Category,Start Date,Expiration Date,Redemption Limit,Redeemed Quantity, Redeemed Amount,Active,Additional Info,Custom Metadata Property Name - **Start and expiration dates** need to be provided in compliance with the ISO 8601 norms. For example, 2020-03-11T09:00:00.000Z.       - YYYY-MM-DD     - YYYY-MM-DDTHH     - YYYY-MM-DDTHH:mm     - YYYY-MM-DDTHH:mm:ss     - YYYY-MM-DDTHH:mm:ssZ     - YYYY-MM-DDTHH:mm:ssZ     - YYYY-MM-DDTHH:mm:ss.SSSZ  - Custom code attributes (not supported by-default) need to be added as code **metadata**.  - You **cannot import the same codes** to a single Voucherify Project.  📘 Categories  In the structure representing your data, you can define a category that the voucher belongs to. You can later use the category of a voucher to group and search by specific criteria in the Dashboard and using the List Vouchers endpoint. This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File path.
    try {
      VouchersImportCsvCreateResponseBody result = apiInstance.importVouchersUsingCsv(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#importVouchersUsingCsv");
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

[**VouchersImportCsvCreateResponseBody**](VouchersImportCsvCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and vouchers will be added to the repository asynchronously. To check the import status and result, copy the &#x60;async_action_id&#x60; from the **response** and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="listVoucherTransactions"></a>
# **listVoucherTransactions**
> VouchersTransactionsListResponseBody listVoucherTransactions(code, limit, page)

List Voucher Transactions

List transactions that are associated with credit movements on a gift card or loyalty card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      VouchersTransactionsListResponseBody result = apiInstance.listVoucherTransactions(code, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#listVoucherTransactions");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**VouchersTransactionsListResponseBody**](VouchersTransactionsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of transaction objects |  -  |

<a id="listVouchers"></a>
# **listVouchers**
> VouchersListResponseBody listVouchers(limit, page, category, campaignId, customer, campaign, createdAt, updatedAt, order)

List Vouchers

Returns a list of vouchers. By default, the vouchers are returned sorted by creation date, with the most recent vouchers appearing first. A maximum of 100 vouchers are returned in the response. When you get a list of vouchers, you can optionally specify query parameters to customize the number of vouchers returned per call using limit, which page of vouchers to return using page, sort the vouchers using the order query parameter and more. This method will return an error when trying to return a limit of more than 100 vouchers. 

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String category = "category_example"; // String | Limit search results to vouchers within the specified category.
    String campaignId = "campaignId_example"; // String | Limit search results to vouchers within the specified campaign
    String customer = "customer_example"; // String | A tracking identifier of a customer who is the holder of the vouchers. It can be an id generated by Voucherify or the source_id. Remember to use the proper URL escape codes if the source_id contains special characters.
    String campaign = "campaign_example"; // String | A unique campaign name, identifies the parent campaign.
    ParameterCreatedBeforeAfter createdAt = new ParameterCreatedBeforeAfter(); // ParameterCreatedBeforeAfter | A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z
    ParameterUpdatedBeforeAfter updatedAt = new ParameterUpdatedBeforeAfter(); // ParameterUpdatedBeforeAfter | A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z
    ParameterOrderVouchers order = ParameterOrderVouchers.fromValue("created_at"); // ParameterOrderVouchers | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      VouchersListResponseBody result = apiInstance.listVouchers(limit, page, category, campaignId, customer, campaign, createdAt, updatedAt, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#listVouchers");
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
| **category** | **String**| Limit search results to vouchers within the specified category. |
| **campaignId** | **String**| Limit search results to vouchers within the specified campaign |
| **customer** | **String**| A tracking identifier of a customer who is the holder of the vouchers. It can be an id generated by Voucherify or the source_id. Remember to use the proper URL escape codes if the source_id contains special characters. |
| **campaign** | **String**| A unique campaign name, identifies the parent campaign. |
| **createdAt** | [**ParameterCreatedBeforeAfter**](.md)| A filter on the list based on the object created_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [created_at][before] 2017-09-08T13:52:18.227Z |
| **updatedAt** | [**ParameterUpdatedBeforeAfter**](.md)| A filter on the list based on the object updated_at field. The value is a dictionary with the following options: before, after. A date value must be presented in ISO 8601 format (2016-11-16T14:14:31Z or 2016-11-16). An example: [updated_at][before] 2017-09-08T13:52:18.227Z |
| **order** | [**ParameterOrderVouchers**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**VouchersListResponseBody**](VouchersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary that contains an array of vouchers. Each entry in the array is a separate voucher object. If no more vouchers are available (query parameter &#x60;page&#x60; incremented over and above the voucher count), the resulting array will be empty. The result can be narrowed down according to specified (or default) filters. |  -  |

<a id="releaseValidationSession"></a>
# **releaseValidationSession**
> releaseValidationSession(code, sessionKey)

Release Validation Session

Manually release a validation session that has been set up for the voucher. This method undos the actions that are explained in our guide on how a validation session was established, you can read more here.   📘 Release Session using Dashboard  You can also use the Validations Manager in the Dashboard to unlock sessions. [Read more](https://support.voucherify.io/article/16-dashboard-sections#validations).

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify.
    String sessionKey = "ssn_yQGMTeKBSw8OOuFPwlBEjzGy8d8VA9Ts"; // String | A unique session identifier.
    try {
      apiInstance.releaseValidationSession(code, sessionKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#releaseValidationSession");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify. |
| **sessionKey** | **String**| A unique session identifier. |

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
| **204** | Returns no content if the validation session was released successfully. |  -  |

<a id="updateVoucher"></a>
# **updateVoucher**
> VouchersUpdateResponseBody updateVoucher(code, vouchersUpdateRequestBody)

Update Voucher

Updates the specified voucher by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged. Fields other than the ones listed in the request body wont be modified. Even if provided, they will be silently skipped.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A unique **code** that identifies the voucher.
    VouchersUpdateRequestBody vouchersUpdateRequestBody = new VouchersUpdateRequestBody(); // VouchersUpdateRequestBody | Specify the parameters to be updated.
    try {
      VouchersUpdateResponseBody result = apiInstance.updateVoucher(code, vouchersUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#updateVoucher");
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
| **code** | **String**| A unique **code** that identifies the voucher. |
| **vouchersUpdateRequestBody** | [**VouchersUpdateRequestBody**](VouchersUpdateRequestBody.md)| Specify the parameters to be updated. |

### Return type

[**VouchersUpdateResponseBody**](VouchersUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the voucher object if the update succeeded. |  -  |

<a id="updateVoucherBalance"></a>
# **updateVoucherBalance**
> VouchersBalanceUpdateResponseBody updateVoucherBalance(code, vouchersBalanceUpdateRequestBody)

Add or Remove Voucher Balance

Add balance to an existing gift card or loyalty card.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.VouchersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u.
    VouchersBalanceUpdateRequestBody vouchersBalanceUpdateRequestBody = new VouchersBalanceUpdateRequestBody(); // VouchersBalanceUpdateRequestBody | Provide the amount to be added to/subtracted from the voucher.
    try {
      VouchersBalanceUpdateResponseBody result = apiInstance.updateVoucherBalance(code, vouchersBalanceUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VouchersApi#updateVoucherBalance");
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u. |
| **vouchersBalanceUpdateRequestBody** | [**VouchersBalanceUpdateRequestBody**](VouchersBalanceUpdateRequestBody.md)| Provide the amount to be added to/subtracted from the voucher. |

### Return type

[**VouchersBalanceUpdateResponseBody**](VouchersBalanceUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a balance object if the operation succeeded. |  -  |


# VouchersApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteVoucher**](VouchersApi.md#deleteVoucher) | **DELETE** /v1/vouchers/{code} | Delete Voucher |
| [**disableVoucher**](VouchersApi.md#disableVoucher) | **POST** /v1/vouchers/{code}/disable | Disable Voucher |
| [**enableVoucher**](VouchersApi.md#enableVoucher) | **POST** /v1/vouchers/{code}/enable | Enable Voucher |
| [**exportVoucherTransactions**](VouchersApi.md#exportVoucherTransactions) | **POST** /v1/vouchers/{code}/transactions/export | Export Voucher Transactions |
| [**getVoucher**](VouchersApi.md#getVoucher) | **GET** /v1/vouchers/{code} | Get Voucher |
| [**importVouchersUsingCsv**](VouchersApi.md#importVouchersUsingCsv) | **POST** /v1/vouchers/importCSV | Import Vouchers using CSV |
| [**listVoucherTransactions**](VouchersApi.md#listVoucherTransactions) | **GET** /v1/vouchers/{code}/transactions | List Voucher Transactions |
| [**releaseValidationSession**](VouchersApi.md#releaseValidationSession) | **DELETE** /v1/vouchers/{code}/sessions/{sessionKey} | Release Validation Session |
| [**updateVoucherBalance**](VouchersApi.md#updateVoucherBalance) | **POST** /v1/vouchers/{code}/balance | Add or Remove Voucher Balance |


<a id="deleteVoucher"></a>
# **deleteVoucher**
> deleteVoucher(code, force)

Delete Voucher

Deletes a voucher. This operation cannot be undone. Additionally, this operation removes any redemptions on the voucher.  If the &#x60;force&#x60; parameter is set to &#x60;false&#x60; or not set at all, the voucher will be moved to [the bin](ref:list-bin-entries).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A unique **code** that identifies the voucher.
    Boolean force = true; // Boolean | If this flag is set to `true`, the voucher will be removed permanently. If it is set to `false` or not set at all, the voucher will be moved to the bin. Going forward, the user will be able to create another voucher with exactly the same code.
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
| **force** | **Boolean**| If this flag is set to &#x60;true&#x60;, the voucher will be removed permanently. If it is set to &#x60;false&#x60; or not set at all, the voucher will be moved to the bin. Going forward, the user will be able to create another voucher with exactly the same code. |

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

There are various times when you&#39;ll want to manage a voucher&#39;s accessibility. This can be done by two API methods for managing the voucher state - *enable* and *disable*.   ___ This method sets the voucher state to **inactive**. The voucher cannot be redeemed.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. `v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u`.
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. &#x60;v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u&#x60;. |

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

There are various times when you&#39;ll want to manage a voucher&#39;s accessibility. This can be done by two API methods for managing the voucher state - *enable* and *disable*.   ___ The method sets the voucher state to **active**. The voucher can be redeemed - only if the redemption occurs after the start date and the voucher is not expired.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. `v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u`.
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. &#x60;v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u&#x60;. |

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

Export transactions that are associated with credit movements on a gift card or loyalty card.  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique transaction ID. | vtx_0cb7811f1c07765800 | | type | Transaction type. | - &#x60;CREDITS_REMOVAL&#x60; &lt;br&gt; - &#x60;CREDITS_ADDITION&#x60; &lt;br&gt; - &#x60;CREDITS_REFUND&#x60; &lt;br&gt; - &#x60;CREDITS_REDEMPTION&#x60; &lt;br&gt; - &#x60;POINTS_ACCRUAL&#x60; &lt;br&gt; - &#x60;POINTS_CANCELLATION&#x60; &lt;br&gt; - &#x60;POINTS_REDEMPTION&#x60;&lt;br&gt; - &#x60;POINTS_REFUND&#x60;&lt;br&gt; - &#x60;POINTS_ADDITION&#x60;&lt;br&gt; - &#x60;POINTS_REMOVAL&#x60;&lt;br&gt; - &#x60;POINTS_EXPIRATION&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_IN&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_OUT&#x60; | | source_id | Unique transaction source ID. | 8638 | | reason | Contains the reason for the transaction if one was included originally. |  | | balance | The gift card or loyalty card balance after the transaction. |  | | amount | The amount of gift card or loyalty card credits being allocated during the transaction. This value can either be negative or positive depending on the nature of the transaction. |  | | created_at | Timestamp in ISO 8601 format representing the date and time when the transaction was created. | 2022-03-09T09:16:32.521Z  | | voucher_id | Unique Voucher ID. | v_dky7ksKfPX50Wb2Bxvcoeb1xT20b6tcp | | campaign_id | Parent campaign ID. | camp_FNYR4jhqZBM9xTptxDGgeNBV | | source|  Channel through which the transaction was initiated. | API | | details | More detailed information stored in the form of a JSON. | Provides more details related to the transaction in the form of an object. | | related_transaction_id | Unique transaction ID related to a receiver/donor card in the case of a points transfer from/to another card. | vtx_0c9afe802593b34b80 |

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "GIFT-CARD-1"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. `v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u`.
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. &#x60;v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u&#x60;. |
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

<a id="getVoucher"></a>
# **getVoucher**
> VouchersGetResponseBody getVoucher(code)

Get Voucher

Retrieves the voucher with the given &#x60;code&#x60; or unique Voucherify ID. You can either pass the voucher ID which was assigned by Voucherify, e.g., &#x60;v_7HxHkf4VAkMuc8u4lZs78lyRwhRze5UE&#x60;, or the &#x60;code&#x60; of the voucher as the path parameter value, e.g., &#x60;7fjWdr&#x60;.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

Import standalone vouchers into the repository using a CSV file.  The CSV file has to include headers in the first line. All properties listed in the file headers that cannot be mapped to standard voucher fields will be added to the metadata object.    You can find an example CSV file [here](https://support.voucherify.io/article/45-import-codes-and-share-them-digitally#coupons). ___ &lt;!-- title: \&quot;cURL Example Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;cURL cURL example curl -X POST \\   https://api.voucherify.io/v1/vouchers/importCSV \\   -F file&#x3D;@/path/to/vouchers.csv \\   -H \&quot;X-App-Id: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\&quot; \\   -H \&quot;X-App-Token: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\&quot; &#x60;&#x60;&#x60;  &lt;!-- theme: info --&gt;  &gt; 📘 Standard voucher fields mapping &gt; &gt; - Go to the &lt;!-- [import vouchers](OpenAPI.json/paths/~1vouchers~1import) --&gt;[import vouchers](ref:import-vouchers) endpoint to see all standard CSV fields description (body params section). &gt; - Supported CSV file headers: Code,Voucher Type,Value,Discount Type,Category,Start Date,Expiration Date,Redemption Limit,Redeemed Quantity, Redeemed Amount,Active,Additional Info,Custom Metadata Property Name &gt;- **Start and expiration dates** need to be provided in compliance with the ISO 8601 norms. For example, 2020-03-11T09:00:00.000Z.   &gt;    - &#x60;YYYY-MM-DD&#x60; &gt;    - &#x60;YYYY-MM-DDTHH&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ss&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ssZ&#x60; &gt;    - &#x60;YYYY-MM-DDTHH:mm:ss.SSSZ&#x60; &gt; - Custom code attributes (not supported by-default) need to be added as code **metadata**. &gt; - You **cannot import the same codes** to a single Voucherify Project.  &lt;!-- theme: info --&gt;  &gt; 📘 Categories &gt; &gt; In the structure representing your data, you can define a category that the voucher belongs to. You can later use the category of a voucher to group and search by specific criteria in the Dashboard and using the [List Vouchers](ref:list-vouchers) endpoint.  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. `v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u`.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. &#x60;v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u&#x60;. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is &#x60;1&#x60;. |

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

<a id="releaseValidationSession"></a>
# **releaseValidationSession**
> releaseValidationSession(code, sessionKey)

Release Validation Session

Manually release a validation session that has been set up for the voucher. This method undos the actions that are explained in our guide on how a validation session was established, you can read more [here](doc:locking-validation-session).   &gt; 📘 Release Session using Dashboard &gt; &gt; You can also use the Validations Manager in the Dashboard to unlock sessions. [Read more](https://support.voucherify.io/article/16-dashboard-sections#validations).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

<a id="updateVoucherBalance"></a>
# **updateVoucherBalance**
> VouchersBalanceUpdateResponseBody updateVoucherBalance(code, vouchersBalanceUpdateRequestBody)

Add or Remove Voucher Balance

Add balance to an existing gift card or loyalty card.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.VouchersApi;

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

    VouchersApi apiInstance = new VouchersApi(defaultClient);
    String code = "code_example"; // String | A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. `v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u`.
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
| **code** | **String**| A **code** that identifies the voucher or a unique voucher ID assigned by Voucherify, i.e. &#x60;v_TzD19aeNiqGc9LWciMWknyEZT8IW7u4u&#x60;. |
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


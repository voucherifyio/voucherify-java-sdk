# ExportsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExport**](ExportsApi.md#createExport) | **POST** /v1/exports | Create Export |
| [**deleteExport**](ExportsApi.md#deleteExport) | **DELETE** /v1/exports/{exportId} | Delete Export |
| [**downloadExport**](ExportsApi.md#downloadExport) | **GET** /v1/exports/{export_Id} | Download Export |
| [**getExport**](ExportsApi.md#getExport) | **GET** /v1/exports/{exportId} | Get Export |
| [**listExports**](ExportsApi.md#listExports) | **GET** /v1/exports | List Exports |


<a id="createExport"></a>
# **createExport**
> ExportsCreateResponseBody createExport(exportsCreateRequestBody)

Create Export

Create export object. The export can be any of the following types: &#x60;voucher&#x60;, &#x60;redemption&#x60;, &#x60;publication&#x60;, &#x60;customer&#x60;, &#x60;order&#x60;, &#x60;points_expiration&#x60;, or &#x60;voucher_transactions&#x60;.    ## Defaults  If you only specify the object type in the request body without specifying the fields, the API will return the following fields per export object:  | **Export Object** | **Default fields returned** | |:---|:---| | order | &#x60;id&#x60;, &#x60;source_id&#x60;, &#x60;status&#x60; | | voucher | &#x60;code&#x60;, &#x60;voucher_type&#x60;, &#x60;value&#x60;, &#x60;discount_type&#x60; | | publication | &#x60;code&#x60;, &#x60;customer_id&#x60;, &#x60;date&#x60;, &#x60;channel&#x60; | | redemption | &#x60;id&#x60;, &#x60;object&#x60;, &#x60;voucher_code&#x60;, &#x60;customer_id&#x60;, &#x60;date&#x60;, &#x60;result&#x60; | | customer | &#x60;name&#x60;, &#x60;source_id&#x60; | | points_expiration | &#x60;id&#x60;, &#x60;campaign_id&#x60;, &#x60;voucher_id&#x60;, &#x60;status&#x60;, &#x60;expires_at&#x60;, &#x60;points&#x60; | | voucher_transactions | &#x60;id&#x60;, &#x60;type&#x60;, &#x60;source_id&#x60;, &#x60;status&#x60;, &#x60;reason&#x60;, &#x60;source&#x60;, &#x60;balance&#x60;, &#x60;amount&#x60;, &#x60;created_at&#x60; |   ## Fetching particular data sets  Using the &#x60;parameters&#x60; body parameter, you can narrow down which fields to export and how to filter the results. The fields are an array of strings containing the data that you would like to export. These fields define the headers in the CSV file. The array can be a combination of any of the following available fields:  ## Orders    | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique order ID. | ord_A69RIxEdRsPuC6i8gFGVHUft | | source_id | Unique order source ID. | 8638 | | created_at | Timestamp in ISO 8601 format representing the date and time when the order was created. | 2022-03-09T09:16:32.521Z | | updated_at | Timestamp in ISO 8601 format representing the date and time when the order was last updated. | 2022-03-09T09:16:33.331Z | | status | Order status. | &#x60;PAID&#x60;, &#x60;CREATED&#x60;, &#x60;FULFILLED&#x60;, &#x60;CANCELED&#x60; | | amount | Total amount of order items. | 7700 | | discount_amount | Represents total amount of the discount applied to whole cart. | 500 | | items_discount_amount | Represents total amount of the discount applied to order line items. | 100 | | total_discount_amount | All discounts applied to the order including discounts applied to particular order line items and discounts applied to the whole cart. | 600 | | total_amount | Total order amount after applying all discounts. | 7100 | | customer_id | Customer unique ID. | cust_2G4fUQdCXUqp35nXNleav7bO | | referrer_id | Referrer unique ID. | cust_IkrTR674vvQvr9a4rDMiqglY | | metadata | Order metadata; expressed as metadata.X, where X is the name of the custom metadata property. | 1 |  ## Vouchers    | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique voucher ID. | v_HSnGD2vNIHYighTQxwcB4dtVAv8VOmZD | | code | Unique voucher code. | WELCOME100 | | voucher_type | Type of voucher. | &#x60;DISCOUNT_VOUCHER&#x60;, &#x60;GIFT_VOUCHER&#x60;, &#x60;LOYALTY_CARD&#x60; | | value | Value of voucher. | &#x60;DISCOUNT_VOUCHER&#x60; : amount, percent, unit&lt;br&gt;&#x60;GIFT_VOUCHER&#x60;: amount left to spend&lt;br&gt;&#x60;LOYALTY_CARD&#x60;: available usable points | | discount_type | The type of discount for a &#x60;DISCOUNT_VOUCHER&#x60;. | &#x60;AMOUNT&#x60;, &#x60;PERCENT&#x60;, &#x60;UNIT&#x60;, &#x60;FIXED&#x60; | | campaign | Unique campaign name. | Summer Discounts 20% off | | category | Tag defining the category that this voucher belongs to. |  | | start_date | Start date defines when the code starts to be active. Activation timestamp is presented in the ISO 8601 format. Voucher is _inactive_ before this date. | 2020-12-10T23:00:00.000Z | | expiration_date | Expiration date defines when the code expires. Expiration timestamp is presented in the ISO 8601 format. Voucher is _inactive_ after this date. | 2023-12-31T23:00:00.000Z | | gift_balance | Amount left to spend. | 1000 | | loyalty_balance | Available usable points. | 2000 | | redemption_quantity | Maximum number of times a voucher can be redeemed. | 2 | | redemption_count | Total redemptions. | 59 | | active | Boolean indicating whether the voucher is available for use. | &#x60;true&#x60;, &#x60;false&#x60; | | qr_code | URL to QR representation of encrypted code. |  | | bar_code | URL to barcode representation of encrypted code. |  | | metadata | Custom voucher metadata. |  | | is_referral_code | Boolean indicating whether the voucher is a referral code. | &#x60;true&#x60;, &#x60;false&#x60; | | created_at | Timestamp in ISO 8601 format representing the date and time when the voucher was created. | 2022-04-14T09:55:46.814Z | | updated_at | Timestamp in ISO 8601 format representing the date and time when the voucher was last updated. | 2022-04-14T10:02:18.036Z | | validity_timeframe_interval | Defines the intervening time between two time points in ISO 8601 format, expressed as a duration. For example, a voucher with an interval of &#x60;P2D&#x60; will be active every other day. | P2D | | validity_timeframe_duration | Defines the amount of time the voucher will be active in ISO 8601 format. For example, a voucher with a duration of &#x60;PT1H&#x60; will be valid for a duration of one hour. | PT1H | | validity_day_of_week | Array corresponding to the particular days of the week in which the voucher is valid. | \&quot;1,2,3,4,5\&quot; | | discount_amount_limit | For &#x60;PERCENT&#x60; discount type, this is the maximum threshold allowed to be deducted. | 50 | | campaign_id | Parent campaign ID. | camp_7s3uXI44aKfIk5IhmeOPr6ic | | additional_info | An optional field to keep any extra textual information about the code such as a code description and details. |  | | customer_id | Unique customer ID of the assigned owner to whom the voucher was published. | cust_7iUa6ICKyU6gH40dBU25kQU1 | | discount_unit_type | For &#x60;UNIT&#x60; discount type, either a shipping or product ID for a &#x60;UNIT&#x60; discount with one product. | prod_5h1pp1ng, prod_0a9f9aeddb019a42db | | discount_unit_effect | &#x60;UNIT&#x60; discount effect. | &#x60;ADD_MANY_ITEMS&#x60;, &#x60;ADD_MISSING_ITEMS&#x60;,&#x60;ADD_NEW_ITEMS&#x60; | | customer_source_id | Unique customer source id of the assigned owner to whom the voucher was published. | name.lastname@email.com |   ## Publications  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | voucher_code | Unique voucher code. | WELCOME100 | | customer_id | Customer unique ID. | cust_7iUa6ICKyU6gH40dBU25kQU1 | | customer_source_id | Unique customer source id of the assigned owner to whom the voucher was published. | name.lastname@email.com | | date | Timestamp in ISO 8601 format representing the date and time when the voucher was published. | 2022-04-28T10:19:30.792Z | | channel | Publication channel. | voucherify-website | | campaign | Unique campaign name. | Summer Discounts 20% off | | is_winner |  |  | | metadata | Custom publication metadata. |  |  ## Redemptions  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique redemption ID. | r_0acf3a6dae00e679c8, rf_0acf3a495740e679b8 | | object | Object being exported; by default &#x60;redemption&#x60;. | redemption | | date | Timestamp in ISO 8601 format representing the date and time when the voucher was redeemed. | 2022-03-23T08:52:24.867Z | | voucher_code | Unique voucher code redeemed. | WELCOME100 | | campaign | Parent campaign name of voucher if applicable. | Summer Discounts 20% off | | promotion_tier_id |  | promo_Mwy9XpA0TLctSGriM5kum0qp | | customer_id | Unique customer ID of redeeming customer. | cust_nk0N1uNQ1YnupAoJGOgvsODC | | customer_source_id | Unique source ID of redeeming customer. | name.lastname@email.com | | customer_name | Customer name. | John Smith | | tracking_id |  | track_Pw6r3ejnml43kIwNS4Zj09KZ67xOfLUy | | order_amount | Total order amount before applying all discounts. | 1000 | | gift_amount | Gift credits used for redemption. | 10 | | loyalty_points |  | 12 | | result | Tells you whether the redemption succeeded. | &#x60;SUCCESS&#x60;, &#x60;FAILURE&#x60; | | failure_code | Internal Voucherify code for reason why redemption failed. | invalid_customer | | failure_message | A human-readable message providing a short description explaining why the redemption failed. | Customer must be a holder of a loyalty card. | | metadata | Custom redemption metadata. |  |  ## Customers  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | name | Customer name. | John Smith | | id | Unique customer ID. | cust_J1CDUdbqn5Exva8ASWk1Fq0j | | description | An arbitrary string that you can attach to a customer object. | Customer requesting to be added to VIP tier. | | email | Customer&#39;s email. | name.lastname@email.com | | source_id | Unique custom customer identifier. | name.lastname@email.com | | created_at | Timestamp in ISO 8601 format representing the date and time when the customer was created. | 2022-02-03T13:10:11.928Z | | address_city | City | Houston | | address_state | State | TX | | address_line_1 | First line of customer&#39;s address. | 72738 Main St | | address_line_2 | Second line of customer&#39;s address. | Bld 2, Apt 4 | | address_country | Country | United States of America | | address_postal_code | Postal code (ZIP code) | 77042-4143 | | redemptions_total_redeemed | Total customer redemptions. | 5 | | redemptions_total_failed | Total customer failed redemptions. | 2 | | redemptions_total_succeeded | Total customer succeeded redemptions. | 3 | | redemptions_total_rolled_back | Total customer redemptions that were rolled back. | 3 | | redemptions_total_rollback_failed | Total customer redemptions that were unsuccessfully rolled back. | 2 | | redemptions_total_rollback_succeeded | Total customer redemptions that were successfully rolled back. | 1 | | orders_total_amount | Total sum of order amounts over customer lifetime. Value is multiplied by 100 to precisely represent 2 decimal places. | 10000 (represents $100) | | orders_total_count | Total number of customer orders. | 2 | | orders_average_amount | Average amount spent on orders. Value is multiplied by 100 to precisely represent 2 decimal places. | 5000 (represents $50) | | orders_last_order_amount | How much did the customer spend on their last order. Value is multiplied by 100 to precisely represent 2 decimal places. | 5000 (represents $50) | | orders_last_order_date | When was the last customer order; timestamp in ISO 8601 format representing the date and time. | 2022-02-03T13:17:30.630Z | | loyalty_points | Sum of customer&#39;s loyalty points to go across all loyalty cards. | 2000 | | loyalty_referred_customers | How many customers were referred by this customer. | 3 | | updated_at | Timestamp in ISO 8601 format representing the date and time when the customer was updated. | 2022-02-14T14:10:14.305Z | | phone | Customer&#39;s phone number. | +1 (294) 752-1846 | | birthday | &#x60;Deprecated&#x60;. ~~Customer&#39;s birthday~~. | 2022-01-01 | | metadata | Customer metadata. | All metadata fields defined in Metadata Schema for the Customer object. | | birthdate | Customer&#39;s birthdate. | 2022-01-01 |  ## Points Expirations  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Loyalty points bucket ID. | lopb_Wl1o3EjJIHSNjvO5BDLy4z1n | | campaign_id | Campaign ID of the parent loyalty campaign. | camp_7s3uXI44aKfIk5IhmeOPr6ic | | voucher_id | Voucher ID of the parent loyalty card. | v_YLn0WVWXSXbUfDvxgrgUbtfJ3SQIY655 | | status | Status of the loyalty points bucket. | &#x60;ACTIVE&#x60; or &#x60;INACTIVE&#x60; | | expires_at | Timestamp in ISO 8601 format representing the date when the points expire. | 2022-06-30 | | points | Number of points. | 1000 |   ## Gift Card Transactions  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique transaction ID. | vtx_0cb7811f1c07765800 | | type | Transaction type. | - &#x60;CREDITS_REMOVAL&#x60; &lt;br&gt; - &#x60;CREDITS_ADDITION&#x60; &lt;br&gt; - &#x60;CREDITS_REFUND&#x60; &lt;br&gt; - &#x60;CREDITS_REDEMPTION&#x60; | | source_id | Unique transaction source ID. | 8638 | | reason | Contains the reason for the transaction if one was included originally. |  | | balance | The gift card or loyalty card balance after the transaction. |  | | amount | The amount of gift card or loyalty card credits being allocated during the transaction. This value can either be negative or positive depending on the nature of the transaction. |  | | created_at | Timestamp in ISO 8601 format representing the date and time when the transaction was created. | 2022-03-09T09:16:32.521Z  | | voucher_id | Unique Voucher ID. | v_dky7ksKfPX50Wb2Bxvcoeb1xT20b6tcp | | campaign_id | Parent campaign ID. | camp_FNYR4jhqZBM9xTptxDGgeNBV | | source|  Channel through which the transaction was initiated. | API | | details | More detailed information stored in the form of a JSON. | Provides more details related to the transaction in the form of an object. |   ## Loyalty Card Transactions  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique transaction ID assigned by Voucherify. | vtx_0cb7811f1c07765800 | | type | Transaction type. | - &#x60;POINTS_EXPIRATION&#x60; &lt;br&gt; - &#x60;POINTS_ADDITION&#x60; &lt;br&gt; - &#x60;POINTS_REMOVAL&#x60; &lt;br&gt; - &#x60;POINTS_TRANSFER_OUT&#x60; &lt;br&gt; - &#x60;POINTS_ACCRUAL&#x60; &lt;br&gt; - &#x60;POINTS_REFUND&#x60; &lt;br&gt; - &#x60;POINTS_REDEMPTION&#x60; | | source_id | Custom source ID of the transaction if one was included originally. | source_id_custom | | reason | Contains the reason for the transaction if one was included originally. |  | | balance | The loyalty card balance after the transaction. |  | | amount | The amount of loyalty points being allocated during the transaction. This value can either be negative or positive depending on the nature of the transaction. |  | | created_at | Timestamp in ISO 8601 format representing the date and time when the transaction was created. | 2022-03-09T09:16:32.521Z  | | voucher_id | Unique Voucher ID. | v_dky7ksKfPX50Wb2Bxvcoeb1xT20b6tcp | | campaign_id | Parent campaign ID. | camp_FNYR4jhqZBM9xTptxDGgeNBV | | source|  Channel through which the transaction was initiated. | - &#x60;API&#x60; &lt;br&gt; - &#x60;voucherify-web-ui&#x60; &lt;br&gt; - &#x60;Automation&#x60; | | details | More detailed information stored in the form of a JSON. | Provides more details related to the transaction in the form of an object. | | related_transaction_id | Unique transaction ID related to a receiver/donor card in the case of a points transfer from/to another card. | vtx_0c9afe802593b34b80 |

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    ExportsCreateRequestBody exportsCreateRequestBody = new ExportsCreateRequestBody(); // ExportsCreateRequestBody | Specify the details of the export that you would like to create.
    try {
      ExportsCreateResponseBody result = apiInstance.createExport(exportsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#createExport");
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
| **exportsCreateRequestBody** | [**ExportsCreateRequestBody**](ExportsCreateRequestBody.md)| Specify the details of the export that you would like to create. |

### Return type

[**ExportsCreateResponseBody**](ExportsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns export object and URL of CSV file. |  -  |

<a id="deleteExport"></a>
# **deleteExport**
> deleteExport(exportId)

Delete Export

This method deletes a previously created export object.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String exportId = "exportId_example"; // String | Unique export object ID of previously created export. This object can be a: `voucher`, `redemption`, `publication`, `customer`, `order`, `points_expiration`, or `voucher_transactions`.
    try {
      apiInstance.deleteExport(exportId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#deleteExport");
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
| **exportId** | **String**| Unique export object ID of previously created export. This object can be a: &#x60;voucher&#x60;, &#x60;redemption&#x60;, &#x60;publication&#x60;, &#x60;customer&#x60;, &#x60;order&#x60;, &#x60;points_expiration&#x60;, or &#x60;voucher_transactions&#x60;. |

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

<a id="downloadExport"></a>
# **downloadExport**
> String downloadExport(exportId, token)

Download Export

Download the contents of the exported CSV file.   &lt;!-- theme: info --&gt;  &gt; 📘 Important notes &gt; &gt; **Base URL:**  &gt; - &#x60;https://download.voucherify.io&#x60; (Europe)  &gt; - &#x60;https://us1.download.voucherify.io&#x60; (US)  &gt; - &#x60;https://as1.download.voucherify.io&#x60; (Asia)  &gt; &gt; **Token:** Can be found within the &#x60;result&#x60; parameter of the &lt;!-- [Get Export](OpenAPI.json/paths/~1exports~1{exportId}/get) --&gt;[Get Export](ref:get-export) method response.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.models.*;
import voucherify.client.api.ExportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String exportId = "exp_ex6zq0x0EEa9S0N68QcqhxcQ"; // String | Unique export object ID.
    String token = "token_example"; // String | Token that was issued to the export, to get this token, get the export first
    try {
      String result = apiInstance.downloadExport(exportId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#downloadExport");
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
| **exportId** | **String**| Unique export object ID. |
| **token** | **String**| Token that was issued to the export, to get this token, get the export first |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns contents of CSV file. |  -  |

<a id="getExport"></a>
# **getExport**
> ExportsGetResponseBody getExport(exportId)

Get Export

Retrieves the URL of the downloadable file, which was generated via the &lt;!-- [Create Export](OpenAPI.json/paths/~1exports/post) --&gt;[Create Export](ref:create-export) method.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    String exportId = "exportId_example"; // String | Unique export object ID of previously created export. This object can be a: `voucher`, `redemption`, `publication`, `customer`, `order`, `points_expiration`, or `voucher_transactions`.
    try {
      ExportsGetResponseBody result = apiInstance.getExport(exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#getExport");
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
| **exportId** | **String**| Unique export object ID of previously created export. This object can be a: &#x60;voucher&#x60;, &#x60;redemption&#x60;, &#x60;publication&#x60;, &#x60;customer&#x60;, &#x60;order&#x60;, &#x60;points_expiration&#x60;, or &#x60;voucher_transactions&#x60;. |

### Return type

[**ExportsGetResponseBody**](ExportsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the export object if a valid identifier was provided in the path. |  -  |

<a id="listExports"></a>
# **listExports**
> ExportsListResponseBody listExports(limit, page, order)

List Exports

List all exports. 

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.ExportsApi;

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

    ExportsApi apiInstance = new ExportsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    ParameterOrderListExports order = ParameterOrderListExports.fromValue("created_at"); // ParameterOrderListExports | Sorts the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    try {
      ExportsListResponseBody result = apiInstance.listExports(limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportsApi#listExports");
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
| **order** | [**ParameterOrderListExports**](.md)| Sorts the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |

### Return type

[**ExportsListResponseBody**](ExportsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with an exports property that contains an array of exports. Each entry in the array is a separate export object. The list will return the following types of exported objects: &#x60;voucher&#x60;, &#x60;redemption&#x60;, &#x60;publication&#x60;, &#x60;customer&#x60;, &#x60;order&#x60;, &#x60;points_expiration&#x60;, or &#x60;voucher_transactions&#x60;.   The &#x60;channel&#x60; parameter in the response body returns the channel that was used to generate the particular export. The &#x60;user_id&#x60; identifies the specific user who initiated the export through the Voucherify Dashboard; this &#x60;user_id&#x60; is returned when the channel value is &#x60;WEBSITE&#x60;. |  -  |


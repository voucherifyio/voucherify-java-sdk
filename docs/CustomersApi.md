# CustomersApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomersApi.md#createCustomer) | **POST** /v1/customers | Create Customer |
| [**customerPermanentlyDeletion**](CustomersApi.md#customerPermanentlyDeletion) | **POST** /v1/customers/{customerId}/permanent-deletion | Delete Customer Permanently |
| [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /v1/customers/{customerId} | Delete Customer |
| [**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{customerId} | Get Customer |
| [**importCustomersUsingCsv**](CustomersApi.md#importCustomersUsingCsv) | **POST** /v1/customers/importCSV | Import and Update Customers using CSV |
| [**listCustomerSegments**](CustomersApi.md#listCustomerSegments) | **GET** /v1/customers/{customerId}/segments | List Customer&#39;s Segments |
| [**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List Customers |
| [**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /v1/customers/{customerId} | Update Customer |
| [**updateCustomersConsents**](CustomersApi.md#updateCustomersConsents) | **PUT** /v1/customers/{customerId}/consents | Update Customer&#39;s consents |
| [**updateCustomersInBulk**](CustomersApi.md#updateCustomersInBulk) | **POST** /v1/customers/bulk/async | Update Customers in bulk |
| [**updateCustomersMetadataInBulk**](CustomersApi.md#updateCustomersMetadataInBulk) | **POST** /v1/customers/metadata/async | Update Customers&#39; Metadata in bulk |


<a id="createCustomer"></a>
# **createCustomer**
> CustomersCreateResponseBody createCustomer(customersCreateRequestBody)

Create Customer

Creates a customer object.  &lt;!-- theme: info --&gt;  &gt; 📘 Upsert Mode &gt; &gt; If you pass an &#x60;id&#x60; or a &#x60;source_id&#x60; that already exists in the customer database, Voucherify will return a related customer object with updated fields.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    CustomersCreateRequestBody customersCreateRequestBody = new CustomersCreateRequestBody(); // CustomersCreateRequestBody | Create a customer with specified parameters.
    try {
      CustomersCreateResponseBody result = apiInstance.createCustomer(customersCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createCustomer");
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
| **customersCreateRequestBody** | [**CustomersCreateRequestBody**](CustomersCreateRequestBody.md)| Create a customer with specified parameters. |

### Return type

[**CustomersCreateResponseBody**](CustomersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a customer object. |  -  |

<a id="customerPermanentlyDeletion"></a>
# **customerPermanentlyDeletion**
> CustomersPermanentDeletionCreateResponseBody customerPermanentlyDeletion(customerId)

Delete Customer Permanently

The organization user can remove consumer data permanently from the Voucherify system by using this API method. It deletes all customer data and connected resources. It makes the customer profile forgotten by Voucherify.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customer's `id` or `source_id`.
    try {
      CustomersPermanentDeletionCreateResponseBody result = apiInstance.customerPermanentlyDeletion(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#customerPermanentlyDeletion");
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
| **customerId** | **String**| A Voucherify customer&#39;s &#x60;id&#x60; or &#x60;source_id&#x60;. |

### Return type

[**CustomersPermanentDeletionCreateResponseBody**](CustomersPermanentDeletionCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a permanent deletion object and status of the deletion. |  -  |

<a id="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(customerId)

Delete Customer

This method deletes a customer.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customer's `id` or `source_id`.
    try {
      apiInstance.deleteCustomer(customerId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#deleteCustomer");
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
| **customerId** | **String**| A Voucherify customer&#39;s &#x60;id&#x60; or &#x60;source_id&#x60;. |

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

<a id="getCustomer"></a>
# **getCustomer**
> CustomersGetResponseBody getCustomer(customerId)

Get Customer

Retrieve customer details.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customer's `id` or `source_id`.
    try {
      CustomersGetResponseBody result = apiInstance.getCustomer(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getCustomer");
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
| **customerId** | **String**| A Voucherify customer&#39;s &#x60;id&#x60; or &#x60;source_id&#x60;. |

### Return type

[**CustomersGetResponseBody**](CustomersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a customer object if a valid identifier was provided. |  -  |

<a id="importCustomersUsingCsv"></a>
# **importCustomersUsingCsv**
> CustomersImportCsvCreateResponseBody importCustomersUsingCsv(_file)

Import and Update Customers using CSV

This API method lets you import or update customer data. To get a proper and valid response, please send a CSV file with data separated by commas.    ## Request Example &lt;!-- title: \&quot;Example Request\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;cURL curl -X POST \\   https://api.voucherify.io/v1/customers/importCSV \\   -F file&#x3D;@/path/to/customers.csv \\   -H \&quot;X-App-Id: c70a6f00-cf91-4756-9df5-47628850002b\&quot; \\   -H \&quot;X-App-Token: 3266b9f8-e246-4f79-bdf0-833929b1380c\&quot; &#x60;&#x60;&#x60; ## CSV File Format  The CSV file has to include headers in the first line. All properties which cannot be mapped to standard customer fields will be added to the metadata object.  &lt;!-- theme: info --&gt; &gt; 📘 Standard customer fields mapping &gt; &gt; **No spaces allowed in field names**   &gt; Id, Name, Email, Phone, Birthdate, Source_id, Address_line_1, Address_line_2, Address_Postal_Code, Address_City, Address_State, Address_Country, Description, Metadata_name_1, Metadata_name_2  ## Update Customers using CSV  If you would like to update customer&#39;s data, you can do it using the CSV file with new data. However, remember to include a &#x60;source_id&#x60; in your CSV file to manage the update successfully.  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    File _file = new File("/path/to/file"); // File | File path.
    try {
      CustomersImportCsvCreateResponseBody result = apiInstance.importCustomersUsingCsv(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#importCustomersUsingCsv");
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

[**CustomersImportCsvCreateResponseBody**](CustomersImportCsvCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and customers will be added to the repository asynchronously. To check the import status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="listCustomerSegments"></a>
# **listCustomerSegments**
> CustomersSegmentsListResponseBody listCustomerSegments(customerId)

List Customer&#39;s Segments

Returns the list of segments IDs to which the customer belongs to.    If you pass a &#x60;customerId&#x60; which is not stored and recognized by Voucherify as an existing customer in the system, the response will generate a list of segments that the customer would potentialy qualify for if they were to become a customer tracked in the system.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | Unique identifier of a customer represented by an internal customer ID or customer source ID.
    try {
      CustomersSegmentsListResponseBody result = apiInstance.listCustomerSegments(customerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listCustomerSegments");
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
| **customerId** | **String**| Unique identifier of a customer represented by an internal customer ID or customer source ID. |

### Return type

[**CustomersSegmentsListResponseBody**](CustomersSegmentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The method returns segment(s) to which the given customer belongs to. |  -  |

<a id="listCustomers"></a>
# **listCustomers**
> CustomersListResponseBody listCustomers(limit, page, email, city, name, segmentId, createdAtBefore, createdAtAfter, updatedAtBefore, updatedAtAfter, order, startingAfter)

List Customers

Returns a list of customers.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    String email = "email_example"; // String | Limit the customers to the ones that have this specific email address.
    String city = "city_example"; // String | Limit the customers to the ones that are located in the specified city.
    String name = "name_example"; // String | Filter customers by the name property.
    String segmentId = "segmentId_example"; // String | Filter customers by the segment id.
    OffsetDateTime createdAtBefore = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was created.
    OffsetDateTime createdAtAfter = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was created.
    OffsetDateTime updatedAtBefore = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was updated last time.
    OffsetDateTime updatedAtAfter = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was updated last time.
    ParameterOrderListCustomers order = ParameterOrderListCustomers.fromValue("created_at"); // ParameterOrderListCustomers | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    OffsetDateTime startingAfter = OffsetDateTime.now(); // OffsetDateTime | A cursor for pagination. This is a date-time value that defines your place in the list based on `created_at` property from the customer object. For instance, if you make a list request and receive 100 objects, ending with an object created at `2020-05-24T13:43:09.024Z`, your subsequent call can include `starting_after=2020-05-24T13:43:09.024Z` in order to fetch the next page of the list.  <!-- title: Options --> | **Option** | **Format** | **Sorting** | |:---|:---|:---| | Return customers **before** a specific creation date  | - set `starting_after` parameter to the breakpoint date | Sorting order is **descending**; the most recent dates first and least recent dates last. | | Return customers **after** a specific create or update date | - include the `order` parameter set to `created_at` or `updated_at`<br>- set `starting_after` to the breakpoint date | Sorting order is **ascending**; the least recent dates first and the most recent dates last. | 
    try {
      CustomersListResponseBody result = apiInstance.listCustomers(limit, page, email, city, name, segmentId, createdAtBefore, createdAtAfter, updatedAtBefore, updatedAtAfter, order, startingAfter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listCustomers");
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
| **email** | **String**| Limit the customers to the ones that have this specific email address. |
| **city** | **String**| Limit the customers to the ones that are located in the specified city. |
| **name** | **String**| Filter customers by the name property. |
| **segmentId** | **String**| Filter customers by the segment id. |
| **createdAtBefore** | **OffsetDateTime**| Filter customers by date customer was created. |
| **createdAtAfter** | **OffsetDateTime**| Filter customers by date customer was created. |
| **updatedAtBefore** | **OffsetDateTime**| Filter customers by date customer was updated last time. |
| **updatedAtAfter** | **OffsetDateTime**| Filter customers by date customer was updated last time. |
| **order** | [**ParameterOrderListCustomers**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
| **startingAfter** | **OffsetDateTime**| A cursor for pagination. This is a date-time value that defines your place in the list based on &#x60;created_at&#x60; property from the customer object. For instance, if you make a list request and receive 100 objects, ending with an object created at &#x60;2020-05-24T13:43:09.024Z&#x60;, your subsequent call can include &#x60;starting_after&#x3D;2020-05-24T13:43:09.024Z&#x60; in order to fetch the next page of the list.  &lt;!-- title: Options --&gt; | **Option** | **Format** | **Sorting** | |:---|:---|:---| | Return customers **before** a specific creation date  | - set &#x60;starting_after&#x60; parameter to the breakpoint date | Sorting order is **descending**; the most recent dates first and least recent dates last. | | Return customers **after** a specific create or update date | - include the &#x60;order&#x60; parameter set to &#x60;created_at&#x60; or &#x60;updated_at&#x60;&lt;br&gt;- set &#x60;starting_after&#x60; to the breakpoint date | Sorting order is **ascending**; the least recent dates first and the most recent dates last. |  |

### Return type

[**CustomersListResponseBody**](CustomersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with customer objects. The customers are returned sorted by creation date, with the most recent customers appearing first. |  -  |

<a id="updateCustomer"></a>
# **updateCustomer**
> CustomersUpdateResponseBody updateCustomer(customerId, customersUpdateRequestBody)

Update Customer

Updates the specified customer by setting the values of the parameters passed in the request body. Any parameters not provided in the payload will be left unchanged.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customer's `id` or `source_id`.
    CustomersUpdateRequestBody customersUpdateRequestBody = new CustomersUpdateRequestBody(); // CustomersUpdateRequestBody | Specify the parameters to be updated.
    try {
      CustomersUpdateResponseBody result = apiInstance.updateCustomer(customerId, customersUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomer");
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
| **customerId** | **String**| A Voucherify customer&#39;s &#x60;id&#x60; or &#x60;source_id&#x60;. |
| **customersUpdateRequestBody** | [**CustomersUpdateRequestBody**](CustomersUpdateRequestBody.md)| Specify the parameters to be updated. |

### Return type

[**CustomersUpdateResponseBody**](CustomersUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a customer object if updates were successful. |  -  |

<a id="updateCustomersConsents"></a>
# **updateCustomersConsents**
> updateCustomersConsents(customerId, body)

Update Customer&#39;s consents

Update marketing permissions for the specified customer.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify unique customer identifier or source ID.
    Object body = {"cnst_6jQ5XcUOLnj5L7ImQAdBsJ1I":true,"cnst_VCmucIvAsmDYw2PPAok6bcYy":false}; // Object | Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use \"unsubscribed\" as a consent identifier and \"true\" as its value.    #### Examples  <!-- title: \"Request Body\" lineNumbers: true --> ```json {     \"cnst_aIdUulAh0SCsOCaS3005y7yS\": true,     \"cnst_aIdUulAhwewqaS31213fdsfds\": false } ```  Opt-out from all communication:  <!-- title: \"Request Body\" lineNumbers: true --> ```json {     \"unsubscribed\": true } ```
    try {
      apiInstance.updateCustomersConsents(customerId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomersConsents");
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
| **customerId** | **String**| A Voucherify unique customer identifier or source ID. |
| **body** | **Object**| Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use \&quot;unsubscribed\&quot; as a consent identifier and \&quot;true\&quot; as its value.    #### Examples  &lt;!-- title: \&quot;Request Body\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;cnst_aIdUulAh0SCsOCaS3005y7yS\&quot;: true,     \&quot;cnst_aIdUulAhwewqaS31213fdsfds\&quot;: false } &#x60;&#x60;&#x60;  Opt-out from all communication:  &lt;!-- title: \&quot;Request Body\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;unsubscribed\&quot;: true } &#x60;&#x60;&#x60; |

### Return type

null (empty response body)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the consents were updated successfully. |  -  |

<a id="updateCustomersInBulk"></a>
# **updateCustomersInBulk**
> CustomersUpdateInBulkResponseBody updateCustomersInBulk(customersUpdateInBulkRequestBody)

Update Customers in bulk

Update several customers in one asynchronous operation.   In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier.    If a requested customer object is not found, then an **upsert** occurs. This is reflected in the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint as follows:    &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;found\&quot;: false,     \&quot;updated\&quot;: true } &#x60;&#x60;&#x60;  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    List<CustomersUpdateInBulkRequestBody> customersUpdateInBulkRequestBody = Arrays.asList(); // List<CustomersUpdateInBulkRequestBody> | Specify the customer fields that you would like to update in each customer object.
    try {
      CustomersUpdateInBulkResponseBody result = apiInstance.updateCustomersInBulk(customersUpdateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomersInBulk");
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
| **customersUpdateInBulkRequestBody** | [**List&lt;CustomersUpdateInBulkRequestBody&gt;**](CustomersUpdateInBulkRequestBody.md)| Specify the customer fields that you would like to update in each customer object. |

### Return type

[**CustomersUpdateInBulkResponseBody**](CustomersUpdateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and customers will be updated in the repository asynchronously. To check the update status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="updateCustomersMetadataInBulk"></a>
# **updateCustomersMetadataInBulk**
> CustomersMetadataUpdateInBulkResponseBody updateCustomersMetadataInBulk(customersMetadataUpdateInBulkRequestBody)

Update Customers&#39; Metadata in bulk

Update several customers metadata properties in one asynchronous operation.   In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier.    If a requested customer object is not found, then an **upsert** occurs. This is reflected in the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint as follows:    &lt;!-- title: \&quot;Response\&quot; lineNumbers: true --&gt; &#x60;&#x60;&#x60;json {     \&quot;found\&quot;: false,     \&quot;updated\&quot;: true } &#x60;&#x60;&#x60;  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the &#x60;IN_PROGRESS&#x60; status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.CustomersApi;

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

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    CustomersMetadataUpdateInBulkRequestBody customersMetadataUpdateInBulkRequestBody = new CustomersMetadataUpdateInBulkRequestBody(); // CustomersMetadataUpdateInBulkRequestBody | List the `source_ids` of the customer's you would like to update along with the metadata key value pairs.
    try {
      CustomersMetadataUpdateInBulkResponseBody result = apiInstance.updateCustomersMetadataInBulk(customersMetadataUpdateInBulkRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomersMetadataInBulk");
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
| **customersMetadataUpdateInBulkRequestBody** | [**CustomersMetadataUpdateInBulkRequestBody**](CustomersMetadataUpdateInBulkRequestBody.md)| List the &#x60;source_ids&#x60; of the customer&#39;s you would like to update along with the metadata key value pairs. |

### Return type

[**CustomersMetadataUpdateInBulkResponseBody**](CustomersMetadataUpdateInBulkResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returns ID of the scheduled async action. The response informs you that your request has been accepted and customers will be updated in the repository asynchronously. To check the update status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using the &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |


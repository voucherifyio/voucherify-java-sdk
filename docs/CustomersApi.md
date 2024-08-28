# CustomersApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](CustomersApi.md#createCustomer) | **POST** /v1/customers | Create Customer |
| [**customerPermanentlyDeletion**](CustomersApi.md#customerPermanentlyDeletion) | **POST** /v1/customers/{customerId}/permanent-deletion | Delete Customer Permanently |
| [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /v1/customers/{customerId} | Delete Customer |
| [**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{customerId} | Get Customer |
| [**importCustomersUsingCsv**](CustomersApi.md#importCustomersUsingCsv) | **POST** /v1/customers/importCSV | Import and Update Customers using CSV |
| [**listCustomerActivity**](CustomersApi.md#listCustomerActivity) | **GET** /v1/customers/{customerId}/activity | List Customer Activity |
| [**listCustomerSegments**](CustomersApi.md#listCustomerSegments) | **GET** /v1/customers/{customerId}/segments | List Customer&#39;s Segments |
| [**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List Customers |
| [**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /v1/customers/{customerId} | Update Customer |
| [**updateCustomersConsents**](CustomersApi.md#updateCustomersConsents) | **PUT** /v1/customers/{customerId}/consents | Update Customer&#39;s consents [Deprecated] |
| [**updateCustomersInBulk**](CustomersApi.md#updateCustomersInBulk) | **POST** /v1/customers/bulk/async | Update Customers in bulk |
| [**updateCustomersMetadataInBulk**](CustomersApi.md#updateCustomersMetadataInBulk) | **POST** /v1/customers/metadata/async | Update Customers&#39; Metadata in bulk |


<a id="createCustomer"></a>
# **createCustomer**
> CustomersCreateResponseBody createCustomer(customersCreateRequestBody)

Create Customer

Creates a customer object.  📘 Upsert Mode  If you pass an id or a source_id that already exists in the customer database, Voucherify will return a related customer object with updated fields.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customers id or source_id.
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
| **customerId** | **String**| A Voucherify customers id or source_id. |

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
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customers id or source_id.
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
| **customerId** | **String**| A Voucherify customers id or source_id. |

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
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customers id or source_id.
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
| **customerId** | **String**| A Voucherify customers id or source_id. |

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

This API method lets you import or update customer data. To get a proper and valid response, please send a CSV file with data separated by commas.   # Request Example # CSV File Format The CSV file has to include headers in the first line. All properties which cannot be mapped to standard customer fields will be added to the metadata object.  📘 Standard customer fields mapping  **No spaces allowed in field names**    Id, Name, Email, Phone, Birthdate, Source_id, Address_line_1, Address_line_2, Address_Postal_Code, Address_City, Address_State, Address_Country, Description, Metadata_name_1, Metadata_name_2 # Update Customers using CSV If you would like to update customers data, you can do it using the CSV file with new data. However, remember to include a source_id in your CSV file to manage the update successfully. This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

<a id="listCustomerActivity"></a>
# **listCustomerActivity**
> CustomersActivityListResponseBody listCustomerActivity(customerId, limit, order, startingAfterId, startDate, endDate, campaignId, campaignType, category, type)

List Customer Activity

Retrieve customer activities.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customers id or source ID of the customer who performed the activities.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    ParameterOrderCreatedAt order = ParameterOrderCreatedAt.fromValue("created_at"); // ParameterOrderCreatedAt | Apply this filter to order the events according the date and time when it was created. 
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the events starting after an event with the given ID.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must begin on. Represented in ISO 8601 format.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    String campaignId = "campaignId_example"; // String | Requests only events related to specific campaign identified by its ID.
    ParameterCampaignType campaignType = ParameterCampaignType.fromValue("PROMOTION"); // ParameterCampaignType | Filters related customers activity for the selected campaign types. Allowed values:  DISCOUNT_COUPONS, REFERRAL_PROGRAM, GIFT_VOUCHERS, PROMOTION, LOYALTY_PROGRAM.
    ParameterActivityCategory category = ParameterActivityCategory.fromValue("ACTION"); // ParameterActivityCategory | Filters activities for actions or effects. Allowed values:  ACTION, EFFECT.
    String type = "type_example"; // String | Event name of the customer event.
    try {
      CustomersActivityListResponseBody result = apiInstance.listCustomerActivity(customerId, limit, order, startingAfterId, startDate, endDate, campaignId, campaignType, category, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listCustomerActivity");
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
| **customerId** | **String**| A Voucherify customers id or source ID of the customer who performed the activities. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | [**ParameterOrderCreatedAt**](.md)| Apply this filter to order the events according the date and time when it was created.  |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the events starting after an event with the given ID. |
| **startDate** | **OffsetDateTime**| Timestamp representing the date and time which results must begin on. Represented in ISO 8601 format. |
| **endDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |
| **campaignId** | **String**| Requests only events related to specific campaign identified by its ID. |
| **campaignType** | [**ParameterCampaignType**](.md)| Filters related customers activity for the selected campaign types. Allowed values:  DISCOUNT_COUPONS, REFERRAL_PROGRAM, GIFT_VOUCHERS, PROMOTION, LOYALTY_PROGRAM. |
| **category** | [**ParameterActivityCategory**](.md)| Filters activities for actions or effects. Allowed values:  ACTION, EFFECT. |
| **type** | **String**| Event name of the customer event. |

### Return type

[**CustomersActivityListResponseBody**](CustomersActivityListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with customer activities. |  -  |

<a id="listCustomerSegments"></a>
# **listCustomerSegments**
> CustomersSegmentsListResponseBody listCustomerSegments(customerId)

List Customer&#39;s Segments

Returns the list of segments IDs to which the customer belongs to.   If you pass a customerId which is not stored and recognized by Voucherify as an existing customer in the system, the response will generate a list of segments that the customer would potentialy qualify for if they were to become a customer tracked in the system.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    String email = "email_example"; // String | Limit the customers to the ones that have this specific email address.
    String city = "city_example"; // String | Limit the customers to the ones that are located in the specified city.
    String name = "name_example"; // String | Filter customers by the name property.
    String segmentId = "segmentId_example"; // String | Filter customers by the segment id.
    OffsetDateTime createdAtBefore = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was created.
    OffsetDateTime createdAtAfter = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was created.
    OffsetDateTime updatedAtBefore = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was updated last time.
    OffsetDateTime updatedAtAfter = OffsetDateTime.now(); // OffsetDateTime | Filter customers by date customer was updated last time.
    ParameterOrderListCustomers order = ParameterOrderListCustomers.fromValue("created_at"); // ParameterOrderListCustomers | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    OffsetDateTime startingAfter = OffsetDateTime.now(); // OffsetDateTime | A cursor for pagination. This is a date-time value that defines your place in the list based on created_at property from the customer object. For instance, if you make a list request and receive 100 objects, ending with an object created at 2020-05-24T13:43:09.024Z, your subsequent call can include starting_after 2020-05-24T13:43:09.024Z in order to fetch the next page of the list.  
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
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **email** | **String**| Limit the customers to the ones that have this specific email address. |
| **city** | **String**| Limit the customers to the ones that are located in the specified city. |
| **name** | **String**| Filter customers by the name property. |
| **segmentId** | **String**| Filter customers by the segment id. |
| **createdAtBefore** | **OffsetDateTime**| Filter customers by date customer was created. |
| **createdAtAfter** | **OffsetDateTime**| Filter customers by date customer was created. |
| **updatedAtBefore** | **OffsetDateTime**| Filter customers by date customer was updated last time. |
| **updatedAtAfter** | **OffsetDateTime**| Filter customers by date customer was updated last time. |
| **order** | [**ParameterOrderListCustomers**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startingAfter** | **OffsetDateTime**| A cursor for pagination. This is a date-time value that defines your place in the list based on created_at property from the customer object. For instance, if you make a list request and receive 100 objects, ending with an object created at 2020-05-24T13:43:09.024Z, your subsequent call can include starting_after 2020-05-24T13:43:09.024Z in order to fetch the next page of the list.   |

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
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify customers id or source_id.
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
| **customerId** | **String**| A Voucherify customers id or source_id. |
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

Update Customer&#39;s consents [Deprecated]

Update marketing permissions for the specified customer. ❗️ Deprecated  This endpoint is deprecated. The feature of managing consents will be soon removed from Voucherify, including this endpoint.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String customerId = "customerId_example"; // String | A Voucherify unique customer identifier or source ID.
    Object body = {"cnst_6jQ5XcUOLnj5L7ImQAdBsJ1I":true,"cnst_VCmucIvAsmDYw2PPAok6bcYy":false}; // Object | Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use unsubscribed as a consent identifier and true as its value.   ## Examples  Opt-out from all communication: 
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
| **body** | **Object**| Key-value pairs where the key is the consent identifier and value is a boolean that identifies if a customer has given the consent or not. To deny all consents use unsubscribed as a consent identifier and true as its value.   ## Examples  Opt-out from all communication:  |

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

Update several customers in one asynchronous operation.  In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier.   If a requested customer object is not found, then an **upsert** occurs. This is reflected in the Get Async Action endpoint as follows:    This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

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

Update several customers metadata properties in one asynchronous operation.  In one request, it is possible to update a maximum of **100** records. In the response body, you get a unique async action identifier.   If a requested customer object is not found, then an **upsert** occurs. This is reflected in the Get Async Action endpoint as follows:    This API request starts a process that affects Voucherify data in bulk.  In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.  The result will return the async ID. You can verify the status of your request via this API request.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    CustomersMetadataUpdateInBulkRequestBody customersMetadataUpdateInBulkRequestBody = new CustomersMetadataUpdateInBulkRequestBody(); // CustomersMetadataUpdateInBulkRequestBody | List the source_ids of the customers you would like to update along with the metadata key value pairs.
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
| **customersMetadataUpdateInBulkRequestBody** | [**CustomersMetadataUpdateInBulkRequestBody**](CustomersMetadataUpdateInBulkRequestBody.md)| List the source_ids of the customers you would like to update along with the metadata key value pairs. |

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


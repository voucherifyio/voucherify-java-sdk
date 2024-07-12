# OrdersApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /v1/orders | Create Order |
| [**createOrderExport**](OrdersApi.md#createOrderExport) | **POST** /v1/orders/export | Create Orders Export |
| [**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/orders/{orderId} | Get Order |
| [**importOrders**](OrdersApi.md#importOrders) | **POST** /v1/orders/import | Import Orders |
| [**listOrders**](OrdersApi.md#listOrders) | **GET** /v1/orders | List Orders |
| [**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /v1/orders/{orderId} | Update Order |


<a id="createOrder"></a>
# **createOrder**
> OrdersCreateResponseBody createOrder(ordersCreateRequestBody)

Create Order

Creates an order object and triggers an order creation event.  &lt;!-- theme: info --&gt;  &gt; 📘 Upsert Mode &gt; &gt; If you pass an &#x60;id&#x60; or a &#x60;source_id&#x60; that already exists in the order database, Voucherify will return a related order object with updated fields.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrdersCreateRequestBody ordersCreateRequestBody = new OrdersCreateRequestBody(); // OrdersCreateRequestBody | Specify the order parameters.
    try {
      OrdersCreateResponseBody result = apiInstance.createOrder(ordersCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
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
| **ordersCreateRequestBody** | [**OrdersCreateRequestBody**](OrdersCreateRequestBody.md)| Specify the order parameters. |

### Return type

[**OrdersCreateResponseBody**](OrdersCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an order object if the operation succeeded. |  -  |

<a id="createOrderExport"></a>
# **createOrderExport**
> OrdersExportCreateResponseBody createOrderExport(ordersExportCreateRequestBody)

Create Orders Export

Creates a downloadable CSV file containing a list of orders.  The parameters listed in the payload resembles headers in the CSV file. To include a parameter to the file, add it to the &#x60;parameters.fields&#x60; object in the request body.  The available filters are all &lt;!-- [order object](OpenAPI.json/components/schemas/OrdersUpdateResponseBody) --&gt;[order object](ref:get-order) attributes. Additionally, any metadata defined in the metadata schema can be exported.  Passing an empty JSON will generate a file containing three default fields: &#x60;id&#x60;, &#x60;source_id&#x60;, and &#x60;status&#x60;.  The fields array is an array of strings containing the data in the export. These fields define the headers in the CSV file. The array can be a combination of any of the following available fields:  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique order ID. | ord_A69RIxEdRsPuC6i8gFGVHUft | | source_id | Unique order source ID. | 8638 | | created_at | Timestamp in ISO 8601 format representing the date and time when the order was created. | 2022-03-09T09:16:32.521Z | | updated_at | Timestamp in ISO 8601 format representing the date and time when the order was last updated. | 2022-03-09T09:16:33.331Z | | status | Order status. | &#x60;PAID&#x60;, &#x60;CREATED&#x60;, &#x60;FULFILLED&#x60;, &#x60;CANCELED&#x60; | | amount | Total amount of order items. | 7700 | | discount_amount | Represents total amount of the discount applied to whole cart. | 500 | | items_discount_amount | Represents total amount of the discount applied to order line items. | 100 | | total_discount_amount | All discounts applied to the order including discounts applied to particular order line items and discounts applied to the whole cart. | 600 | | total_amount | Total order amount after applying all discounts. | 7100 | | customer_id | Customer unique ID. | cust_2G4fUQdCXUqp35nXNleav7bO | | referrer_id | Referrer unique ID. | cust_IkrTR674vvQvr9a4rDMiqglY | | metadata | Returns all order metadata. | Response will include all order metadata. | | metadata.X | Where X is the name of a particular order metadata property. | The returned value will depend on the type of data defined in the Dashboard &gt; Project Settings &gt; Metdata Schemas &gt; Order. |

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    OrdersExportCreateRequestBody ordersExportCreateRequestBody = new OrdersExportCreateRequestBody(); // OrdersExportCreateRequestBody | Specify which order parameters you would like to export.
    try {
      OrdersExportCreateResponseBody result = apiInstance.createOrderExport(ordersExportCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderExport");
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
| **ordersExportCreateRequestBody** | [**OrdersExportCreateRequestBody**](OrdersExportCreateRequestBody.md)| Specify which order parameters you would like to export. |

### Return type

[**OrdersExportCreateResponseBody**](OrdersExportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the &#x60;id&#x60; of the export object and &#x60;status&#x60; of the file generation process. The &#x60;id&#x60; is used in the &lt;!-- [Get Export](OpenAPI.json/paths/~1exports~1{exportId}/get) --&gt;[Get Export](ref:get-export) method to generate the url for the downloadable CSV file or in the &lt;!-- [Download Export](OpenAPI.json/paths/~1exports~1{export_Id}/get) --&gt;[Download Export](ref:download-export) method to return the contents of the CSV file. The status indicates whether the file has been scheduled for creation. |  -  |

<a id="getOrder"></a>
# **getOrder**
> OrdersGetResponseBody getOrder(orderId)

Get Order

Retrieve an order.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Voucherify order ID or order source ID.
    try {
      OrdersGetResponseBody result = apiInstance.getOrder(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrder");
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
| **orderId** | **String**| Unique Voucherify order ID or order source ID. |

### Return type

[**OrdersGetResponseBody**](OrdersGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an order object if a valid identifier was provided.  |  -  |

<a id="importOrders"></a>
# **importOrders**
> OrdersImportCreateResponseBody importOrders(ordersImportCreateRequestBodyItem)

Import Orders

&lt;!-- theme: info --&gt;  &gt; 🚧 Historical orders &gt; &gt; This endpoint should only be used to import historical orders into Voucherify. For on-going synchronization, the &lt;!-- [create order](OpenAPI.json/paths/~1orders/post) --&gt;[create order](ref:create-order) and &lt;!-- [update order](OpenAPI.json/paths/~1orders~1{orderId}/put) --&gt;[update order](ref:update-order) endpoints should be used. This is critical because this endpoint does not store events or launch distributions.  ## Limitations  ### Import volume  There can be only a single on-going order import per tenant per project at a given time. The user can schedule more imports but those extra imports will be scheduled to run in sequence one by one.    ### Maximum count of orders in single import  There is a &#x60;2000&#x60; limit but we might decide to change it to a lower / higher value at any given time depending if we find this value is too high or too low with time.  ## Notifications  There are no notifications on the Dashboard because this import is launched via the API.  ## Triggered actions    If you import orders with customers, then a logic will be scheduled responsible for placing these customers into segments and refreshing the segment&#39;s summary. Consequently, this update will trigger  - **customers entering into segments**  - **distributions** based on any rules tied to customer entering segment(s) - **earning rules** based on the customer entering segment(s)  ## What is not triggered  1. No webhooks are triggered during the import of orders - for both orders and upserted products / skus.    2. Distributions based on Order Update, Order Paid, Order Created and Order Cancelled. In other words if you have a distribution based on Order Paid and you import an order with a PAID status, the distribution is not going to be triggered.      3. No events are created during the import of orders - for both orders and upserted products / skus. In other words you won&#39;t see any events in the Activity tab in the Dashboard such as Order created or Order paid. If you are additionally upserting products / skus, then you won&#39;t see the Product created events listed, etc.     4. Earning rules based on Order Paid won&#39;t be triggered.  This API request starts a process that affects Voucherify data in bulk.   In case of small jobs (like bulk update) the request is put into a queue and processed once every other bulk request placed in the queue prior to this request is finished. However, when the job takes a longer time (like vouchers generation) then it is processed in small portions in a round-robin fashion. When there is a list of vouchers generation scheduled, then they will all have the IN_PROGRESS status shortly. This way, small jobs added just after scheduling big jobs of the same type will be processed in a short time window.   The result will return the async ID. You can verify the status of your request via this [API request](ref:get-async-action).

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    List<OrdersImportCreateRequestBodyItem> ordersImportCreateRequestBodyItem = Arrays.asList(); // List<OrdersImportCreateRequestBodyItem> | The request body is sent in the form of an array of order objects.
    try {
      OrdersImportCreateResponseBody result = apiInstance.importOrders(ordersImportCreateRequestBodyItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#importOrders");
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
| **ordersImportCreateRequestBodyItem** | [**List&lt;OrdersImportCreateRequestBodyItem&gt;**](OrdersImportCreateRequestBodyItem.md)| The request body is sent in the form of an array of order objects. |

### Return type

[**OrdersImportCreateResponseBody**](OrdersImportCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the ID of the scheduled asynchronous action, informing you that your request has been accepted and the order(s) will be added to the repository asynchronously. To check the status and result, copy the &#x60;async_action_id&#x60; from the response and pass it using &lt;!-- [Get Async Action](OpenAPI.json/paths/~1async-actions~1{asyncActionId}/get) --&gt;[Get Async Action](ref:get-async-action) endpoint. |  -  |

<a id="listOrders"></a>
# **listOrders**
> OrdersListResponseBody listOrders(limit, page, order)

List Orders

Returns a list of orders.  

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    ParameterOrderListOrders order = ParameterOrderListOrders.fromValue("created_at"); // ParameterOrderListOrders | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    try {
      OrdersListResponseBody result = apiInstance.listOrders(limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrders");
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
| **order** | [**ParameterOrderListOrders**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |

### Return type

[**OrdersListResponseBody**](OrdersListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with order objects. The orders are returned sorted by creation date by default, with the most recent orders appearing last, unless you specify another sequence using the order query parameter. |  -  |

<a id="updateOrder"></a>
# **updateOrder**
> OrdersUpdateResponseBody updateOrder(orderId, ordersUpdateRequestBody)

Update Order

Updates the specified order by setting the values of the parameters passed in the request body. Any parameters not provided will be left unchanged.

### Example
```java
// Import classes:
import voucherify.client.ApiClient;
import voucherify.client.ApiException;
import voucherify.client.Configuration;
import voucherify.client.auth.*;
import voucherify.client.models.*;
import voucherify.client.api.OrdersApi;

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

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderId = "orderId_example"; // String | Unique Voucherify order ID or order source ID.
    OrdersUpdateRequestBody ordersUpdateRequestBody = new OrdersUpdateRequestBody(); // OrdersUpdateRequestBody | Specify the parameters of the order that are to be updated.
    try {
      OrdersUpdateResponseBody result = apiInstance.updateOrder(orderId, ordersUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrder");
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
| **orderId** | **String**| Unique Voucherify order ID or order source ID. |
| **ordersUpdateRequestBody** | [**OrdersUpdateRequestBody**](OrdersUpdateRequestBody.md)| Specify the parameters of the order that are to be updated. |

### Return type

[**OrdersUpdateResponseBody**](OrdersUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the order object if the update succeeded. |  -  |


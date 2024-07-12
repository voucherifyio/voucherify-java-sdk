# ValidationRulesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createValidationRuleAssignment**](ValidationRulesApi.md#createValidationRuleAssignment) | **POST** /v1/validation-rules/{validationRuleId}/assignments | Create Validation Rules Assignments |
| [**createValidationRules**](ValidationRulesApi.md#createValidationRules) | **POST** /v1/validation-rules | Create Validation Rules |
| [**deleteValidationRuleAssignment**](ValidationRulesApi.md#deleteValidationRuleAssignment) | **DELETE** /v1/validation-rules/{validationRuleId}/assignments/{assignmentId} | Delete Validation Rule Assignment |
| [**deleteValidationRules**](ValidationRulesApi.md#deleteValidationRules) | **DELETE** /v1/validation-rules/{validationRuleId} | Delete Validation Rule |
| [**getValidationRule**](ValidationRulesApi.md#getValidationRule) | **GET** /v1/validation-rules/{validationRuleId} | Get Validation Rule |
| [**listValidationRuleAssignments**](ValidationRulesApi.md#listValidationRuleAssignments) | **GET** /v1/validation-rules/{validationRuleId}/assignments | List Validation Rule Assignments |
| [**listValidationRules**](ValidationRulesApi.md#listValidationRules) | **GET** /v1/validation-rules | List Validation Rules |
| [**listValidationRulesAssignments**](ValidationRulesApi.md#listValidationRulesAssignments) | **GET** /v1/validation-rules-assignments | List Validation Rules&#39; Assignment(s) |
| [**updateValidationRule**](ValidationRulesApi.md#updateValidationRule) | **PUT** /v1/validation-rules/{validationRuleId} | Update Validation Rule |


<a id="createValidationRuleAssignment"></a>
# **createValidationRuleAssignment**
> ValidationRulesAssignmentsCreateResponseBody createValidationRuleAssignment(validationRuleId, force, validationRulesAssignmentsCreateRequestBody)

Create Validation Rules Assignments

Assign validation rule to either one of the following objects: voucher, campaign, promotion tier, earning rule, reward, distribution.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | Unique validation rule ID.
    Boolean force = true; // Boolean | If this flag is set to true, the previous assignment with the same data will be deleted and a new one will be added.
    ValidationRulesAssignmentsCreateRequestBody validationRulesAssignmentsCreateRequestBody = new ValidationRulesAssignmentsCreateRequestBody(); // ValidationRulesAssignmentsCreateRequestBody | Specify the resource that you would like to assign the validation rule to.
    try {
      ValidationRulesAssignmentsCreateResponseBody result = apiInstance.createValidationRuleAssignment(validationRuleId, force, validationRulesAssignmentsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#createValidationRuleAssignment");
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
| **validationRuleId** | **String**| Unique validation rule ID. |
| **force** | **Boolean**| If this flag is set to true, the previous assignment with the same data will be deleted and a new one will be added. |
| **validationRulesAssignmentsCreateRequestBody** | [**ValidationRulesAssignmentsCreateRequestBody**](ValidationRulesAssignmentsCreateRequestBody.md)| Specify the resource that you would like to assign the validation rule to. |

### Return type

[**ValidationRulesAssignmentsCreateResponseBody**](ValidationRulesAssignmentsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a validation rules assignment object. |  -  |

<a id="createValidationRules"></a>
# **createValidationRules**
> ValidationRulesCreateResponseBody createValidationRules(validationRulesCreateRequestBody)

Create Validation Rules

Create validation rules.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    ValidationRulesCreateRequestBody validationRulesCreateRequestBody = new ValidationRulesCreateRequestBody(); // ValidationRulesCreateRequestBody | Specify the validation rules parameters.
    try {
      ValidationRulesCreateResponseBody result = apiInstance.createValidationRules(validationRulesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#createValidationRules");
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
| **validationRulesCreateRequestBody** | [**ValidationRulesCreateRequestBody**](ValidationRulesCreateRequestBody.md)| Specify the validation rules parameters. |

### Return type

[**ValidationRulesCreateResponseBody**](ValidationRulesCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a validation rule object. |  -  |

<a id="deleteValidationRuleAssignment"></a>
# **deleteValidationRuleAssignment**
> deleteValidationRuleAssignment(validationRuleId, assignmentId)

Delete Validation Rule Assignment

This method deletes a validation rule assignment.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    String assignmentId = "assignmentId_example"; // String | A unique validation rule assignment ID.
    try {
      apiInstance.deleteValidationRuleAssignment(validationRuleId, assignmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#deleteValidationRuleAssignment");
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
| **validationRuleId** | **String**| A unique validation rule ID. |
| **assignmentId** | **String**| A unique validation rule assignment ID. |

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

<a id="deleteValidationRules"></a>
# **deleteValidationRules**
> deleteValidationRules(validationRuleId)

Delete Validation Rule

This method deletes a validation rule.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    try {
      apiInstance.deleteValidationRules(validationRuleId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#deleteValidationRules");
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
| **validationRuleId** | **String**| A unique validation rule ID. |

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

<a id="getValidationRule"></a>
# **getValidationRule**
> ValidationRulesGetResponseBody getValidationRule(validationRuleId)

Get Validation Rule

Retrieve the details of a validation rule.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    try {
      ValidationRulesGetResponseBody result = apiInstance.getValidationRule(validationRuleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#getValidationRule");
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
| **validationRuleId** | **String**| A unique validation rule ID. |

### Return type

[**ValidationRulesGetResponseBody**](ValidationRulesGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the validation rule object. |  -  |

<a id="listValidationRuleAssignments"></a>
# **listValidationRuleAssignments**
> ValidationRulesAssignmentsListResponseBody listValidationRuleAssignments(validationRuleId, limit, page, order)

List Validation Rule Assignments

Retrieve validation rule assignments for a specific validation rule.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | Unique validation rule ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListValidationRuleAssignments order = ParameterOrderListValidationRuleAssignments.fromValue("created_at"); // ParameterOrderListValidationRuleAssignments | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      ValidationRulesAssignmentsListResponseBody result = apiInstance.listValidationRuleAssignments(validationRuleId, limit, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRuleAssignments");
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
| **validationRuleId** | **String**| Unique validation rule ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **order** | [**ParameterOrderListValidationRuleAssignments**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**ValidationRulesAssignmentsListResponseBody**](ValidationRulesAssignmentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of validation rule assignments.  If the validation rule ID provided in the path parameter cannot be found, the endpoint will return an empty &#x60;data&#x60; array and a total of &#x60;0&#x60;. |  -  |

<a id="listValidationRules"></a>
# **listValidationRules**
> ValidationRulesListResponseBody listValidationRules(limit, page, order, startDate, endDate)

List Validation Rules

Retrieve validation rules.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListValidationRules order = ParameterOrderListValidationRules.fromValue("created_at"); // ParameterOrderListValidationRules | This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must start on. Represented in ISO 8601 format.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Timestamp representing the date and time which results must end on. Represented in ISO 8601 format.
    try {
      ValidationRulesListResponseBody result = apiInstance.listValidationRules(limit, page, order, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRules");
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
| **order** | [**ParameterOrderListValidationRules**](.md)| This is a property that controls the sorting direction of the results. Sort the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **startDate** | **OffsetDateTime**| Timestamp representing the date and time which results must start on. Represented in ISO 8601 format. |
| **endDate** | **OffsetDateTime**| Timestamp representing the date and time which results must end on. Represented in ISO 8601 format. |

### Return type

[**ValidationRulesListResponseBody**](ValidationRulesListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of validation rules. |  -  |

<a id="listValidationRulesAssignments"></a>
# **listValidationRulesAssignments**
> ValidationRulesAssignmentsListResponseBody listValidationRulesAssignments(relatedObjectId, rule, page, limit, order)

List Validation Rules&#39; Assignment(s)

List all validation rules assignments or filter the results using the related object ID or the validation rule ID query parameters.  # How to retrieve specific validation rule assignments(s) ## Related object ID To find an assignment for a particular resource, you can use the ID of the object to which the validation rule was assigned. This could be, for example, an ID of a: voucher, campaign, distribution, reward assignment, earning rule, promotion tier.    ## Validation rule ID You can use the validation rule ID to find assignment(s) for a specific validation rule.  

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String relatedObjectId = "relatedObjectId_example"; // String | The resource ID to which the validation rule was assigned; this could be, for example, a resource ID of a voucher, campaign, earning rule, reward assignment, promotion tier, or distribution.
    String rule = "rule_example"; // String | Validation rule ID.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    String order = "order_example"; // String | Sorts the results using one of the filtering options: -created_at, created_at, where the dash - preceding a sorting option means sorting in a descending order.
    try {
      ValidationRulesAssignmentsListResponseBody result = apiInstance.listValidationRulesAssignments(relatedObjectId, rule, page, limit, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#listValidationRulesAssignments");
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
| **relatedObjectId** | **String**| The resource ID to which the validation rule was assigned; this could be, for example, a resource ID of a voucher, campaign, earning rule, reward assignment, promotion tier, or distribution. |
| **rule** | **String**| Validation rule ID. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **order** | **String**| Sorts the results using one of the filtering options: -created_at, created_at, where the dash - preceding a sorting option means sorting in a descending order. |

### Return type

[**ValidationRulesAssignmentsListResponseBody**](ValidationRulesAssignmentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary with a data property that contains an array of validation rule assignments. Each entry in the array is a separate object. If no more validation rule assignments are available, the resulting array will be empty. The result can be narrowed down according to default filters. |  -  |

<a id="updateValidationRule"></a>
# **updateValidationRule**
> ValidationRulesUpdateResponseBody updateValidationRule(validationRuleId, validationRulesUpdateRequestBody)

Update Validation Rule

Update validation rule parameters.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ValidationRulesApi;

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

    ValidationRulesApi apiInstance = new ValidationRulesApi(defaultClient);
    String validationRuleId = "validationRuleId_example"; // String | A unique validation rule ID.
    ValidationRulesUpdateRequestBody validationRulesUpdateRequestBody = new ValidationRulesUpdateRequestBody(); // ValidationRulesUpdateRequestBody | Specify the parameters to be updated.
    try {
      ValidationRulesUpdateResponseBody result = apiInstance.updateValidationRule(validationRuleId, validationRulesUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationRulesApi#updateValidationRule");
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
| **validationRuleId** | **String**| A unique validation rule ID. |
| **validationRulesUpdateRequestBody** | [**ValidationRulesUpdateRequestBody**](ValidationRulesUpdateRequestBody.md)| Specify the parameters to be updated. |

### Return type

[**ValidationRulesUpdateResponseBody**](ValidationRulesUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the validation rule object with the updated parameters. |  -  |


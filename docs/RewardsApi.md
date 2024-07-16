# RewardsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRewardAssignment**](RewardsApi.md#createRewardAssignment) | **POST** /v1/rewards/{rewardId}/assignments | Create Reward Assignment |
| [**deleteReward**](RewardsApi.md#deleteReward) | **DELETE** /v1/rewards/{rewardId} | Delete Reward |
| [**deleteRewardAssignment**](RewardsApi.md#deleteRewardAssignment) | **DELETE** /v1/rewards/{rewardId}/assignments/{assignmentId} | Delete Reward Assignment |
| [**getRewardAssignment**](RewardsApi.md#getRewardAssignment) | **GET** /v1/rewards/{rewardId}/assignments/{assignmentId} | Get Reward Assignment |
| [**listRewardAssignments**](RewardsApi.md#listRewardAssignments) | **GET** /v1/rewards/{rewardId}/assignments | List Reward Assignments |
| [**updateRewardAssignment**](RewardsApi.md#updateRewardAssignment) | **PUT** /v1/rewards/{rewardId}/assignments/{assignmentId} | Update Reward Assignment |


<a id="createRewardAssignment"></a>
# **createRewardAssignment**
> RewardsAssignmentsCreateResponseBody createRewardAssignment(rewardId, rewardsAssignmentsCreateRequestBody)

Create Reward Assignment

Assigns a reward to a specified loyalty campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    RewardsAssignmentsCreateRequestBody rewardsAssignmentsCreateRequestBody = new RewardsAssignmentsCreateRequestBody(); // RewardsAssignmentsCreateRequestBody | Provide the campaign ID of the campaign to which the reward is to be assigned and define the cost of the reward in terms of loyalty points.
    try {
      RewardsAssignmentsCreateResponseBody result = apiInstance.createRewardAssignment(rewardId, rewardsAssignmentsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#createRewardAssignment");
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
| **rewardId** | **String**| A unique reward ID. |
| **rewardsAssignmentsCreateRequestBody** | [**RewardsAssignmentsCreateRequestBody**](RewardsAssignmentsCreateRequestBody.md)| Provide the campaign ID of the campaign to which the reward is to be assigned and define the cost of the reward in terms of loyalty points. |

### Return type

[**RewardsAssignmentsCreateResponseBody**](RewardsAssignmentsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a reward assignment object. |  -  |

<a id="deleteReward"></a>
# **deleteReward**
> deleteReward(rewardId)

Delete Reward

Delete a reward.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    try {
      apiInstance.deleteReward(rewardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#deleteReward");
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
| **rewardId** | **String**| A unique reward ID. |

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

<a id="deleteRewardAssignment"></a>
# **deleteRewardAssignment**
> deleteRewardAssignment(rewardId, assignmentId)

Delete Reward Assignment

This method deletes a reward assignment for a particular reward.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      apiInstance.deleteRewardAssignment(rewardId, assignmentId);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#deleteRewardAssignment");
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
| **rewardId** | **String**| A unique reward ID. |
| **assignmentId** | **String**| A unique reward assignment ID. |

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

<a id="getRewardAssignment"></a>
# **getRewardAssignment**
> RewardsAssignmentsGetResponseBody getRewardAssignment(rewardId, assignmentId)

Get Reward Assignment

Retrieve a reward assignment.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    try {
      RewardsAssignmentsGetResponseBody result = apiInstance.getRewardAssignment(rewardId, assignmentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#getRewardAssignment");
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
| **rewardId** | **String**| A unique reward ID. |
| **assignmentId** | **String**| A unique reward assignment ID. |

### Return type

[**RewardsAssignmentsGetResponseBody**](RewardsAssignmentsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a reward assignment object. |  -  |

<a id="listRewardAssignments"></a>
# **listRewardAssignments**
> RewardsAssignmentsListResponseBody listRewardAssignments(rewardId, limit, page)

List Reward Assignments

Retrieve reward assignments by the reward ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    try {
      RewardsAssignmentsListResponseBody result = apiInstance.listRewardAssignments(rewardId, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#listRewardAssignments");
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
| **rewardId** | **String**| A unique reward ID. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **page** | **Integer**| Which page of results to return. The lowest value is 1. |

### Return type

[**RewardsAssignmentsListResponseBody**](RewardsAssignmentsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of reward assignment objects. Each object contains information regarding the resource to which the reward was assigned and the cost in loyalty points for the reward. |  -  |

<a id="updateRewardAssignment"></a>
# **updateRewardAssignment**
> RewardsAssignmentsUpdateResponseBody updateRewardAssignment(rewardId, assignmentId, rewardsAssignmentsUpdateRequestBody)

Update Reward Assignment

Update the number of points needed to successfully redeem the reward.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String rewardId = "rewardId_example"; // String | A unique reward ID.
    String assignmentId = "assignmentId_example"; // String | A unique reward assignment ID.
    RewardsAssignmentsUpdateRequestBody rewardsAssignmentsUpdateRequestBody = new RewardsAssignmentsUpdateRequestBody(); // RewardsAssignmentsUpdateRequestBody | Define the number of points required to exchange for the reward.
    try {
      RewardsAssignmentsUpdateResponseBody result = apiInstance.updateRewardAssignment(rewardId, assignmentId, rewardsAssignmentsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#updateRewardAssignment");
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
| **rewardId** | **String**| A unique reward ID. |
| **assignmentId** | **String**| A unique reward assignment ID. |
| **rewardsAssignmentsUpdateRequestBody** | [**RewardsAssignmentsUpdateRequestBody**](RewardsAssignmentsUpdateRequestBody.md)| Define the number of points required to exchange for the reward. |

### Return type

[**RewardsAssignmentsUpdateResponseBody**](RewardsAssignmentsUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated reward assignment object. |  -  |


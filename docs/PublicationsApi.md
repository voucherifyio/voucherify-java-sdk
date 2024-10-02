# PublicationsApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPublication**](PublicationsApi.md#createPublication) | **POST** /v1/publications | Create Publication |
| [**createPublication1**](PublicationsApi.md#createPublication1) | **GET** /v1/publications/create | Create Publication |
| [**listPublications**](PublicationsApi.md#listPublications) | **GET** /v1/publications | List Publications |


<a id="createPublication"></a>
# **createPublication**
> PublicationsCreateResponseBody createPublication(joinOnce, publicationsCreateRequestBody)

Create Publication

This method selects vouchers that are suitable for publication, adds a publish entry and returns the publication. A voucher is suitable for publication when its active and hasnt been published yet.    🚧 Clearly define the source of the voucher  You must clearly define which source you want to publish the voucher code from. It can either be a code from a campaign or a specific voucher identified by a code.    🚧 Publish multiple vouchers  In case you want to publish multiple vouchers within a single publication, you need to specify the campaign name and number of vouchers you want to publish.    📘 Auto-update campaign  In case you want to ensure the number of publishable codes increases automatically with the number of customers, you should use an **auto-update** campaign.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PublicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    PublicationsApi apiInstance = new PublicationsApi(defaultClient);
    Boolean joinOnce = true; // Boolean | Through this flag, you can control if a particular person gets only one and always the same code even if the app sends multiple publication requests. It means that if you have a referral program, a referrer is assigned only to one code if an integration sends publication requests more than once for the same customer.
    PublicationsCreateRequestBody publicationsCreateRequestBody = new PublicationsCreateRequestBody(); // PublicationsCreateRequestBody | Specify the publication parameters.
    try {
      PublicationsCreateResponseBody result = apiInstance.createPublication(joinOnce, publicationsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicationsApi#createPublication");
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
| **joinOnce** | **Boolean**| Through this flag, you can control if a particular person gets only one and always the same code even if the app sends multiple publication requests. It means that if you have a referral program, a referrer is assigned only to one code if an integration sends publication requests more than once for the same customer. |
| **publicationsCreateRequestBody** | [**PublicationsCreateRequestBody**](PublicationsCreateRequestBody.md)| Specify the publication parameters. |

### Return type

[**PublicationsCreateResponseBody**](PublicationsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a publication object if a valid identifier was provided. |  -  |

<a id="createPublication1"></a>
# **createPublication1**
> PublicationsCreateResponseBody createPublication1(customer, joinOnce, voucher, campaign, sourceId, metadata)

Create Publication

This method selects vouchers that are suitable for publication, adds a publish entry and returns the publication. A voucher is suitable for publication when its active and hasnt been published yet.  ❗️ Limited access  Access to this endpoint is limited. This endpoint is designed for specific integrations and the API keys need to be configured to access this endpoint. Navigate to the **Dashboard** &amp;rarr; **Project Settings** &amp;rarr; **General** &amp;rarr; **Integration Keys** to set up a pair of API keys and use them to send the request.    🚧 Clearly define the source of the voucher  You must clearly define which source you want to publish the voucher code from. It can either be a code from a campaign or a specific voucher identified by a code.    🚧 Publish multiple vouchers  This endpoint does not support the publishing of multiple vouchers from a single campaign. In case you want to publish multiple vouchers within a single publication, you need to use a dedicated endpoint.    📘 Auto-update campaign  In case you want to ensure the number of publishable codes increases automatically with the number of customers, you should use an **auto-update** campaign.   # Example Request      ❗️ Required    Query param voucher OR campaign MUST be filled out. If you provide both, campaign param will be skipped.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PublicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    PublicationsApi apiInstance = new PublicationsApi(defaultClient);
    Customer customer = new Customer(); // Customer | Contains information about the customer to whom the publication was directed.
    Boolean joinOnce = true; // Boolean | Through this flag, you can control if a particular person gets only one and always the same code even if the app sends multiple publication requests. It means that if you have a referral program, a referrer is assigned only to one code if an integration sends publication requests more than once for the same customer.
    String voucher = "voucher_example"; // String | Code of voucher being published.
    CreatePublicationCampaign campaign = new CreatePublicationCampaign(); // CreatePublicationCampaign | Create publication with campaign.
    String sourceId = "sourceId_example"; // String | The merchants publication ID if it is different from the Voucherify publication ID. Its an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. If source_id is provided only 1 voucher can be published per request.
    Object metadata = null; // Object | The metadata object stores all custom attributes assigned to the publication. A set of key/value pairs that you can attach to a publication object. It can be useful for storing additional information about the publication in a structured format.
    try {
      PublicationsCreateResponseBody result = apiInstance.createPublication1(customer, joinOnce, voucher, campaign, sourceId, metadata);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicationsApi#createPublication1");
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
| **customer** | [**Customer**](.md)| Contains information about the customer to whom the publication was directed. |
| **joinOnce** | **Boolean**| Through this flag, you can control if a particular person gets only one and always the same code even if the app sends multiple publication requests. It means that if you have a referral program, a referrer is assigned only to one code if an integration sends publication requests more than once for the same customer. |
| **voucher** | **String**| Code of voucher being published. |
| **campaign** | [**CreatePublicationCampaign**](.md)| Create publication with campaign. |
| **sourceId** | **String**| The merchants publication ID if it is different from the Voucherify publication ID. Its an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. If source_id is provided only 1 voucher can be published per request. |
| **metadata** | [**Object**](.md)| The metadata object stores all custom attributes assigned to the publication. A set of key/value pairs that you can attach to a publication object. It can be useful for storing additional information about the publication in a structured format. |

### Return type

[**PublicationsCreateResponseBody**](PublicationsCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a publication object. |  -  |

<a id="listPublications"></a>
# **listPublications**
> PublicationsListResponseBody listPublications(limit, page, order, campaign, customer, voucher, result, voucherType, isReferralCode, filters, sourceId)

List Publications

Retrieve a list of publications. To return a **particular** publication, you can use the source_id query parameter and provide the source_id of the publication you are looking for specifically. # Pagination  🚧 Important!  If you want to scroll through a huge set of records, it is recommended to use the Exports API. This API will return an error page_over_limit if you reach a page above 1000. # Filter Query The filters query parameter allows for joining multiple parameters with logical operators. The syntax looks as follows:  ## Operators:  ## Examples  

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.PublicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    PublicationsApi apiInstance = new PublicationsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is 1.
    ParameterOrderListPublications order = ParameterOrderListPublications.fromValue("id"); // ParameterOrderListPublications | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    String campaign = "campaign_example"; // String | Filters by a given campaign name.
    String customer = "customer_example"; // String | Filters by a unique customer ID.
    String voucher = "voucher_example"; // String | Filters by a given voucher code.
    ParameterResultListPublications result = ParameterResultListPublications.fromValue("SUCCESS"); // ParameterResultListPublications | Filters by a publication result.
    ParameterVoucherTypeListPublications voucherType = ParameterVoucherTypeListPublications.fromValue("discount"); // ParameterVoucherTypeListPublications | Filters by a voucher type.
    Boolean isReferralCode = true; // Boolean | This filter works only for the true option. If set to true, the query returns only publications of codes from referral campaigns. 
    ParameterFiltersListPublications filters = new ParameterFiltersListPublications(); // ParameterFiltersListPublications | Filter conditions.
    String sourceId = "sourceId_example"; // String | Using this endpoint with a particular publication source_id, which was sent with the original request to create a publication, returns in the response, exactly the same code published initially because the code was assigned to the given publication. As a result, you can use this endpoint as a reference and return a code that was assigned in a publication by using a particular source_id.
    try {
      PublicationsListResponseBody result = apiInstance.listPublications(limit, page, order, campaign, customer, voucher, result, voucherType, isReferralCode, filters, sourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicationsApi#listPublications");
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
| **order** | [**ParameterOrderListPublications**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **campaign** | **String**| Filters by a given campaign name. |
| **customer** | **String**| Filters by a unique customer ID. |
| **voucher** | **String**| Filters by a given voucher code. |
| **result** | [**ParameterResultListPublications**](.md)| Filters by a publication result. |
| **voucherType** | [**ParameterVoucherTypeListPublications**](.md)| Filters by a voucher type. |
| **isReferralCode** | **Boolean**| This filter works only for the true option. If set to true, the query returns only publications of codes from referral campaigns.  |
| **filters** | [**ParameterFiltersListPublications**](.md)| Filter conditions. |
| **sourceId** | **String**| Using this endpoint with a particular publication source_id, which was sent with the original request to create a publication, returns in the response, exactly the same code published initially because the code was assigned to the given publication. As a result, you can use this endpoint as a reference and return a code that was assigned in a publication by using a particular source_id. |

### Return type

[**PublicationsListResponseBody**](PublicationsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of publications you&#39;ve previously created with &lt;!-- [create publication](OpenAPI.json/paths/~1publications/post) --&gt;[create publication](ref:create-publication) or implicitly by the distribution manager. The publications are returned in sorted order, with the most recent ones appearing first. |  -  |


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

This method selects vouchers that are suitable for publication, adds a publish entry and returns the publication.  A voucher is suitable for publication when it&#39;s active and hasn&#39;t been published yet.    &lt;!-- theme: warning --&gt; &gt; 🚧 Clearly define the source of the voucher &gt; &gt; You must clearly define which source you want to publish the voucher code from. It can either be a code from a campaign or a specific voucher identified by a code.   &lt;!-- theme: warning --&gt; &gt; 🚧 Publish multiple vouchers &gt; In case you want to publish multiple vouchers within a single publication, you need to specify the campaign name and number of vouchers you want to publish.   &lt;!-- theme: info --&gt;  &gt; 📘 Auto-update campaign &gt; &gt; In case you want to ensure the number of publishable codes increases automatically with the number of customers, you should use an **auto-update** campaign.

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
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

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

This method selects vouchers that are suitable for publication, adds a publish entry and returns the publication.  A voucher is suitable for publication when it&#39;s active and hasn&#39;t been published yet. &gt; ❗️ Limited access &gt; &gt; Access to this endpoint is limited. This endpoint is designed for specific integrations and the API keys need to be configured to access this endpoint. Navigate to the **Dashboard** &amp;rarr; **Project Settings** &amp;rarr; **General** &amp;rarr; **Integration Keys** to set up a pair of API keys and use them to send the request.    &lt;!-- theme: warning --&gt; &gt; 🚧 Clearly define the source of the voucher &gt; &gt; You must clearly define which source you want to publish the voucher code from. It can either be a code from a campaign or a specific voucher identified by a code.   &lt;!-- theme: warning --&gt; &gt; 🚧 Publish multiple vouchers &gt; This endpoint does not support the publishing of multiple vouchers from a single campaign. In case you want to publish multiple vouchers within a single publication, you need to use a [dedicated endpoint](ref:create-publication).    &lt;!-- theme: info --&gt;  &gt; 📘 Auto-update campaign &gt; &gt; In case you want to ensure the number of publishable codes increases automatically with the number of customers, you should use an **auto-update** campaign.    ## Example Request  &#x60;&#x60;&#x60;markdown Publication Query  /publications/create?campaign[name]&#x3D;BlackFriday&amp;customer[source_id]&#x3D;Customer_Source_ID  &#x60;&#x60;&#x60;    &lt;!-- theme: danger --&gt; &gt; ❗️ Required   &gt; &gt; Query param &#x60;voucher&#x60; OR &#x60;campaign&#x60; MUST be filled out. If you provide both, &#x60;campaign&#x60; param will be skipped.

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
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

    PublicationsApi apiInstance = new PublicationsApi(defaultClient);
    Customer customer = new Customer(); // Customer | Contains information about the customer to whom the publication was directed.
    Boolean joinOnce = true; // Boolean | Through this flag, you can control if a particular person gets only one and always the same code even if the app sends multiple publication requests. It means that if you have a referral program, a referrer is assigned only to one code if an integration sends publication requests more than once for the same customer.
    String voucher = "voucher_example"; // String | Code of voucher being published.
    CreatePublicationCampaign campaign = new CreatePublicationCampaign(); // CreatePublicationCampaign | Create publication with campaign.
    String sourceId = "sourceId_example"; // String | The merchant’s publication ID if it is different from the Voucherify publication ID. It's an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. If `source_id` is provided only 1 voucher can be published per request.
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
| **sourceId** | **String**| The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. If &#x60;source_id&#x60; is provided only 1 voucher can be published per request. |
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

Retrieve a list of publications. To return a **particular** publication, you can use the &#x60;source_id&#x60; query parameter and provide the &#x60;source_id&#x60; of the publication you are looking for specifically.  ## Pagination  &lt;!-- theme: warning --&gt; &gt; 🚧 Important! &gt; &gt; If you want to scroll through a huge set of records, it is recommended to use the &lt;!-- [Exports API](OpenAPI.json/components/schemas/16_obj_export_object) --&gt;[Exports API](ref:create-export). This API will return an error &#x60;page_over_limit&#x60; if you reach a page above 1000.  ## Filter Query  The &#x60;filters&#x60; query parameter allows for joining multiple parameters with logical operators. The syntax looks as follows:  &lt;!-- title: \&quot;Filter template\&quot; --&gt; &#x60;&#x60;&#x60;url filters[&lt;field_name&gt;][conditions][&lt;operator&gt;][&lt;index&gt;]&#x3D;&lt;value&gt; &#x60;&#x60;&#x60;  ### Operators:  &lt;!-- title: \&quot;Operators\&quot; --&gt; &#x60;&#x60;&#x60;     \&quot;$in\&quot;     \&quot;$not_in\&quot;     \&quot;$is\&quot;     \&quot;$is_not\&quot;     \&quot;$has_value\&quot;     \&quot;$is_unknown\&quot;     \&quot;$contains\&quot;     \&quot;$starts_with\&quot;     \&quot;$ends_with\&quot;     \&quot;$more_than\&quot;     \&quot;$less_than\&quot;     \&quot;$more_than_equal\&quot;     \&quot;$less_than_equal\&quot; &#x60;&#x60;&#x60;  ### Examples  &lt;!-- title: \&quot;Example 1 - List publications of a given customer\&quot; --&gt; &#x60;&#x60;&#x60;url GET /v1/publications?filters[customer_id][conditions][$is][0]&#x3D;cust_lUET6gRpO5Wxlg5p2j2gRCgL &#x60;&#x60;&#x60; &lt;!-- title: \&quot;Example 2 - List publications of 2 customers\&quot; --&gt; &#x60;&#x60;&#x60;url GET /v1/publications?filters[customer_id][conditions][$in][0]&#x3D;cust_lUET6gRpO5Wxlg5p2j2gRCgL&amp;filters[customer_id][conditions][$in][1]&#x3D;cust_aR7NfHusxT7PdTMAKMfWDXnc &#x60;&#x60;&#x60; &lt;!-- title: \&quot;Example 3 - List publications of 2 customers using junction operator\&quot; --&gt; &#x60;&#x60;&#x60;url GET /v1/publications?filters[customer_id][conditions][$is][0]&#x3D;cust_lUET6gRpO5Wxlg5p2j2gRCgL&amp;filters[customer_id][conditions][$is][1]&#x3D;cust_aR7NfHusxT7PdTMAKMfWDXnc&amp;filters[junction]&#x3D;OR &#x60;&#x60;&#x60;

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
    ApiKeyAuth X-App-Id = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Id");
    X-App-Id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Id.setApiKeyPrefix("Token");

    // Configure API key authorization: X-App-Token
    ApiKeyAuth X-App-Token = (ApiKeyAuth) defaultClient.getAuthentication("X-App-Token");
    X-App-Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //X-App-Token.setApiKeyPrefix("Token");

    PublicationsApi apiInstance = new PublicationsApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    Integer page = 56; // Integer | Which page of results to return. The lowest value is `1`.
    ParameterOrderListPublications order = ParameterOrderListPublications.fromValue("id"); // ParameterOrderListPublications | Sorts the results using one of the filtering options, where the dash `-` preceding a sorting option means sorting in a descending order.
    String campaign = "campaign_example"; // String | Filters by a given campaign name.
    String customer = "customer_example"; // String | Filters by a unique customer ID.
    String voucher = "voucher_example"; // String | Filters by a given voucher code.
    ParameterResultListPublications result = ParameterResultListPublications.fromValue("SUCCESS"); // ParameterResultListPublications | Filters by a publication result.
    ParameterVoucherTypeListPublications voucherType = ParameterVoucherTypeListPublications.fromValue("discount"); // ParameterVoucherTypeListPublications | Filters by a voucher type.
    Boolean isReferralCode = true; // Boolean | This filter works only for the `true` option. If set to `true`, the query returns only publications of codes from referral campaigns. 
    String filters = "filters_example"; // String | Allows for combining the filters mentioned in the endpoint description.
    String sourceId = "sourceId_example"; // String | Using this endpoint with a particular publication `source_id`, which was sent with the original request to create a publication, returns in the response, exactly the same code published initially because the code was assigned to the given publication. As a result, you can use this endpoint as a reference and return a code that was assigned in a publication by using a particular `source_id`.
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
| **page** | **Integer**| Which page of results to return. The lowest value is &#x60;1&#x60;. |
| **order** | [**ParameterOrderListPublications**](.md)| Sorts the results using one of the filtering options, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
| **campaign** | **String**| Filters by a given campaign name. |
| **customer** | **String**| Filters by a unique customer ID. |
| **voucher** | **String**| Filters by a given voucher code. |
| **result** | [**ParameterResultListPublications**](.md)| Filters by a publication result. |
| **voucherType** | [**ParameterVoucherTypeListPublications**](.md)| Filters by a voucher type. |
| **isReferralCode** | **Boolean**| This filter works only for the &#x60;true&#x60; option. If set to &#x60;true&#x60;, the query returns only publications of codes from referral campaigns.  |
| **filters** | **String**| Allows for combining the filters mentioned in the endpoint description. |
| **sourceId** | **String**| Using this endpoint with a particular publication &#x60;source_id&#x60;, which was sent with the original request to create a publication, returns in the response, exactly the same code published initially because the code was assigned to the given publication. As a result, you can use this endpoint as a reference and return a code that was assigned in a publication by using a particular &#x60;source_id&#x60;. |

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
| **200** | Returns a list of publications you’ve previously created with &lt;!-- [create publication](OpenAPI.json/paths/~1publications/post) --&gt;[create publication](ref:create-publication) or implicitly by the distribution manager. The publications are returned in sorted order, with the most recent ones appearing first. |  -  |


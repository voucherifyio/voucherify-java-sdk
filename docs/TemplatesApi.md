# TemplatesApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTierFromTemplate**](TemplatesApi.md#addTierFromTemplate) | **POST** /v1/templates/campaigns/{campaignTemplateId}/tier-setup | Add Promotion Tier From Template |
| [**createCampaignFromTemplate**](TemplatesApi.md#createCampaignFromTemplate) | **POST** /v1/templates/campaigns/{campaignTemplateId}/campaign-setup | Create Campaign From Template |
| [**createCampaignTemplate**](TemplatesApi.md#createCampaignTemplate) | **POST** /v1/templates/campaigns | Create Campaign Template |
| [**deleteCampaignTemplate**](TemplatesApi.md#deleteCampaignTemplate) | **DELETE** /v1/templates/campaigns/{campaignTemplateId} | Delete Campaign Template |
| [**getCampaignTemplate**](TemplatesApi.md#getCampaignTemplate) | **GET** /v1/templates/campaigns/{campaignTemplateId} | Get Campaign Template |
| [**listCampaignTemplates**](TemplatesApi.md#listCampaignTemplates) | **GET** /v1/templates/campaigns | List Campaign Templates |
| [**updateCampaignTemplate**](TemplatesApi.md#updateCampaignTemplate) | **PUT** /v1/templates/campaigns/{campaignTemplateId} | Update Campaign Template |


<a id="addTierFromTemplate"></a>
# **addTierFromTemplate**
> TemplatesCampaignsTierSetupCreateResponseBody addTierFromTemplate(campaignTemplateId, templatesCampaignsTierSetupCreateRequestBody)

Add Promotion Tier From Template

Creates a promotion tier out of a discount campaign template and adds it to an existing promotion campaign. To add a promotion tier to a campaign, you need to provide the name in the request and the campaign ID. Other fields are optional. If no other fields are sent, the configuration from the template will be used. You can send new values of the fields listed below to replace the settings saved in the template. However, you cannot assign an action or an existing validation rule or create a new one in the request. If the template has a validation rule, a new validation rule is always created for the promotion tier. When the promotion tier has been created, then you can: - Update the validation rule, - Unassign the validation rule, - Assign an existing validation rule.  👍 Promotion Tiers and Campaign Templates You can create a campaign template out of a promotion tier. Promotion tiers are converted to a discount campaign with the DISCOUNT_COUPON type. You can use this template to create: - Discount campaign - Promotion tier  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String campaignTemplateId = "campaignTemplateId_example"; // String | Pass the campaign template ID that was assigned by Voucherify.
    TemplatesCampaignsTierSetupCreateRequestBody templatesCampaignsTierSetupCreateRequestBody = new TemplatesCampaignsTierSetupCreateRequestBody(); // TemplatesCampaignsTierSetupCreateRequestBody | Only name and campaign_id are required. The rest of the fields will overwrite the template configuration.
    try {
      TemplatesCampaignsTierSetupCreateResponseBody result = apiInstance.addTierFromTemplate(campaignTemplateId, templatesCampaignsTierSetupCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#addTierFromTemplate");
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
| **campaignTemplateId** | **String**| Pass the campaign template ID that was assigned by Voucherify. |
| **templatesCampaignsTierSetupCreateRequestBody** | [**TemplatesCampaignsTierSetupCreateRequestBody**](TemplatesCampaignsTierSetupCreateRequestBody.md)| Only name and campaign_id are required. The rest of the fields will overwrite the template configuration. |

### Return type

[**TemplatesCampaignsTierSetupCreateResponseBody**](TemplatesCampaignsTierSetupCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the added promotion tier and about the resources that have been created out of the template and added to the project. |  -  |

<a id="createCampaignFromTemplate"></a>
# **createCampaignFromTemplate**
> TemplatesCampaignsCampaignSetupCreateResponseBody createCampaignFromTemplate(campaignTemplateId, templatesCampaignsCampaignSetupCreateRequestBody)

Create Campaign From Template

Creates a campaign out of a campaign template. To create a campaign, you need to provide the name in the request, while other fields are optional. If no other fields are sent, the configuration from the template will be used. You can send new values of the fields listed below to replace the settings saved in the template. However, you cannot assign an existing validation rule or create a new one in the request. If the template has a validation rule, a new validation rule is always created for the campaign. When the campaign has been created, then you can: - Update the validation rule, - Unassign the validation rule, - Assign an existing validation rule.  👍 Promotion Tiers and Campaign Templates You can create a campaign template out of a promotion tier. Promotion tiers are converted to a discount campaign with the DISCOUNT_COUPON type. You can use this template to create: - Discount campaign - Promotion tier  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String campaignTemplateId = "campaignTemplateId_example"; // String | Pass the campaign template ID that was assigned by Voucherify.
    TemplatesCampaignsCampaignSetupCreateRequestBody templatesCampaignsCampaignSetupCreateRequestBody = new TemplatesCampaignsCampaignSetupCreateRequestBody(); // TemplatesCampaignsCampaignSetupCreateRequestBody | Only name is required. The rest of the fields will overwrite the template configuration.
    try {
      TemplatesCampaignsCampaignSetupCreateResponseBody result = apiInstance.createCampaignFromTemplate(campaignTemplateId, templatesCampaignsCampaignSetupCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createCampaignFromTemplate");
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
| **campaignTemplateId** | **String**| Pass the campaign template ID that was assigned by Voucherify. |
| **templatesCampaignsCampaignSetupCreateRequestBody** | [**TemplatesCampaignsCampaignSetupCreateRequestBody**](TemplatesCampaignsCampaignSetupCreateRequestBody.md)| Only name is required. The rest of the fields will overwrite the template configuration. |

### Return type

[**TemplatesCampaignsCampaignSetupCreateResponseBody**](TemplatesCampaignsCampaignSetupCreateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the created campaign and about the resources that have been created out of the template and added to the project. |  -  |

<a id="createCampaignTemplate"></a>
# **createCampaignTemplate**
> TemplatesCampaignsCreateTemplateResponseBody createCampaignTemplate(templatesCampaignsCreateRequestBody)

Create Campaign Template

Creates a template for a discount or gift campaign, or a promotion tier. A template stores campaign configuration **without** the following details: - Campaign name - Category - Code count The following elements are not supported by campaign templates: - Redeeming API keys - Redeeming users - Customer loyalty tier - Static segments  👍 Promotion Tiers and Campaign Templates You can create a campaign template out of a promotion tier. Promotion tiers are converted to a discount campaign with the DISCOUNT_COUPON type. You can use this template to create: - Discount campaign, - Promotion tier.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    TemplatesCampaignsCreateRequestBody templatesCampaignsCreateRequestBody = new TemplatesCampaignsCreateRequestBody(); // TemplatesCampaignsCreateRequestBody | Provide details for a campaign template
    try {
      TemplatesCampaignsCreateTemplateResponseBody result = apiInstance.createCampaignTemplate(templatesCampaignsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createCampaignTemplate");
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
| **templatesCampaignsCreateRequestBody** | [**TemplatesCampaignsCreateRequestBody**](TemplatesCampaignsCreateRequestBody.md)| Provide details for a campaign template |

### Return type

[**TemplatesCampaignsCreateTemplateResponseBody**](TemplatesCampaignsCreateTemplateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of a created campaign template. |  -  |

<a id="deleteCampaignTemplate"></a>
# **deleteCampaignTemplate**
> deleteCampaignTemplate(campaignTemplateId)

Delete Campaign Template

Deletes the campaign template permanently.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String campaignTemplateId = "campaignTemplateId_example"; // String | Pass the campaign template ID that was assigned by Voucherify.
    try {
      apiInstance.deleteCampaignTemplate(campaignTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteCampaignTemplate");
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
| **campaignTemplateId** | **String**| Pass the campaign template ID that was assigned by Voucherify. |

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

<a id="getCampaignTemplate"></a>
# **getCampaignTemplate**
> TemplatesCampaignsGetResponseBody getCampaignTemplate(campaignTemplateId)

Get Campaign Template

Retrieves a campaign template available in the project.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String campaignTemplateId = "campaignTemplateId_example"; // String | Pass the campaign template ID that was assigned by Voucherify.
    try {
      TemplatesCampaignsGetResponseBody result = apiInstance.getCampaignTemplate(campaignTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getCampaignTemplate");
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
| **campaignTemplateId** | **String**| Pass the campaign template ID that was assigned by Voucherify. |

### Return type

[**TemplatesCampaignsGetResponseBody**](TemplatesCampaignsGetResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about a campaign template. |  -  |

<a id="listCampaignTemplates"></a>
# **listCampaignTemplates**
> TemplatesCampaignsListResponseBody listCampaignTemplates(limit, startingAfterId, order, includeTotal, filters)

List Campaign Templates

Lists all campaign templates available in the project.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the campaign templates created after a template with the given ID.
    ParameterTemplatesList order = ParameterTemplatesList.fromValue("id"); // ParameterTemplatesList | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    Boolean includeTotal = true; // Boolean | If set to true, the response returns the number of all campaign templates, regardless of the applied filters or limits. Set to false by default.
    ParameterFiltersListTemplates filters = new ParameterFiltersListTemplates(); // ParameterFiltersListTemplates | Filters for listing templates.
    try {
      TemplatesCampaignsListResponseBody result = apiInstance.listCampaignTemplates(limit, startingAfterId, order, includeTotal, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listCampaignTemplates");
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
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the campaign templates created after a template with the given ID. |
| **order** | [**ParameterTemplatesList**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **includeTotal** | **Boolean**| If set to true, the response returns the number of all campaign templates, regardless of the applied filters or limits. Set to false by default. |
| **filters** | [**ParameterFiltersListTemplates**](.md)| Filters for listing templates. |

### Return type

[**TemplatesCampaignsListResponseBody**](TemplatesCampaignsListResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of campaign template objects. The templates are returned by creation date by default. The most recent objects appear last unless specified otherwise with the &#x60;order&#x60; parameter. |  -  |

<a id="updateCampaignTemplate"></a>
# **updateCampaignTemplate**
> TemplatesCampaignsUpdateResponseBody updateCampaignTemplate(campaignTemplateId, templatesCampaignsUpdateRequestBody)

Update Campaign Template

Updates the name or description of the campaign template.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-App-Id
    defaultClient.setAuthentication("X-App-Id", "YOUR API KEY");

    // Configure API key authorization: X-App-Token
    defaultClient.setAuthentication("X-App-Token", "YOUR API KEY");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    String campaignTemplateId = "campaignTemplateId_example"; // String | Pass the campaign template ID that was assigned by Voucherify.
    TemplatesCampaignsUpdateRequestBody templatesCampaignsUpdateRequestBody = new TemplatesCampaignsUpdateRequestBody(); // TemplatesCampaignsUpdateRequestBody | Provide the new name or description for the campaign template
    try {
      TemplatesCampaignsUpdateResponseBody result = apiInstance.updateCampaignTemplate(campaignTemplateId, templatesCampaignsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateCampaignTemplate");
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
| **campaignTemplateId** | **String**| Pass the campaign template ID that was assigned by Voucherify. |
| **templatesCampaignsUpdateRequestBody** | [**TemplatesCampaignsUpdateRequestBody**](TemplatesCampaignsUpdateRequestBody.md)| Provide the new name or description for the campaign template |

### Return type

[**TemplatesCampaignsUpdateResponseBody**](TemplatesCampaignsUpdateResponseBody.md)

### Authorization

[X-App-Id](../README.md#X-App-Id), [X-App-Token](../README.md#X-App-Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of an updated campaign template. |  -  |


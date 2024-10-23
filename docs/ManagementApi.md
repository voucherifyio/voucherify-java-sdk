# ManagementApi

All URIs are relative to *https://api.voucherify.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assignUser**](ManagementApi.md#assignUser) | **POST** /management/v1/projects/{projectId}/users | Assign User |
| [**createBrand**](ManagementApi.md#createBrand) | **POST** /management/v1/projects/{projectId}/branding | Create Brand |
| [**createCustomEventSchema**](ManagementApi.md#createCustomEventSchema) | **POST** /management/v1/projects/{projectId}/custom-event-schemas | Create Custom Event Schema |
| [**createMetadataSchema**](ManagementApi.md#createMetadataSchema) | **POST** /management/v1/projects/{projectId}/metadata-schemas | Create Metadata Schema |
| [**createProject**](ManagementApi.md#createProject) | **POST** /management/v1/projects | Create Project |
| [**createStackingRules**](ManagementApi.md#createStackingRules) | **POST** /management/v1/projects/{projectId}/stacking-rules | Create Stacking Rules |
| [**createWebhook**](ManagementApi.md#createWebhook) | **POST** /management/v1/projects/{projectId}/webhooks | Create Webhook |
| [**deleteBrand**](ManagementApi.md#deleteBrand) | **DELETE** /management/v1/projects/{projectId}/branding/{brandingId} | Delete Brand |
| [**deleteCustomEventSchema**](ManagementApi.md#deleteCustomEventSchema) | **DELETE** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Delete Custom Event Schema |
| [**deleteMetadataSchema**](ManagementApi.md#deleteMetadataSchema) | **DELETE** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Delete Metadata Schema |
| [**deleteProject**](ManagementApi.md#deleteProject) | **DELETE** /management/v1/projects/{projectId} | Delete Project |
| [**deleteStackingRules**](ManagementApi.md#deleteStackingRules) | **DELETE** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Delete Stacking Rules |
| [**deleteWebhook**](ManagementApi.md#deleteWebhook) | **DELETE** /management/v1/projects/{projectId}/webhooks/{webhookId} | Delete Webhook |
| [**getBrand**](ManagementApi.md#getBrand) | **GET** /management/v1/projects/{projectId}/branding/{brandingId} | Get Brand |
| [**getCustomEventSchema**](ManagementApi.md#getCustomEventSchema) | **GET** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Get Custom Event Schema |
| [**getMetadataSchema1**](ManagementApi.md#getMetadataSchema1) | **GET** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Get Metadata Schema |
| [**getProject**](ManagementApi.md#getProject) | **GET** /management/v1/projects/{projectId} | Get Project |
| [**getStackingRules**](ManagementApi.md#getStackingRules) | **GET** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Get Stacking Rules |
| [**getUser**](ManagementApi.md#getUser) | **GET** /management/v1/projects/{projectId}/users/{userId} | Get User |
| [**getWebhook**](ManagementApi.md#getWebhook) | **GET** /management/v1/projects/{projectId}/webhooks/{webhookId} | Get Webhook |
| [**inviteUser**](ManagementApi.md#inviteUser) | **POST** /management/v1/projects/users/invite | Invite a New User |
| [**listBrands**](ManagementApi.md#listBrands) | **GET** /management/v1/projects/{projectId}/branding | List Brands |
| [**listCustomEventSchemas**](ManagementApi.md#listCustomEventSchemas) | **GET** /management/v1/projects/{projectId}/custom-event-schemas | List Custom Event Schemas |
| [**listMetadataSchemas1**](ManagementApi.md#listMetadataSchemas1) | **GET** /management/v1/projects/{projectId}/metadata-schemas | List Metadata Schemas |
| [**listProjects**](ManagementApi.md#listProjects) | **GET** /management/v1/projects | List Projects |
| [**listStackingRules**](ManagementApi.md#listStackingRules) | **GET** /management/v1/projects/{projectId}/stacking-rules | List Stacking Rules |
| [**listUsers**](ManagementApi.md#listUsers) | **GET** /management/v1/projects/{projectId}/users | List Users |
| [**listWebhooks**](ManagementApi.md#listWebhooks) | **GET** /management/v1/projects/{projectId}/webhooks | List Webhooks |
| [**managementCopyCampaignTemplate**](ManagementApi.md#managementCopyCampaignTemplate) | **POST** /management/v1/projects/{projectId}/templates/campaigns/{campaignTemplateId}/copy | Copy Campaign Template to a Project |
| [**managementListCampaignTemplates**](ManagementApi.md#managementListCampaignTemplates) | **GET** /management/v1/projects/{projectId}/templates/campaigns | List Campaign Templates |
| [**unassignUser**](ManagementApi.md#unassignUser) | **DELETE** /management/v1/projects/{projectId}/users/{userId} | Unassign User |
| [**updateBrand**](ManagementApi.md#updateBrand) | **PUT** /management/v1/projects/{projectId}/branding/{brandingId} | Update Brand |
| [**updateCustomEventSchema**](ManagementApi.md#updateCustomEventSchema) | **PUT** /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId} | Update Custom Event Schema |
| [**updateMetadataSchema**](ManagementApi.md#updateMetadataSchema) | **PUT** /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId} | Update Metadata Schema |
| [**updateProject**](ManagementApi.md#updateProject) | **PUT** /management/v1/projects/{projectId} | Update Project |
| [**updateStackingRules**](ManagementApi.md#updateStackingRules) | **PUT** /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId} | Update Stacking Rules |
| [**updateUser**](ManagementApi.md#updateUser) | **PUT** /management/v1/projects/{projectId}/users/{userId} | Update User |
| [**updateWebhook**](ManagementApi.md#updateWebhook) | **PUT** /management/v1/projects/{projectId}/webhooks/{webhookId} | Update Webhook |


<a id="assignUser"></a>
# **assignUser**
> ManagementProjectsUsersAssignResponseBody assignUser(projectId, managementProjectsUsersAssignRequestBody)

Assign User

Assigns a user to a given project. The user must be an existing user in Voucherify.  🚧 Correct Use of Data To avoid errors, use the role key with either id or login keys.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsUsersAssignRequestBody managementProjectsUsersAssignRequestBody = new ManagementProjectsUsersAssignRequestBody(); // ManagementProjectsUsersAssignRequestBody | Defines the user details.
    try {
      ManagementProjectsUsersAssignResponseBody result = apiInstance.assignUser(projectId, managementProjectsUsersAssignRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#assignUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsUsersAssignRequestBody** | [**ManagementProjectsUsersAssignRequestBody**](ManagementProjectsUsersAssignRequestBody.md)| Defines the user details. |

### Return type

[**ManagementProjectsUsersAssignResponseBody**](ManagementProjectsUsersAssignResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the user assigned to the project. |  -  |

<a id="createBrand"></a>
# **createBrand**
> ManagementProjectsBrandingCreateResponseBody createBrand(projectId, managementProjectsBrandingCreateRequestBody)

Create Brand

Creates a new brand configuration. You can have only one brand configured for a project.  📘 White Labelling  The white labelling settings which can be found in Project Settings &gt; Brand Details and which are available only for Enterprise clients as a separate service can be configured only in the user interface.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsBrandingCreateRequestBody managementProjectsBrandingCreateRequestBody = new ManagementProjectsBrandingCreateRequestBody(); // ManagementProjectsBrandingCreateRequestBody | Defines a brand configuration.
    try {
      ManagementProjectsBrandingCreateResponseBody result = apiInstance.createBrand(projectId, managementProjectsBrandingCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsBrandingCreateRequestBody** | [**ManagementProjectsBrandingCreateRequestBody**](ManagementProjectsBrandingCreateRequestBody.md)| Defines a brand configuration. |

### Return type

[**ManagementProjectsBrandingCreateResponseBody**](ManagementProjectsBrandingCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the brand configuration. |  -  |

<a id="createCustomEventSchema"></a>
# **createCustomEventSchema**
> ManagementProjectsCustomEventSchemasCreateResponseBody createCustomEventSchema(projectId, managementProjectsCustomEventSchemasCreateRequestBody)

Create Custom Event Schema

Creates a custom event schema. The properties object is required, but it can be empty, however. This object is for optional custom properties (metadata).  📘 Custom Event Documentation  Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. Read also the details about the Track Custom Event endpoint and the Custom Event Object.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsCustomEventSchemasCreateRequestBody managementProjectsCustomEventSchemasCreateRequestBody = new ManagementProjectsCustomEventSchemasCreateRequestBody(); // ManagementProjectsCustomEventSchemasCreateRequestBody | Defines the custom event schema.
    try {
      ManagementProjectsCustomEventSchemasCreateResponseBody result = apiInstance.createCustomEventSchema(projectId, managementProjectsCustomEventSchemasCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsCustomEventSchemasCreateRequestBody** | [**ManagementProjectsCustomEventSchemasCreateRequestBody**](ManagementProjectsCustomEventSchemasCreateRequestBody.md)| Defines the custom event schema. |

### Return type

[**ManagementProjectsCustomEventSchemasCreateResponseBody**](ManagementProjectsCustomEventSchemasCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the custom event schema. |  -  |

<a id="createMetadataSchema"></a>
# **createMetadataSchema**
> ManagementProjectsMetadataSchemasCreateResponseBody createMetadataSchema(projectId, managementProjectsMetadataSchemasCreateRequestBody)

Create Metadata Schema

Creates a new metadata (custom attribute) schema. The schema consists of a set of key-value pairs to customize Voucherify resources.  You can nest your object within a standard metadata schema, e.g. within a campaign or customer schema. However, your nested object cannot include another nested object. The standard metadata schemas are: - Campaign - Voucher - Publication - Redemption - Product - Customer - Order - Order line item - Loyalty Tier - Promotion Tier - Earning rule - Reward  📘 Metadata Documentation  Read the Getting Started with Metadata articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsMetadataSchemasCreateRequestBody managementProjectsMetadataSchemasCreateRequestBody = new ManagementProjectsMetadataSchemasCreateRequestBody(); // ManagementProjectsMetadataSchemasCreateRequestBody | Defines the metadata schema.
    try {
      ManagementProjectsMetadataSchemasCreateResponseBody result = apiInstance.createMetadataSchema(projectId, managementProjectsMetadataSchemasCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsMetadataSchemasCreateRequestBody** | [**ManagementProjectsMetadataSchemasCreateRequestBody**](ManagementProjectsMetadataSchemasCreateRequestBody.md)| Defines the metadata schema. |

### Return type

[**ManagementProjectsMetadataSchemasCreateResponseBody**](ManagementProjectsMetadataSchemasCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the metadata schema. |  -  |

<a id="createProject"></a>
# **createProject**
> ManagementProjectsCreateResponseBody createProject(managementProjectsCreateRequestBody)

Create Project

Creates a new project. You can add users, specify the cluster, timezone, currency, and other details. All owners are added to the project by default.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ManagementProjectsCreateRequestBody managementProjectsCreateRequestBody = new ManagementProjectsCreateRequestBody(); // ManagementProjectsCreateRequestBody | Define project details.
    try {
      ManagementProjectsCreateResponseBody result = apiInstance.createProject(managementProjectsCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createProject");
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
| **managementProjectsCreateRequestBody** | [**ManagementProjectsCreateRequestBody**](ManagementProjectsCreateRequestBody.md)| Define project details. |

### Return type

[**ManagementProjectsCreateResponseBody**](ManagementProjectsCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of a created project. |  -  |

<a id="createStackingRules"></a>
# **createStackingRules**
> ManagementProjectsStackingRulesCreateResponseBody createStackingRules(projectId, managementProjectsStackingRulesCreateRequestBody)

Create Stacking Rules

Overwrites the default stacking rules. If new stacking rules have been created for the project earlier (e.g. in the user interface), it returns an error. Use Update Stacking Rules endpoint to change the rules.  📘 Stacking Rules Documentation  Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsStackingRulesCreateRequestBody managementProjectsStackingRulesCreateRequestBody = new ManagementProjectsStackingRulesCreateRequestBody(); // ManagementProjectsStackingRulesCreateRequestBody | Defines the stacking rule parameters.
    try {
      ManagementProjectsStackingRulesCreateResponseBody result = apiInstance.createStackingRules(projectId, managementProjectsStackingRulesCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsStackingRulesCreateRequestBody** | [**ManagementProjectsStackingRulesCreateRequestBody**](ManagementProjectsStackingRulesCreateRequestBody.md)| Defines the stacking rule parameters. |

### Return type

[**ManagementProjectsStackingRulesCreateResponseBody**](ManagementProjectsStackingRulesCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the stacking rules assigned to the project. |  -  |

<a id="createWebhook"></a>
# **createWebhook**
> ManagementProjectsWebhooksCreateResponseBody createWebhook(projectId, managementProjectsWebhooksCreateRequestBody)

Create Webhook

Creates a new webhook configuration.  📘 Webhook Documentation  Read Webhooks v2024-01-01 article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsWebhooksCreateRequestBody managementProjectsWebhooksCreateRequestBody = new ManagementProjectsWebhooksCreateRequestBody(); // ManagementProjectsWebhooksCreateRequestBody | Defines a webhook configuration.
    try {
      ManagementProjectsWebhooksCreateResponseBody result = apiInstance.createWebhook(projectId, managementProjectsWebhooksCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#createWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsWebhooksCreateRequestBody** | [**ManagementProjectsWebhooksCreateRequestBody**](ManagementProjectsWebhooksCreateRequestBody.md)| Defines a webhook configuration. |

### Return type

[**ManagementProjectsWebhooksCreateResponseBody**](ManagementProjectsWebhooksCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the webhook configuration. |  -  |

<a id="deleteBrand"></a>
# **deleteBrand**
> deleteBrand(projectId, brandingId)

Delete Brand

Deletes permanently a brand configuration.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    try {
      apiInstance.deleteBrand(projectId, brandingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the brand configuration has been successfully deleted. |  -  |

<a id="deleteCustomEventSchema"></a>
# **deleteCustomEventSchema**
> deleteCustomEventSchema(projectId, customEventSchemaId)

Delete Custom Event Schema

Deletes permanently the custom event schema with its custom properties (metadata).  📘 Custom Event Documentation  Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. Read also the details about the Track Custom Event endpoint and the Custom Event Object.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    try {
      apiInstance.deleteCustomEventSchema(projectId, customEventSchemaId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the custom event schema has been successfully deleted. |  -  |

<a id="deleteMetadataSchema"></a>
# **deleteMetadataSchema**
> deleteMetadataSchema(projectId, metadataSchemaId)

Delete Metadata Schema

Deletes permanently the metadata schema. In standard metadata schemas, this endpoint removes permanently all definitions. The standard metadata schemas are: - Campaign - Voucher - Publication - Redemption - Product - Customer - Order - Order line item - Loyalty Tier - Promotion Tier - Earning rule - Reward If you want to delete only one definition, use the Update Metadata Schema endpoint. In the request, provide the deleted: true pair in the definition object. This definition will be moved to Removed definitions. If you want to create a new standard metadata schema, use the Create Metadata Schema endpoint.  🚧 Metadata Purging This endpoint deletes permanently the metadata schemas only. However, it does not purge the metadata from associated entities, so the metadata added to those entities will remain. If you want to purge metadata from the entities: 1. Remove all the definitions you want to purge. You can do this either in Voucherify Project Settings &gt; Metadata Schema tab or with the Update Metadata Schema endpoint. 2. In Voucherify Project Settings &gt; Metadata Schema tab, go to the relevant metadata schema. 3. In Removed definitions, click the bin button next to the definitions whose metadata you want to purge from entities. Note: - This is an asynchronous action. You will be notified when it has been completed. - You cannot purge metadata for the Redemption and Publication schemas. 4. Use the Delete Metadata Schema request to delete the metadata schema from Voucherify.  📘 Metadata Documentation  Read the Getting Started with Metadata articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    try {
      apiInstance.deleteMetadataSchema(projectId, metadataSchemaId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the metadata schema has been successfully deleted. |  -  |

<a id="deleteProject"></a>
# **deleteProject**
> deleteProject(projectId)

Delete Project

Deletes an existing project. The users currently using the deleted project will be automatically logged out.  🚧 Sandbox Project The sandbox project cannot be deleted.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      apiInstance.deleteProject(projectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if deletion is successful. |  -  |

<a id="deleteStackingRules"></a>
# **deleteStackingRules**
> deleteStackingRules(projectId, stackingRulesId)

Delete Stacking Rules

Deletes permanently the current settings for the stacking rules. The stacking rules are restored to default values.  📘 Stacking Rules Documentation  Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    try {
      apiInstance.deleteStackingRules(projectId, stackingRulesId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the stacking rules have been successfully deleted. |  -  |

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(projectId, webhookId)

Delete Webhook

Deletes a webhook configuration.  📘 Webhook Documentation  Read Webhooks v2024-01-1 article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    try {
      apiInstance.deleteWebhook(projectId, webhookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#deleteWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the webhook configuration has been successfully deleted. |  -  |

<a id="getBrand"></a>
# **getBrand**
> ManagementProjectsBrandingGetResponseBody getBrand(projectId, brandingId)

Get Brand

Retrieves a brand configuration.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    try {
      ManagementProjectsBrandingGetResponseBody result = apiInstance.getBrand(projectId, brandingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. |

### Return type

[**ManagementProjectsBrandingGetResponseBody**](ManagementProjectsBrandingGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the brand configuration. |  -  |

<a id="getCustomEventSchema"></a>
# **getCustomEventSchema**
> ManagementProjectsCustomEventSchemasGetResponseBody getCustomEventSchema(projectId, customEventSchemaId)

Get Custom Event Schema

Retrieves a custom event schema.  📘 Custom Event Documentation  Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. Read also the details about the Track Custom Event endpoint and the Custom Event Object.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    try {
      ManagementProjectsCustomEventSchemasGetResponseBody result = apiInstance.getCustomEventSchema(projectId, customEventSchemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. |

### Return type

[**ManagementProjectsCustomEventSchemasGetResponseBody**](ManagementProjectsCustomEventSchemasGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the custom event schema. |  -  |

<a id="getMetadataSchema1"></a>
# **getMetadataSchema1**
> ManagementProjectsMetadataSchemasGetResponseBody getMetadataSchema1(projectId, metadataSchemaId)

Get Metadata Schema

Retrieves a metadata schema.  📘 Metadata Documentation  Read the Getting Started with Metadata articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    try {
      ManagementProjectsMetadataSchemasGetResponseBody result = apiInstance.getMetadataSchema1(projectId, metadataSchemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getMetadataSchema1");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. |

### Return type

[**ManagementProjectsMetadataSchemasGetResponseBody**](ManagementProjectsMetadataSchemasGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the metadata schema. |  -  |

<a id="getProject"></a>
# **getProject**
> ManagementProjectsGetResponseBody getProject(projectId)

Get Project

Retrieves an existing project.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsGetResponseBody result = apiInstance.getProject(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsGetResponseBody**](ManagementProjectsGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of a project. |  -  |

<a id="getStackingRules"></a>
# **getStackingRules**
> ManagementProjectsStackingRulesGetResponseBody getStackingRules(projectId, stackingRulesId)

Get Stacking Rules

Retrieves the stacking rules for the project.  📘 Stacking Rules Documentation  Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    try {
      ManagementProjectsStackingRulesGetResponseBody result = apiInstance.getStackingRules(projectId, stackingRulesId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. |

### Return type

[**ManagementProjectsStackingRulesGetResponseBody**](ManagementProjectsStackingRulesGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the stacking rules for the project. |  -  |

<a id="getUser"></a>
# **getUser**
> ManagementProjectsUsersGetUserResponseBody getUser(projectId, userId)

Get User

Retrieves the project users details.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the users login.
    try {
      ManagementProjectsUsersGetUserResponseBody result = apiInstance.getUser(projectId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the users login. |

### Return type

[**ManagementProjectsUsersGetUserResponseBody**](ManagementProjectsUsersGetUserResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the project user&#39;s details. |  -  |

<a id="getWebhook"></a>
# **getWebhook**
> ManagementProjectsWebhooksGetResponseBody getWebhook(projectId, webhookId)

Get Webhook

Retrieves a webhook configuration.  📘 Webhook Documentation  Read Webhooks v2024-01-1 article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    try {
      ManagementProjectsWebhooksGetResponseBody result = apiInstance.getWebhook(projectId, webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#getWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. |

### Return type

[**ManagementProjectsWebhooksGetResponseBody**](ManagementProjectsWebhooksGetResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the webhook configuration. |  -  |

<a id="inviteUser"></a>
# **inviteUser**
> inviteUser(managementProjectsUsersInviteCreateRequestBody)

Invite a New User

Sends an invitation to an email address that has not been used yet as a Voucherify user login. You can specify the projects to which the invited user will be assigned and define their roles.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    ManagementProjectsUsersInviteCreateRequestBody managementProjectsUsersInviteCreateRequestBody = new ManagementProjectsUsersInviteCreateRequestBody(); // ManagementProjectsUsersInviteCreateRequestBody | Defines the details of the invitation, the project, and roles to which the user will be assigned.
    try {
      apiInstance.inviteUser(managementProjectsUsersInviteCreateRequestBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#inviteUser");
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
| **managementProjectsUsersInviteCreateRequestBody** | [**ManagementProjectsUsersInviteCreateRequestBody**](ManagementProjectsUsersInviteCreateRequestBody.md)| Defines the details of the invitation, the project, and roles to which the user will be assigned. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the invitation has been sent successfully. |  -  |

<a id="listBrands"></a>
# **listBrands**
> ManagementProjectsBrandingListResponseBody listBrands(projectId)

List Brands

Lists all brand configurations. Because a project can have only one brand, it always returns a list with one item. This endpoint can be used to retrieve the brand configuration created with the Voucherify Dashboard and the ID.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsBrandingListResponseBody result = apiInstance.listBrands(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listBrands");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsBrandingListResponseBody**](ManagementProjectsBrandingListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the brand created in the project. |  -  |

<a id="listCustomEventSchemas"></a>
# **listCustomEventSchemas**
> ManagementProjectsCustomEventSchemasListResponseBody listCustomEventSchemas(projectId)

List Custom Event Schemas

Lists all custom event schemas available in the project.  📘 Custom Event Documentation  Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. Read also the details about the Track Custom Event endpoint and the Custom Event Object.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsCustomEventSchemasListResponseBody result = apiInstance.listCustomEventSchemas(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listCustomEventSchemas");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsCustomEventSchemasListResponseBody**](ManagementProjectsCustomEventSchemasListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the custom event schemas created in the project. |  -  |

<a id="listMetadataSchemas1"></a>
# **listMetadataSchemas1**
> ManagementProjectsMetadataSchemasListResponseBody listMetadataSchemas1(projectId)

List Metadata Schemas

Lists all metadata schemas available in the project.  📘 Metadata Documentation  Read the Getting Started with Metadata articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsMetadataSchemasListResponseBody result = apiInstance.listMetadataSchemas1(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listMetadataSchemas1");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsMetadataSchemasListResponseBody**](ManagementProjectsMetadataSchemasListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the metadata schemas created in the project. |  -  |

<a id="listProjects"></a>
# **listProjects**
> ManagementProjectsListResponseBody listProjects()

List Projects

Lists all projects for the organization. The endpoint does not require any query parameters.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    try {
      ManagementProjectsListResponseBody result = apiInstance.listProjects();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listProjects");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ManagementProjectsListResponseBody**](ManagementProjectsListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all projects with their details. |  -  |

<a id="listStackingRules"></a>
# **listStackingRules**
> ManagementProjectsStackingRulesListResponseBody listStackingRules(projectId)

List Stacking Rules

Lists all stacking rules. Returns always a list with one item. This endpoint can be used to retrieve the default stacking rules. The default stacking rules do not have an ID that could be used with the Get Stacking Rules or Update Stacking Rules endpoints.  📘 Stacking Rules Documentation  Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsStackingRulesListResponseBody result = apiInstance.listStackingRules(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsStackingRulesListResponseBody**](ManagementProjectsStackingRulesListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the stacking rules assigned to the project. These can be either the default stacking rules or the created ones. |  -  |

<a id="listUsers"></a>
# **listUsers**
> ManagementProjectsUsersListResponseBody listUsers(projectId)

List Users

Lists all users assigned to the project.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsUsersListResponseBody result = apiInstance.listUsers(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listUsers");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsUsersListResponseBody**](ManagementProjectsUsersListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of all the users assigned to the project. |  -  |

<a id="listWebhooks"></a>
# **listWebhooks**
> ManagementProjectsWebhooksListResponseBody listWebhooks(projectId)

List Webhooks

Lists all webhook configurations for the project.  📘 Webhook Documentation  Read Webhooks v2024-01-1 article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    try {
      ManagementProjectsWebhooksListResponseBody result = apiInstance.listWebhooks(projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#listWebhooks");
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
| **projectId** | **String**| Provide the unique identifier of the project. |

### Return type

[**ManagementProjectsWebhooksListResponseBody**](ManagementProjectsWebhooksListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about webhook configurations created in the project. |  -  |

<a id="managementCopyCampaignTemplate"></a>
# **managementCopyCampaignTemplate**
> ManagementProjectsTemplatesCampaignsCopyCreateResponseBody managementCopyCampaignTemplate(projectId, campaignTemplateId, managementProjectsTemplatesCampaignsCopyCreateRequestBody)

Copy Campaign Template to a Project

Copies a campaign template to another project. The resources, like validation rules or products, will not be copied to the destination project yet. When the template is used to create a new campaign or add a new promotion tier, the resources will be created in the destination project.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String campaignTemplateId = "campaignTemplateId_example"; // String | Provide the unique identifier of the campaign template.
    ManagementProjectsTemplatesCampaignsCopyCreateRequestBody managementProjectsTemplatesCampaignsCopyCreateRequestBody = new ManagementProjectsTemplatesCampaignsCopyCreateRequestBody(); // ManagementProjectsTemplatesCampaignsCopyCreateRequestBody | Determines the details about the template in the destination project as well as the destination project itself.
    try {
      ManagementProjectsTemplatesCampaignsCopyCreateResponseBody result = apiInstance.managementCopyCampaignTemplate(projectId, campaignTemplateId, managementProjectsTemplatesCampaignsCopyCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#managementCopyCampaignTemplate");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **campaignTemplateId** | **String**| Provide the unique identifier of the campaign template. |
| **managementProjectsTemplatesCampaignsCopyCreateRequestBody** | [**ManagementProjectsTemplatesCampaignsCopyCreateRequestBody**](ManagementProjectsTemplatesCampaignsCopyCreateRequestBody.md)| Determines the details about the template in the destination project as well as the destination project itself. |

### Return type

[**ManagementProjectsTemplatesCampaignsCopyCreateResponseBody**](ManagementProjectsTemplatesCampaignsCopyCreateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the copied campaign template. |  -  |

<a id="managementListCampaignTemplates"></a>
# **managementListCampaignTemplates**
> ManagementProjectsTemplatesCampaignsListResponseBody managementListCampaignTemplates(projectId, limit, startingAfterId, order, includeTotal, filters)

List Campaign Templates

Lists all campaign templates available in the project.  👍 List Campaign Templates  This endpoint works in the same way as the List Campaign Templates endpoint.  📘 Campaign Templates – Documentation Read the [Campaign Templates documentation](https://support.voucherify.io/article/620-campaign-templates) to learn more about this feature.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    Integer limit = 56; // Integer | Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items.
    String startingAfterId = "startingAfterId_example"; // String | A cursor for pagination. It retrieves the campaign templates created after a template with the given ID.
    ParameterTemplatesList order = ParameterTemplatesList.fromValue("id"); // ParameterTemplatesList | Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order.
    Boolean includeTotal = true; // Boolean | If set to true, the response returns the number of all campaign templates, regardless of the applied filters or limits. Set to false by default.
    ParameterFiltersListTemplates filters = new ParameterFiltersListTemplates(); // ParameterFiltersListTemplates | Filters for listing templates.
    try {
      ManagementProjectsTemplatesCampaignsListResponseBody result = apiInstance.managementListCampaignTemplates(projectId, limit, startingAfterId, order, includeTotal, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#managementListCampaignTemplates");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **limit** | **Integer**| Limits the number of objects to be returned. The limit can range between 1 and 100 items. If no limit is set, it returns 10 items. |
| **startingAfterId** | **String**| A cursor for pagination. It retrieves the campaign templates created after a template with the given ID. |
| **order** | [**ParameterTemplatesList**](.md)| Sorts the results using one of the filtering options, where the dash - preceding a sorting option means sorting in a descending order. |
| **includeTotal** | **Boolean**| If set to true, the response returns the number of all campaign templates, regardless of the applied filters or limits. Set to false by default. |
| **filters** | [**ParameterFiltersListTemplates**](.md)| Filters for listing templates. |

### Return type

[**ManagementProjectsTemplatesCampaignsListResponseBody**](ManagementProjectsTemplatesCampaignsListResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a dictionary of campaign template objects. The templates are returned by creation date by default. The most recent objects appear last unless specified otherwise with the &#x60;order&#x60; parameter. |  -  |

<a id="unassignUser"></a>
# **unassignUser**
> unassignUser(projectId, userId)

Unassign User

Unassigns the user from the project. If the user is currently logged in, they are automatically logged out. If the user is assigned to only one project, they cannot be unassigned from that project.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the users login.
    try {
      apiInstance.unassignUser(projectId, userId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#unassignUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the users login. |

### Return type

null (empty response body)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returns no content if the user has been successfully unnassigned. |  -  |

<a id="updateBrand"></a>
# **updateBrand**
> ManagementProjectsBrandingUpdateResponseBody updateBrand(projectId, brandingId, managementProjectsBrandingUpdateRequestBody)

Update Brand

Updates a brand configuration. Only the fields sent in the request will be updated. The fields omitted in the request will remain unchanged.  📘 White Labelling  The white labelling settings which can be found in Project Settings &gt; Brand Details and which are available only for Enterprise clients as a separate service can be configured only in the user interface.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String brandingId = "brandingId_example"; // String | Provide the unique identifier of the brand configuration.
    ManagementProjectsBrandingUpdateRequestBody managementProjectsBrandingUpdateRequestBody = new ManagementProjectsBrandingUpdateRequestBody(); // ManagementProjectsBrandingUpdateRequestBody | Defines the brand configuration to be updated.
    try {
      ManagementProjectsBrandingUpdateResponseBody result = apiInstance.updateBrand(projectId, brandingId, managementProjectsBrandingUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateBrand");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **brandingId** | **String**| Provide the unique identifier of the brand configuration. |
| **managementProjectsBrandingUpdateRequestBody** | [**ManagementProjectsBrandingUpdateRequestBody**](ManagementProjectsBrandingUpdateRequestBody.md)| Defines the brand configuration to be updated. |

### Return type

[**ManagementProjectsBrandingUpdateResponseBody**](ManagementProjectsBrandingUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated brand configuration. |  -  |

<a id="updateCustomEventSchema"></a>
# **updateCustomEventSchema**
> ManagementProjectsCustomEventSchemasUpdateResponseBody updateCustomEventSchema(projectId, customEventSchemaId, managementProjectsCustomEventSchemasUpdateRequestBody)

Update Custom Event Schema

Updates a custom event schema. With this request, you can: - Add a non-existing property to a custom event schema. - Update an existing property. In the request, you can provide only those properties you want to add or update. Definitions omitted in the request remain unchanged.  👍 Additional Notes - You can change the type of an existing property, e.g. from string to number. - You can remove a custom property with this endpoint by providing deleted: true in the request. However, you cannot permanently remove an event definition or its property with this endpoint.  📘 Custom Event Documentation  Read [Custom Events](https://support.voucherify.io/article/111-custom-events) article to learn how custom events work in Voucherify. Read also the details about the Track Custom Event endpoint and the Custom Event Object.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String customEventSchemaId = "customEventSchemaId_example"; // String | Provide the unique identifier of the custom event schema.
    ManagementProjectsCustomEventSchemasUpdateRequestBody managementProjectsCustomEventSchemasUpdateRequestBody = new ManagementProjectsCustomEventSchemasUpdateRequestBody(); // ManagementProjectsCustomEventSchemasUpdateRequestBody | Defines the custom event schema to be updated.
    try {
      ManagementProjectsCustomEventSchemasUpdateResponseBody result = apiInstance.updateCustomEventSchema(projectId, customEventSchemaId, managementProjectsCustomEventSchemasUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateCustomEventSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **customEventSchemaId** | **String**| Provide the unique identifier of the custom event schema. |
| **managementProjectsCustomEventSchemasUpdateRequestBody** | [**ManagementProjectsCustomEventSchemasUpdateRequestBody**](ManagementProjectsCustomEventSchemasUpdateRequestBody.md)| Defines the custom event schema to be updated. |

### Return type

[**ManagementProjectsCustomEventSchemasUpdateResponseBody**](ManagementProjectsCustomEventSchemasUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated custom event schema. |  -  |

<a id="updateMetadataSchema"></a>
# **updateMetadataSchema**
> ManagementProjectsMetadataSchemasUpdateResponseBody updateMetadataSchema(projectId, metadataSchemaId, managementProjectsMetadataSchemasUpdateRequestBody)

Update Metadata Schema

Updates a metadata schema. With this request, you can: - Add a non-existing attribute definition to the metadata schema. - Update an existing attribute definition by overwriting its current values. In the request, you can provide only those definitions you want to add or update. Definitions omitted in the request remain unchanged. However, if you want to update a definition, you will have to add all its current key-value pairs as well. Only the pairs sent in the request are saved for this definition. This means that the key-value pairs that are not sent in a request are restored to default values. For example, if your definition has an array with values and it is not sent in an update request, the array values will be deleted.  👍 Additional Notes - You cannot change the type of an existing schema, e.g. from string to number. - You can remove a definition with this endpoint by providing deleted: true in the request. It will be moved to the Removed definitions section in the user interface. However, you cannot permanently remove a definition with this endpoint.  📘 Metadata Documentation  Read the Getting Started with Metadata articles to learn how metadata work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String metadataSchemaId = "metadataSchemaId_example"; // String | Provide the unique identifier of the metadata schema.
    ManagementProjectsMetadataSchemasUpdateRequestBody managementProjectsMetadataSchemasUpdateRequestBody = new ManagementProjectsMetadataSchemasUpdateRequestBody(); // ManagementProjectsMetadataSchemasUpdateRequestBody | Defines the metadata schema to be updated.
    try {
      ManagementProjectsMetadataSchemasUpdateResponseBody result = apiInstance.updateMetadataSchema(projectId, metadataSchemaId, managementProjectsMetadataSchemasUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateMetadataSchema");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **metadataSchemaId** | **String**| Provide the unique identifier of the metadata schema. |
| **managementProjectsMetadataSchemasUpdateRequestBody** | [**ManagementProjectsMetadataSchemasUpdateRequestBody**](ManagementProjectsMetadataSchemasUpdateRequestBody.md)| Defines the metadata schema to be updated. |

### Return type

[**ManagementProjectsMetadataSchemasUpdateResponseBody**](ManagementProjectsMetadataSchemasUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated metadata schema. |  -  |

<a id="updateProject"></a>
# **updateProject**
> ManagementProjectsUpdateResponseBody updateProject(projectId, managementProjectsUpdateRequestBody)

Update Project

Updates an existing project. You can add or modify settings for timezone, currency, notifications, and other details. Only the fields sent in the request will be updated.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    ManagementProjectsUpdateRequestBody managementProjectsUpdateRequestBody = new ManagementProjectsUpdateRequestBody(); // ManagementProjectsUpdateRequestBody | Define the project details to be updated.
    try {
      ManagementProjectsUpdateResponseBody result = apiInstance.updateProject(projectId, managementProjectsUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateProject");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **managementProjectsUpdateRequestBody** | [**ManagementProjectsUpdateRequestBody**](ManagementProjectsUpdateRequestBody.md)| Define the project details to be updated. |

### Return type

[**ManagementProjectsUpdateResponseBody**](ManagementProjectsUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details of an updated project. |  -  |

<a id="updateStackingRules"></a>
# **updateStackingRules**
> ManagementProjectsStackingRulesUpdateResponseBody updateStackingRules(projectId, stackingRulesId, managementProjectsStackingRulesUpdateRequestBody)

Update Stacking Rules

Updates the stacking rules. Only the provided fields will be updated. However, if you update an array, the content of the array is overwritten. This means that if you want to add new values to an array and retain existing ones, you need to provide both the existing and new values in the request.  📘 Stacking Rules Documentation  Read [the Stacking Rules article](https://support.voucherify.io/article/604-stacking-rules) to learn how they work.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String stackingRulesId = "stackingRulesId_example"; // String | Provide the unique identifier of the stacking rules.
    ManagementProjectsStackingRulesUpdateRequestBody managementProjectsStackingRulesUpdateRequestBody = new ManagementProjectsStackingRulesUpdateRequestBody(); // ManagementProjectsStackingRulesUpdateRequestBody | Defines the stacking rules to be updated.
    try {
      ManagementProjectsStackingRulesUpdateResponseBody result = apiInstance.updateStackingRules(projectId, stackingRulesId, managementProjectsStackingRulesUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateStackingRules");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **stackingRulesId** | **String**| Provide the unique identifier of the stacking rules. |
| **managementProjectsStackingRulesUpdateRequestBody** | [**ManagementProjectsStackingRulesUpdateRequestBody**](ManagementProjectsStackingRulesUpdateRequestBody.md)| Defines the stacking rules to be updated. |

### Return type

[**ManagementProjectsStackingRulesUpdateResponseBody**](ManagementProjectsStackingRulesUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated stacking rules. |  -  |

<a id="updateUser"></a>
# **updateUser**
> ManagementProjectsUsersUpdateRoleResponseBody updateUser(projectId, userId, managementProjectsUsersUpdateRoleRequestBody)

Update User

Updates the users role.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String userId = "userId_example"; // String | Provide the unique identifier of the user. Alternatively, provide the users login.
    ManagementProjectsUsersUpdateRoleRequestBody managementProjectsUsersUpdateRoleRequestBody = new ManagementProjectsUsersUpdateRoleRequestBody(); // ManagementProjectsUsersUpdateRoleRequestBody | Defines the users new role.
    try {
      ManagementProjectsUsersUpdateRoleResponseBody result = apiInstance.updateUser(projectId, userId, managementProjectsUsersUpdateRoleRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateUser");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **userId** | **String**| Provide the unique identifier of the user. Alternatively, provide the users login. |
| **managementProjectsUsersUpdateRoleRequestBody** | [**ManagementProjectsUsersUpdateRoleRequestBody**](ManagementProjectsUsersUpdateRoleRequestBody.md)| Defines the users new role. |

### Return type

[**ManagementProjectsUsersUpdateRoleResponseBody**](ManagementProjectsUsersUpdateRoleResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the user assigned to the project. |  -  |

<a id="updateWebhook"></a>
# **updateWebhook**
> ManagementProjectsWebhooksUpdateResponseBody updateWebhook(projectId, webhookId, managementProjectsWebhooksUpdateRequestBody)

Update Webhook

Updates a webhook configuration. The events listed in the request are overwritten. If you want to add more events, provide also the events that are already in the webhook configuration.  📘 Webhook Documentation  Read Webhooks v2024-01-1 article to learn how webhooks work in Voucherify.

### Example
```java
// Import classes:
import io.voucherify.client.ApiClient;
import io.voucherify.client.ApiException;
import io.voucherify.client.Configuration;
import io.voucherify.client.auth.*;
import io.voucherify.client.models.*;
import io.voucherify.client.api.ManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.voucherify.io");
    
    // Configure API key authorization: X-Management-Token
    defaultClient.setAuthentication("X-Management-Token", "YOUR API KEY");

    // Configure API key authorization: X-Management-Id
    defaultClient.setAuthentication("X-Management-Id", "YOUR API KEY");

    ManagementApi apiInstance = new ManagementApi(defaultClient);
    String projectId = "projectId_example"; // String | Provide the unique identifier of the project.
    String webhookId = "webhookId_example"; // String | Provide the unique identifier of the webhook configuration.
    ManagementProjectsWebhooksUpdateRequestBody managementProjectsWebhooksUpdateRequestBody = new ManagementProjectsWebhooksUpdateRequestBody(); // ManagementProjectsWebhooksUpdateRequestBody | Defines the webhook configuration to be updated.
    try {
      ManagementProjectsWebhooksUpdateResponseBody result = apiInstance.updateWebhook(projectId, webhookId, managementProjectsWebhooksUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagementApi#updateWebhook");
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
| **projectId** | **String**| Provide the unique identifier of the project. |
| **webhookId** | **String**| Provide the unique identifier of the webhook configuration. |
| **managementProjectsWebhooksUpdateRequestBody** | [**ManagementProjectsWebhooksUpdateRequestBody**](ManagementProjectsWebhooksUpdateRequestBody.md)| Defines the webhook configuration to be updated. |

### Return type

[**ManagementProjectsWebhooksUpdateResponseBody**](ManagementProjectsWebhooksUpdateResponseBody.md)

### Authorization

[X-Management-Token](../README.md#X-Management-Token), [X-Management-Id](../README.md#X-Management-Id)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the details about the updated webhook configuration. |  -  |


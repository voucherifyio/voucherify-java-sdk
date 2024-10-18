

# ManagementProjectsCreateRequestBody

Request body schema for **POST** `/management/v1/projects`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**caseSensitiveCodes** | **Boolean** | Determines if the vouchers in the project will be case sensitive (if &#x60;true&#x60;, &#x60;C0dE-cfV&#x60; is not equal to &#x60;c0de-cfv&#x60;) or case insensitive (if false, &#x60;C0dE-cfV&#x60; is equal to &#x60;c0de-cfv&#x60;). |
|**name** | **String** | The name of the project. |
|**description** | **String** | A user-defined description of the project, e.g. its purpose, scope, region. |
|**timezone** | **String** | The time zone in which the project is established. It can be in the GMT format or in accordance with IANA time zone database. |
|**currency** | **String** | The currency used in the project. It is equal to a 3-letter ISO 4217 code. |
|**dialCode** | **String** | The country dial code for the project. It is equal to an ITU country code. |
|**webhookVersion** | [**WebhookVersionEnum**](#WebhookVersionEnum) | The webhook version used in the project. |
|**clientTrustedDomains** | **List&lt;String&gt;** | An array of URL addresses that allow client requests. |
|**clientRedeemEnabled** | **Boolean** | Enables client-side redemption. |
|**clientPublishEnabled** | **Boolean** | Enables client-side publication. |
|**clientListVouchersEnabled** | **Boolean** | Enables client-side listing of vouchers. |
|**clientCreateCustomerEnabled** | **Boolean** | Enables client-side creation of customers. |
|**clientLoyaltyEventsEnabled** | **Boolean** | Enables client-side events for loyalty and referral programs. |
|**clientSetVoucherExpirationDateEnabled** | **Boolean** | Enables client-side setting of voucher expiration date. |
|**apiUsageNotifications** | [**ManagementProjectsCreateRequestBodyApiUsageNotifications**](ManagementProjectsCreateRequestBodyApiUsageNotifications.md) |  |
|**webhooksCalloutNotifications** | [**ManagementProjectsCreateRequestBodyWebhooksCalloutNotifications**](ManagementProjectsCreateRequestBodyWebhooksCalloutNotifications.md) |  |
|**clusterId** | **String** | The identifier of the cluster where the project will be created. The default cluster is &#x60;eu1&#x60; unless otherwise configured. |
|**apiVersion** | [**ApiVersionEnum**](#ApiVersionEnum) | The API version used in the project. Currently, the default and only value is &#x60;v2018-08-01&#x60;. |
|**users** | [**List&lt;ManagementProjectsCreateRequestBodyUsersItem&gt;**](ManagementProjectsCreateRequestBodyUsersItem.md) | The users (their identifiers, logins, and roles) who will be assigned to the project. You can assign only existing Voucherify users.  It must be used either in the following combinations: - &#x60;id&#x60; and &#x60;role&#x60;, or - &#x60;login&#x60; and &#x60;role&#x60;. |



## Enum: WebhookVersionEnum

| Name | Value |
|---- | -----|
| V2024_01_01 | &quot;v2024-01-01&quot; |



## Enum: ApiVersionEnum

| Name | Value |
|---- | -----|
| V2018_08_01 | &quot;v2018-08-01&quot; |




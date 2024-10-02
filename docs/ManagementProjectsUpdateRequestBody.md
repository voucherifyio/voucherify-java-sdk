

# ManagementProjectsUpdateRequestBody

Request body schema for **PUT** `v1/management/v1/projects/{projectId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
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
|**apiUsageNotifications** | [**ManagementProjectsUpdateRequestBodyApiUsageNotifications**](ManagementProjectsUpdateRequestBodyApiUsageNotifications.md) |  |
|**webhooksCalloutNotifications** | [**ManagementProjectsUpdateRequestBodyWebhooksCalloutNotifications**](ManagementProjectsUpdateRequestBodyWebhooksCalloutNotifications.md) |  |
|**defaultCodeConfig** | [**ManagementProjectsUpdateRequestBodyDefaultCodeConfig**](ManagementProjectsUpdateRequestBodyDefaultCodeConfig.md) |  |



## Enum: WebhookVersionEnum

| Name | Value |
|---- | -----|
| V2024_01_01 | &quot;v2024-01-01&quot; |




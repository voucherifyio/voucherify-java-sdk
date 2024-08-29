

# CampaignsVouchersCreateInBulkRequestBody

Request body schema for **POST** `v1/campaigns/{campaignId}/vouchers`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Unique voucher code. |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the voucher. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |
|**redemption** | [**CampaignsVouchersCreateInBulkRequestBodyRedemption**](CampaignsVouchersCreateInBulkRequestBodyRedemption.md) |  |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the voucher starts to be active in ISO 8601 format. Voucher is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the voucher expires in ISO 8601 format.  Voucher is *inactive after* this date. |




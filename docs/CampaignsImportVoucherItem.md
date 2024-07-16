

# CampaignsImportVoucherItem

Import Vouchers to Campaign

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Unique custom voucher code. |
|**type** | [**TypeEnum**](#TypeEnum) | Type of voucher. |
|**redemption** | [**CampaignsImportVoucherItemRedemption**](CampaignsImportVoucherItemRedemption.md) |  |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the voucher. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**gift** | [**Gift**](Gift.md) |  |
|**loyaltyCard** | [**CampaignsImportVoucherLoyaltyCard**](CampaignsImportVoucherLoyaltyCard.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| LUCKY_DRAW_CODE | &quot;LUCKY_DRAW_CODE&quot; |




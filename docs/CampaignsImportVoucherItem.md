

# CampaignsImportVoucherItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Value representing the imported code. |
|**redemption** | [**CampaignsImportVoucherItemRedemption**](CampaignsImportVoucherItemRedemption.md) |  |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**metadata** | **Object** |  |
|**category** | **String** | Tag defining the category that this voucher belongs to. Useful when listing vouchers using the [List Vouchers](ref:list-vouchers) endpoint. |
|**startDate** | **OffsetDateTime** | Activation timestamp presented in the ISO 8601 format. Voucher is *inactive before* this date. Start date defines when the code starts to be active. Allowed date formats are: - YYYY-MM-DD - YYYY-MM-DDTHH - YYYY-MM-DDTHH:mm - YYYY-MM-DDTHH:mm:ss - YYYY-MM-DDTHH:mm:ssZ - YYYY-MM-DDTHH:mm:ss.SSSZ |
|**expirationDate** | **OffsetDateTime** | Expiration date defines when the code expires. Expiration timestamp is presented in the ISO 8601 format.  Voucher is *inactive after* this date. Allowed date formats are: - YYYY-MM-DD - YYYY-MM-DDTHH - YYYY-MM-DDTHH:mm - YYYY-MM-DDTHH:mm:ss - YYYY-MM-DDTHH:mm:ssZ - YYYY-MM-DDTHH:mm:ss.SSSZ |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**loyaltyCard** | [**SimpleLoyaltyCard**](SimpleLoyaltyCard.md) |  |
|**gift** | [**Gift**](Gift.md) |  |
|**discount** | [**Discount**](Discount.md) |  |



## Enum: List&lt;ValidityDayOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |




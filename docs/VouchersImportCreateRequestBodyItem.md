

# VouchersImportCreateRequestBodyItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**campaign** | **String** | Identifies the voucher&#39;s parent campaign using a unique campaign name. |
|**campaignId** | **String** | Identifies the voucher&#39;s parent campaign using a unique campaign ID assigned by the Voucherify API. |
|**category** | **String** | The name of the tag defining the category that this voucher belongs to. Useful when listing vouchers using the &lt;!-- [List Vouchers](OpenAPI.json/paths/~1vouchers/get) --&gt;[List Vouchers](ref:list-vouchers) endpoint. |
|**categoryId** | **String** | The unique ID assigned by Voucherify of the tag defining the category that this voucher belongs to. Useful when listing vouchers using the &lt;!-- [List Vouchers](OpenAPI.json/paths/~1vouchers/get) --&gt;[List Vouchers](ref:list-vouchers) endpoint. |
|**startDate** | **OffsetDateTime** | Start date defines when the code starts to be active. Activation timestamp is presented in the ISO 8601 format. Voucher is *inactive before* this date. |
|**expirationDate** | **OffsetDateTime** | Expiration date defines when the code expires. Expiration timestamp is presented in the ISO 8601 format.  Voucher is *inactive after* this date. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**metadata** | **Object** |  |
|**validationRules** | **List&lt;String&gt;** | Array containing the ID of the validation rule associated with the voucher. |
|**redemption** | [**VouchersImportCreateRequestBodyItemRedemption**](VouchersImportCreateRequestBodyItemRedemption.md) |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |
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
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |




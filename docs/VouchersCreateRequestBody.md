

# VouchersCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Code that identifies a voucher. The pattern can use all the letters of the English alphabet, Arabic numerals, and special characters. Pass this attribute in the request body to create a distinct code. Otherwise, either use the &#x60;code_config&#x60; object to set the rules that the Voucherify API will use to create a random code, or don&#39;t pass any code and Voucherify will generate a random code. |
|**campaign** | **String** | Identifies the voucher&#39;s parent campaign using a unique campaign name. |
|**campaignId** | **String** | Identifies the voucher&#39;s parent campaign using a unique campaign ID assigned by the Voucherify API. |
|**category** | **String** | The name of the category that this voucher belongs to. Useful when listing vouchers with the [List Vouchers](ref:list-vouchers) endpoint. |
|**categoryId** | **String** | Unique identifier assigned by Voucherify to the name of the category that this voucher belongs to. Useful when listing vouchers with the [List Vouchers](ref:list-vouchers) endpoint. |
|**startDate** | **OffsetDateTime** | Start date defines when the code starts to be active. Activation timestamp is presented in the ISO 8601 format. Voucher is *inactive before* this date. |
|**expirationDate** | **OffsetDateTime** | Expiration date defines when the code expires. Expiration timestamp is presented in the ISO 8601 format.  Voucher is *inactive after* this date. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |
|**validationRules** | **List&lt;String&gt;** | Array containing the ID of the validation rule associated with the voucher. |
|**redemption** | [**VouchersCreateRequestBodyRedemption**](VouchersCreateRequestBodyRedemption.md) |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**loyaltyCard** | [**SimpleLoyaltyCard**](SimpleLoyaltyCard.md) |  |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |
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




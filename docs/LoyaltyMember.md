

# LoyaltyMember

This is an object representing a loyalty member.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Assigned by the Voucherify API, identifies the voucher. |
|**code** | **String** | A code that identifies a voucher. Pattern can use all letters of the English alphabet, Arabic numerals, and special characters. |
|**campaign** | **String** | A unique campaign name, identifies the voucher&#39;s parent campaign. |
|**campaignId** | **String** | Assigned by the Voucherify API, identifies the voucher&#39;s parent campaign. |
|**category** | **String** | Tag defining the category that this voucher belongs to. |
|**categoryId** | **String** | Unique category ID assigned by Voucherify. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines the type of the voucher.  |
|**discount** | **Object** |  |
|**gift** | **Object** |  |
|**loyaltyCard** | [**LoyaltyMemberLoyaltyCard**](LoyaltyMemberLoyaltyCard.md) |  |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the code expires in ISO 8601 format.  Voucher is *inactive after* this date. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**active** | **Boolean** | A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |
|**assets** | [**VoucherAssets**](VoucherAssets.md) |  |
|**isReferralCode** | **Boolean** | This is always false for loyalty members. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was last updated in ISO 8601 format. |
|**holderId** | **String** | Unique identifier of the customer who owns the voucher. |
|**_object** | **String** | The type of the object represented by JSON. Default is &#x60;voucher&#x60;. |
|**publish** | [**LoyaltyMemberPublish**](LoyaltyMemberPublish.md) |  |
|**redemption** | [**LoyaltyMemberRedemption**](LoyaltyMemberRedemption.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



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




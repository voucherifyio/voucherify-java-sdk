

# MemberActivityDataRedemptionVoucher


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** |  |
|**code** | **String** |  |
|**gift** | [**MemberActivityDataRedemptionVoucherGift**](MemberActivityDataRedemptionVoucherGift.md) |  |
|**discount** | [**Discount**](Discount.md) |  |
|**loyaltyCard** | [**MemberActivityDataRedemptionVoucherLoyaltyCard**](MemberActivityDataRedemptionVoucherLoyaltyCard.md) |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**campaign** | **String** |  |
|**campaignId** | **String** |  |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |
|**holderId** | **String** | Unique customer identifier of the redeemable holder. It equals to the customer ID assigned by Voucherify. |
|**referrerId** | **String** |  |
|**categoryId** | **String** |  |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |
|**active** | **Boolean** | Shows whether the voucher is on or off. &#x60;true&#x60; indicates an *active* voucher and &#x60;false&#x60; indicates an *inactive* voucher. and A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher |
|**createdAt** | **String** |  |
|**updatedAt** | **String** |  |
|**redemption** | [**MemberActivityDataRedemptionVoucherRedemption**](MemberActivityDataRedemptionVoucherRedemption.md) |  |
|**startDate** | **String** |  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the code expires in ISO 8601 format.  Voucher is *inactive after* this date. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a voucher. The metadata object stores all custom attributes assigned to the voucher. and The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format. |
|**_object** | **String** |  |
|**category** | **String** | Tag defining the category that this voucher belongs to. Useful when listing vouchers using the List Vouchers endpoint. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**additionalInfo** | **String** | An optional field to keep any extra textual information about the code such as a code description and details. |
|**assets** | [**VoucherAssets**](VoucherAssets.md) |  |
|**publish** | [**MemberActivityDataRedemptionVoucherPublish**](MemberActivityDataRedemptionVoucherPublish.md) |  |
|**validationRulesAssignments** | [**ValidationRulesAssignmentsList**](ValidationRulesAssignmentsList.md) |  |
|**holder** | [**SimpleCustomer**](SimpleCustomer.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |



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




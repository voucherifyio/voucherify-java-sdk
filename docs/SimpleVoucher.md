

# SimpleVoucher

Simplified voucher data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | A unique identifier that represents the voucher assigned by Voucherify. |
|**code** | **String** | Voucher code. |
|**gift** | [**Gift**](Gift.md) |  |
|**discount** | [**Discount**](Discount.md) |  |
|**loyaltyCard** | [**SimpleVoucherLoyaltyCard**](SimpleVoucherLoyaltyCard.md) |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the voucher. |
|**campaign** | **String** | Campaign name. |
|**campaignId** | **String** | Campaign unique ID. |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |
|**holderId** | **String** | Unique customer ID of the campaign owner. |
|**referrerId** | **String** | Unique identifier of the referrer assigned by Voucherify. |
|**categoryId** | **String** | Unique identifier of the category that this voucher belongs to. |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |
|**active** | **Boolean** | Shows whether the voucher is on or off. &#x60;true&#x60; indicates an *active* voucher and &#x60;false&#x60; indicates an *inactive* voucher. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the order was created. Timestamp is presented in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the voucher was updated in the ISO 8601 format. |
|**redemption** | [**SimpleVoucherRedemption**](SimpleVoucherRedemption.md) |  |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is *inactive before* this date. |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the code expires in ISO 8601 format.  Voucher is *inactive after* this date. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a voucher. The metadata object stores all custom attributes assigned to the voucher. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |




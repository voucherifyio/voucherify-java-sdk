

# CustomerRedeemable

Single customer's redeemable

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique redeemable holder identifier. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redeemable was assigned. The value is shown in the ISO 8601 format. |
|**redeemableId** | **String** | Identifier of the redeemable item. |
|**redeemableObject** | **String** | Type of the redeemable. |
|**customerId** | **String** | Identifier of the customer. |
|**holderRole** | [**HolderRoleEnum**](#HolderRoleEnum) | Role of the holder. |
|**campaignId** | **String** | Unique campaign identifier, assigned by Voucherify. |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Defines the type of the campaign. |
|**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | Defines the type of the voucher. |
|**redeemable** | [**CustomerRedeemableRedeemable**](CustomerRedeemableRedeemable.md) |  |



## Enum: HolderRoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;OWNER&quot; |
| REFERRER | &quot;REFERRER&quot; |
| REFEREE | &quot;REFEREE&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_PROGRAM | &quot;LOYALTY_PROGRAM&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| REFERRAL_PROGRAM | &quot;REFERRAL_PROGRAM&quot; |
| LUCKY_DRAW | &quot;LUCKY_DRAW&quot; |



## Enum: VoucherTypeEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| LUCKY_DRAW_CODE | &quot;LUCKY_DRAW_CODE&quot; |




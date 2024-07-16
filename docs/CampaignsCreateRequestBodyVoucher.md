

# CampaignsCreateRequestBodyVoucher


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**discount** | [**Discount**](Discount.md) |  |
|**codeConfig** | [**CodeConfig**](CodeConfig.md) |  |
|**redemption** | [**CampaignsCreateRequestBodyVoucherRedemption**](CampaignsCreateRequestBodyVoucherRedemption.md) |  |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |
|**gift** | [**Gift**](Gift.md) |  |
|**loyaltyCard** | [**CampaignLoyaltyCard**](CampaignLoyaltyCard.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |




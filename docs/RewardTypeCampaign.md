

# RewardTypeCampaign

Objects stores information about the campaign related to the reward.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique campaign ID, assigned by Voucherify. |
|**balance** | **Integer** | The incremental amout to be added to the current balance on the gift card. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**type** | [**TypeEnum**](#TypeEnum) | Campaign type. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| PROMOTION | &quot;PROMOTION&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |
| REFERRAL_PROGRAM | &quot;REFERRAL_PROGRAM&quot; |
| LOYALTY_PROGRAM | &quot;LOYALTY_PROGRAM&quot; |






# VoucherBaseGift

Object representing gift parameters. Child attributes are present only if `type` is `GIFT_VOUCHER`. Defaults to `null`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **Integer** | Total gift card income over the lifetime of the card. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**balance** | **Integer** | Available funds. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**effect** | [**EffectEnum**](#EffectEnum) | Defines how the credits are applied to the customer&#39;s order. |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;APPLY_TO_ORDER&quot; |
| ITEMS | &quot;APPLY_TO_ITEMS&quot; |




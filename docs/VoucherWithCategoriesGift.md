

# VoucherWithCategoriesGift

Object representing gift parameters. Child attributes are present only if `type` is `GIFT_VOUCHER`. Defaults to `null`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **Integer** | Total gift card income over the lifetime of the card. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**subtractedAmount** | **Integer** | Total amount of subtracted credits over the gift card lifetime. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**balance** | **Integer** | Available funds. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**effect** | [**EffectEnum**](#EffectEnum) | Defines how the credits are applied to the customer&#39;s order. |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;APPLY_TO_ORDER&quot; |
| ITEMS | &quot;APPLY_TO_ITEMS&quot; |






# Gift

Contains current gift card balance information.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **BigDecimal** | Total gift card income over the lifetime of the card. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**subtractedAmount** | **Integer** | Total amount of subtracted credits over the gift card lifetime. |
|**balance** | **BigDecimal** | Available funds. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. &#x60;balance&#x60; &#x3D; &#x60;amount&#x60; - &#x60;subtracted_amount&#x60; - &#x60;redemption.redeemed_amount&#x60;. |
|**effect** | [**EffectEnum**](#EffectEnum) | Defines how the credits are applied to the customer&#39;s order. |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;APPLY_TO_ORDER&quot; |
| ITEMS | &quot;APPLY_TO_ITEMS&quot; |




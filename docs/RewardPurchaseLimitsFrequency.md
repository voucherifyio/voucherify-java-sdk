

# RewardPurchaseLimitsFrequency

Purchase frequency limits for a reward.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Frequency limit type. &#x60;NO_LIMIT&#x60; - unlimited purchases. &#x60;LIMITED&#x60; - limited by the &#x60;limits&#x60; array. |
|**limits** | [**List&lt;RewardPurchaseLimitsFrequencyLimit&gt;**](RewardPurchaseLimitsFrequencyLimit.md) | Frequency limit definitions. Empty array when &#x60;type&#x60; is &#x60;NO_LIMIT&#x60;; one entry when &#x60;type&#x60; is &#x60;LIMITED&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_LIMIT | &quot;NO_LIMIT&quot; |
| LIMITED | &quot;LIMITED&quot; |




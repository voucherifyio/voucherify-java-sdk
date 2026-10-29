

# LoyaltiesExamineRewardsExamineResponseBodyRewardDetail

Reward detail.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique reward ID (&#x60;lrew_...&#x60;). |
|**name** | **String** | Reward name. |
|**type** | [**TypeEnum**](#TypeEnum) | Reward type. |
|**metadata** | **Map&lt;String, Object&gt;** | Reward metadata (empty object when unset). |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;reward&#x60;. |
|**purchaseLimits** | [**RewardPurchaseLimits**](RewardPurchaseLimits.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MATERIAL | &quot;MATERIAL&quot; |
| DIGITAL | &quot;DIGITAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD | &quot;reward&quot; |




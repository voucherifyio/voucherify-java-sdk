

# Reward


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique reward ID, assigned by Voucherify. |
|**name** | **String** | Reward name. |
|**stock** | **Integer** | Configurable for **material rewards**. The number of units of the product that you want to share as reward. |
|**redeemed** | **Integer** | Defines the number of already invoked (successful) reward redemptions.  |
|**attributes** | [**RewardAttributes**](RewardAttributes.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the reward. A set of key/value pairs that you can attach to a reward object. It can be useful for storing additional information about the reward in a structured format. |
|**type** | [**TypeEnum**](#TypeEnum) | Reward type. |
|**parameters** | [**RewardType**](RewardType.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the reward. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;CAMPAIGN&quot; |
| COIN | &quot;COIN&quot; |
| MATERIAL | &quot;MATERIAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD | &quot;reward&quot; |




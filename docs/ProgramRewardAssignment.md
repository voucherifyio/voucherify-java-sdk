

# ProgramRewardAssignment

A reward assigned to a program, with stock configuration and redemption counter.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**rewardId** | **String** | Unique reward identifier. |
|**stock** | [**ProgramRewardAssignmentStock**](ProgramRewardAssignmentStock.md) |  |
|**redeemed** | **BigDecimal** | Number of times the reward has been redeemed within the program. Defaults to 0. |
|**createdAt** | **OffsetDateTime** | Assignment creation timestamp (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Last update timestamp (ISO 8601), or &#x60;null&#x60; when never updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_reward&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_REWARD | &quot;program_reward&quot; |




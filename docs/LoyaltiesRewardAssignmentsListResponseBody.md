

# LoyaltiesRewardAssignmentsListResponseBody

Response body schema for **GET** `v1/loyalties/{campaignId}/reward-assignments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about loyalty reward assignments in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of reward assignment objects. |
|**data** | [**List&lt;RewardAssignment&gt;**](RewardAssignment.md) | Contains array of reward assignment objects. |
|**total** | **Integer** | Total number of reward assignment objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




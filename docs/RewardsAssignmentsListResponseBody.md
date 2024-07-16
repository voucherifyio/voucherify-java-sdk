

# RewardsAssignmentsListResponseBody

Response body schema for **GET** `/rewards/{rewardID}/assignments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about reward assignments in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of reward assignments. |
|**data** | [**List&lt;RewardAssignment&gt;**](RewardAssignment.md) |  |
|**total** | **Integer** | Total number of reward assignments. |




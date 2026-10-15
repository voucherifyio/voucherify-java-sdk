

# V2LoyaltiesProgramsRewardsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/rewards`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |
|**data** | [**List&lt;ProgramRewardAssignment&gt;**](ProgramRewardAssignment.md) | Reward assignments on the current page. |
|**cursor** | [**ProgramListCursor**](ProgramListCursor.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




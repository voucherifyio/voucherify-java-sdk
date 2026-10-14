

# V2LoyaltiesProgramsEarningRulesListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/earning-rules`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |
|**data** | [**List&lt;ProgramEarningRuleAssignment&gt;**](ProgramEarningRuleAssignment.md) | Earning rule assignments on the current page. |
|**cursor** | [**ProgramListCursor**](ProgramListCursor.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




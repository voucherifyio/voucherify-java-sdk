

# V2LoyaltiesProgramsTierStructuresListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/tier-structures`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. |
|**data** | [**List&lt;ProgramTierStructureAssignment&gt;**](ProgramTierStructureAssignment.md) | Tier structure assignments on the current page. |
|**cursor** | [**ProgramListCursor**](ProgramListCursor.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




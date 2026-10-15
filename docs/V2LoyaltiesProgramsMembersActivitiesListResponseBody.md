

# V2LoyaltiesProgramsMembersActivitiesListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/activities`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;VLMemberActivity&gt;**](VLMemberActivity.md) | Member activities on the current page. |
|**cursor** | [**ListCursor**](ListCursor.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




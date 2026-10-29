

# V2LoyaltiesProgramsMembersListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;Member&gt;**](Member.md) | Members on the current page (without the &#x60;cards&#x60; array). |
|**cursor** | [**ListCursor**](ListCursor.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




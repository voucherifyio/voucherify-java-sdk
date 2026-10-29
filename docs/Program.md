

# Program

A loyalty program.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique program identifier. |
|**name** | **String** | Program name. |
|**status** | [**StatusEnum**](#StatusEnum) | Program status. |
|**startDate** | **OffsetDateTime** | Program validity start date (ISO 8601), or &#x60;null&#x60; when not set. |
|**endDate** | **OffsetDateTime** | Program validity end date (ISO 8601), or &#x60;null&#x60; when not set. |
|**validityHours** | [**ProgramValidityHours**](ProgramValidityHours.md) |  |
|**metadata** | **Object** | Arbitrary key-value metadata. Defaults to &#x60;{}&#x60;. |
|**createdAt** | **OffsetDateTime** | Creation timestamp (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Last update timestamp (ISO 8601), or &#x60;null&#x60; when never updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM | &quot;program&quot; |




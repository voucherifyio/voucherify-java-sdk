

# SegmentsCreateResponseBody

Response body schema for **POST** `v1/segments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique segment ID. |
|**name** | **String** | Segment name. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the segment was created. The value is shown in the ISO 8601 format. |
|**type** | [**TypeEnum**](#TypeEnum) | Describes whether the segment is dynamic (customers come in and leave based on set criteria) or static (manually selected customers). |
|**filter** | **Object** | Defines a set of criteria for an &#x60;auto-update&#x60; segment type.   |
|**initialSyncStatus** | [**InitialSyncStatusEnum**](#InitialSyncStatusEnum) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the customer segment. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;auto-update&quot; |
| STATIC | &quot;static&quot; |
| PASSIVE | &quot;passive&quot; |



## Enum: InitialSyncStatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SEGMENT | &quot;segment&quot; |




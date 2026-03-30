

# SegmentsGetResponseBody

Response body schema for **GET** `v1/v1/segments/{segmentId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique segment ID. |
|**name** | **String** | Segment name. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the segment was created. The value is shown in the ISO 8601 format. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the segment is: - Active (&#x60;auto-update&#x60;): customers enter and leave the segment based on the defined filters and the &#x60;customer.segment.entered&#x60; and &#x60;customer.segment.left&#x60; events are triggered, - Passive (&#x60;passive&#x60;): customers enter and leave the segment based on the defined filters, but the &#x60;customer.segment.entered&#x60; and &#x60;customer.segment.left&#x60; events are not triggered, - Static (&#x60;static&#x60;): manually selected customers. |
|**filter** | **Object** | Defines a set of criteria for an &#x60;auto-update&#x60; or &#x60;passive&#x60; segment type. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the customer segment. |
|**initialSyncStatus** | [**InitialSyncStatusEnum**](#InitialSyncStatusEnum) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;auto-update&quot; |
| PASSIVE | &quot;passive&quot; |
| STATIC | &quot;static&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SEGMENT | &quot;segment&quot; |



## Enum: InitialSyncStatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |




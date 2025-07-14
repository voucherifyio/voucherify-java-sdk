

# SimpleEvent

Simplified event data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier assigned by Voucherify that will be linked to the this event. |
|**type** | **String** | Type of the triggering event. |
|**category** | [**CategoryEnum**](#CategoryEnum) | Type of the event. |
|**entityId** | **String** | ID of the entity that initiated the event. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the event was created in the ISO 8601 format. |
|**groupId** | **String** | Unique identifier of the request that triggered the event. |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| EFFECT | &quot;EFFECT&quot; |
| ACTION | &quot;ACTION&quot; |




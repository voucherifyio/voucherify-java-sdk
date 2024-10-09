

# ManagementProjectsCustomEventSchemasGetResponseBody

Response body schema for **GET** `v1/management/v1/projects/{projectId}/custom-event-schema/{customEventSchemaId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the custom event schema. |
|**name** | **String** | User-defined name of the custom event. This is also shown in **Project Settings** &gt; **Event Schema** in the Voucherify Dashboard. |
|**schema** | [**ManagementProjectsCustomEventSchemasGetResponseBodySchema**](ManagementProjectsCustomEventSchemasGetResponseBodySchema.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event schema was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event schema was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOM_EVENT_SCHEMA | &quot;custom-event-schema&quot; |




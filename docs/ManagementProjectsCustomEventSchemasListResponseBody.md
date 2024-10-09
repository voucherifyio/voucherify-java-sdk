

# ManagementProjectsCustomEventSchemasListResponseBody

Object containing a list of custom event schemas.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the custom event schemas in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of custom event schema objects. |
|**data** | [**List&lt;ManagementProjectsCustomEventSchema&gt;**](ManagementProjectsCustomEventSchema.md) | Array of custom event schema objects. |
|**total** | **Integer** | The total number of custom event schema objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




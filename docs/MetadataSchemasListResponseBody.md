

# MetadataSchemasListResponseBody

Object containing a list of metadata schemas.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the metadata schemas in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of metadata schema objects. |
|**schemas** | [**List&lt;MetadataSchemaDeprecated&gt;**](MetadataSchemaDeprecated.md) | Array of metadata schema objects. The metadata schemas are listed by related object properties. |
|**total** | **Integer** | The total number of metadata schema objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| SCHEMAS | &quot;schemas&quot; |




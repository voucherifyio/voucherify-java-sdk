

# ExportsListResponseBody

Response body schema for **GET** `/exports`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about exports. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of exports. |
|**exports** | [**List&lt;Export&gt;**](Export.md) | An array of export objects. |
|**total** | **Integer** | Total number of exports. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| EXPORTS | &quot;exports&quot; |




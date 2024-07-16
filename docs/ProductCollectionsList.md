

# ProductCollectionsList

Schema representing list of product collections

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about product collections. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the JSON property that contains the array of product collections. |
|**data** | [**List&lt;ProductCollectionsItem&gt;**](ProductCollectionsItem.md) | A dictionary that contains an array of product collections and their details. |
|**total** | **Integer** | Total number of product collections. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




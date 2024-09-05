

# CategoriesListResponseBody

Response body schema for **GET** `v1/categories`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about categories in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of category objects. |
|**data** | [**List&lt;Category&gt;**](Category.md) |  |
|**total** | **Integer** | Total number of categories. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




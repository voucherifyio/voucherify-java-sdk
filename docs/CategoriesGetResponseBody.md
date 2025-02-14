

# CategoriesGetResponseBody

Response body schema for **GET** `v1/categories/{categoryId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique category ID assigned by Voucherify. |
|**name** | **String** | Category name. |
|**hierarchy** | **Integer** | Category hierarchy. Categories with lower hierarchy are processed before categories with higher hierarchy value. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the category. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was updated. The value is shown in the ISO 8601 format. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CATEGORY | &quot;category&quot; |




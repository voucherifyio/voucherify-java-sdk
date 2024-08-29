

# CategoriesGetResponseBody

Response body schema for **GET** `v1/categories/{categoryId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique category ID assigned by Voucherify. |
|**name** | **String** | Category name. |
|**hierarchy** | **Integer** | Category hierarchy. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the category. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the category was updated. The value is shown in the ISO 8601 format. |
|**stackingRulesType** | [**StackingRulesTypeEnum**](#StackingRulesTypeEnum) | The type of the stacking rule eligibility. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CATEGORY | &quot;category&quot; |



## Enum: StackingRulesTypeEnum

| Name | Value |
|---- | -----|
| JOINT | &quot;JOINT&quot; |
| EXCLUSIVE | &quot;EXCLUSIVE&quot; |




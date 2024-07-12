

# ValidationRulesListResponseBody

Response body schema for **GET** `/validation-rules`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about validation rules. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of validation rules. |
|**data** | [**List&lt;ValidationRule&gt;**](ValidationRule.md) | An array of validation rules. |
|**total** | **Integer** | Total number of validation rules in the project. |




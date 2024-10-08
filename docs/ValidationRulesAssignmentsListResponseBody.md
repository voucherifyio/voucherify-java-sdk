

# ValidationRulesAssignmentsListResponseBody

Response body for **GET** `v1/validation-rules-assignments` and **GET** `v1/validation-rules/{validationRuleId}/assignments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about validation rule assignments. |
|**dataRef** | **String** | Identifies the name of the JSON property that contains the array of validation rule assignments. |
|**data** | [**List&lt;ValidationRuleAssignment&gt;**](ValidationRuleAssignment.md) | A dictionary that contains an array of validation rule assignments. |
|**total** | **Integer** | Total number of validation rule assignments. |




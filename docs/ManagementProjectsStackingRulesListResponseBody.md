

# ManagementProjectsStackingRulesListResponseBody

Response body schema for **GET** `/management/v1/projects/{projectId}/stacking-rules`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the stacking rules in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of stacking rule objects. |
|**data** | [**List&lt;ManagementProjectsStackingRules&gt;**](ManagementProjectsStackingRules.md) | Array of only one stacking rule object. |
|**total** | **Integer** | The total number of stacking rule objects. It is always 1. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




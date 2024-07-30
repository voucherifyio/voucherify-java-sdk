

# AsyncActionsListResponseBody

Response body schema for **GET** `/async-actions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about asynchronous actions. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the JSON property that contains the array of asynchronous actions. |
|**asyncActions** | [**List&lt;AsyncActionBase&gt;**](AsyncActionBase.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| ASYNC_ACTIONS | &quot;async_actions&quot; |




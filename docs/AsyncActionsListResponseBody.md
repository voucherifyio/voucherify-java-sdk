

# AsyncActionsListResponseBody

Response body schema for **GET** `v1/async-actions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about asynchronous actions. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the JSON property that contains the array of asynchronous actions. |
|**asyncActions** | [**List&lt;AsyncActionBase&gt;**](AsyncActionBase.md) |  |
|**hasMore** | **Boolean** | As query results are always limited by parameters, the &#x60;has_more&#x60; flag indicates if there are more records available. This lets you know if you can run another request to get more records returned in the results. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| ASYNC_ACTIONS | &quot;async_actions&quot; |




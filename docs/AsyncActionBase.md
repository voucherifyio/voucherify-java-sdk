

# AsyncActionBase

This is an object representing an asynchronous action.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Async action unique ID. |
|**type** | **String** | Type of async action. |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the async action. Informs you whether the async action has already been completed. |
|**operationStatus** | [**OperationStatusEnum**](#OperationStatusEnum) | Status of async action processing. Informs about the async action status, whether it failed, succeeded, or the status is unknown. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the async action was scheduled in ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the async action was updated. The value is shown in the ISO 8601 format. |
|**requestId** | **String** | Unique request ID. |
|**processingTime** | **Integer** | The length of time it took to process the request in milliseconds. |
|**progress** | **Integer** | % progress to completion of the asynchronous action. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the &#x60;async_action&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;DONE&quot; |
| ENQUEUED | &quot;ENQUEUED&quot; |
| FAILED | &quot;FAILED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



## Enum: OperationStatusEnum

| Name | Value |
|---- | -----|
| FAILED | &quot;FAILED&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ASYNC_ACTION | &quot;async_action&quot; |




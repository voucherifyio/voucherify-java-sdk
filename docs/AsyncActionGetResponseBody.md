

# AsyncActionGetResponseBody

Response body schema for **GET** `/async-actions/{asyncActionId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Async action unique ID. |
|**type** | **String** | Type of async action. Examples: \&quot;CAMPAIGN.VOUCHERS_IMPORT\&quot;, \&quot;CAMPAIGN.VOUCHERS_IMPORT_CSV\&quot;, \&quot;CAMPAIGN.VOUCHERS_UPDATE\&quot;, \&quot;CAMPAIGN.VOUCHERS_DELETE\&quot;, \&quot;CAMPAIGN.VOUCHERS_GENERATE\&quot;, \&quot;CAMPAIGNS.METADATA_KEY_PURGE\&quot;, \&quot;CUSTOMERS.IMPORT_CSV\&quot;, \&quot;CUSTOMERS.BULK_UPDATE\&quot;, \&quot;CUSTOMERS.METADATA_UPDATE\&quot;, \&quot;CUSTOMERS.METADATA_KEY_PURGE\&quot;, \&quot;PRODUCTS.BULK_UPDATE\&quot;, \&quot;PRODUCTS.METADATA_UPDATE\&quot;, \&quot;PRODUCTS.METADATA_KEY_PURGE\&quot;, \&quot;PRODUCTS.IMPORT_CSV\&quot;, \&quot;SKUS.IMPORT_CSV\&quot;, \&quot;VOUCHERS.IMPORT\&quot;, \&quot;VOUCHERS.IMPORT_CSV\&quot;, \&quot;VOUCHERS.BULK_UPDATE\&quot;, \&quot;VOUCHERS.METADATA_UPDATE\&quot;, \&quot;VOUCHERS.METADATA_KEY_PURGE\&quot;, \&quot;ORDERS.IMPORT\&quot;, \&quot;ORDERS.METADATA_KEY_PURGE\&quot; |
|**status** | [**StatusEnum**](#StatusEnum) | Status of async action. Informs you whether the async action has already been completed. |
|**operationStatus** | **String** | Status of async action processing. Informs about the async action status, whether it failed, succeeded, or the status is unknown. Examples: \&quot;FAILED\&quot;, \&quot;SUCCESS\&quot; |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the async action was scheduled in ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the async action was updated. The value is shown in the ISO 8601 format. |
|**requestId** | **String** | Unique request ID. |
|**processingTime** | **Integer** | The length of time it took to process the request in milliseconds. |
|**progress** | **Integer** | % progress to completion of the asynchronous action. |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about the &#x60;async_action&#x60;. |
|**result** | **Object** |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENQUEUED | &quot;ENQUEUED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |
| FAILED | &quot;FAILED&quot; |




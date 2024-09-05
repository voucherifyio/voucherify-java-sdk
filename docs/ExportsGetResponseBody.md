

# ExportsGetResponseBody

Response body schema for **GET** `v1/exports/{exportId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique export ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object being represented. This object stores information about the export. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the export was scheduled in ISO 8601 format. |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated. |
|**channel** | **String** | The channel through which the export was triggered. |
|**result** | [**ExportsGetResponseBodyResult**](ExportsGetResponseBodyResult.md) |  |
|**userId** | **String** | Identifies the specific user who initiated the export through the Voucherify Dashboard; returned when the channel value is WEBSITE. |
|**exportedObject** | [**ExportedObjectEnum**](#ExportedObjectEnum) |  |
|**parameters** | [**ExportsGetResponseBodyParameters**](ExportsGetResponseBodyParameters.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EXPORT | &quot;export&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: ExportedObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| REDEMPTION | &quot;redemption&quot; |
| CUSTOMER | &quot;customer&quot; |
| PUBLICATION | &quot;publication&quot; |
| ORDER | &quot;order&quot; |
| POINTS_EXPIRATION | &quot;points_expiration&quot; |
| VOUCHER_TRANSACTIONS | &quot;voucher_transactions&quot; |




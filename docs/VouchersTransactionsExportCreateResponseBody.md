

# VouchersTransactionsExportCreateResponseBody

Response body schema for **POST** `/vouchers/{code}/transactions/export`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique export ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object being represented. This object stores information about the &#x60;export&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the export was scheduled in ISO 8601 format. |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated. |
|**channel** | **String** | The channel through which the export was triggered. |
|**exportedObject** | [**ExportedObjectEnum**](#ExportedObjectEnum) | The type of exported object. |
|**parameters** | [**VoucherTransactionsFilters**](VoucherTransactionsFilters.md) |  |
|**result** | [**VoucherTransactionsExportResult**](VoucherTransactionsExportResult.md) |  |
|**userId** | **String** | Identifies the specific user who initiated the export through the Voucherify Dashboard; returned when the &#x60;channel&#x60; value is &#x60;WEBSITE&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EXPORT | &quot;export&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |



## Enum: ExportedObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER_TRANSACTIONS | &quot;voucher_transactions&quot; |




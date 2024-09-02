

# LoyaltiesMembersTransactionsExportCreateResponseBody

Response body schema for **POST** `v1/loyalties/members/{memberId}/transactions/export` and for **POST** `v1/loyalties/{campaignId}/members/{memberId}/transactions/export`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique export ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object being represented. This object stores information about the export. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the export was scheduled in ISO 8601 format. |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the export. Informs you whether the export has already been completed, i.e. indicates whether the file containing the exported data has been generated. |
|**channel** | **String** | The channel through which the export was triggered. |
|**result** | **Object** | Contains the URL of the CSV file. |
|**userId** | **String** | Identifies the specific user who initiated the export through the Voucherify Dashboard; returned when the channel value is WEBSITE. |
|**exportedObject** | [**ExportedObjectEnum**](#ExportedObjectEnum) | The type of object to be exported. |
|**parameters** | [**LoyaltiesMembersTransactionsExportCreateResponseBodyParameters**](LoyaltiesMembersTransactionsExportCreateResponseBodyParameters.md) |  |



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






# LoyaltiesPointsExpirationExportCreateResponseBody

This is an object representing an export of points expirations. 

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique export ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object being represented. This object stores information about the export. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the export was scheduled in ISO 8601 format. |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the export. Informs you whether the export has already been completed. |
|**channel** | [**ChannelEnum**](#ChannelEnum) | The channel through which the export was triggered. |
|**exportedObject** | [**ExportedObjectEnum**](#ExportedObjectEnum) | The type of exported object. |
|**parameters** | [**LoyaltiesPointsExpirationExportCreateResponseBodyParameters**](LoyaltiesPointsExpirationExportCreateResponseBodyParameters.md) |  |
|**result** | **Object** | Always null |
|**userId** | **String** | The user_id identifies the specific user who initiated the export through the Voucherify Dashboard; this &#x60;user_id&#x60; is returned when the channel value is &#x60;WEBSITE&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EXPORT | &quot;export&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SCHEDULED | &quot;SCHEDULED&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| WEBSITE | &quot;WEBSITE&quot; |



## Enum: ExportedObjectEnum

| Name | Value |
|---- | -----|
| POINTS_EXPIRATION | &quot;points_expiration&quot; |




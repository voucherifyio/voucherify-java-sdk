

# LocationsGetResponseBody

Response schema for listing locations using **GET** `/v1/locations/{locationId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique location ID, assigned by the Voucherify API. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about a &#x60;location&#x60;. |
|**name** | **String** | Location name. |
|**shape** | [**LocationsGetResponseBodyShape**](LocationsGetResponseBodyShape.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the location was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the location was updated. The value is shown in the ISO 8601 format. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LOCATION | &quot;location&quot; |




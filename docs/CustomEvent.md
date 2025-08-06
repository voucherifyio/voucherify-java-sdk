

# CustomEvent


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique custom event ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object represented is an &#x60;event&#x60;. |
|**type** | **String** | The event name. |
|**customer** | [**SimpleCustomerRequiredObjectType**](SimpleCustomerRequiredObjectType.md) |  |
|**referral** | [**CustomEventReferral**](CustomEventReferral.md) |  |
|**loyalty** | [**CustomEventLoyalty**](CustomEventLoyalty.md) |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer object. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the custom event was created. The value is shown in the ISO 8601 format. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |




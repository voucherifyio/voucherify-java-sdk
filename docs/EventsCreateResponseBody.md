

# EventsCreateResponseBody

Response body schema for **POST** `v1/events`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object represented is an &#x60;event&#x60;. |
|**type** | **String** | The event name. |
|**customer** | [**SimpleCustomerRequiredObjectType**](SimpleCustomerRequiredObjectType.md) |  |
|**referral** | **Object** | A &#x60;null&#x60; referral object. |
|**loyalty** | **Object** | A &#x60;null&#x60; loyalty object. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;event&quot; |




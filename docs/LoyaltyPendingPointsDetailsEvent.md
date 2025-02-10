

# LoyaltyPendingPointsDetailsEvent

Details about the event that created pending points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique event identifier, assigned by Voucherify. |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the event that triggered the creation of pending points. |
|**groupId** | **String** | Unique identifier of the request that triggered the event, assigned by Voucherify. |
|**entityId** | **String** | Unique identifier of the entity that triggered the event, assigned by Voucherify. For pending points, it is the &#x60;customer_id&#x60; of the customer who paid for the order. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the event occurred. The value is shown in the ISO 8601 format. |
|**category** | [**CategoryEnum**](#CategoryEnum) | Type of the event. |
|**eventSource** | [**EventSource**](EventSource.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_ORDER_PAID | &quot;customer.order.paid&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ACTION | &quot;ACTION&quot; |
| EFFECT | &quot;EFFECT&quot; |




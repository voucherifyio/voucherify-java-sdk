

# LoyaltiesMembersPendingPointsActivateResponseBody

Response body schema for **POST** `/loyalties/members/{memberId}/pending-points/{pendingPointsId}/activate`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | The number of pending points added to the loyalty card. |
|**total** | **Integer** | Total number of points incurred over the lifespan of the loyalty card, minus the expired points. |
|**balance** | **Integer** | The current number of loyalty points after the pending points have been added. |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the voucher being modified. For pending points, it is always &#x60;loyalty_card&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is &#x60;balance&#x60;. |
|**relatedObject** | [**LoyaltiesMembersPendingPointsActivateResponseBodyRelatedObject**](LoyaltiesMembersPendingPointsActivateResponseBodyRelatedObject.md) |  |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The type of the operation being performed. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;loyalty_card&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |




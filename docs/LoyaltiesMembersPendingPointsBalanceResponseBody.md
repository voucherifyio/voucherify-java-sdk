

# LoyaltiesMembersPendingPointsBalanceResponseBody

Response body schema for **POST** `/loyalties/members/{memberId}/pending-points/{pendingPointsId}/balance`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | The number of pending points added to or subtracted from the loyalty card. |
|**total** | **Integer** | Total number of pending points currently on a loyalty card. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is &#x60;balance&#x60;. |
|**relatedObject** | [**LoyaltiesMembersPendingPointsBalanceResponseBodyRelatedObject**](LoyaltiesMembersPendingPointsBalanceResponseBodyRelatedObject.md) |  |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The type of the operation being performed. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |




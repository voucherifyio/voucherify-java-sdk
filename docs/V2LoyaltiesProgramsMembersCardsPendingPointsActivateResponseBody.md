

# V2LoyaltiesProgramsMembersCardsPendingPointsActivateResponseBody

Response body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points/{bucketId}/activate`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**transaction** | [**CardTransaction**](CardTransaction.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Result status. Always &#x60;TRANSACTION_CREATED&#x60;. |
|**message** | [**MessageEnum**](#MessageEnum) | Human-readable result message - \&quot;Points activation transaction created\&quot;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| TRANSACTION_CREATED | &quot;TRANSACTION_CREATED&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| POINTS_ACTIVATION_TRANSACTION_CREATED | &quot;Points activation transaction created&quot; |




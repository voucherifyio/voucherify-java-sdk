

# V2LoyaltiesProgramsMembersCardsPointsAdjustResponseBody

Response body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**transaction** | [**CardTransaction**](CardTransaction.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | &#x60;TRANSACTION_CREATED&#x60; when a transaction was created, &#x60;NO_CHANGE&#x60; when the requested points amount was zero. |
|**message** | [**MessageEnum**](#MessageEnum) | Human-readable result message: - \&quot;Points addition transaction created\&quot;, - \&quot;Points subtraction transaction created\&quot;, - \&quot;Provided amount is zero, transaction was not created\&quot;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| TRANSACTION_CREATED | &quot;TRANSACTION_CREATED&quot; |
| NO_CHANGE | &quot;NO_CHANGE&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| POINTS_ADDITION_TRANSACTION_CREATED | &quot;Points addition transaction created&quot; |
| POINTS_SUBTRACTION_TRANSACTION_CREATED | &quot;Points subtraction transaction created&quot; |
| PROVIDED_AMOUNT_IS_ZERO_TRANSACTION_WAS_NOT_CREATED | &quot;Provided amount is zero, transaction was not created&quot; |




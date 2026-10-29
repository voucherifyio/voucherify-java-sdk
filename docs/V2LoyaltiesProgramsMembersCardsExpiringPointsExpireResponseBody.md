

# V2LoyaltiesProgramsMembersCardsExpiringPointsExpireResponseBody

Response body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/expiring-points/{bucketId}/expire`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**transaction** | [**CardTransaction**](CardTransaction.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Result status. The API endpoint returns &#x60;TRANSACTION_CREATED&#x60;. |
|**message** | [**MessageEnum**](#MessageEnum) | Human-readable result message - \&quot;Points expiration transaction created\&quot;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| TRANSACTION_CREATED | &quot;TRANSACTION_CREATED&quot; |



## Enum: MessageEnum

| Name | Value |
|---- | -----|
| POINTS_EXPIRATION_TRANSACTION_CREATED | &quot;Points expiration transaction created&quot; |






# V2LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody

Request body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/orders/payments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardId** | **String** | Unique identifier of the member&#39;s loyalty card to spend points from (format &#x60;lcrd_...&#x60;). |
|**order** | [**OrderPaymentOrder**](OrderPaymentOrder.md) |  |
|**paymentLimit** | [**LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit**](LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBodyLimit.md) |  |
|**mode** | [**ModeEnum**](#ModeEnum) | Payment mode. &#x60;TRANSACTION&#x60; creates a &#x60;PENDING&#x60; order transaction processed asynchronously (HTTP &#x60;202&#x60;). &#x60;DRY_RUN&#x60; only simulates the payment and returns the calculation result (HTTP &#x60;200&#x60;); no transaction is created. Defaults to &#x60;TRANSACTION&#x60; when omitted or &#x60;null&#x60;. |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;TRANSACTION&quot; |
| DRY_RUN | &quot;DRY_RUN&quot; |




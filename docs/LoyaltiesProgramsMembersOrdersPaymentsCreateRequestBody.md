

# LoyaltiesProgramsMembersOrdersPaymentsCreateRequestBody

Request body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/orders/payments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardId** | **String** | Unique identifier of the member&#39;s loyalty card to spend points from (format &#x60;lcrd_...&#x60;). |
|**order** | [**OrderPaymentOrder**](OrderPaymentOrder.md) |  |
|**paymentLimit** | **Object** |  |
|**mode** | **Object** |  |




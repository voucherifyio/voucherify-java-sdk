

# LoyaltiesProgramsMembersOrdersPaymentsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/orders/payments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;OrderPaymentTransaction&gt;**](OrderPaymentTransaction.md) | Order payment transactions. |
|**cursor** | **Object** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




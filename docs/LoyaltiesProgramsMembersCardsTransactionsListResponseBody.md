

# LoyaltiesProgramsMembersCardsTransactionsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;CardTransaction&gt;**](CardTransaction.md) | Card transactions on the current page. |
|**cursor** | **Object** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




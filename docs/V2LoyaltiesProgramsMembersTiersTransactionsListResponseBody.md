

# V2LoyaltiesProgramsMembersTiersTransactionsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/tiers/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;TierTransaction&gt;**](TierTransaction.md) | List of tier transactions. |
|**cursor** | [**ListCursor**](ListCursor.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




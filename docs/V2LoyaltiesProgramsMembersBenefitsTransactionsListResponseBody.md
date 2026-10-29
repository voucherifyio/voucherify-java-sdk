

# V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/benefits/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;BenefitTransaction&gt;**](BenefitTransaction.md) | List of benefit transactions. |
|**cursor** | [**V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBodyCursor**](V2LoyaltiesProgramsMembersBenefitsTransactionsListResponseBodyCursor.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




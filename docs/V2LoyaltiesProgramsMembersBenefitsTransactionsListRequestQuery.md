

# V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/benefits/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins the field filters. Allowed values are &#x60;AND&#x60; and &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**benefitId** | [**LoyaltiesProgramsMembersBenefitsTransactionsListRequestQueryBenefitId**](LoyaltiesProgramsMembersBenefitsTransactionsListRequestQueryBenefitId.md) |  |
|**createdAt** | [**TransactionFilterDateConditions**](TransactionFilterDateConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |




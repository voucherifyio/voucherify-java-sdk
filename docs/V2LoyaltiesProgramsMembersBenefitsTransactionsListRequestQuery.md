

# V2LoyaltiesProgramsMembersBenefitsTransactionsListRequestQuery

Request query schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/benefits/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Defines the logical junction between field filters. Allowed values: &#x60;AND&#x60;, &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**benefitId** | [**LoyaltiesProgramsMembersBenefitsTransactionsListRequestQueryBenefitId**](LoyaltiesProgramsMembersBenefitsTransactionsListRequestQueryBenefitId.md) |  |
|**createdAt** | [**TransactionFilterDateConditions**](TransactionFilterDateConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |




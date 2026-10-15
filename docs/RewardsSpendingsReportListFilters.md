

# RewardsSpendingsReportListFilters

Filters for program rewards spendings reports.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**junction** | [**JunctionEnum**](#JunctionEnum) | Joins the field filters. Allowed values are &#x60;AND&#x60; and &#x60;OR&#x60;. Defaults to &#x60;AND&#x60;. |
|**rewardId** | [**RewardsReportFilterRewardIdConditions**](RewardsReportFilterRewardIdConditions.md) |  |
|**cardDefinitionId** | [**ReportCardDefinitionIdFilterConditions**](ReportCardDefinitionIdFilterConditions.md) |  |
|**costId** | [**RewardsSpendingsReportFilterCostIdConditions**](RewardsSpendingsReportFilterCostIdConditions.md) |  |
|**spendingId** | [**RewardsSpendingsReportFilterSpendingIdConditions**](RewardsSpendingsReportFilterSpendingIdConditions.md) |  |



## Enum: JunctionEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |






# EarningRulePendingPoints

Defines the configuration for pending points. Pending points can be used only with the `order.paid` event.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**periodType** | [**PeriodTypeEnum**](#PeriodTypeEnum) | Defines the type of the period during which the points are in the pending state. Currently, only &#x60;DAY&#x60; value is accepted. |
|**periodValue** | **Integer** | Defines for how long the points are in the pending state. The minimum value is 1, maximum is 90. |



## Enum: PeriodTypeEnum

| Name | Value |
|---- | -----|
| DAY | &quot;DAY&quot; |




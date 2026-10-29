

# LoyaltyV2ActivityEarningRuleEarningLimitsGlobal

Global (per member, across this rule) earning limits. With `NO_LIMIT`, `limits` is an empty array. With `LIMITED`, `limits` contains exactly one `TIME_BASED` limit. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Whether global earning limits apply. |
|**limits** | **List&lt;Object&gt;** | Earning limits (at most one). Empty array when &#x60;type&#x60; is &#x60;NO_LIMIT&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_LIMIT | &quot;NO_LIMIT&quot; |
| LIMITED | &quot;LIMITED&quot; |




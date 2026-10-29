

# EarningRuleTriggerLimitsFrequency

Frequency limit for triggers per member. With `NO_LIMIT`, `limits` must be null or an empty array. With `LIMITED`, `limits` is required and must contain exactly one limit. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Frequency limit type. |
|**limits** | **List&lt;Object&gt;** | Frequency limits (at most one). Can be &#x60;null&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NO_LIMIT | &quot;NO_LIMIT&quot; |
| LIMITED | &quot;LIMITED&quot; |




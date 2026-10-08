

# LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEvent

Context for examining `customer.custom_event` earning rules. With `type` = `ALL`, `all` is required and `specific` must be `null`/absent. With `SPECIFIC`, `specific` is required and `all` must be null/absent. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Whether to examine all custom events or one specific event. |
|**all** | [**LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEventAll**](LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEventAll.md) |  |
|**specific** | [**LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEventSpecific**](LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEventSpecific.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| SPECIFIC | &quot;SPECIFIC&quot; |




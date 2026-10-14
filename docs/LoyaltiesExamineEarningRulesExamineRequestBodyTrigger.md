

# LoyaltiesExamineEarningRulesExamineRequestBodyTrigger

Which trigger events to examine. With `ALL`, all trigger events are examined and `specific` must be `null`/absent. With `SPECIFIC`, `specific` is required. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Trigger examination mode. |
|**specific** | [**LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific**](LoyaltiesExamineEarningRulesExamineRequestBodyTriggerSpecific.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| SPECIFIC | &quot;SPECIFIC&quot; |




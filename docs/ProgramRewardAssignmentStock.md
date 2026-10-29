

# ProgramRewardAssignmentStock

Reward stock configuration. When `type` is `UNLIMITED`, `limited` must not be provided. When `type` is `LIMITED`, `limited` is required. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Stock type. |
|**limited** | [**ProgramRewardAssignmentStockLimited**](ProgramRewardAssignmentStockLimited.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNLIMITED | &quot;UNLIMITED&quot; |
| LIMITED | &quot;LIMITED&quot; |




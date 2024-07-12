

# ValidationRuleAssignment

This is an object representing a validation rule assignment.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Validation rule assignment ID. |
|**ruleId** | **String** | Validation rule ID. |
|**relatedObjectId** | **String** | The resource ID to which the validation rule was assigned. |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | The type of resource to which the validation rule was assigned. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the validation rule assignment was created. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the ID. |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| EARNING_RULE | &quot;earning_rule&quot; |
| REWARD_ASSIGNMENT | &quot;reward_assignment&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| DISTRIBUTION | &quot;distribution&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VALIDATION_RULES_ASSIGNMENT | &quot;validation_rules_assignment&quot; |




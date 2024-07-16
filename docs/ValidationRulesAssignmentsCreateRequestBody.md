

# ValidationRulesAssignmentsCreateRequestBody

Request body schema for **POST** `/validation-rules/{validationRuleId}/assignments`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**relatedObjectType** | [**RelatedObjectTypeEnum**](#RelatedObjectTypeEnum) | Defines the related object, e.g. &#x60;voucher&#x60;. |
|**relatedObjectId** | **String** | Unique related object ID assigned by Voucherify, e.g. &#x60;v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno&#x60; for a voucher. |



## Enum: RelatedObjectTypeEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| EARNING_RULE | &quot;earning_rule&quot; |
| DISTRIBUTION | &quot;distribution&quot; |
| REWARD_ASSIGNMENT | &quot;reward_assignment&quot; |




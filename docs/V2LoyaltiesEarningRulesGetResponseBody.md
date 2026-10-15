

# V2LoyaltiesEarningRulesGetResponseBody

Response body schema for **GET** `/v2/loyalties/earning-rules/{earningRuleId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Earning rule ID (&#x60;lern_...&#x60;). |
|**name** | **String** | Earning rule name. |
|**status** | [**StatusEnum**](#StatusEnum) | Current status. &#x60;DELETED&#x60; also exists internally but deleted rules are excluded from API reads. |
|**earnings** | [**List&lt;EarningRuleEarning&gt;**](EarningRuleEarning.md) | Earning definitions of the rule. Contains at least one earning. |
|**trigger** | [**EarningRuleTrigger**](EarningRuleTrigger.md) |  |
|**error** | [**LoyaltyV2ActivityEarningRuleError**](LoyaltyV2ActivityEarningRuleError.md) |  |
|**validityHours** | [**EarningRuleValidityHours**](EarningRuleValidityHours.md) |  |
|**startDate** | **OffsetDateTime** | Date-time from which the rule is active. Can be &#x60;null&#x60;. |
|**endDate** | **OffsetDateTime** | Date-time until which the rule is active. Can be &#x60;null&#x60;. |
|**triggerLimits** | [**V2LoyaltiesEarningRulesGetResponseBodyTriggerLimits**](V2LoyaltiesEarningRulesGetResponseBodyTriggerLimits.md) |  |
|**earningLimits** | [**LoyaltyV2ActivityEarningRuleEarningLimits**](LoyaltyV2ActivityEarningRuleEarningLimits.md) |  |
|**metadata** | **Map&lt;String, Object&gt;** | Arbitrary key-value metadata; any JSON object is accepted. |
|**createdAt** | **OffsetDateTime** | Creation timestamp (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Last update timestamp (ISO 8601). &#x60;null&#x60; when never updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;earning_rule&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EARNING_RULE | &quot;earning_rule&quot; |




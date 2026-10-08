

# MemberTierProgress

Member's tier progress on a card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**current** | **Object** |  |
|**tierStructure** | **Object** |  |
|**deferred** | [**List&lt;MemberTierProgressDeferred&gt;**](MemberTierProgressDeferred.md) | Upcoming tier assignments scheduled to start later, when the tier structure defers tier changes. The member will be assigned to the deferred tier at the start date. |
|**risks** | [**List&lt;MemberTierProgressRisk&gt;**](MemberTierProgressRisk.md) | Upcoming risks of losing or downgrading the current tier. |
|**opportunities** | [**List&lt;MemberTierProgressOpportunity&gt;**](MemberTierProgressOpportunity.md) | Opportunities to reach higher tiers. Deferred tiers are not included in this list. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;member_tier_progress&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| MEMBER_TIER_PROGRESS | &quot;member_tier_progress&quot; |




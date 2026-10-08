

# MemberTierProgressRisk

A risk of losing or downgrading the current tier.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Risk type - &#x60;TIER_DOWNGRADE&#x60; when the member would fall to a lower tier, &#x60;TIER_LEFT&#x60; when the member would leave the tier structure entirely. |
|**date** | **OffsetDateTime** | Date when the risk materializes (ISO 8601), or &#x60;null&#x60;. |
|**tier** | **Object** |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DOWNGRADE | &quot;TIER_DOWNGRADE&quot; |
| LEFT | &quot;TIER_LEFT&quot; |




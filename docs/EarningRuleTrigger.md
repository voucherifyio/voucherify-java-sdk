

# EarningRuleTrigger

Event that triggers the earning rule. Depending on `event`, either `custom_event` or `segment` is required and the other trigger contexts must be `null`/absent. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**event** | [**EventEnum**](#EventEnum) | Triggering event type. |
|**customEvent** | [**LoyaltyV2ActivityEarningRuleTriggerCustomEvent**](LoyaltyV2ActivityEarningRuleTriggerCustomEvent.md) |  |
|**segment** | [**LoyaltyV2ActivityEarningRuleTriggerSegment**](LoyaltyV2ActivityEarningRuleTriggerSegment.md) |  |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| ORDER_PAID | &quot;customer.order.paid&quot; |
| CUSTOM_EVENT | &quot;customer.custom_event&quot; |
| SEGMENT_ENTERED | &quot;customer.segment.entered&quot; |




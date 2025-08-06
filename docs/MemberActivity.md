

# MemberActivity

This is an object representing member activity.    This is a general object which presents moments from members' activity. There are all types of different events that members perform during their journey once they participate in a loyalty program. Events describe moments when the members redeem loyalty cards and earn points or rewards. The list of all types of activities is listed below.  The details describing the activity are collected in an array property named `data`. In this object, software integrators can find all further information explaining the event context.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique event ID, assigned by Voucherify. |
|**type** | [**TypeEnum**](#TypeEnum) | Event type. |
|**data** | [**MemberActivityData1**](MemberActivityData1.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the member activity occurred in ISO 8601 format. |
|**groupId** | **String** | Unique identifier of the request that caused the event. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_TIER_UPGRADED | &quot;customer.loyalty.tier.upgraded&quot; |
| LOYALTY_TIER_DOWNGRADED | &quot;customer.loyalty.tier.downgraded&quot; |
| LOYALTY_TIER_PROLONGED | &quot;customer.loyalty.tier.prolonged&quot; |
| LOYALTY_TIER_EXPIRATION_CHANGED | &quot;customer.loyalty.tier.expiration.changed&quot; |
| LOYALTY_TIER_JOINED | &quot;customer.loyalty.tier.joined&quot; |
| LOYALTY_TIER_LEFT | &quot;customer.loyalty.tier.left&quot; |
| PUBLICATION_SUCCEEDED | &quot;customer.publication.succeeded&quot; |
| PUBLICATION_FAILED | &quot;customer.publication.failed&quot; |
| REDEMPTION_FAILED | &quot;customer.redemption.failed&quot; |
| REDEMPTION_SUCCCEEDED | &quot;customer.redemption.succceeded&quot; |
| REDEMPTION_ROLLBACK_FAILED | &quot;customer.redemption.rollback.failed&quot; |
| REDEMPTION_ROLLBACK_SUCCCEEDED | &quot;customer.redemption.rollback.succceeded&quot; |
| REWARDED | &quot;customer.rewarded&quot; |
| REWARDED_LOYALTY_POINTS | &quot;customer.rewarded.loyalty_points&quot; |
| REWARD_REDEMPTIONS_CREATED | &quot;customer.reward_redemptions.created&quot; |
| REWARD_REDEMPTIONS_PENDING | &quot;customer.reward_redemptions.pending&quot; |
| REWARD_REDEMPTIONS_COMPLETED | &quot;customer.reward_redemptions.completed&quot; |
| REWARD_REDEMPTIONS_ROLLEDBACK | &quot;customer.reward_redemptions.rolledback&quot; |
| VOUCHER_DELETED | &quot;customer.voucher.deleted&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_ACTIVATED | &quot;customer.voucher.loyalty_card.pending_points.activated&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_ADDED | &quot;customer.voucher.loyalty_card.pending_points.added&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_CANCELED | &quot;customer.voucher.loyalty_card.pending_points.canceled&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_UPDATED | &quot;customer.voucher.loyalty_card.pending_points.updated&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_ADDED | &quot;customer.voucher.loyalty_card.points_added&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_TRANSFERRED | &quot;customer.voucher.loyalty_card.points_transferred&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_EXPIRED | &quot;customer.voucher.loyalty_card.points_expired&quot; |




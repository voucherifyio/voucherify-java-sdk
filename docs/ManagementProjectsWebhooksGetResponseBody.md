

# ManagementProjectsWebhooksGetResponseBody

Response body schema for **GET** `/management/v1/projects/{projectId}/webhooks/{webhookId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the webhook. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the webhook configuration was created. The value for this parameter is shown in the ISO 8601 format. |
|**targetUrl** | **String** | URL address that receives webhooks. |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Lists the events that trigger webhook sendout. |
|**active** | **Boolean** | Determines if the webhook configuration is active. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| WEBHOOK | &quot;webhook&quot; |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| BUSINESS_VALIDATION_RULE_ASSIGNMENT_CREATED | &quot;business_validation_rule.assignment.created&quot; |
| BUSINESS_VALIDATION_RULE_ASSIGNMENT_DELETED | &quot;business_validation_rule.assignment.deleted&quot; |
| BUSINESS_VALIDATION_RULE_CREATED | &quot;business_validation_rule.created&quot; |
| BUSINESS_VALIDATION_RULE_DELETED | &quot;business_validation_rule.deleted&quot; |
| BUSINESS_VALIDATION_RULE_UPDATED | &quot;business_validation_rule.updated&quot; |
| CAMPAIGN_CREATED | &quot;campaign.created&quot; |
| CAMPAIGN_DELETED | &quot;campaign.deleted&quot; |
| CAMPAIGN_DISABLED | &quot;campaign.disabled&quot; |
| CAMPAIGN_ENABLED | &quot;campaign.enabled&quot; |
| CAMPAIGN_EARNING_RULE_ASSIGNED | &quot;campaign.earning_rule.assigned&quot; |
| CAMPAIGN_EARNING_RULE_DELETED | &quot;campaign.earning_rule.deleted&quot; |
| CAMPAIGN_EARNING_RULE_DISABLED | &quot;campaign.earning_rule.disabled&quot; |
| CAMPAIGN_EARNING_RULE_ENABLED | &quot;campaign.earning_rule.enabled&quot; |
| CAMPAIGN_EARNING_RULE_UPDATED | &quot;campaign.earning_rule.updated&quot; |
| CAMPAIGN_LOYALTY_TIER_CREATED | &quot;campaign.loyalty_tier.created&quot; |
| CAMPAIGN_LOYALTY_TIER_DELETED | &quot;campaign.loyalty_tier.deleted&quot; |
| CAMPAIGN_LOYALTY_TIER_UPDATED | &quot;campaign.loyalty_tier.updated&quot; |
| CAMPAIGN_PROMOTION_STACK_CREATED | &quot;campaign.promotion_stack.created&quot; |
| CAMPAIGN_PROMOTION_STACK_UPDATED | &quot;campaign.promotion_stack.updated&quot; |
| CAMPAIGN_PROMOTION_TIER_CREATED | &quot;campaign.promotion_tier.created&quot; |
| CAMPAIGN_PROMOTION_TIER_DELETED | &quot;campaign.promotion_tier.deleted&quot; |
| CAMPAIGN_PROMOTION_TIER_DISABLED | &quot;campaign.promotion_tier.disabled&quot; |
| CAMPAIGN_PROMOTION_TIER_ENABLED | &quot;campaign.promotion_tier.enabled&quot; |
| CAMPAIGN_PROMOTION_TIER_UPDATED | &quot;campaign.promotion_tier.updated&quot; |
| CAMPAIGN_REFERRAL_TIER_CREATED | &quot;campaign.referral_tier.created&quot; |
| CAMPAIGN_REFERRAL_TIER_DELETED | &quot;campaign.referral_tier.deleted&quot; |
| CAMPAIGN_REFERRAL_TIER_UPDATED | &quot;campaign.referral_tier.updated&quot; |
| CAMPAIGN_REWARD_ASSIGNMENT_CREATED | &quot;campaign.reward.assignment.created&quot; |
| CAMPAIGN_REWARD_ASSIGNMENT_DELETED | &quot;campaign.reward.assignment.deleted&quot; |
| CAMPAIGN_REWARD_ASSIGNMENT_UPDATED | &quot;campaign.reward.assignment.updated&quot; |
| CAMPAIGN_UPDATED | &quot;campaign.updated&quot; |
| CAMPAIGN_VOUCHERS_ADED | &quot;campaign.vouchers.aded&quot; |
| CAMPAIGN_VOUCHERS_GENERATION_COMPLETED | &quot;campaign.vouchers.generation.completed&quot; |
| CAMPAIGN_VOUCHERS_GENERATION_FAILED | &quot;campaign.vouchers.generation.failed&quot; |
| CAMPAIGN_VOUCHERS_GENERATION_STARTED | &quot;campaign.vouchers.generation.started&quot; |
| CUSTOMER_CONFIRMED | &quot;customer.confirmed&quot; |
| CUSTOMER_CREATED | &quot;customer.created&quot; |
| CUSTOMER_DELETED | &quot;customer.deleted&quot; |
| CUSTOMER_REWARDED | &quot;customer.rewarded&quot; |
| CUSTOMER_REWARDED_LOYALTY_POINTS | &quot;customer.rewarded.loyalty_points&quot; |
| PUBLICATION_SUCCEEDED | &quot;publication.succeeded&quot; |
| REDEMPTION_FAILED | &quot;redemption.failed&quot; |
| REDEMPTION_ROLLBACK_FAILED | &quot;redemption.rollback.failed&quot; |
| REDEMPTION_ROLLBACK_SUCCEEDED | &quot;redemption.rollback.succeeded&quot; |
| REDEMPTION_SUCCEEDED | &quot;redemption.succeeded&quot; |
| VOUCHER_CREATED | &quot;voucher.created&quot; |
| VOUCHER_DELETED | &quot;voucher.deleted&quot; |
| VOUCHER_DISABLED | &quot;voucher.disabled&quot; |
| VOUCHER_ENABLED | &quot;voucher.enabled&quot; |
| VOUCHER_GIFT_BALANCE_ADED | &quot;voucher.gift.balance_aded&quot; |
| VOUCHER_GIFT_TRANSACTION_CREATED | &quot;voucher.gift.transaction.created&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_ACTIVATED | &quot;voucher.loyalty_card.pending_points.activated&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_ADED | &quot;voucher.loyalty_card.pending_points.aded&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_CANCELED | &quot;voucher.loyalty_card.pending_points.canceled&quot; |
| VOUCHER_LOYALTY_CARD_PENDING_POINTS_UPDATED | &quot;voucher.loyalty_card.pending_points.updated&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_ADED | &quot;voucher.loyalty_card.points_aded&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_EXPIRED | &quot;voucher.loyalty_card.points_expired&quot; |
| VOUCHER_LOYALTY_CARD_TRANSACTION_CREATED | &quot;voucher.loyalty_card.transaction.created&quot; |
| VOUCHER_PUBLISHED | &quot;voucher.published&quot; |
| VOUCHER_UPDATED | &quot;voucher.updated&quot; |




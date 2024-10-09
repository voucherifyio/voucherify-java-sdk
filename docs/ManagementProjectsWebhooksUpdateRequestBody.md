

# ManagementProjectsWebhooksUpdateRequestBody

Request body schema for **PUT** `v1/management/v1/projects/{projectId}/webhooks`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**targetUrl** | **String** | URL address that receives webhooks. |
|**events** | [**List&lt;EventsEnum&gt;**](#List&lt;EventsEnum&gt;) | Lists the events that trigger webhook sendout. |
|**active** | **Boolean** | Determines if the webhook configuration is active. |



## Enum: List&lt;EventsEnum&gt;

| Name | Value |
|---- | -----|
| REDEMPTION_SUCCEEDED | &quot;redemption.succeeded&quot; |
| REDEMPTION_FAILED | &quot;redemption.failed&quot; |
| REDEMPTION_ROLLBACK_SUCCEEDED | &quot;redemption.rollback.succeeded&quot; |
| REDEMPTION_ROLLBACK_FAILED | &quot;redemption.rollback.failed&quot; |
| PUBLICATION_SUCCEEDED | &quot;publication.succeeded&quot; |
| VOUCHER_PUBLISHED | &quot;voucher.published&quot; |
| VOUCHER_UPDATED | &quot;voucher.updated&quot; |
| VOUCHER_DELETED | &quot;voucher.deleted&quot; |
| VOUCHER_CREATED | &quot;voucher.created&quot; |
| VOUCHER_ENABLED | &quot;voucher.enabled&quot; |
| VOUCHER_DISABLED | &quot;voucher.disabled&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_ADDED | &quot;voucher.loyalty_card.points_added&quot; |
| VOUCHER_GIFT_BALANCE_ADDED | &quot;voucher.gift.balance_added&quot; |
| CAMPAIGN_ENABLED | &quot;campaign.enabled&quot; |
| CAMPAIGN_DELETED | &quot;campaign.deleted&quot; |
| CAMPAIGN_CREATED | &quot;campaign.created&quot; |
| CAMPAIGN_UPDATED | &quot;campaign.updated&quot; |
| CAMPAIGN_DISABLED | &quot;campaign.disabled&quot; |
| CAMPAIGN_VOUCHERS_GENERATION_COMPLETED | &quot;campaign.vouchers.generation.completed&quot; |
| BUSINESS_VALIDATION_RULE_ASSIGNMENT_CREATED | &quot;business_validation_rule.assignment.created&quot; |
| BUSINESS_VALIDATION_RULE_ASSIGNMENT_DELETED | &quot;business_validation_rule.assignment.deleted&quot; |
| BUSINESS_VALIDATION_RULE_CREATED | &quot;business_validation_rule.created&quot; |
| BUSINESS_VALIDATION_RULE_DELETED | &quot;business_validation_rule.deleted&quot; |
| BUSINESS_VALIDATION_RULE_UPDATED | &quot;business_validation_rule.updated&quot; |
| CUSTOMER_CREATED | &quot;customer.created&quot; |
| CUSTOMER_DELETED | &quot;customer.deleted&quot; |
| CUSTOMER_REWARDED | &quot;customer.rewarded&quot; |
| CUSTOMER_REWARDED_LOYALTY_POINTS | &quot;customer.rewarded.loyalty_points&quot; |




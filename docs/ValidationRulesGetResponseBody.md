

# ValidationRulesGetResponseBody

Response body schema for **GET** `v1/validation-rules/{validationRuleId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**name** | **String** | Custom, unique name for set of validation rules. |
|**rules** | **Object** | Contains all the rule definitions for the validation rule. It is a set of key value pairs representing the rules and logic between the rules. The keys are numbered consecutively beginning from &#x60;1&#x60;. The values are objects containing the rule conditions. |
|**error** | [**ValidationRulesGetResponseBodyError**](ValidationRulesGetResponseBodyError.md) |  |
|**applicableTo** | [**ValidationRulesGetResponseBodyApplicableTo**](ValidationRulesGetResponseBodyApplicableTo.md) |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of validation rule. |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | Validation rule context type.    | **Context Type** | **Definition** | |:---|:---| | earning_rule.order.paid |  | | earning_rule.custom_event |  | | earning_rule.customer.segment.entered |  | | campaign.discount_coupons |  | | campaign.discount_coupons.discount.apply_to_order |  | | campaign.discount_coupons.discount.apply_to_items |  | | campaign.discount_coupons.discount.apply_to_items_proportionally |  | | campaign.discount_coupons.discount.apply_to_items_proportionally_by_quantity |  | | campaign.discount_coupons.discount.fixed.apply_to_items |  | | campaign.gift_vouchers |  | | campaign.gift_vouchers.gift.apply_to_order |  | | campaign.gift_vouchers.gift.apply_to_items |  | | campaign.referral_program |  | | campaign.referral_program.discount.apply_to_order |  | | campaign.referral_program.discount.apply_to_items |  | | campaign.referral_program.discount.apply_to_items_proportionally |  | | campaign.referral_program.discount.apply_to_items_proportionally_by_quantity |  | | campaign.referral_program.discount.fixed.apply_to_items |  | | campaign.promotion |  | | campaign.promotion.discount.apply_to_order |  | | campaign.promotion.discount.apply_to_items |  | | campaign.promotion.discount.apply_to_items_proportionally |  | | campaign.promotion.discount.apply_to_items_proportionally_by_quantity |  | | campaign.promotion.discount.fixed.apply_to_items |  | | campaign.loyalty_program |  | | campaign.lucky_draw |  | | voucher.discount_voucher |  | | voucher.discount_voucher.discount.apply_to_order |  | | voucher.discount_voucher.discount.apply_to_items |  | | voucher.discount_voucher.discount.apply_to_items_proportionally |  | | voucher.discount_voucher.discount.apply_to_items_proportionally_by_quantity |  | | voucher.discount_voucher.discount.fixed.apply_to_items |  | | voucher.gift_voucher |  | | voucher.gift_voucher.gift.apply_to_order |  | | voucher.gift_voucher.gift.apply_to_items |  | | voucher.loyalty_card |  | | voucher.lucky_draw_code |  | | distribution.custom_event |  | | reward_assignment.pay_with_points |  | | global |  | |
|**id** | **String** | Unique validation rule ID. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the validation rule was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the validation rule was updated. The value is shown in the ISO 8601 format. |
|**assignmentsCount** | **Integer** | The number of instances the validation rule has been assigned to different types of redeemables. |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about the validation rule. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXPRESSION | &quot;expression&quot; |
| BASIC | &quot;basic&quot; |
| ADVANCED | &quot;advanced&quot; |
| COMPLEX | &quot;complex&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| EARNING_RULE_ORDER_PAID | &quot;earning_rule.order.paid&quot; |
| EARNING_RULE_CUSTOM_EVENT | &quot;earning_rule.custom_event&quot; |
| EARNING_RULE_CUSTOMER_SEGMENT_ENTERED | &quot;earning_rule.customer.segment.entered&quot; |
| EARNING_RULE_CUSTOMER_TIER_JOINED | &quot;earning_rule.customer.tier.joined&quot; |
| EARNING_RULE_CUSTOMER_TIER_LEFT | &quot;earning_rule.customer.tier.left&quot; |
| EARNING_RULE_CUSTOMER_TIER_UPGRADED | &quot;earning_rule.customer.tier.upgraded&quot; |
| EARNING_RULE_CUSTOMER_TIER_DOWNGRADED | &quot;earning_rule.customer.tier.downgraded&quot; |
| EARNING_RULE_CUSTOMER_TIER_PROLONGED | &quot;earning_rule.customer.tier.prolonged&quot; |
| CAMPAIGN_DISCOUNT_COUPONS | &quot;campaign.discount_coupons&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ORDER | &quot;campaign.discount_coupons.discount.apply_to_order&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS | &quot;campaign.discount_coupons.discount.apply_to_items&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY | &quot;campaign.discount_coupons.discount.apply_to_items_proportionally&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;campaign.discount_coupons.discount.apply_to_items_proportionally_by_quantity&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY | &quot;campaign.discount_coupons.discount.apply_to_items_by_quantity&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_FIXED_APPLY_TO_ITEMS | &quot;campaign.discount_coupons.discount.fixed.apply_to_items&quot; |
| CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_PERCENT_APPLY_TO_ITEMS | &quot;campaign.discount_coupons.discount.percent.apply_to_items&quot; |
| CAMPAIGN_GIFT_VOUCHERS | &quot;campaign.gift_vouchers&quot; |
| CAMPAIGN_GIFT_VOUCHERS_GIFT_APPLY_TO_ORDER | &quot;campaign.gift_vouchers.gift.apply_to_order&quot; |
| CAMPAIGN_GIFT_VOUCHERS_GIFT_APPLY_TO_ITEMS | &quot;campaign.gift_vouchers.gift.apply_to_items&quot; |
| CAMPAIGN_REFERRAL_PROGRAM | &quot;campaign.referral_program&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ORDER | &quot;campaign.referral_program.discount.apply_to_order&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS | &quot;campaign.referral_program.discount.apply_to_items&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY | &quot;campaign.referral_program.discount.apply_to_items_proportionally&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;campaign.referral_program.discount.apply_to_items_proportionally_by_quantity&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY | &quot;campaign.referral_program.discount.apply_to_items_by_quantity&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_FIXED_APPLY_TO_ITEMS | &quot;campaign.referral_program.discount.fixed.apply_to_items&quot; |
| CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_PERCENT_APPLY_TO_ITEMS | &quot;campaign.referral_program.discount.percent.apply_to_items&quot; |
| CAMPAIGN_PROMOTION | &quot;campaign.promotion&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ORDER | &quot;campaign.promotion.discount.apply_to_order&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS | &quot;campaign.promotion.discount.apply_to_items&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY | &quot;campaign.promotion.discount.apply_to_items_proportionally&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;campaign.promotion.discount.apply_to_items_proportionally_by_quantity&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY | &quot;campaign.promotion.discount.apply_to_items_by_quantity&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_FIXED_APPLY_TO_ITEMS | &quot;campaign.promotion.discount.fixed.apply_to_items&quot; |
| CAMPAIGN_PROMOTION_DISCOUNT_PERCENT_APPLY_TO_ITEMS | &quot;campaign.promotion.discount.percent.apply_to_items&quot; |
| CAMPAIGN_LOYALTY_PROGRAM | &quot;campaign.loyalty_program&quot; |
| CAMPAIGN_LUCKY_DRAW | &quot;campaign.lucky_draw&quot; |
| VOUCHER_DISCOUNT_VOUCHER | &quot;voucher.discount_voucher&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ORDER | &quot;voucher.discount_voucher.discount.apply_to_order&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS | &quot;voucher.discount_voucher.discount.apply_to_items&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY | &quot;voucher.discount_voucher.discount.apply_to_items_proportionally&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY | &quot;voucher.discount_voucher.discount.apply_to_items_proportionally_by_quantity&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY | &quot;voucher.discount_voucher.discount.apply_to_items_by_quantity&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_FIXED_APPLY_TO_ITEMS | &quot;voucher.discount_voucher.discount.fixed.apply_to_items&quot; |
| VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_PERCENT_APPLY_TO_ITEMS | &quot;voucher.discount_voucher.discount.percent.apply_to_items&quot; |
| VOUCHER_GIFT_VOUCHER | &quot;voucher.gift_voucher&quot; |
| VOUCHER_GIFT_VOUCHER_GIFT_APPLY_TO_ORDER | &quot;voucher.gift_voucher.gift.apply_to_order&quot; |
| VOUCHER_GIFT_VOUCHER_GIFT_APPLY_TO_ITEMS | &quot;voucher.gift_voucher.gift.apply_to_items&quot; |
| VOUCHER_LOYALTY_CARD | &quot;voucher.loyalty_card&quot; |
| VOUCHER_LUCKY_DRAW_CODE | &quot;voucher.lucky_draw_code&quot; |
| DISTRIBUTION_CUSTOM_EVENT | &quot;distribution.custom_event&quot; |
| DISTRIBUTION_ORDER_PAID | &quot;distribution.order.paid&quot; |
| DISTRIBUTION_ORDER_CREATED | &quot;distribution.order.created&quot; |
| DISTRIBUTION_ORDER_CANCELED | &quot;distribution.order.canceled&quot; |
| DISTRIBUTION_ORDER_UPDATED | &quot;distribution.order.updated&quot; |
| REWARD_ASSIGNMENT_PAY_WITH_POINTS | &quot;reward_assignment.pay_with_points&quot; |
| GLOBAL | &quot;global&quot; |




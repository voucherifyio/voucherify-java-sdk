

# PromotionsTiersUpdateRequestBody

Request body schema for **PUT** `v1/promotions/tiers/{promotionTierId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**name** | **String** | Name of the promotion tier. |
|**banner** | **String** | Text to be displayed to your customers on your website. |
|**action** | [**PromotionTierUpdateAction**](PromotionTierUpdateAction.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the promotion tier. A set of key/value pairs that you can attach to a promotion tier object. It can be useful for storing additional information about the promotion tier in a structured format. |
|**hierarchy** | **Integer** | The promotions hierarchy defines the order in which the discounts from different tiers will be applied to a customer&#39;s order. If a customer qualifies for discounts from more than one tier, discounts will be applied in the order defined in the hierarchy. |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the promotion tier starts to be active in ISO 8601 format. Promotion tier is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Activation timestamp defines when the promotion tier expires in ISO 8601 format. Promotion tier is *inactive after* this date.  |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**validationRuleAssignments** | [**ValidationRuleAssignmentsList**](ValidationRuleAssignmentsList.md) |  |
|**category** | **String** | Assign a new or update the promotion tier&#39;s category using name. |
|**categoryId** | **String** | Assign a new or update the promotion tier&#39;s category using id |



## Enum: List&lt;ValidityDayOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |




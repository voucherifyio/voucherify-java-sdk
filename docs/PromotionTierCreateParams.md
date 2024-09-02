

# PromotionTierCreateParams

This is an object representing a promotion tier create params. Promotion tiers are always assigned to a campaign and cannot be used standalone.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**name** | **String** | Name of the promotion tier. |
|**banner** | **String** | Text to be displayed to your customers on your website. |
|**action** | [**PromotionTierCreateParamsAction**](PromotionTierCreateParamsAction.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the promotion tier. A set of key/value pairs that you can attach to a promotion tier object. It can be useful for storing additional information about the promotion tier in a structured format. |
|**validationRules** | **List&lt;String&gt;** | Array containing the ID of the validation rule associated with the promotion tier. |
|**active** | **Boolean** | A flag to toggle the promotion tier on or off. You can disable a promotion tier even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* promotion tier - &#x60;false&#x60; indicates an *inactive* promotion tier |
|**hierarchy** | **Integer** | The promotions hierarchy defines the order in which the discounts from different tiers will be applied to a customer&#39;s order. If a customer qualifies for discounts from more than one tier, discounts will be applied in the order defined in the hierarchy. |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the promotion tier starts to be active in ISO 8601 format. Promotion tier is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Activation timestamp defines when the promotion tier expires in ISO 8601 format. Promotion tier is *inactive after* this date.  |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**category** | **String** | Assign category to the promotion tier. |
|**categoryId** | **String** | Instead of using the category name, you can alternatively assign a new category to a promotion tier using a unique category ID, i.e. &#x60;cat_0c9da30e7116ba6bba&#x60;. |



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




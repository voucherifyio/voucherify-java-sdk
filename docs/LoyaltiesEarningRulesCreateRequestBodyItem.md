

# LoyaltiesEarningRulesCreateRequestBodyItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**validationRuleId** | **String** | A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance. |
|**loyalty** | [**LoyaltiesEarningRulesCreateTierChangeRequestBodyLoyalty**](LoyaltiesEarningRulesCreateTierChangeRequestBodyLoyalty.md) |  |
|**event** | [**EventEnum**](#EventEnum) | Defines the event which triggers the earning rule to add points to a loyalty card.    - &#x60;customer.loyalty.tier.joined&#x60; an event defined by the Voucherify API corresponding to a customer joining a tier     - &#x60;customer.loyalty.tier.left&#x60; an event defined by the Voucherify API corresponding to a customer leaving a tier     - &#x60;customer.loyalty.tier.upgraded&#x60; an event defined by the Voucherify API corresponding to a customer&#39;s tier being upgraded     - &#x60;customer.loyalty.tier.downgraded&#x60; an event defined by the Voucherify API corresponding to a customer&#39;s tier being upgraded     - &#x60;customer.loyalty.tier.prolonged&#x60; an event defined by the Voucherify API corresponding to a customer&#39;s tier being prolonged |
|**source** | [**LoyaltiesEarningRulesCreateTierChangeRequestBodySource**](LoyaltiesEarningRulesCreateTierChangeRequestBodySource.md) |  |
|**active** | **Boolean** | A flag to toggle the earning rule on or off. You can disable an earning rule even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60; of the campaign or the earning rule&#39;s own &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* earning rule - &#x60;false&#x60; indicates an *inactive* earning rule |
|**startDate** | **OffsetDateTime** | Start date defines when the earning rule starts to be active. Activation timestamp is presented in the ISO 8601 format. Earning rule is *inactive before* this date. If you don&#39;t define the start date for an earning rule, it&#39;ll inherit the campaign start date by default.  |
|**expirationDate** | **OffsetDateTime** | Expiration date defines when the earning rule expires. Expiration timestamp is presented in the ISO 8601 format.  Earning rule is *inactive after* this date.If you don&#39;t define the expiration date for an earning rule, it&#39;ll inherit the campaign expiration date by default. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the earning rule. A set of key/value pairs that you can attach to an earning rule object. It can be useful for storing additional information about the earning rule in a structured format. |
|**segment** | [**LoyaltiesEarningRulesCreateEnteredSegmentRequestBodySegment**](LoyaltiesEarningRulesCreateEnteredSegmentRequestBodySegment.md) |  |
|**customEvent** | [**LoyaltiesEarningRulesCreateCustomEventRequestBodyCustomEvent**](LoyaltiesEarningRulesCreateCustomEventRequestBodyCustomEvent.md) |  |
|**loyaltyTier** | [**LoyaltiesEarningRulesCreateTierChangeRequestBodyLoyaltyTier**](LoyaltiesEarningRulesCreateTierChangeRequestBodyLoyaltyTier.md) |  |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| JOINED | &quot;customer.loyalty.tier.joined&quot; |
| LEFT | &quot;customer.loyalty.tier.left&quot; |
| UPGRADED | &quot;customer.loyalty.tier.upgraded&quot; |
| DOWNGRADED | &quot;customer.loyalty.tier.downgraded&quot; |
| PROLONGED | &quot;customer.loyalty.tier.prolonged&quot; |



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



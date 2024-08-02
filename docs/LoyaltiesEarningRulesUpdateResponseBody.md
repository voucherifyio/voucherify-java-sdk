

# LoyaltiesEarningRulesUpdateResponseBody

Response body schema for **PUT** `/loyalties/{campaignId}/earning-rules/{earningRuleId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Assigned by the Voucherify API, identifies the earning rule object. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the earning rule was created. The value is shown in the ISO 8601 format. |
|**loyalty** | [**EarningRuleBaseLoyalty**](EarningRuleBaseLoyalty.md) |  |
|**event** | **String** |  |
|**customEvent** | [**EarningRuleBaseCustomEvent**](EarningRuleBaseCustomEvent.md) |  |
|**segment** | [**EarningRuleBaseSegment**](EarningRuleBaseSegment.md) |  |
|**loyaltyTier** | [**EarningRuleBaseLoyaltyTier**](EarningRuleBaseLoyaltyTier.md) |  |
|**source** | [**EarningRuleBaseSource**](EarningRuleBaseSource.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is earning_rule. |
|**automationId** | **String** | For internal use by Voucherify. |
|**startDate** | **String** | Start date defines when the earning rule starts to be active. Activation timestamp is presented in the ISO 8601 format. Earning rule is inactive before this date. If you don&#39;t define the start date for an earning rule, it&#39;ll inherit the campaign start date by default. |
|**expirationDate** | **String** | Expiration date defines when the earning rule expires. Expiration timestamp is presented in the ISO 8601 format. Earning rule is inactive after this date.If you don&#39;t define the expiration date for an earning rule, it&#39;ll inherit the campaign expiration date by default. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the earning rule. A set of key/value pairs that you can attach to an earning rule object. It can be useful for storing additional information about the earning rule in a structured format. |
|**validationRuleId** | **String** | A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the earning rule was last updated in ISO 8601 format. |
|**active** | **Boolean** | A flag to toggle the earning rule on or off. You can disable an earning rule even though it&#39;s within the active period defined by the start_date and expiration_date of the campaign or the earning rule&#39;s own start_date and expiration_date.  - &#x60;true&#x60; indicates an active earning rule - &#x60;false&#x60; indicates an inactive earning rule |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EARNING_RULE | &quot;earning_rule&quot; |



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




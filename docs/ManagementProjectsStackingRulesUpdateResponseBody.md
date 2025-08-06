

# ManagementProjectsStackingRulesUpdateResponseBody

Response body schema for **PUT** `/management/v1/projects/{projectId}/stacking-rules/{stackingRulesId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | The unique identifier of the stacking rules. |
|**exclusiveCategories** | **List&lt;String&gt;** | Lists the IDs of exclusive categories. A redeemable from a campaign with an exclusive category is the only redeemable to be redeemed when applied with redeemables from other campaigns unless these campaigns are exclusive or joint. |
|**jointCategories** | **List&lt;String&gt;** | Lists the IDs of the joint categories. A campaign with a joint category is always applied regardless of the exclusivity of other campaigns. |
|**redeemablesLimit** | **Integer** | Defines how many redeemables can be sent in one request. Note: more redeemables means more processing time. |
|**applicableRedeemablesLimit** | **Integer** | Defines how many redeemables can be applied in one request. The number must be less than or equal to &#x60;redeemables_limit&#x60;. For example, a user can select 30 discounts but only 5 will be applied to the order and the remaining will be &#x60;SKIPPED&#x60; according to the &#x60;redeemables_sorting_rule&#x60;. |
|**applicableRedeemablesPerCategoryLimit** | **Integer** | Defines how many redeemables with the same category can be applied in one request. The number must be less than or equal to &#x60;applicable_redeemables_limit&#x60;. The ones above the limit will be &#x60;SKIPPED&#x60; according to the &#x60;redeemables_sorting_rule&#x60;. |
|**applicableExclusiveRedeemablesLimit** | **Integer** | Defines how many redeemables with an assigned exclusive category can be applied in one request. The ones above the limit will be &#x60;SKIPPED&#x60; according to the &#x60;redeemables_sorting_rule&#x60;. |
|**applicableExclusiveRedeemablesPerCategoryLimit** | **Integer** | Defines how many redeemables with an assigned exclusive category can be applied in one request. The ones above the limit will be &#x60;SKIPPED&#x60; according to the &#x60;redeemables_sorting_rule&#x60;. The number must be less than or equal to &#x60;applicable_exclusive_redeemables_limit&#x60;. |
|**discountCalculationMode** | [**DiscountCalculationModeEnum**](#DiscountCalculationModeEnum) | Defines if the discounts are applied by taking into account the initial order amount or the discounted order amount. |
|**initialAmountModeCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that apply a discount based on the initial amount. |
|**discountedAmountModeCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that apply a discount based on the discounted amount. |
|**redeemablesApplicationMode** | [**RedeemablesApplicationModeEnum**](#RedeemablesApplicationModeEnum) | Defines the application mode for redeemables. &#x60;\&quot;ALL\&quot;&#x60; means that all redeemables must be validated for the redemption to be successful. &#x60;\&quot;PARTIAL\&quot;&#x60; means that only those redeemables that can be validated will be redeemed. The redeemables that fail validaton will be skipped. |
|**redeemablesSortingRule** | [**RedeemablesSortingRuleEnum**](#RedeemablesSortingRuleEnum) | Defines redeemables sorting rule. &#x60;CATEGORY_HIERARCHY&#x60; means that redeemables are applied oaccording to the category priority. &#x60;REQUESTED_ORDER&#x60; means that redeemables are applied in the sequence provided in the request. |
|**redeemablesProductsApplicationMode** | [**RedeemablesProductsApplicationModeEnum**](#RedeemablesProductsApplicationModeEnum) | Defines redeemables products application mode. &#x60;STACK&#x60; means that multiple discounts can be applied to a product. &#x60;ONCE&#x60; means that only one discount can be applied to the same product. |
|**redeemablesNoEffectRule** | [**RedeemablesNoEffectRuleEnum**](#RedeemablesNoEffectRuleEnum) | Defines redeemables no effect rule. &#x60;REDEEM_ANYWAY&#x60; means that the redeemable will be redeemed regardless of any restrictions or conditions in place. &#x60;SKIP&#x60; means that the redeemable will be processed only when an applicable effect is calculated. |
|**noEffectSkipCategories** | **List&lt;String&gt;** | Lists category IDs. Redeemables with a given category are skipped even if the &#x60;redeemables_no_effect_rule&#x60; is set to &#x60;REDEEM_ANYWAY&#x60;. Category IDs can&#39;t overlap with the IDs in &#x60;no_effect_redeem_anyway_categories&#x60;. |
|**noEffectRedeemAnywayCategories** | **List&lt;String&gt;** | Lists category IDs. Redeemables with a given category are redeemed anyway even if the &#x60;redeemables_no_effect_rule&#x60; is set to &#x60;SKIP&#x60;. Category IDs can&#39;t overlap with the IDs in &#x60;no_effect_skip_categories&#x60;. |
|**redeemablesRollbackOrderMode** | [**RedeemablesRollbackOrderModeEnum**](#RedeemablesRollbackOrderModeEnum) | Defines the rollback mode for the order. &#x60;WITH_ORDER&#x60; is a default setting. The redemption is rolled back together with the data about the order, including related discount values. &#x60;WITHOUT_ORDER&#x60; allows rolling the redemption back without affecting order data, including the applied discount values. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the stacking rules were created. The value for this parameter is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the stacking rules were updated. The value for this parameter is shown in the ISO 8601 format. |



## Enum: DiscountCalculationModeEnum

| Name | Value |
|---- | -----|
| INITIAL_AMOUNT | &quot;INITIAL_AMOUNT&quot; |
| DISCOUNTED_AMOUNT | &quot;DISCOUNTED_AMOUNT&quot; |



## Enum: RedeemablesApplicationModeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| PARTIAL | &quot;PARTIAL&quot; |



## Enum: RedeemablesSortingRuleEnum

| Name | Value |
|---- | -----|
| CATEGORY_HIERARCHY | &quot;CATEGORY_HIERARCHY&quot; |
| REQUESTED_ORDER | &quot;REQUESTED_ORDER&quot; |



## Enum: RedeemablesProductsApplicationModeEnum

| Name | Value |
|---- | -----|
| STACK | &quot;STACK&quot; |
| ONCE | &quot;ONCE&quot; |



## Enum: RedeemablesNoEffectRuleEnum

| Name | Value |
|---- | -----|
| REDEEM_ANYWAY | &quot;REDEEM_ANYWAY&quot; |
| SKIP | &quot;SKIP&quot; |



## Enum: RedeemablesRollbackOrderModeEnum

| Name | Value |
|---- | -----|
| WITH_ORDER | &quot;WITH_ORDER&quot; |
| WITHOUT_ORDER | &quot;WITHOUT_ORDER&quot; |




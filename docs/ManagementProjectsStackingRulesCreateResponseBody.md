

# ManagementProjectsStackingRulesCreateResponseBody

Response body schema for **POST** `/management/v1/projects/{projectId}/stacking-rules`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | The unique identifier of the stacking rules. |
|**exclusiveCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that are exclusive. |
|**jointCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that are joint. |
|**redeemablesLimit** | **Integer** | Defines how many redeemables can be sent to Voucherify for validation at the same time. |
|**applicableRedeemablesLimit** | **Integer** | Defines how many redeemables can be applied at the same time. The number must be less than or equal to &#x60;\&quot;redeemables_limit\&quot;&#x60;. |
|**applicableRedeemablesPerCategoryLimit** | **Integer** | Defines how many redeemables with the same category can be applied at the same time. The number must be less than or equal to &#x60;\&quot;applicable_redeemables_limit\&quot;&#x60;. |
|**applicableExclusiveRedeemablesLimit** | **Integer** | Defines how many redeemables with an assigned exclusive category can be applied at the same time. |
|**applicableExclusiveRedeemablesPerCategoryLimit** | **Integer** | Defines how many exclusive redeemables with the same category can be applied at the same time. The number must be less than or equal to &#x60;\&quot;applicable_exclusive_redeemables_limit\&quot;&#x60;. |
|**discountCalculationMode** | [**DiscountCalculationModeEnum**](#DiscountCalculationModeEnum) | Defines if the discounts are applied by taking into account the initial order amount or the discounted order amount. |
|**initialAmountModeCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that apply a discount based on the initial amount. |
|**discountedAmountModeCategories** | **List&lt;String&gt;** | Lists the IDs of the categories that apply a discount based on the discounted amount. |
|**redeemablesApplicationMode** | [**RedeemablesApplicationModeEnum**](#RedeemablesApplicationModeEnum) | Defines the application mode for redeemables. &#x60;\&quot;ALL\&quot;&#x60; means that all redeemables must be validated for the redemption to be successful. &#x60;\&quot;PARTIAL\&quot;&#x60; means that only those redeemables that can be validated will be redeemed. The redeemables that fail validaton will be skipped. |
|**redeemablesSortingRule** | [**RedeemablesSortingRuleEnum**](#RedeemablesSortingRuleEnum) | Defines the sorting rule for redeemables. &#x60;\&quot;CATEGORY_HIERARCHY\&quot;&#x60; means that redeemables are applied with the order established by the hierarchy of the categories. &#x60;\&quot;REQUESTED_ORDER\&quot;&#x60; means that redeemables are applied with the order established in the request. |
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




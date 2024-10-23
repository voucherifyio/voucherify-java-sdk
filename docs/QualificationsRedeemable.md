

# QualificationsRedeemable


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Id of the redeemable. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type of the redeemable. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |
|**result** | [**RedeemableResult**](RedeemableResult.md) |  |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |
|**validationRuleId** | **String** | A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance. |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the product. A set of key/value pairs that you can attach to a product object. It can be useful for storing additional information about the product in a structured format. |
|**categories** | [**List&lt;CategoryWithStackingRulesType&gt;**](CategoryWithStackingRulesType.md) | List of category information. |
|**banner** | **String** | Name of the earning rule. This is displayed as a header for the earning rule in the Dashboard. |
|**name** | **String** | Name of the redeemable. |
|**campaignName** | **String** | Name of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60; |
|**campaignId** | **String** | Id of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60; |
|**validationRulesAssignments** | [**ValidationRulesAssignmentsList**](ValidationRulesAssignmentsList.md) |  |
|**redeemables** | [**List&lt;QualificationsRedeemableBase&gt;**](QualificationsRedeemableBase.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |
| PROMOTION_STACK | &quot;promotion_stack&quot; |
| VOUCHER | &quot;voucher&quot; |




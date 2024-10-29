

# ValidationsValidateResponseBodyRedeemablesItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |
|**result** | [**ValidationsValidateResponseBodyRedeemablesItemResult**](ValidationsValidateResponseBodyRedeemablesItemResult.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redeemable. |
|**categories** | [**List&lt;CategoryWithStackingRulesType&gt;**](CategoryWithStackingRulesType.md) |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPLICABLE | &quot;APPLICABLE&quot; |
| INAPPLICABLE | &quot;INAPPLICABLE&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |




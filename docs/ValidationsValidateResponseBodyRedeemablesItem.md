

# ValidationsValidateResponseBodyRedeemablesItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**status** | [**StatusEnum**](#StatusEnum) |  |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |
|**order** | [**ValidationsValidateResponseBodyRedeemablesItemOrder**](ValidationsValidateResponseBodyRedeemablesItemOrder.md) |  |
|**applicableTo** | [**ApplicableToResultList**](ApplicableToResultList.md) |  |
|**inapplicableTo** | [**InapplicableToResultList**](InapplicableToResultList.md) |  |
|**result** | [**ValidationsValidateResponseBodyRedeemablesItemResult**](ValidationsValidateResponseBodyRedeemablesItemResult.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redeemable. |
|**categories** | [**List&lt;CategoryWithStackingRulesType&gt;**](CategoryWithStackingRulesType.md) |  |
|**campaignName** | **String** | Campaign name. Displayed only if the &#x60;options.expand&#x60; is passed with a &#x60;redeemable&#x60; value in the validation request body. |
|**campaignId** | **String** | Unique campaign ID assigned by Voucherify. Displayed only if the &#x60;options.expand&#x60; is passed with a &#x60;redeemable&#x60; value in the validation request body. |
|**name** | **String** | Name of the promotion tier. Displayed only if the &#x60;options.expand&#x60; is passed with a &#x60;redeemable&#x60; value in the validation request body. |



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




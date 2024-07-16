

# ValidationsRedeemableInapplicable


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**status** | [**StatusEnum**](#StatusEnum) | Indicates whether the redeemable can be applied or not applied based on the validation rules. |
|**id** | **String** | Redeemable ID, i.e. the voucher code. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Redeemable&#39;s object type. |
|**result** | [**ValidationsRedeemableInapplicableResult**](ValidationsRedeemableInapplicableResult.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes in the form of key/value pairs assigned to the redeemable. |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INAPPLICABLE | &quot;INAPPLICABLE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| VOUCHER | &quot;voucher&quot; |
| PROMOTION_TIER | &quot;promotion_tier&quot; |




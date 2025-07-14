

# ClientValidationsValidateResponseBody

Response body schema for **POST** `/validations`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the validation, assigned by Voucherify. |
|**valid** | **Boolean** | The result of the validation. It takes all of the redeemables into account and returns a &#x60;false&#x60; if at least one redeemable is inapplicable. Returns &#x60;true&#x60; if all redeemables are applicable. |
|**redeemables** | [**List&lt;ClientValidationsValidateResponseBodyRedeemablesItem&gt;**](ClientValidationsValidateResponseBodyRedeemablesItem.md) |  |
|**skippedRedeemables** | [**List&lt;ValidationsRedeemableSkipped&gt;**](ValidationsRedeemableSkipped.md) | Lists validation results of each skipped redeemable. |
|**inapplicableRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each inapplicable redeemable. |
|**order** | [**ClientValidationsValidateResponseBodyOrder**](ClientValidationsValidateResponseBodyOrder.md) |  |
|**trackingId** | **String** | Hashed customer source ID. |
|**session** | [**Session**](Session.md) |  |
|**stackingRules** | [**StackingRules**](StackingRules.md) |  |




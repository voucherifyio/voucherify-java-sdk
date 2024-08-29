

# ClientRedemptionsRedeemResponseBody

Response body schema for **POST** `v1/redemptions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**redemptions** | [**List&lt;Redemption&gt;**](Redemption.md) |  |
|**parentRedemption** | [**Redemption**](Redemption.md) |  |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |
|**inapplicableRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each inapplicable redeemable. |
|**skippedRedeemables** | [**List&lt;ValidationsRedeemableSkipped&gt;**](ValidationsRedeemableSkipped.md) | Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;. |




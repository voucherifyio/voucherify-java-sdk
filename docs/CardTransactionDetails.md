

# CardTransactionDetails

Card transaction details. Variant-dependent fields are not present on all variants.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reason** | **String** | Reason for the transaction (e.g. the reason provided in a manual adjustment request). |
|**rejection** | [**CardTransactionDetailsRejection**](CardTransactionDetailsRejection.md) |  |
|**metadata** | **Object** | Transaction metadata (empty object when none). |
|**points** | [**CardTransactionDetailsPoints**](CardTransactionDetailsPoints.md) |  |
|**bucket** | [**LoyaltyV2CardPointsBucketSimple**](LoyaltyV2CardPointsBucketSimple.md) |  |
|**buckets** | [**List&lt;LoyaltyV2CardPointsBucketSimple&gt;**](LoyaltyV2CardPointsBucketSimple.md) | The points buckets that expired (&#x60;POINTS_EXPIRED&#x60; only). |
|**date** | **LocalDate** | Expiration date (&#x60;POINTS_EXPIRED&#x60; only, &#x60;YYYY-MM-DD&#x60;). |
|**reward** | [**CardTransactionDetailsReward**](CardTransactionDetailsReward.md) |  |
|**rewardTransaction** | [**CardTransactionDetailsRewardTransaction**](CardTransactionDetailsRewardTransaction.md) |  |
|**cardTransaction** | [**CardTransactionDetailsCardTransaction**](CardTransactionDetailsCardTransaction.md) |  |
|**purchase** | [**CardTransactionDetailsPurchase**](CardTransactionDetailsPurchase.md) |  |
|**order** | [**CardTransactionDetailsOrder**](CardTransactionDetailsOrder.md) |  |
|**orderTransaction** | [**CardTransactionDetailsOrderTransaction**](CardTransactionDetailsOrderTransaction.md) |  |
|**targetCard** | [**CardTransactionDetailsTargetCard**](CardTransactionDetailsTargetCard.md) |  |
|**purchaseTransaction** | [**CardTransactionDetailsPurchaseTransaction**](CardTransactionDetailsPurchaseTransaction.md) |  |




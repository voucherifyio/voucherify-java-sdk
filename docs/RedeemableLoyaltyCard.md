

# RedeemableLoyaltyCard

Redeemable loyalty card object response

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Total points incurred over the lifespan of the loyalty card, minus the expired points. |
|**balance** | **Integer** | Points available for reward redemption. |
|**exchangeRatio** | **BigDecimal** | The cash equivalent of the points defined in the points_ratio property. |
|**pointsRatio** | **Integer** | The number of loyalty points that will map to the predefined cash amount defined by the exchange_ratio property. |
|**transfers** | [**List&lt;LoyaltiesTransferPoints&gt;**](LoyaltiesTransferPoints.md) |  |




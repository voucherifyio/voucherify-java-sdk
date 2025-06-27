

# RedeemableLoyaltyCard

Redeemable loyalty card object response

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Total number of points added to the loyalty card over its lifespan. |
|**balance** | **Integer** | Points available for reward redemption. This is calculated as follows: &#x60;balance&#x60; &#x3D; &#x60;points&#x60; - &#x60;expired_points&#x60; - &#x60;subtracted_points&#x60; - &#x60;redemption.redeemed_points&#x60;. |
|**exchangeRatio** | **BigDecimal** | The cash equivalent of the points defined in the points_ratio property. |
|**pointsRatio** | **Integer** | The number of loyalty points that will map to the predefined cash amount defined by the exchange_ratio property. |
|**transfers** | [**List&lt;LoyaltiesTransferPoints&gt;**](LoyaltiesTransferPoints.md) |  |




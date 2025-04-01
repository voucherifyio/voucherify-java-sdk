

# SimpleLoyaltyCard

Simplified loyalty card data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Total number of points added to the loyalty card over its lifespan. |
|**balance** | **Integer** | Points available for reward redemption. This is calculated as follows: &#x60;balance&#x60; &#x3D; &#x60;points&#x60; - &#x60;expired_points&#x60; - &#x60;subtracted_points&#x60; - &#x60;redemption.redeemed_points&#x60;. |
|**nextExpirationDate** | **String** | The next closest date when the next set of points are due to expire. |
|**nextExpirationPoints** | **Integer** | The amount of points that are set to expire next. |
|**pendingPoints** | **Integer** | Shows the number of pending points that will be added to the loyalty card when they are activated automatically or manually. |
|**expiredPoints** | **Integer** | Shows the total number of expired points over the lifetime of the loyalty card. |
|**subtractedPoints** | **Integer** | Shows the total number of subtracted points over the lifetime of the loyalty card. |




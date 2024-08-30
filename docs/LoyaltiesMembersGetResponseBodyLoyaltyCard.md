

# LoyaltiesMembersGetResponseBodyLoyaltyCard

Object representing loyalty card parameters. Child attributes are present only if `type` is `LOYALTY_CARD`. Defaults to `null`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Total points incurred over the lifespan of the loyalty card. |
|**balance** | **Integer** | Points available for reward redemption. |
|**nextExpirationDate** | **LocalDate** | The next closest date when the next set of points are due to expire. |
|**nextExpirationPoints** | **Integer** | The amount of points that are set to expire next. |




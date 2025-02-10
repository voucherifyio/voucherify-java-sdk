

# CampaignsVouchersCreateResponseBodyLoyaltyCard

Object representing loyalty card parameters. Child attributes are present only if `type` is `LOYALTY_CARD`. Defaults to `null`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Total points incurred over the lifespan of the loyalty card, minus the expired points. |
|**balance** | **Integer** | Points available for reward redemption. |
|**nextExpirationDate** | **LocalDate** | The next closest date when the next set of points are due to expire. |
|**nextExpirationPoints** | **Integer** | The amount of points that are set to expire next. |
|**pendingPoints** | **Integer** | Determines the number of pending points that will be added to the loyalty card after the predefined time. |




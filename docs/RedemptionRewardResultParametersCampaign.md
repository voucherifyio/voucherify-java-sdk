

# RedemptionRewardResultParametersCampaign

Defines the product redeemed as a reward.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Campaign unique ID. |
|**balance** | **Integer** | Points available for reward redemption. This is calculated as follows: &#x60;balance&#x60; &#x3D; &#x60;points&#x60; - &#x60;expired_points&#x60; - &#x60;subtracted_points&#x60; - &#x60;redemption.redeemed_points&#x60;. |
|**type** | **String** | Defines the type of the campaign. |




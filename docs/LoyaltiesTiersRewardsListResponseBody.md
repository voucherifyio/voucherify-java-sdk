

# LoyaltiesTiersRewardsListResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/tiers/{loyaltyTierId}/rewards`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about loyalty tier rewards in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of loyalty tier reward objects. |
|**data** | [**List&lt;LoyaltiesLoyaltyTierReward&gt;**](LoyaltiesLoyaltyTierReward.md) | Contains array of loyalty tier reward objects. |
|**total** | **Integer** | Total number of loyalty tier reward objects. |




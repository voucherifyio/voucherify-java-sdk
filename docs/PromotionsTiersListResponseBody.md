

# PromotionsTiersListResponseBody

Response body schema for **GET** `v1/promotions/{campaignId}/tiers` and **GET** `v1/promotions/tiers`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about promotion tiers in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of promotion tier objects. |
|**tiers** | [**List&lt;PromotionTier&gt;**](PromotionTier.md) | Contains array of promotion tier objects. |
|**total** | **Integer** | Total number of promotion tiers. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request (with a different page or a different start date filter) to get more records returned in the results. |




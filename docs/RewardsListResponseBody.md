

# RewardsListResponseBody

Response body schema for **GET** `/rewards`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of transaction objects. |
|**data** | [**List&lt;Reward&gt;**](Reward.md) | A dictionary that contains an array of rewards. Each entry in the array is a separate transaction object. |
|**total** | **Integer** | Returns how many rewards in the project meet the limits defined by the query parameter definitions. |




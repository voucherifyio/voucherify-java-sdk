

# LoyaltiesPendingPointsListResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/pending-points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of pending point objects. |
|**data** | [**List&lt;LoyaltyPendingPoints&gt;**](LoyaltyPendingPoints.md) | A dictionary that contains an array of pending point entries. Each entry in the array is a separate pending point object. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request to get more records returned in the results. |
|**moreStartingAfter** | **String** | Returns an ID that can be used to return another page of results. Use the pending point entry ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results starting after the entry with that ID. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




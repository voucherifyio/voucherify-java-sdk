

# CustomerRedeemablesList

List of customer's redeemables

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about customer redeemables. |
|**dataRef** | **String** | Identifies the name of the JSON property that contains the array of redeemables. |
|**data** | [**List&lt;CustomerRedeemable&gt;**](CustomerRedeemable.md) | A dictionary that contains an array of redeemables. |
|**total** | **Integer** | Total number of results returned. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request with a &#x60;starting_after_id&#x60; query or a different limit to get more records returned in the results. |
|**moreStartingAfter** | **String** | Returns an ID that can be used to return another page of results. Use the ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results occuring after the field with that ID. |




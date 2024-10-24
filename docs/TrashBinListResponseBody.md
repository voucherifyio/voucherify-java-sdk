

# TrashBinListResponseBody

Retrieves a list of the resources moved the bin.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the bin entries in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of bin entry objects. |
|**data** | [**List&lt;TrashBinItem&gt;**](TrashBinItem.md) | Array of bin entry objects. |
|**total** | **Integer** | The total number of bin entries. This is the number of the entries returned in the array, not the number of all matching results or all resources currently moved to the bin. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request with a &#x60;starting_after_id&#x60; query or a different limit to get more records returned in the results. |
|**moreStartingAfter** | **String** | If &#x60;has_more&#x60; is &#x60;true&#x60;, it returns an ID that can be used to return another page of results. Use the ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results occuring after the field with that ID. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |






# CustomersActivityListResponseBody

Response body schema for **GET** `v1/customers/{customerId}/activity`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about customer activities in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of customer activity objects. |
|**data** | [**List&lt;CustomerActivity&gt;**](CustomerActivity.md) | Array of customer activity objects. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request with a &#x60;starting_after_id&#x60; query or a different limit to get more records returned in the results. |
|**moreStartingAfter** | **String** | Returns an ID that can be used to return another page of results. Use the event ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results starting after the event with that ID. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




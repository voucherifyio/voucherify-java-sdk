

# QualificationsRedeemables

List of redeemables for examine qualification.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is &#x60;list&#x60;. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of qualified redeemables. |
|**data** | [**List&lt;QualificationsRedeemable&gt;**](QualificationsRedeemable.md) | Array of qualified redeemables. |
|**total** | **Integer** | The number of redeemables returned in the API request. |
|**hasMore** | **Boolean** | As results are always limited, the &#x60;has_more&#x60; flag indicates if there are more records for given parameters. This lets you know if you can run another request (with different options) to get more records returned in the results. |
|**moreStartingAfter** | **OffsetDateTime** | Timestamp representing the date and time to use in &#x60;starting_after&#x60; cursor to get more redeemables. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




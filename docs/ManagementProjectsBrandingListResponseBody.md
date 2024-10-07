

# ManagementProjectsBrandingListResponseBody

Object containing a list of brand configurations. It always contains one item.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the brand in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of brand objects. |
|**data** | [**List&lt;ManagementProjectsBranding&gt;**](ManagementProjectsBranding.md) | Array of brand objects. It contains only one object. |
|**total** | **Integer** | The total number of brand objects. It is always &#x60;1&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




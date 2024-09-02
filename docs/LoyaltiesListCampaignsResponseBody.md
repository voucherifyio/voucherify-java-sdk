

# LoyaltiesListCampaignsResponseBody

Response body schema for **Get** `/loyalties`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about loyalty campaigns in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of loyalty campaign objects. |
|**campaigns** | [**List&lt;LoyaltyCampaign&gt;**](LoyaltyCampaign.md) | Contains an array of loyalty campaign objects. |
|**total** | **Integer** | Total number of loyalty campaign objects. |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| CAMPAIGNS | &quot;campaigns&quot; |




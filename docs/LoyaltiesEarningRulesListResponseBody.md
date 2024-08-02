

# LoyaltiesEarningRulesListResponseBody

Response body schema for listing earning rules using **GET** `/loyalties/{campaignId}/earning-rules` endpoint.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about earning rules in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of earning rule objects. |
|**data** | [**List&lt;EarningRule&gt;**](EarningRule.md) | Contains array of earning rule objects. |
|**total** | **Integer** | Total number of earning rule objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




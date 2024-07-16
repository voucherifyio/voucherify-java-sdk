

# LoyaltiesTiersEarningRulesListResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/tiers/{loyaltyTierId}/earning-rules`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about earning rules in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of earning rule objects. |
|**data** | [**List&lt;EarningRule&gt;**](EarningRule.md) | Contains array of earning rule objects. |
|**total** | **Integer** | Total number of earning rule objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




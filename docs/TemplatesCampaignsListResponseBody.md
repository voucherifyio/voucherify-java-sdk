

# TemplatesCampaignsListResponseBody

Response body schema for **GET** `/v1/templates/campaign`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about campaign templates. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the JSON property that contains the array of campaign templates. |
|**data** | [**List&lt;CampaignTemplate&gt;**](CampaignTemplate.md) | Dictionary that contains an array of campaign templates. |
|**total** | **Integer** | Total number of templates, regardless of the applied query parameters. Displayed only if the &#x60;include_total&#x60; query paremeter is set to &#x60;true&#x60;. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request to get more records returned in the results. |
|**moreStartingAfter** | **String** | Returns an ID that can be used to return another page of results. Use the template ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results starting after the template with that ID. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




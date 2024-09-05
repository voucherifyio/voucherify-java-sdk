

# CampaignsListResponseBody

Schema model for **GET** `v1/campaigns`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about campaigns in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of campaign objects. |
|**campaigns** | [**List&lt;CampaignBase&gt;**](CampaignBase.md) | Contains array of campaign objects. |
|**total** | **Integer** | Total number of campaigns. |




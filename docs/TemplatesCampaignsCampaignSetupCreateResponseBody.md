

# TemplatesCampaignsCampaignSetupCreateResponseBody

Response body schema for **POST** `/v1/templates/campaigns/{campaignTemplateId}/campaign-setup`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**createdResources** | [**List&lt;TemplatesCampaignsCampaignSetupCreateResponseBodyCreatedResourcesItem&gt;**](TemplatesCampaignsCampaignSetupCreateResponseBodyCreatedResourcesItem.md) | Contains a list of resources that have been added to the project when the campaign has been created out of the template. |
|**campaign** | [**Campaign**](Campaign.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the campaign created out of the campaign template. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN_SETUP | &quot;campaign_setup&quot; |




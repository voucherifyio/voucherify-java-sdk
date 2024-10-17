

# TemplatesCampaignsTierSetupCreateResponseBody

Response body schema for **POST** `/v1/templates/campaigns/{campaignTemplateId}/tier-setup`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**createdResources** | [**List&lt;TemplatesCampaignsTierSetupCreateResponseBodyCreatedResourcesItem&gt;**](TemplatesCampaignsTierSetupCreateResponseBodyCreatedResourcesItem.md) | Contains a list of resources that have been added to the project when the promotion tier has been created out of the template. |
|**promotionTier** | [**PromotionTier**](PromotionTier.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the campaign created out of the campaign template. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROMOTION_TIER_SETUP | &quot;promotion_tier_setup&quot; |




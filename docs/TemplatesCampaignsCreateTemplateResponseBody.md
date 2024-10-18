

# TemplatesCampaignsCreateTemplateResponseBody

Response body schema for **POST** `/v1/templates/campaigns`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the campaign template. It is assigned by Voucherify. |
|**name** | **String** | User-defined name of the campaign template. |
|**description** | **String** | User-defined description of the campaign template. |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of the campaign used to create the campaign template. Templates created from a promotion tier are converted to &#x60;DISCOUNT_COUPONS&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign template was created. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN_TEMPLATE | &quot;campaign_template&quot; |




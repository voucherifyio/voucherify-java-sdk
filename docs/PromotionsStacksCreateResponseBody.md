

# PromotionsStacksCreateResponseBody

Response body schema for **POST** `v1/promotions/{campaignId}/stacks`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**name** | **String** | Promotion stack name. |
|**tiers** | [**PromotionStackBaseTiers**](PromotionStackBaseTiers.md) |  |
|**id** | **String** | Unique promotion stack ID. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the promotion stack was created. The value is shown in the ISO 8601 format. |
|**campaignId** | **String** | Promotion stack&#39;s parent campaign&#39;s unique ID. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**categoryId** | **String** | Promotion stack category ID. |
|**categories** | [**List&lt;PromotionStackBase&gt;**](PromotionStackBase.md) | Details about the category assigned to the promotion stack. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROMOTION_STACK | &quot;promotion_stack&quot; |




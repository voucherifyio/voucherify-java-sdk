

# TrashBinItem

Resource moved to the bin, i.e. a campaign, product, SKU, or voucher.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the trash bin entry. It should not be confused with the ID of the resource moved to the bin. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the resource was moved to the bin. The value for this parameter is shown in the ISO 8601 format. |
|**deletedByUserId** | **String** | Unique identifier of the user who moved the resource to the bin. It returns a user ID if the resource was moved to the bin through an action in the website. It returns a &#x60;null&#x60; if the resource was deleted through the API. |
|**resourceId** | **String** | Unique identifier of the resource moved to the bin, i.e. an ID of a campaign, product, SKU, or voucher. |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) | Type of the resource moved to the bin. |
|**resourceName** | **String** | Name of the resouce moved to the bin. It is the name of the campaign, product or SKU, or the voucher code. |
|**resourceParentId** | **String** | Unique identifier of the parent resource. For a voucher, it is a campaign ID, except for standalone vouchers. For an SKU, it is the product ID. It returns &#x60;null&#x60; for campaigns and base products. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. It is equal to the &#x60;resource_type&#x60;. |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |




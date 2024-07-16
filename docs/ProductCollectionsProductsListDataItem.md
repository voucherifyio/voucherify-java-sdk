

# ProductCollectionsProductsListDataItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** |  |
|**sourceId** | **String** |  |
|**name** | **String** | Unique user-defined product name. |
|**price** | **Integer** | Unit price. It is represented by a value multiplied by 100 to accurately reflect 2 decimal places, such as &#x60;$100.00&#x60; being expressed as &#x60;10000&#x60;. |
|**attributes** | **List&lt;String&gt;** | A list of product attributes whose values you can customize for given SKUs: &#x60;[\&quot;color\&quot;,\&quot;size\&quot;,\&quot;ranking\&quot;]&#x60;. Each child SKU can have a unique value for a given attribute. |
|**metadata** | **Object** |  |
|**imageUrl** | **String** |  |
|**createdAt** | **String** |  |
|**updatedAt** | **String** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |
|**productId** | **String** | The parent product&#39;s unique ID. |
|**sku** | **String** | Unique user-defined SKU name. |
|**currency** | **String** | SKU price currency. |
|**product** | [**ProductWithoutSkus**](ProductWithoutSkus.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |




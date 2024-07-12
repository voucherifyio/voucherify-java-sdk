

# ProductCollectionsCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Show that the product collection is static (manually selected products). |
|**name** | **String** | Unique user-defined product collection name. |
|**products** | [**List&lt;ProductCollectionsCreateDynamicRequestBodyProductsItem&gt;**](ProductCollectionsCreateDynamicRequestBodyProductsItem.md) | Defines a set of products for a &#x60;STATIC&#x60; product collection type. |
|**filter** | [**ProductCollectionsCreateRequestBodyFilter**](ProductCollectionsCreateRequestBodyFilter.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |




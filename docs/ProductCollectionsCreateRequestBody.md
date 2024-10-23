

# ProductCollectionsCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Show that the product collection is static (manually selected products). |
|**name** | **String** | Unique user-defined product collection name. |
|**products** | [**List&lt;ProductCollectionsCreateRequestBodyProductsItem&gt;**](ProductCollectionsCreateRequestBodyProductsItem.md) | Defines a set of products for a &#x60;STATIC&#x60; product collection type. |
|**filter** | **Object** | Defines a set of criteria and boundary conditions for an &#x60;AUTO_UPDATE&#x60; product collection type. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |




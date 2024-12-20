

# ProductCollectionsGetResponseBody

Response body schema for **GET** `v1/product-collections/{productCollectionId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Product collection ID. |
|**name** | **String** | Unique user-defined product collection name. |
|**type** | [**TypeEnum**](#TypeEnum) | Describes whether the product collection is dynamic (products come in and leave based on set criteria) or static (manually selected products). |
|**filter** | **Object** | Defines a set of criteria and boundary conditions for an &#x60;AUTO_UPDATE&#x60; product collection type. |
|**products** | [**List&lt;ProductCollectionsGetResponseBodyProductsItem&gt;**](ProductCollectionsGetResponseBodyProductsItem.md) | Defines a set of products for a &#x60;STATIC&#x60; product collection type. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the product collection was created. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the static product collection. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;STATIC&quot; |
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |




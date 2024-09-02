

# ProductCollectionsProductsListResponseBody

Response body schema for **GET** `v1/product-collections/{productCollectionId}/products`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about products and SKUs. |
|**dataRef** | **String** | Identifies the name of the JSON property that contains the array of products and SKUs. |
|**data** | [**List&lt;ProductCollectionsProductsListResponseBodyDataItem&gt;**](ProductCollectionsProductsListResponseBodyDataItem.md) |  |
|**total** | **Integer** | Total number of products &amp; SKUs in the product collection. |




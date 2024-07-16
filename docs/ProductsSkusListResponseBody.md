

# ProductsSkusListResponseBody

Response body schema for **GET** `/products/{productId}/skus`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about SKUs. |
|**dataRef** | **String** | Identifies the name of the JSON property that contains the array of SKUs. |
|**skus** | [**List&lt;Sku&gt;**](Sku.md) | A dictionary that contains an array of SKUs. |
|**total** | **Integer** | Total number of SKUs in the product. |




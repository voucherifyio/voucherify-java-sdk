

# ProductsListResponseBody

Response body schema for **GET** `/products`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about products in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of product objects. |
|**products** | [**List&lt;Product&gt;**](Product.md) | Contains array of product objects. |
|**total** | **Integer** | Total number of product objects. |




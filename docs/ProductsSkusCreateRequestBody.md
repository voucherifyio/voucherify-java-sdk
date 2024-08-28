

# ProductsSkusCreateRequestBody

Request body schema for **POST** `v1/products/{productId}/skus

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique SKU ID. |
|**sourceId** | **String** | A unique SKU identifier from your inventory system. |
|**sku** | **String** | Unique user-defined SKU name. |
|**price** | **Integer** | SKU unit price. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**currency** | **String** | SKU price currency. |
|**attributes** | **Object** | The attributes object stores values for all custom attributes inherited by the SKU from the parent product. A set of key/value pairs that are attached to a SKU object and are unique to each SKU within a product family. |
|**imageUrl** | **String** | The HTTPS URL pointing to the .png or .jpg file that will be used to render the SKU image. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the SKU. A set of key/value pairs that you can attach to a SKU object. It can be useful for storing additional information about the SKU in a structured format. |




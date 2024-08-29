

# ProductsSkusCreateResponseBody

Response body schema for **PUT** `v1/products/{productId}/skus`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | A unique identifier that represents the SKU and is assigned by Voucherify. |
|**sourceId** | **String** | A unique SKU identifier from your inventory system. |
|**productId** | **String** | The parent product&#39;s unique ID. |
|**sku** | **String** | Unique user-defined SKU name. |
|**price** | **Integer** | Unit price. It is represented by a value multiplied by 100 to accurately reflect 2 decimal places, such as &#x60;$100.00&#x60; being expressed as &#x60;10000&#x60;. |
|**currency** | **String** | SKU price currency. |
|**attributes** | **Object** | The attributes object stores values for all custom attributes inherited by the SKU from the parent product. A set of key/value pairs that are attached to a SKU object and are unique to each SKU within a product family. |
|**imageUrl** | **String** | The HTTPS URL pointing to the .png or .jpg file that will be used to render the SKU image. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the SKU. A set of key/value pairs that you can attach to a SKU object. It can be useful for storing additional information about the SKU in a structured format. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the SKU was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the SKU was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the &#x60;SKU&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SKU | &quot;sku&quot; |




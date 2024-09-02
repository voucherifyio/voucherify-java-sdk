

# ProductsGetResponseBody

Response body schema for **GET** `v1/products/{productId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique product ID assigned by Voucherify. |
|**sourceId** | **String** | Unique product source ID. |
|**name** | **String** | Unique user-defined product name. |
|**price** | **Integer** | Unit price. It is represented by a value multiplied by 100 to accurately reflect 2 decimal places, such as &#x60;$100.00&#x60; being expressed as &#x60;10000&#x60;. |
|**attributes** | **List&lt;String&gt;** | A list of product attributes whose values you can customize for given SKUs: &#x60;[\&quot;color\&quot;,\&quot;size\&quot;,\&quot;ranking\&quot;]&#x60;. Each child SKU can have a unique value for a given attribute. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the product. A set of key/value pairs that you can attach to a product object. It can be useful for storing additional information about the product in a structured format. |
|**imageUrl** | **String** | The HTTPS URL pointing to the .png or .jpg file that will be used to render the product image. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the product was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the product was updated. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the product. |
|**skus** | [**SkusListForProduct**](SkusListForProduct.md) |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |




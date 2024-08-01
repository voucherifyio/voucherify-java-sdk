

# VouchersListResponseBody

Response body schema for **GET** `/vouchers`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of voucher objects. |
|**vouchers** | [**List&lt;VoucherWithCategories&gt;**](VoucherWithCategories.md) | A dictionary that contains an array of  vouchers. Each entry in the array is a separate voucher object. |
|**total** | **Integer** | Returns how many vouchers in the project meet the limits defined by the query parameter definitions. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| VOUCHERS | &quot;vouchers&quot; |




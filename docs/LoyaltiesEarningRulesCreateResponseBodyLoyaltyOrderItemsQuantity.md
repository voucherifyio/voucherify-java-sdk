

# LoyaltiesEarningRulesCreateResponseBodyLoyaltyOrderItemsQuantity

Defines the ratio based on the property defined in the calculation_type parameter. For every set of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every calculation_type, give points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**every** | **Integer** | Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 order amount is written as 1000. |
|**points** | **Integer** | Number of points to be awarded, i.e. how many points to be added to the loyalty card. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Type of object taken under consideration. |
|**id** | **String** | Unique ID of the resource, i.e. pc_75U0dHlr7u75BJodrW1AE3t6, prod_0bae32322150fd0546, or sku_0b7d7dfb090be5c619. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |




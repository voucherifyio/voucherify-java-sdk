

# MemberActivityDataRedemptionOrderItemsItemSku

An object containing details of the related SKU.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | A unique identifier that represents the SKU and is assigned by Voucherify. |
|**sourceId** | **String** | The merchant&#39;s SKU ID (if it is different than Voucherify&#39;s SKU ID). It is really useful in case of integration between multiple systems. It can be an ID from an eCommerce site, a database or a 3rd party service. |
|**override** | **Boolean** | The override set to &#x60;true&#x60; is used to store the product information in the system. If the product does not exist, it will be created with a source_id; if it does exist, the provided values for the name, price, and metadata will replace those already stored in the system. |
|**sku** | **String** | The SKU name. |
|**price** | **BigDecimal** | SKU price. A positive integer in the smallest currency unit (e.g. 100 cents for $1.00). |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to an SKU. It can be useful for storing additional information about the SKU in a structured format. It can be used to create product collections. |




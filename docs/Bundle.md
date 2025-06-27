

# Bundle

Determines how the bundle conditions are met by the customer's order items. The items in the order meet the bundle condition in the following way: SKU, then product, then collection.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**quantity** | **Integer** | Determines how many bundles are qualified. If there are missing bundle products, the value is &#x60;0&#x60;. If the bundle is qualified, the value is &#x60;1&#x60;. |
|**identified** | [**List&lt;BundleIdentifiedItem&gt;**](BundleIdentifiedItem.md) | Determines products from the customer&#39;s order items that meet bundle conditions. SKUs meet the conditions for their product that is used in the bundle. Returns only the products and their quantity that meet the bundle. |
|**missing** | [**List&lt;BundleMissingItem&gt;**](BundleMissingItem.md) | Determines products, SKUs, or collections from the bundle that are missing in the customer&#39;s order items. Determines also the missing quantity. For collections, this means that order items do not include a sufficient number of items that belong to the collection. |




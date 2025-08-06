

# Bundle

Determines how the bundle conditions are met by the customer's order items. The items in the order meet the bundle condition in the following way: SKU, then product, then collection.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**quantity** | **Integer** | Determines how many bundles are qualified. If there are missing bundle products, the value is &#x60;0&#x60;. If the bundle is qualified, the value is &#x60;1&#x60;. The maximum number of identified bundles can equal the number set in &#x60;limit&#x60;. Also defines the multiplier of the discount for &#x60;AMOUNT&#x60;, &#x60;PERCENT&#x60;, and &#x60;UNIT&#x60; discount types. To inform end-customers that more products can be added to meet additional bundles, compare this parameter with &#x60;limit&#x60;. |
|**limit** | **Integer** | Determines the maximum number of identified bundles. This also defines the maximum multiplier of the bundle discount. |
|**identified** | [**List&lt;BundleIdentifiedItem&gt;**](BundleIdentifiedItem.md) | Determines products from the customer&#39;s order items that meet bundle conditions. SKUs meet the conditions for their product that is used in the bundle. Returns only the products and their quantity that meet the bundle. |
|**missing** | [**List&lt;BundleMissingItem&gt;**](BundleMissingItem.md) | Determines products, SKUs, or collections from the bundle that are missing in the customer&#39;s order items. Determines also the missing quantity. For collections, this means that order items do not include a sufficient number of items that belong to the collection. Not returned when all required bundle items are in the order. |




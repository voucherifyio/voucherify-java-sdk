

# ApplicableTo


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | This object stores information about the resource to which the discount is applicable. |
|**id** | **String** | Unique product collection, product, or SKU identifier assigned by Voucherify. |
|**sourceId** | **String** | The source identifier from your inventory system. |
|**productId** | **String** | Parent product&#39;s unique ID assigned by Voucherify. |
|**productSourceId** | **String** | Parent product&#39;s source ID from your inventory system. |
|**price** | **BigDecimal** | New fixed price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 price is written as 1000. In case of the fixed price being calculated by the formula, i.e. the price_formula parameter is present in the fixed price definition, this value becomes the fallback value. Such that in a case where the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed price. |
|**priceFormula** | **BigDecimal** | Formula used to dynamically calculate the discounted price of an item. |
|**effect** | **ApplicableToEffect** |  |
|**quantityLimit** | **Integer** | The maximum number of units allowed to be discounted per order line item. |
|**aggregatedQuantityLimit** | **Integer** | The maximum number of units allowed to be discounted combined across all matched order line items. |
|**amountLimit** | **Integer** | Upper limit allowed to be applied as a discount per order line item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600. |
|**aggregatedAmountLimit** | **Integer** | Maximum discount amount per order. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount on the entire order is written as 600. This value is definable for the following discount effects: - &#x60;APPLY_TO_ITEMS&#x60; (each item subtotal is discounted equally) - &#x60;APPLY_TO_ITEMS_BY_QUANTITY&#x60; (each unit of matched products has the same discount value) |
|**productCampaignQuantityLimit** | **Integer** | Limits the number of discounted item units (product, SKU, collection) that all customers can receive in a given campaign. If a product is selected, the limit covers all discounts across all SKUs belonging to that product. If a product collection is selected, the limit covers all products/SKUs within the collection.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productCampaignQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per campaign.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productCustomerCampaignQuantityLimit** | **Integer** | Limits the number of discounted item units (product, SKU, collection) that one customer can receive in a given campaign.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productCustomerCampaignQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per customer in a campaign.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCampaignQuantityLimit** | **Integer** | Limits the number of discounted item units of a given product in a collection that all customers can receive in a given campaign.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCampaignQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per campaign for a product in a collection.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCustomerCampaignQuantityLimit** | **Integer** | Limits the number of discounted item units of a given product in a collection that one customer can receive in a campaign.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCustomerCampaignQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per customer for a product in a collection.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productPromotionTierQuantityLimit** | **Integer** | Limits the number of discounted item units that all customers can receive in a promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productPromotionTierQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productCustomerPromotionTierQuantityLimit** | **Integer** | Limits the number of discounted item units that one customer can receive in a given promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productCustomerPromotionTierQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per customer in a promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionPromotionTierQuantityLimit** | **Integer** | Limits the number of discounted item units of a given product in a collection that all customers can receive in a given promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionPromotionTierQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per promotion tier for a product in a collection.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCustomerPromotionTierQuantityLimit** | **Integer** | Limits the number of discounted item units of a given product in a collection that one customer can receive in a promotion tier.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**productInCollectionCustomerPromotionTierQuantityLimitFormula** | **String** | Formula used to dynamically calculate the maximum units per customer in a promotion tier for a product in a collection.  This limit is available on demand as part of campaign budget limits. Contact [Voucherify support](https://www.voucherify.io/contact-support) or your account manager to learn more. |
|**orderItemIndices** | **List&lt;Integer&gt;** | Lists which order lines are (not) covered by the discount. The order in the array is determined by the sequence of applied discounts, while the numbers correspond to the order lines sent in the &#x60;order&#x60; object in the request. The first order line is assigned &#x60;0&#x60;, the second order line is assigned &#x60;1&#x60;, and so on. |
|**orderItemUnits** | [**List&lt;ApplicableToOrderItemUnitsItem&gt;**](ApplicableToOrderItemUnitsItem.md) | Lists which units within order lines are covered by the discount. The order line items are listed according to sequence of applied discounts while the &#x60;index&#x60; corresponds to the order line sent in the &#x60;order&#x60; object in the request. |
|**repeat** | **Integer** | Determines the recurrence of the discount, e.g. &#x60;\&quot;repeat\&quot;: 3&#x60; means that the discount is applied to every third item. |
|**skipInitially** | **Integer** | Determines how many items are skipped before the discount is applied. |
|**target** | [**TargetEnum**](#TargetEnum) | Determines to which kinds of objects the discount is applicable. &#x60;ITEM&#x60; includes products and SKUs. &#x60;UNIT&#x60; means particular units within an order line. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;ITEM&quot; |
| UNIT | &quot;UNIT&quot; |




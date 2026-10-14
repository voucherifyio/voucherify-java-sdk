

# EarningRulePointsProportionalApplicableTo

Criterion selecting order items the calculation applies to. Depending on `type`, exactly one of `product`, `sku` or `products_collection` is required and the others must be null/absent. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the referenced object. |
|**product** | [**LoyaltyV2ActivityEarningRulePointsProportionalApplicableToProduct**](LoyaltyV2ActivityEarningRulePointsProportionalApplicableToProduct.md) |  |
|**sku** | [**LoyaltyV2ActivityEarningRulePointsProportionalApplicableToSku**](LoyaltyV2ActivityEarningRulePointsProportionalApplicableToSku.md) |  |
|**productsCollection** | [**LoyaltyV2ActivityEarningRulePointsProportionalApplicableToProductsCollection**](LoyaltyV2ActivityEarningRulePointsProportionalApplicableToProductsCollection.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |




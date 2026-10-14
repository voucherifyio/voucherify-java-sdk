

# BenefitPointsProportionalApplicableTo

A single applicability rule. Exactly one of `product`, `sku`, or `products_collection` is required, matching the `type`. In requests, the other two may be omitted or set to `null`. In responses, they are omitted. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the referenced object. |
|**product** | [**LoyaltyV2ActivityBenefitPointsProportionalApplicableToProduct**](LoyaltyV2ActivityBenefitPointsProportionalApplicableToProduct.md) |  |
|**sku** | [**LoyaltyV2ActivityBenefitPointsProportionalApplicableToSku**](LoyaltyV2ActivityBenefitPointsProportionalApplicableToSku.md) |  |
|**productsCollection** | [**LoyaltyV2ActivityBenefitPointsProportionalApplicableToProductsCollection**](LoyaltyV2ActivityBenefitPointsProportionalApplicableToProductsCollection.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| PRODUCTS_COLLECTION | &quot;products_collection&quot; |




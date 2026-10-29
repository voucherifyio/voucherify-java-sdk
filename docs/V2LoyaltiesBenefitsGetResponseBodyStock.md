

# V2LoyaltiesBenefitsGetResponseBodyStock

Stock configuration of the benefit. When `type` is `LIMITED`, the `limited` object is required. When `type` is `UNLIMITED`, requests may omit `limited` or set it to `null`; responses omit it. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Whether the benefit has unlimited or limited stock. |
|**limited** | [**LoyaltyV2ActivityBenefitStockLimited**](LoyaltyV2ActivityBenefitStockLimited.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| UNLIMITED | &quot;UNLIMITED&quot; |
| LIMITED | &quot;LIMITED&quot; |




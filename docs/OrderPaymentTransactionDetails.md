

# OrderPaymentTransactionDetails

Details of a `PAY_WITH_POINTS` order transaction.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reason** | **String** | Human-readable reason: \&quot;Points spent on order payment\&quot;. |
|**rejection** | [**OrderPaymentRejection**](OrderPaymentRejection.md) |  |
|**metadata** | **Object** | Transaction metadata. For pay-with-points transactions this contains the flattened payment limits used for the calculation: &#x60;amount_limit&#x60; for the &#x60;AMOUNT_LIMIT&#x60; type and/or &#x60;points_limit&#x60; for the &#x60;POINTS_LIMIT&#x60; type. Empty object when the default &#x60;CARD_BALANCE&#x60; limit was used or when not set. |
|**payment** | [**OrderPaymentPaymentDetails**](OrderPaymentPaymentDetails.md) |  |
|**spendingCap** | [**OrderPaymentTransactionDetailsSpendingCap**](OrderPaymentTransactionDetailsSpendingCap.md) |  |




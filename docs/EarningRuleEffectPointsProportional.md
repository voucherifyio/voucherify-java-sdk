

# EarningRuleEffectPointsProportional

Proportional points effect - awards points using an \"every X gives Y points\" formula. Depending on `calculation_type`, one specific configuration object is required and the others must be null/absent: - `PRE_DISCOUNT_ORDER_AMOUNT`: requires `order.amount` - `POST_DISCOUNT_ORDER_AMOUNT`: requires `order.total_amount` - `ORDER_METADATA_VALUE`: requires `order.metadata` - `CUSTOMER_METADATA_VALUE`: requires `customer.metadata` - `CUSTOM_EVENT_METADATA_VALUE`: requires `custom_event.metadata` - `PRE_DISCOUNT_ORDER_ITEMS_AMOUNT`: requires `order_items.amount` - `POST_DISCOUNT_ORDER_ITEMS_AMOUNT`: requires `order_items.subtotal_amount` - `ORDER_ITEMS_QUANTITY`: requires `order_items.quantity` The trigger further restricts allowed calculation types: `customer.order.paid` allows all order/order-items types plus `CUSTOMER_METADATA_VALUE`; `customer.custom_event` allows `CUSTOMER_METADATA_VALUE` and `CUSTOM_EVENT_METADATA_VALUE`; `customer.segment.entered` allows only `CUSTOMER_METADATA_VALUE`. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | How the proportional points are calculated. |
|**cardDefinitionId** | **String** | Card definition ID (&#x60;lcdef_...&#x60;) the points are awarded to. |
|**pointsExpiration** | [**EarningRuleEffectPointsExpiration**](EarningRuleEffectPointsExpiration.md) |  |
|**order** | [**EarningRulePointsProportionalOrder**](EarningRulePointsProportionalOrder.md) |  |
|**customer** | [**EarningRulePointsProportionalCustomer**](EarningRulePointsProportionalCustomer.md) |  |
|**customEvent** | [**EarningRulePointsProportionalCustomEvent**](EarningRulePointsProportionalCustomEvent.md) |  |
|**orderItems** | [**EarningRulePointsProportionalOrderItems**](EarningRulePointsProportionalOrderItems.md) |  |



## Enum: CalculationTypeEnum

| Name | Value |
|---- | -----|
| PRE_DISCOUNT_ORDER_AMOUNT | &quot;PRE_DISCOUNT_ORDER_AMOUNT&quot; |
| POST_DISCOUNT_ORDER_AMOUNT | &quot;POST_DISCOUNT_ORDER_AMOUNT&quot; |
| PRE_DISCOUNT_ORDER_ITEMS_AMOUNT | &quot;PRE_DISCOUNT_ORDER_ITEMS_AMOUNT&quot; |
| POST_DISCOUNT_ORDER_ITEMS_AMOUNT | &quot;POST_DISCOUNT_ORDER_ITEMS_AMOUNT&quot; |
| ORDER_ITEMS_QUANTITY | &quot;ORDER_ITEMS_QUANTITY&quot; |
| ORDER_METADATA_VALUE | &quot;ORDER_METADATA_VALUE&quot; |
| CUSTOMER_METADATA_VALUE | &quot;CUSTOMER_METADATA_VALUE&quot; |
| CUSTOM_EVENT_METADATA_VALUE | &quot;CUSTOM_EVENT_METADATA_VALUE&quot; |




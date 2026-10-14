

# V2LoyaltiesBenefitsGetResponseBodyPointsProportional

Proportional points effect - points are calculated from an order amount, order items, or a metadata property. Exactly one calculation source object (`order`, `customer`, `custom_event`, or `order_items`) is required, determined by `calculation_type`. In requests, the remaining source properties may be omitted or set to `null`. In responses, they are omitted. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**calculationType** | [**CalculationTypeEnum**](#CalculationTypeEnum) | How the points are calculated: - &#x60;PRE_DISCOUNT_ORDER_AMOUNT&#x60; - points per every specified order amount before discounts (requires &#x60;order.amount&#x60;) - &#x60;POST_DISCOUNT_ORDER_AMOUNT&#x60; - points per every specified order amount after discounts (requires &#x60;order.total_amount&#x60;) - &#x60;PRE_DISCOUNT_ORDER_ITEMS_AMOUNT&#x60; - points per every specified amount spent on selected products before discounts (requires &#x60;order_items.amount&#x60;) - &#x60;POST_DISCOUNT_ORDER_ITEMS_AMOUNT&#x60; - points per every specified amount spent on selected products after discounts (requires &#x60;order_items.subtotal_amount&#x60;) - &#x60;ORDER_ITEMS_QUANTITY&#x60; - points per every specified quantity of selected products, excluding free items (requires &#x60;order_items.quantity&#x60;) - &#x60;ORDER_METADATA_VALUE&#x60; - points per every specified value in the order metadata (requires &#x60;order.metadata&#x60;) - &#x60;CUSTOMER_METADATA_VALUE&#x60; - points per every specified value in the customer metadata (requires &#x60;customer.metadata&#x60;) - &#x60;CUSTOM_EVENT_METADATA_VALUE&#x60; - points per every specified value in the custom event metadata (requires &#x60;custom_event.metadata&#x60;) |
|**cardDefinitionId** | **String** | ID of the card definition whose cards receive the points. The card definition must exist and be ACTIVE. |
|**order** | [**BenefitPointsProportionalOrder**](BenefitPointsProportionalOrder.md) |  |
|**customer** | [**BenefitPointsProportionalCustomer**](BenefitPointsProportionalCustomer.md) |  |
|**customEvent** | [**BenefitPointsProportionalCustomEvent**](BenefitPointsProportionalCustomEvent.md) |  |
|**orderItems** | [**BenefitPointsProportionalOrderItems**](BenefitPointsProportionalOrderItems.md) |  |



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






# ApplicableToOrderItemUnitsItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**index** | **Integer** | Number assigned to the order line item in accordance with the order sent in the request. |
|**units** | **List&lt;Integer&gt;** | Numbers of units in the order line covered by the discount; e.g. &#x60;2, 5, 8&#x60; for 10 units with the setting &#x60;\&quot;skip_initially\&quot;: 1&#x60;, &#x60;\&quot;repeat\&quot;: 3&#x60;. The counting of units starts from &#x60;1&#x60;. The maximum quantity of all handled units is 1000. If the quantity of all order items exceeds 1000, this array is not returned, but &#x60;units_limit_exceeded: true&#x60;. However, the discount is calculated properly for all relevant units. |
|**unitsLimitExceeded** | **Boolean** | Returned as &#x60;true&#x60; only when the sum total of &#x60;quantity&#x60; of all order items exceeds 1000. |




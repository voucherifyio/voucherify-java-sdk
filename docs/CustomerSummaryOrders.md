

# CustomerSummaryOrders

Lists details about orders related to the customer. Lists only data for orders with the `PAID` or `FULFILLED` status. Data from orders with a `CREATED` or `CANCELED` status are not included. The data is updated also when an order changes status.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**totalAmount** | **Integer** | The total amount spent by the customer. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**totalCount** | **Integer** | Total number of orders made by the customer. |
|**averageAmount** | **Integer** | Average amount spent on orders. &#x60;total_amount&#x60; &amp;divide; &#x60;total_count&#x60;. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**lastOrderAmount** | **Integer** | Amount spent on last order. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |
|**lastOrderDate** | **OffsetDateTime** | Timestamp representing the date and time of the customer&#39;s last order in ISO 8601 format. |




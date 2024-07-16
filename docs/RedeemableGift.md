

# RedeemableGift

Contains current gift card balance information.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**balance** | **BigDecimal** | Available funds. Value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |
|**credits** | **BigDecimal** | The number of credits that the user wants to use from the gift card to fulfil the order. The value of credits cannot be higher than the current balance on the gift card. If the user gives more points than he has on the gift card, the application will return an error code in response. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. |




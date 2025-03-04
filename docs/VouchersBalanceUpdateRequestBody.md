

# VouchersBalanceUpdateRequestBody

Request body schema for `vouchers/{code}/balance`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**amount** | **Integer** | The incremental amount to be added to or removed from the current balance on the gift card or loyalty card. The value is multiplied by 100 to represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;. To remove balance, simply add a minus sign before the value, i.e. to remove $20, use -2000. |
|**sourceId** | **String** | The merchant&#39;s transaction ID if it is different from the Voucherify transaction ID. It is really useful in case of an integration between multiple systems. It can be a transaction ID from a CRM system, database or 3rd-party service. |
|**reason** | **String** | Reason why the transaction occurred. |




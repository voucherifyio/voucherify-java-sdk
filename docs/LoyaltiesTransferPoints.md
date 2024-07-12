

# LoyaltiesTransferPoints


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Unique loyalty card code from which the user wants to transfer loyalty points (source). |
|**points** | **Integer** | The number of loyalty points that the user wants to transfer to another loyalty card. The number of points cannot be higher than the current balance on the loyalty card (source). |
|**reason** | **String** | Reason for the transfer. |
|**sourceId** | **String** | The merchant’s transaction ID if it is different from the Voucherify transaction ID. It is really useful in case of an integration between multiple systems. It can be a transaction ID from a CRM system, database or 3rd-party service. |






# SimpleCustomer


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | The ID of an existing customer that will be linked to redemption in this request. |
|**sourceId** | **String** | A unique identifier of the customer who validates a voucher. It can be a customer ID or email from a CRM system, database, or a third-party service. If you also pass a customer ID (unique ID assigned by Voucherify), the source ID will be ignored. |
|**name** | **String** | Customer&#39;s first and last name. |
|**email** | **String** | Customer&#39;s email address. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |




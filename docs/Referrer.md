

# Referrer


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | The ID of an existing customer. |
|**sourceId** | **String** | A unique identifier of the customer who validates a voucher. It can be a customer ID or email from a CRM system, database, or a third-party service. If you also pass a customer ID (unique ID assigned by Voucherify), the source ID will be ignored. |
|**name** | **String** | Customer&#39;s first and last name. |
|**description** | **String** | An arbitrary string that you can attach to a customer object. |
|**email** | **String** | Customer&#39;s email address. |
|**phone** | **String** | Customer&#39;s phone number. This parameter is mandatory when you try to send out codes to customers via an SMS channel. |
|**birthday** | **LocalDate** | &#x60;Deprecated&#x60;. ~~Customer&#39;s birthdate; format YYYY-MM-DD~~. |
|**birthdate** | **LocalDate** | Customer&#39;s birthdate; format YYYY-MM-DD. |
|**address** | [**CustomerBaseAddress**](CustomerBaseAddress.md) |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments. |




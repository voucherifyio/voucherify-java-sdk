

# ExamineCustomerIdentification

Identifies the customer to examine. Depending on `type`, requires one of `customer_id`, `customer_source_id`, or `member_id`. Non-selected identifiers may be omitted or set to `null`. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Identification method. |
|**customerId** | **String** | Unique customer ID (&#x60;cust_...&#x60;). Required when &#x60;type&#x60; is &#x60;customer_id&#x60;. |
|**customerSourceId** | **String** | Customer source ID, e.g. from an external system. May be provided as a string or a number. Required when &#x60;type&#x60; is &#x60;customer_source_id&#x60;. |
|**memberId** | **String** | Loyalty member ID (&#x60;lmbr_...&#x60;). Required when &#x60;type&#x60; is &#x60;member_id&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_ID | &quot;customer_id&quot; |
| CUSTOMER_SOURCE_ID | &quot;customer_source_id&quot; |
| MEMBER_ID | &quot;member_id&quot; |






# CustomersMetadataUpdateInBulkRequestBody

Request body schema for **POST** `v1/customers/metadata/async`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**sourceIds** | **List&lt;String&gt;** | An array of customer &#x60;source_id&#x60;&#39;s. |
|**metadata** | **Object** | Metadata key value pairs to be updated. A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments. |




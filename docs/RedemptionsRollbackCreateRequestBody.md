

# RedemptionsRollbackCreateRequestBody

Request body schema for **POST** `/redemptions/{redemptionId}/rollback`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reason** | **String** | Reason for the rollback. |
|**trackingId** | **String** | Customer&#39;s &#x60;source_id&#x60;. |
|**customer** | [**Customer**](Customer.md) |  |
|**order** | [**Order**](Order.md) |  |
|**metadata** | **Object** | A set of key/value pairs that you can send in the request body to update **redemption** metadata. |




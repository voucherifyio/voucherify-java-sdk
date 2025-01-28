

# LoyaltyPendingPoints

Contains details about the pending point entry.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the pending point entry, assigned by Voucherify. |
|**voucherId** | **String** | Unique identifier of the loyalty card, assigned by Voucherify. |
|**campaignId** | **String** | Unique campaign identifier, assigned by Voucherify. |
|**customerId** | **String** | Unique customer identifier, assigned by Voucherify. |
|**orderId** | **String** | Unique order identifier, assigned by Voucherify. |
|**points** | **Integer** | Number of points in the pending state. |
|**activatesAt** | **LocalDate** | Date when the pending points are activated and added to the customer&#39;s loyalty card. |
|**details** | [**LoyaltyPendingPointsDetails**](LoyaltyPendingPointsDetails.md) |  |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the pending point entry was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the pending point entry was modified. The value is shown in the ISO 8601 format. |




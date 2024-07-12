

# LoyaltyTierExpiration

Defines loyalty tier expiration date.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customerId** | **String** | Unique customer ID of the customer making the purchase. |
|**campaignId** | **String** | Unique campaign ID, assigned by Voucherify. |
|**tierId** | **String** | Unique tier ID, assigned by Voucherify. |
|**startDate** | **String** | Activation timestamp defines when the loyalty tier starts to be active in ISO 8601 format. Loyalty tier is inactive before this date. |
|**expirationDate** | **String** | Expiration timestamp defines when the loyalty tier expires in ISO 8601 format. Loyalty tier is inactive after this date. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty tier was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the loyalty tier was updated. The value is shown in the ISO 8601 format. |




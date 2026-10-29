

# TierTransactionDetails

Details of the tier evaluation. Fields that do not apply to the transaction type are `null`. `JOINED` - `tier_to` set, `tier_from` null. `LEFT` - `tier_from` set, `tier_to` null. `UPGRADED` and `DOWNGRADED` - both `tier_from` and `tier_to` set. `EXPIRATION_CHANGED` - `expires_at` holds the new expiration; `tier_from` and `tier_to` null. `EVALUATION_REFRESHED` - `points` holds the recalculated value; `tier_from` and `tier_to` null.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **BigDecimal** | Qualifying points at the time of evaluation. Returns the point balance or the points earned in the tracking period, depending on the tier structure. &#x60;null&#x60; when points were not calculated. |
|**tierFrom** | **String** | Unique identifier of the tier the member moved from (format &#x60;lt_...&#x60;). &#x60;null&#x60; when there is no source tier, including &#x60;JOINED&#x60;, &#x60;EXPIRATION_CHANGED&#x60;, and &#x60;EVALUATION_REFRESHED&#x60; transactions. |
|**tierTo** | **String** | Unique identifier of the tier the member moved to (format &#x60;lt_...&#x60;). &#x60;null&#x60; when there is no destination tier, including &#x60;LEFT&#x60;, &#x60;EXPIRATION_CHANGED&#x60;, and &#x60;EVALUATION_REFRESHED&#x60; transactions. |
|**origin** | [**TierTransactionOrigin**](TierTransactionOrigin.md) |  |
|**rejection** | [**TierTransactionRejection**](TierTransactionRejection.md) |  |
|**startAt** | **OffsetDateTime** | Start of the tier membership period, or &#x60;null&#x60;. |
|**expiresAt** | **OffsetDateTime** | Expiration of the tier membership period, or &#x60;null&#x60;. |




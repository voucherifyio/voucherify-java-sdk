

# LoyaltiesMembersBalanceUpdateRequestBody

Request Body schema for **POST** `v1/loyalties/members/{memberId}/balance` and **POST** `v1/loyalties/{campaignId}/members/{memberId}/balance`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Incremental balance to be added to/subtracted from the loyalty card.  - To add points: 100 - To subtract points, add a minus: -100 |
|**expirationType** | **PointsExpirationTypes** |  |
|**expirationDate** | **OffsetDateTime** | Set expiration date for added points, i.e. &#x60;YYYY-MM-DD&#x60;. This parameter is required only when expiration_type is set to &#x60;CUSTOM_DATE&#x60;. |
|**reason** | **String** | Reason for the transfer. |
|**sourceId** | **String** | The merchant&#39;s transaction ID if it is different from the Voucherify transaction ID. It is really useful in case of an integration between multiple systems. It can be a transaction ID from a CRM system, database or 3rd-party service. |




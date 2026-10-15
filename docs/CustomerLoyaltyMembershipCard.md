

# CustomerLoyaltyMembershipCard

Loyalty card balance recorded on the customer membership.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardDefinitionId** | **String** | Identifies the card definition. |
|**cardId** | **String** | Identifies the loyalty card. |
|**points** | **BigDecimal** | Points balance on the card. |
|**pendingPoints** | **BigDecimal** | Pending points on the card. |
|**nextActivationAt** | **LocalDate** | Date when the next points become active, in &#x60;YYYY-MM-DD&#x60; format. &#x60;null&#x60; when no activation is scheduled. |
|**nextExpirationAt** | **LocalDate** | Date when the next points expire, in &#x60;YYYY-MM-DD&#x60; format. &#x60;null&#x60; when no expiration is scheduled. |




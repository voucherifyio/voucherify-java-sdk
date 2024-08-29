

# ClientQualificationsCheckEligibilityResponseBody

Response body schema for **POST** `v1/qualifications`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**redeemables** | [**QualificationsRedeemables**](QualificationsRedeemables.md) |  |
|**trackingId** | **String** | This identifier is generated during voucher qualification based on your internal id (e.g., email, database ID). This is a hashed customer source ID. |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |
|**stackingRules** | [**StackingRules**](StackingRules.md) |  |




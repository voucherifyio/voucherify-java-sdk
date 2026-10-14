

# V2LoyaltiesProgramsRewardsPurchasesRefundResponseBody

Response body schema for **POST** `/v2/loyalties/programs/{programId}/rewards/purchases/{rewardTransactionId}/refund`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**transaction** | [**RewardPurchaseTransaction**](RewardPurchaseTransaction.md) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Result status. Always &#x60;APPROVED&#x60; on success. |
|**message** | **String** | Returns the result message: \&quot;Reward refund transaction created. Points will be returned to the member&#39;s card shortly.\&quot;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |




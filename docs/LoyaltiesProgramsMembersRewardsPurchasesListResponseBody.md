

# LoyaltiesProgramsMembersRewardsPurchasesListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;RewardPurchaseTransaction&gt;**](RewardPurchaseTransaction.md) | Reward purchase transactions (type &#x60;PURCHASE&#x60; only). |
|**cursor** | **Object** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




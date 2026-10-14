

# LoyaltiesProgramsMembersRewardsPurchasesCreateRequestBody

Request body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/rewards/purchases`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**rewardId** | **String** | Unique identifier of the reward to purchase (format &#x60;lrew_...&#x60;). |
|**mode** | [**ModeEnum**](#ModeEnum) | Purchase mode. &#x60;TRANSACTION&#x60; creates a &#x60;PENDING&#x60; reward transaction processed asynchronously (HTTP &#x60;202&#x60;). &#x60;DRY_RUN&#x60; only simulates the purchase and returns the calculation result (HTTP &#x60;200&#x60;); no transaction is created. Defaults to &#x60;TRANSACTION&#x60; when omitted. |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;TRANSACTION&quot; |
| DRY_RUN | &quot;DRY_RUN&quot; |




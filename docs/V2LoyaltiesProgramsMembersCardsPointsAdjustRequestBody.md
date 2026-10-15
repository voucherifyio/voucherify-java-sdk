

# V2LoyaltiesProgramsMembersCardsPointsAdjustRequestBody

Request body schema for **POST** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Number of points to adjust. Positive values add points (&#x60;ADMIN_CREDIT&#x60; transaction), negative values subtract points (&#x60;ADMIN_DEBIT&#x60; transaction), zero results in no transaction (&#x60;NO_CHANGE&#x60;). |
|**reason** | **String** | Optional reason for the adjustment, stored in the transaction details. |




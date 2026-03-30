

# LoyaltiesMembersRedemptionRedeemRequestBody

Request body schema for **POST** `v1/loyalties/{campaignId}/members/{memberId}/redemption` and for **POST** `v1/loyalties/members/{memberId}/redemption`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**reward** | [**LoyaltiesMembersRedemptionRedeemRequestBodyReward**](LoyaltiesMembersRedemptionRedeemRequestBodyReward.md) |  |
|**order** | [**Order**](Order.md) |  |
|**metadata** | **Object** | A set of key/value pairs that you can send in the request body to check against vouchers requiring **redemption** metadata validation rules to be satisfied. The validation runs against rules that are defined through the [Create Validation Rules](/api-reference/validation-rules/create-validation-rules) endpoint or with the [Validation Rule Builder](/personalize/create-validation-rules) in the the Dashboard. |




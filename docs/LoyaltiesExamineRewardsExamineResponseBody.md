

# LoyaltiesExamineRewardsExamineResponseBody

Response body schema for **POST** `/v2/loyalties/examine/rewards`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customer** | [**ExamineCustomerReference**](ExamineCustomerReference.md) |  |
|**rewards** | [**List&lt;LoyaltiesExamineRewardsExamineResponseBodyRewardDetail&gt;**](LoyaltiesExamineRewardsExamineResponseBodyRewardDetail.md) | Lists rewards that resolved a points cost and appear on a returned card. Omits a reward when it is inactive, out of stock, has no matching cost, or the member has no card for that cost. |
|**memberships** | [**List&lt;LoyaltiesExamineRewardsExamineResponseBodyMembership&gt;**](LoyaltiesExamineRewardsExamineResponseBodyMembership.md) | Lists one entry for each active membership whose program has reward assignments. &#x60;cards&#x60; can be empty when none of those rewards resolve onto a card. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;rewards_examine_result&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARDS_EXAMINE_RESULT | &quot;rewards_examine_result&quot; |




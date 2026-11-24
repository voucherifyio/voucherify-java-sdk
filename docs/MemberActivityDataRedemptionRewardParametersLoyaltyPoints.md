

# MemberActivityDataRedemptionRewardParametersLoyaltyPoints

Defines how many points to credit on a `v2/loyalties` (loyalty hub) card, which program and card definition receive them, and what happens when the customer is not a member yet.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Number of points to credit. Must be greater than &#x60;0&#x60;. |
|**programId** | **String** | Unique &#x60;v2/loyalties&#x60; (loyalty hub) program ID, assigned by Voucherify. |
|**cardDefinitionId** | **String** | Unique card definition ID of the &#x60;v2/loyalties&#x60; (loyalty hub) card that receives the points. |
|**onMissingMember** | [**OnMissingMemberEnum**](#OnMissingMemberEnum) | Action when the customer is not a member of the program. &#x60;ENROLL&#x60; enrolls the customer and credits the points. &#x60;REJECT&#x60; rejects the award and the customer is not enrolled. |



## Enum: OnMissingMemberEnum

| Name | Value |
|---- | -----|
| ENROLL | &quot;ENROLL&quot; |
| REJECT | &quot;REJECT&quot; |




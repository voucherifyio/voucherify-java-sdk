

# MemberActivityDataRedemptionReward


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customer** | [**MemberActivityDataRedemptionRewardCustomer**](MemberActivityDataRedemptionRewardCustomer.md) |  |
|**assignmentId** | **String** | Unique reward assignment ID assigned by Voucherify. |
|**voucher** | [**MemberActivityDataRedemptionRewardVoucher**](MemberActivityDataRedemptionRewardVoucher.md) |  |
|**product** | [**MemberActivityDataRedemptionRewardProduct**](MemberActivityDataRedemptionRewardProduct.md) |  |
|**sku** | [**MemberActivityDataRedemptionRewardSku**](MemberActivityDataRedemptionRewardSku.md) |  |
|**loyaltyTierId** | **String** | Unique loyalty tier ID assigned by Voucherify. |
|**id** | **String** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) |  |
|**name** | **String** |  |
|**createdAt** | **String** |  |
|**updatedAt** | **String** |  |
|**parameters** | [**MemberActivityDataRedemptionRewardParameters**](MemberActivityDataRedemptionRewardParameters.md) |  |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a reward. The metadata object stores all custom attributes assigned to the reward. |
|**type** | [**TypeEnum**](#TypeEnum) | Reward type. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REWARD | &quot;reward&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;CAMPAIGN&quot; |
| COIN | &quot;COIN&quot; |
| MATERIAL | &quot;MATERIAL&quot; |




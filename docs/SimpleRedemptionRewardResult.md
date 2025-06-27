

# SimpleRedemptionRewardResult

Simplified redemption reward result data

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |
|**assignmentId** | **String** | Unique reward assignment ID assigned by Voucherify. |
|**voucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |
|**product** | [**SimpleProduct**](SimpleProduct.md) |  |
|**sku** | [**SimpleSku**](SimpleSku.md) |  |
|**loyaltyTierId** | **String** | Unique loyalty tier ID assigned by Voucherify. |
|**id** | **String** | Unique reward ID, assigned by Voucherify. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the reward. |
|**name** | **String** | Reward name. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the reward was updated. The value is shown in the ISO 8601 format. |
|**parameters** | [**RewardType**](RewardType.md) |  |
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




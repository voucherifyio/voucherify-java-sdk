

# RedemptionRewardResult


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |
|**assignmentId** | **String** | Unique reward assignment ID assigned by Voucherify. |
|**voucher** | [**Voucher**](Voucher.md) |  |
|**product** | [**Product**](Product.md) |  |
|**sku** | [**Sku**](Sku.md) |  |
|**loyaltyTierId** | **String** | Unique loyalty tier ID assigned by Voucherify. |
|**id** | **String** | Unique reward ID. |
|**name** | **String** | Name of the reward. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redemption was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp in ISO 8601 format indicating when the reward was updated. |
|**parameters** | [**RedemptionRewardResultParameters**](RedemptionRewardResultParameters.md) |  |
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




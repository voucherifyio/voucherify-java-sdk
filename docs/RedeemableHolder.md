

# RedeemableHolder

Single customer's redeemable

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the redeemable holder. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the redeemable was assigned. The value is shown in the ISO 8601 format. |
|**redeemableId** | **String** | Identifier of the redeemable item. |
|**redeemableObject** | **String** | Type of the redeemable. |
|**customerId** | **String** | Unique identifier of the customer. |
|**holderRole** | [**HolderRoleEnum**](#HolderRoleEnum) | Role of the holder. |
|**campaignId** | **String** | Unique identifier of the campaign as assigned by Voucherify. |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Defines the type of the campaign. |
|**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) | Defines the type of the voucher. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a redeemable holder. The metadata object stores all custom attributes assigned to the &#x60;redeemable_holder&#x60; object. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |



## Enum: HolderRoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;OWNER&quot; |
| REFERRER | &quot;REFERRER&quot; |
| REFEREE | &quot;REFEREE&quot; |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| REFERRAL_PROGRAM | &quot;REFERRAL_PROGRAM&quot; |



## Enum: VoucherTypeEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| REDEEMABLE_HOLDER | &quot;redeemable_holder&quot; |




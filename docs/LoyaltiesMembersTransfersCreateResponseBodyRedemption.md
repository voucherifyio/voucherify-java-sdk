

# LoyaltiesMembersTransfersCreateResponseBodyRedemption

Stores a summary of redemptions that have been applied to the voucher.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**quantity** | **Integer** | How many times a voucher can be redeemed. A null value means unlimited. |
|**redeemedPoints** | **Integer** | Total loyalty points redeemed. |
|**redeemedQuantity** | **Integer** | How many times a voucher has already been redeemed. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute. |
|**url** | **String** | The endpoint where this list of redemptions can be accessed using a **GET** method. /v1/vouchers/{voucher_code}/redemptions |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




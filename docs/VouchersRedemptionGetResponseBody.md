

# VouchersRedemptionGetResponseBody

Response body schema for **GET** `/vouchers/{code}/redemption`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**quantity** | **Integer** | The maximum number of times a voucher can be redeemed. |
|**redeemedQuantity** | **Integer** | The number of times the voucher was redeemed successfully. |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about redemptions in a dictionary. |
|**url** | **String** | URL |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of &#x60;redemption_entries&#x60;. |
|**total** | **Integer** | Total number of redemption objects. |
|**redemptionEntries** | [**List&lt;RedemptionEntry&gt;**](RedemptionEntry.md) | Contains the array of successful and failed redemption objects. |




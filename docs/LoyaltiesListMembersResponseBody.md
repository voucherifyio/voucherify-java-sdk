

# LoyaltiesListMembersResponseBody

Response body schema for **GET** `v1/loyalties/{campaignId}/members`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about members in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of voucher objects. |
|**vouchers** | [**List&lt;LoyaltyMember&gt;**](LoyaltyMember.md) | Contains array of voucher objects representing loyalty cards, in other words, loyalty program members. |
|**total** | **Integer** | Total number of voucher objects. |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| VOUCHERS | &quot;vouchers&quot; |






# LoyaltiesMembersBalanceUpdateResponseBody

Response schema for **POST** `v1/loyalties/members/{memberId}/balance` and for **POST** `v1/loyalties/{campaignId}/members/{memberId}/balance`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | The incremental points removed or added to the current balance on the loyalty card. |
|**total** | **Integer** | The total of points accrued over the lifetime of the loyalty card. |
|**balance** | **Integer** | The balance after adding/removing points. |
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher being modified. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is balance. |
|**relatedObject** | [**LoyaltiesMembersBalanceUpdateResponseBodyRelatedObject**](LoyaltiesMembersBalanceUpdateResponseBodyRelatedObject.md) |  |
|**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | The type of operation being performed. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;loyalty_card&quot; |
| GIFT_VOUCHER | &quot;gift_voucher&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



## Enum: OperationTypeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| AUTOMATIC | &quot;AUTOMATIC&quot; |






# RewardPurchaseDigitalGiftVoucher

Gift voucher fulfillment entry.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Voucher identifier of the gift voucher. |
|**code** | **String** | Gift voucher code. |
|**amount** | **BigDecimal** | Amount added to (or, for refunds, subtracted from) the gift voucher balance. |
|**balance** | **BigDecimal** | Gift voucher balance after the operation. |
|**result** | [**ResultEnum**](#ResultEnum) | Refund handling result for this gift voucher (present in refund results):  - &#x60;CREDITS_SUBTRACTED&#x60;: The credited balance was subtracted.  - &#x60;SKIPPED&#x60;: The voucher was left intact. |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SKIPPED | &quot;SKIPPED&quot; |
| CREDITS_SUBTRACTED | &quot;CREDITS_SUBTRACTED&quot; |




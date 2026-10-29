

# RewardPurchaseRefundPolicies

Refund policies for a reward purchase refund.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**refund** | [**RefundEnum**](#RefundEnum) | Applies the refund override. &#x60;DEFAULT&#x60; follows the reward&#39;s refunds setting. &#x60;ALLOW&#x60; refunds even when the reward is not refundable. Defaults to &#x60;DEFAULT&#x60;. |
|**stock** | [**StockEnum**](#StockEnum) | Controls assignment stock. &#x60;DEFAULT&#x60; restores one unit when stock is limited. &#x60;WRITE_OFF&#x60; does not restore stock. Unlimited (&#x60;null&#x60;) stock is unchanged. Defaults to &#x60;DEFAULT&#x60;. |



## Enum: RefundEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| ALLOW | &quot;ALLOW&quot; |



## Enum: StockEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| WRITE_OFF | &quot;WRITE_OFF&quot; |




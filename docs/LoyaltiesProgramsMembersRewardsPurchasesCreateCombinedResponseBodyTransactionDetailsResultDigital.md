

# LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransactionDetailsResultDigital


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Digital reward type. |
|**discountCoupons** | [**List&lt;RewardPurchaseDigitalCoupon&gt;**](RewardPurchaseDigitalCoupon.md) | Fulfilled discount coupons (present when &#x60;type&#x60; is &#x60;DISCOUNT_COUPONS&#x60;). |
|**giftVouchers** | [**List&lt;RewardPurchaseDigitalGiftVoucher&gt;**](RewardPurchaseDigitalGiftVoucher.md) | Fulfilled gift vouchers (present when &#x60;type&#x60; is &#x60;GIFT_VOUCHERS&#x60;). |
|**loyaltyCardPoints** | [**LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransactionDetailsResultDigitalLoyaltyCardPoints**](LoyaltiesProgramsMembersRewardsPurchasesCreateCombinedResponseBodyTransactionDetailsResultDigitalLoyaltyCardPoints.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |
| LOYALTY_CARD_POINTS | &quot;LOYALTY_CARD_POINTS&quot; |




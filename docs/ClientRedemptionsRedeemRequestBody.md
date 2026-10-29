

# ClientRedemptionsRedeemRequestBody

Response body schema for **POST** `v1/redemptions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**options** | [**ClientRedemptionsRedeemRequestBodyOptions**](ClientRedemptionsRedeemRequestBodyOptions.md) |  |
|**redeemables** | [**List&lt;ClientRedemptionsRedeemRequestBodyRedeemablesItem&gt;**](ClientRedemptionsRedeemRequestBodyRedeemablesItem.md) | An array of redeemables. You can combine &#x60;voucher&#x60;(s) and &#x60;promotion_tier&#x60;(s). Alternatively, send one unique&#x60;promotion_stack&#x60; in the array. Each unique redeemable can be sent in one request only once. |
|**order** | [**Order**](Order.md) |  |
|**customer** | [**Customer**](Customer.md) |  |
|**session** | [**Session**](Session.md) |  |
|**trackingId** | **String** | Is correspondent to Customer&#39;s source_id |
|**metadata** | **Object** | A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format. |




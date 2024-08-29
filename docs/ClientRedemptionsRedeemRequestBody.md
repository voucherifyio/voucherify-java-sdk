

# ClientRedemptionsRedeemRequestBody

Response body schema for **POST** `v1/redemptions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**redeemables** | [**List&lt;StackableValidateRedeemBaseRedeemablesItem&gt;**](StackableValidateRedeemBaseRedeemablesItem.md) |  |
|**order** | [**Order**](Order.md) |  |
|**customer** | [**Customer**](Customer.md) |  |
|**session** | [**Session**](Session.md) |  |
|**trackingId** | **String** | Is correspondent to Customer&#39;s source_id |
|**metadata** | **Object** | A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format. |
|**options** | [**ClientRedemptionsRedeemRequestBodyOptions**](ClientRedemptionsRedeemRequestBodyOptions.md) |  |




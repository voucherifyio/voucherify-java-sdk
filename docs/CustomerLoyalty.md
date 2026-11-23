

# CustomerLoyalty

Summary of the customer's **legacy loyalty** activity: points on loyalty cards and referred customers. Loyalty hub memberships are listed separately under `loyalty_memberships` on the customer object.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **Integer** | Customer&#39;s loyalty points minus expired points for all loyalty cards (**legacy loyalty**) which the customer has. |
|**referredCustomers** | **Integer** | Total number of customers referred by the customer. |
|**campaigns** | [**Map&lt;String, CustomerLoyaltyCampaignsEntry&gt;**](CustomerLoyaltyCampaignsEntry.md) | Contains **legacy loyalty** and referral campaigns with details about point balances and how many customers were referred by the customer. |




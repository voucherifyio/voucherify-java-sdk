

# ReferralsMembersHoldersCreateInBulkRequestBody

Request body schema for **POST** `v1/referrals/{campaignId}/members/{memberId}/holders` and **POST** `v1/referrals/members/{memberId}/holders`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**holders** | [**List&lt;Customer&gt;**](Customer.md) | Array of holders to be added to a referral card as referees. You have to send at least one object in the array up to a maximum of 100 objects. You can send either a &#x60;source_id&#x60; or &#x60;id&#x60;, or both; however, at least one of them is required. If both are sent, Voucherify checks &#x60;id&#x60; to upsert that customer&#39;s data. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to the redeemable holders sent in the array. The value can be a string, number, boolean, date, datetime, image URL, or object. The metadata must meet the metadata schema for publications. The metadata object stores all custom attributes assigned to the redeemable holder. |




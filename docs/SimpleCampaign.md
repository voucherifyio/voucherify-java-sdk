

# SimpleCampaign

Simplified campaign data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Campaign ID. |
|**name** | **String** | Campaign name. |
|**campaignType** | **String** | Type of campaign. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the campaign can be updated with new vouchers after campaign creation or if the campaign consists of generic (standalone) voucherss.  - &#x60;AUTO_UPDATE&#x60;: the campaign is dynamic, i.e. vouchers will generate based on set criteria -  &#x60;STATIC&#x60;: vouchers need to be manually published - &#x60;STANDALONE&#x60;: campaign for single vouchers |
|**isReferralCode** | **Boolean** | Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;. |
|**voucher** | [**SimpleCampaignVoucher**](SimpleCampaignVoucher.md) |  |
|**referralProgram** | [**ReferralProgram**](ReferralProgram.md) |  |
|**autoJoin** | **Boolean** | Indicates whether customers will be able to auto-join the campaign if any earning rule is fulfilled. |
|**joinOnce** | **Boolean** | If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once. It is always &#x60;false&#x60; for generic (standalone) vouchers campaigns and it cannot be changed in them. It is always &#x60;true&#x60; for loyalty campaigns and it cannot be changed in them. |
|**active** | **Boolean** | Indicates whether the campaign is active. |
|**categoryId** | **String** | The unique category ID that this campaign belongs to. |
|**category** | **String** | Unique category name. |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |
|**metadata** | **Object** | A set of custom key/value pairs that you can attach to a campaign. The metadata object stores all custom attributes assigned to the campaign. |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is inactive *before* this date.  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is inactive *after* this date. |
|**description** | **String** | An optional field to keep extra textual information about the campaign such as a campaign description and details. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was updated in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the campaign. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |
| STATIC | &quot;STATIC&quot; |
| STANDALONE | &quot;STANDALONE&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |




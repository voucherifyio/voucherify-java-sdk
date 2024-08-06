

# CampaignsUpdateCouponCampaignBase

Base body schema for updating a campaign which contains coupon codes using **PUT** `/campaigns`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**description** | **String** | An optional field to keep any extra textual information about the campaign such as a campaign description and details. |
|**category** | **String** | The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;. |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format. |
|**unsetMetadataFields** | **List&lt;String&gt;** | Determine which metadata should be removed from campaign. |
|**categoryId** | **String** | Unique category ID that this campaign belongs to. Either pass this parameter OR the &#x60;category&#x60;. |
|**activityDurationAfterPublishing** | **String** | Defines the amount of time the campaign will be active in ISO 8601 format after publishing. For example, a campaign with a &#x60;duration&#x60; of &#x60;P24D&#x60; will be valid for a duration of 24 days. |
|**joinOnce** | **Boolean** | If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once. |
|**autoJoin** | **Boolean** | Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published. |



## Enum: List&lt;ValidityDayOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |
| STATIC | &quot;STATIC&quot; |




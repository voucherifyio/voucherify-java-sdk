

# LoyaltiesCreateCampaignResponseBody

Response body schema for **POST** `/loyalties`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique campaign ID, assigned by Voucherify. |
|**name** | **String** | Campaign name. |
|**description** | **String** | An optional field to keep any extra textual information about the campaign such as a campaign description and details. |
|**campaignType** | [**CampaignTypeEnum**](#CampaignTypeEnum) | Type of campaign. |
|**type** | [**TypeEnum**](#TypeEnum) | Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: the campaign is dynamic, i.e. vouchers will generate based on set criteria     -  &#x60;STATIC&#x60;: vouchers need to be manually published |
|**voucher** | [**LoyaltyCampaignVoucher**](LoyaltyCampaignVoucher.md) |  |
|**autoJoin** | **Boolean** | Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled. |
|**joinOnce** | **Boolean** | If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once. |
|**useVoucherMetadataSchema** | **Boolean** | Flag indicating whether the campaign is to use the voucher&#39;s metadata schema instead of the campaign metadata schema. |
|**validityTimeframe** | [**ValidityTimeframe**](ValidityTimeframe.md) |  |
|**validityDayOfWeek** | [**List&lt;ValidityDayOfWeekEnum&gt;**](#List&lt;ValidityDayOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**validityHours** | [**ValidityHours**](ValidityHours.md) |  |
|**activityDurationAfterPublishing** | **String** | Defines the amount of time the campaign will be active in ISO 8601 format after publishing. For example, a campaign with a &#x60;duration&#x60; of &#x60;P24D&#x60; will be valid for a duration of 24 days. |
|**vouchersCount** | **Integer** | Total number of unique vouchers in campaign. |
|**startDate** | **OffsetDateTime** | Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date.  |
|**expirationDate** | **OffsetDateTime** | Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date. |
|**active** | **Boolean** | A flag to toggle the campaign on or off. You can disable a campaign even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* campaign - &#x60;false&#x60; indicates an *inactive* campaign |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the campaign was last updated in ISO 8601 format. |
|**category** | **String** | Unique category name. |
|**creationStatus** | [**CreationStatusEnum**](#CreationStatusEnum) | Indicates the status of the campaign creation. |
|**vouchersGenerationStatus** | [**VouchersGenerationStatusEnum**](#VouchersGenerationStatusEnum) | Indicates the status of the campaign&#39;s voucher generation. |
|**_protected** | **Boolean** | Indicates whether the resource can be deleted. |
|**categoryId** | **String** | Unique category ID that this campaign belongs to. |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Contains details about the category. |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about the campaign. |
|**loyaltyTiersExpiration** | [**LoyaltyTiersExpirationAll**](LoyaltyTiersExpirationAll.md) |  |
|**validationRulesAssignments** | [**ValidationRulesAssignmentsList**](ValidationRulesAssignmentsList.md) |  |
|**accessSettingsAssignments** | [**AccessSettingsCampaignAssignmentsList**](AccessSettingsCampaignAssignmentsList.md) |  |



## Enum: CampaignTypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_PROGRAM | &quot;LOYALTY_PROGRAM&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO_UPDATE | &quot;AUTO_UPDATE&quot; |
| STATIC | &quot;STATIC&quot; |



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



## Enum: CreationStatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;DONE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |
| DRAFT | &quot;DRAFT&quot; |
| MODIFYING | &quot;MODIFYING&quot; |



## Enum: VouchersGenerationStatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;DONE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |
| DRAFT | &quot;DRAFT&quot; |
| MODIFYING | &quot;MODIFYING&quot; |




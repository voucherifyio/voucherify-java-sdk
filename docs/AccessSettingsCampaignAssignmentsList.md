

# AccessSettingsCampaignAssignmentsList

Lists all assignments of the campaign to areas and stores. For [GET List Campaigns](ref:list-campaigns), this is returned if the `expand=access_settings_assignments` query parameter is passed in the request.  **NOTE**: This object is returned only if the Areas and Stores enterprise feature is enabled. Contact [Voucherify Sales](https://www.voucherify.io/contact-sales) to learn more.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. Default is &#x60;list&#x60;. This object stores information about campaign assignments to areas and stores |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of campaign assignments. |
|**data** | [**List&lt;AreaStoreCampaignAssignment&gt;**](AreaStoreCampaignAssignment.md) | Contains an array of campaign assignments. |
|**total** | **Integer** | Total number of areas and stores to which the campaign is assigned. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




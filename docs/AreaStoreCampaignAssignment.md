

# AreaStoreCampaignAssignment

An object representing an assignment of a campaign to an area or store.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the campaign assignment. |
|**areaId** | **String** | Unique identifier of the area to which the campaign is assigned. |
|**allStores** | **Boolean** | Determines if the campaign is assigned to all of the stores in the area, i.e. if an area ID is passed in the &#x60;access_settings.assign.area_all_stores_ids&#x60; in the request. |
|**areaStoreId** | **String** | Unique identifier of the store to which the campaign is assigned. |
|**createdAt** | **OffsetDateTime** | Date and time when the assignment was made. The value is shown in the ISO 8601 format. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the campaign assignment to areas or stores. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| AREA_STORE_CAMPAIGN_ASSIGNMENT | &quot;area_store_campaign_assignment&quot; |




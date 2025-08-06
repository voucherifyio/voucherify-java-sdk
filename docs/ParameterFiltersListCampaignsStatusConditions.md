

# ParameterFiltersListCampaignsStatusConditions

Data conditions used to narrow down the data records to be returned in the result.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**$active** | **Object** | Campaigns finished generation codes. This also returns campaigns regardless of their &#x60;expiration_date&#x60; and &#x60;start_date&#x60;. |
|**$failed** | **Object** | Campaigs failed to generated codes. |
|**$inProgress** | **Object** | Campaigns are generating codes or they are updating. |
|**$expired** | **Object** | Campaigns generated codes, but their &#x60;expiration_date&#x60; is in the past. |
|**beforeStart** | **Object** | Campaigns generated codes, but their &#x60;start_date&#x60; is in the future. |




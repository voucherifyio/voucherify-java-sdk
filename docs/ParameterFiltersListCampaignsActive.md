

# ParameterFiltersListCampaignsActive

Filters campaigns by their `active` state. Pass the filter as an empty object, for example `filters[active][conditions][$enabled]=`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**$enabled** | **Object** | Campaigns are enabled. |
|**$disabled** | **Object** | Campaigns are disabled. |
|**$expired** | **Object** | Campaign &#x60;expiration_date&#x60; is in the past. |
|**$active** | **Object** | Campaigns are active, &#x60;start_date&#x60; is &#x60;null&#x60; or in the past, and &#x60;expiration_date&#x60; is &#x60;null&#x60; or in the future. |




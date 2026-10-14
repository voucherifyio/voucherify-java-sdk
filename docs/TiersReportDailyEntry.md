

# TiersReportDailyEntry

Aggregated daily program tier-movement statistics for one period, tier structure, and tier. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the aggregation period on the project-local calendar (&#x60;YYYY-MM-DD&#x60;). The date is truncated to the resolution. For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**tierStructureId** | **String** | Unique identifier of the tier structure (format &#x60;lts_...&#x60;). |
|**tierId** | **String** | Unique identifier of the tier (format &#x60;lt_...&#x60;). |
|**joins** | **BigDecimal** | Number of members who joined this tier in the period. |
|**upgrades** | **BigDecimal** | Number of upgrades into this tier in the period. |
|**downgrades** | **BigDecimal** | Number of downgrades into this tier in the period. |
|**lefts** | **BigDecimal** | Number of members who left this tier in the period. |
|**prolongs** | **BigDecimal** | Counts expiration-date changes for members who stayed on this tier in the period. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_tiers_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_TIERS_DAILY_REPORT | &quot;program_tiers_daily_report&quot; |




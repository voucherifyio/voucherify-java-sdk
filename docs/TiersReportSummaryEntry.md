

# TiersReportSummaryEntry

Total program tier-movement statistics for one tier structure and tier. All numeric fields default to 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the summary row (format: &#x60;lptrs_&#x60; followed by hexadecimal characters). |
|**tierStructureId** | **String** | Unique identifier of the tier structure (format &#x60;lts_...&#x60;). |
|**tierId** | **String** | Unique identifier of the tier (format &#x60;lt_...&#x60;). |
|**joins** | **BigDecimal** | Total number of members who joined this tier. |
|**upgrades** | **BigDecimal** | Total number of upgrades into this tier. |
|**downgrades** | **BigDecimal** | Total number of downgrades into this tier. |
|**lefts** | **BigDecimal** | Total number of members who left this tier. |
|**prolongs** | **BigDecimal** | Counts expiration-date changes for members who stayed on this tier. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_tiers_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_TIERS_SUMMARY_REPORT | &quot;program_tiers_summary_report&quot; |




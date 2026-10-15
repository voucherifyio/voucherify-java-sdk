

# MembersReportSummaryEntry

All-time member and card changes for the program. Counters that did not change are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the summary row (format: &#x60;lpmrs_&#x60; followed by hexadecimal characters). |
|**membersJoined** | **BigDecimal** | Counts members who joined the program. |
|**membersDeactivated** | **BigDecimal** | Counts members deactivated. Decreases by 1 when a member is activated again. |
|**membersDeleted** | **BigDecimal** | Counts members deleted. |
|**cards** | **BigDecimal** | Counts cards created. Decreases by 1 when a card is unassigned (e.g. when a member is deleted). |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_members_summary_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_MEMBERS_SUMMARY_REPORT | &quot;program_members_summary_report&quot; |






# MembersReportDailyEntry

Member and card changes for one aggregation period. Counters that did not change in the period are 0.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**date** | **LocalDate** | Identifies the start of the truncated aggregation period (&#x60;YYYY-MM-DD&#x60;). For &#x60;week&#x60; this is Monday. For &#x60;month&#x60; this is the first day. For &#x60;quarter&#x60; this is the quarter start. |
|**membersJoined** | **BigDecimal** | Counts members who joined the program in the period. |
|**membersDeactivated** | **BigDecimal** | Counts members deactivated in the period. Decreases by 1 when a member is activated again. |
|**membersDeleted** | **BigDecimal** | Counts members deleted in the period. |
|**cards** | **BigDecimal** | Counts cards created in the period. Decreases by 1 when a card is unassigned (e.g. when a member is deleted). |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program_members_daily_report&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM_MEMBERS_DAILY_REPORT | &quot;program_members_daily_report&quot; |




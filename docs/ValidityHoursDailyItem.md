

# ValidityHoursDailyItem

Defines the reccuring period(s) when the resource will be active.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**startTime** | **String** | Defines the starting hour of validity in the HH:mm format. The resource is *inactive before* this time. |
|**daysOfWeek** | [**List&lt;DaysOfWeekEnum&gt;**](#List&lt;DaysOfWeekEnum&gt;) | Integer array corresponding to the particular days of the week in which the resource is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60;  Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday |
|**expirationTime** | **String** | Defines the ending hour of validity in the HH:mm format. The resource is *inactive after* this time. |



## Enum: List&lt;DaysOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |




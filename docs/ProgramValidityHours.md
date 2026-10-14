

# ProgramValidityHours

Validity hours configuration of the program.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Validity hours mode. |
|**daily** | [**List&lt;ProgramValidityDailyHours&gt;**](ProgramValidityDailyHours.md) | Daily validity windows. Present only when &#x60;type&#x60; is &#x60;DAILY&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;DAILY&quot; |
| ANY_TIME | &quot;ANY_TIME&quot; |




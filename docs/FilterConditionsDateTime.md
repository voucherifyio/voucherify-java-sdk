

# FilterConditionsDateTime

Data filters used to narrow down the data records to be returned in the result.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**$after** | **OffsetDateTime** | Value is after this date. The value for this parameter is shown in the ISO 8601 format. |
|**$before** | **OffsetDateTime** | Value is before this date. The value for this parameter is shown in the ISO 8601 format. |
|**$hasValue** | **String** | Value is NOT null. The value for this parameter is an empty string. |
|**$isUnknown** | **String** | Value is null. The value for this parameter is an empty string. |
|**$moreThan** | **Integer** | Value is more days ago before the current date and time, e.g. more than &#x60;10&#x60; days ago. |
|**$lessThan** | **Integer** | Value is less days before the current date and time, e.g. less than &#x60;10&#x60; days ago. |




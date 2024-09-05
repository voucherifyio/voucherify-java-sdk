

# FilterConditionsString

Data filters used to narrow down the data records to be returned in the result.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**$in** | **List&lt;String&gt;** | Array of resource values that should be included in the results (multiple values). |
|**$notIn** | **List&lt;String&gt;** | Array of resource values that should be included in the results (multiple values). |
|**$is** | **String** | Value is exactly this value (single value). |
|**$isNot** | **String** | Results omit this value (single value). |
|**$hasValue** | **String** | Value is NOT null. The value for this parameter is an empty string. |
|**$isUnknown** | **String** | Value is null. The value for this parameter is an empty string. |
|**$startsWith** | **String** | Value starts with the specified string. |
|**$endsWith** | **String** | Value ends with the specified string. |




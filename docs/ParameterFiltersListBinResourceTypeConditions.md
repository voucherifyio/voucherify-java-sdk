

# ParameterFiltersListBinResourceTypeConditions


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**$in** | [**List&lt;InEnum&gt;**](#List&lt;InEnum&gt;) | Array of resource values that should be included in the results (multiple values). |
|**$notIn** | [**List&lt;NotInEnum&gt;**](#List&lt;NotInEnum&gt;) | Array of resource values that should be included in the results (multiple values). |
|**$is** | [**IsEnum**](#IsEnum) | Value is exactly this value (single value). |
|**$isNot** | [**IsNotEnum**](#IsNotEnum) | Results omit this value (single value). |
|**$hasValue** | **String** | Value is NOT null. The value for this parameter is an empty string. |
|**$isUnknown** | **String** | Value is null. The value for this parameter is an empty string. |
|**$startsWith** | **String** | Value starts with the specified string. |
|**$endsWith** | **String** | Value ends with the specified string. |



## Enum: List&lt;InEnum&gt;

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |



## Enum: List&lt;NotInEnum&gt;

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |



## Enum: IsEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |



## Enum: IsNotEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |
| PRODUCT | &quot;product&quot; |
| SKU | &quot;sku&quot; |
| VOUCHER | &quot;voucher&quot; |




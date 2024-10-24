

# ParameterFiltersListTemplatesCampaignTypeConditions

Data filters used to narrow down the data records to be returned in the result.

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
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |



## Enum: List&lt;NotInEnum&gt;

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |



## Enum: IsEnum

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |



## Enum: IsNotEnum

| Name | Value |
|---- | -----|
| DISCOUNT_COUPONS | &quot;DISCOUNT_COUPONS&quot; |
| GIFT_VOUCHERS | &quot;GIFT_VOUCHERS&quot; |




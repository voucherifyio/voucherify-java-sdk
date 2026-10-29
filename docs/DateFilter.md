

# DateFilter

Date filter conditions. `$before`/`$after` take date strings (ISO 8601); `$is`, `$more_than`, `$less_than` take non-negative integers; `$has_value`/`$is_unknown` are presence checks. Each condition accepts a single value or an array with exactly one value. At least one condition is required.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**conditions** | [**DateFilterConditions**](DateFilterConditions.md) |  |




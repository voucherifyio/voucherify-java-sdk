

# CardLifetimeBucketPendingPoints

Lifetime counters of pending points. The available pending balance is max(`total` - `activated` - `canceled`, 0).

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**total** | **BigDecimal** | Total pending points ever added. |
|**activated** | **BigDecimal** | Total pending points activated into regular points. |
|**canceled** | **BigDecimal** | Total pending points canceled. |




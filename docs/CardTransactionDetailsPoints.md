

# CardTransactionDetailsPoints

Points affected by the transaction (variant-dependent fields; pending points don't return `expiration_date` and `expiration_type`.).

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**total** | **BigDecimal** | Number of points. Negative for debits. |
|**expirationDate** | **LocalDate** | Expiration date of the affected points (&#x60;YYYY-MM-DD&#x60;), or &#x60;null&#x60;. |
|**expirationType** | [**ExpirationTypeEnum**](#ExpirationTypeEnum) | Points expiration type of the affected points, or &#x60;null&#x60;. |
|**date** | **LocalDate** | Activation date of the pending points (&#x60;YYYY-MM-DD&#x60;). Pending points variants only. |
|**type** | [**TypeEnum**](#TypeEnum) | Pending points activation type. Pending points variants only. |



## Enum: ExpirationTypeEnum

| Name | Value |
|---- | -----|
| NO_EXPIRATION | &quot;NO_EXPIRATION&quot; |
| ROLLING_EXPIRATION | &quot;ROLLING_EXPIRATION&quot; |
| CALENDAR_EXPIRATION | &quot;CALENDAR_EXPIRATION&quot; |
| SLIDING_EXPIRATION | &quot;SLIDING_EXPIRATION&quot; |
| NULL | &quot;null&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMMEDIATE | &quot;IMMEDIATE&quot; |
| PERIOD_BASED | &quot;PERIOD_BASED&quot; |
| FIXED_DATES | &quot;FIXED_DATES&quot; |
| EVENT_BASED | &quot;EVENT_BASED&quot; |




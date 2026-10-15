

# CardNextActivation

The nearest upcoming pending points activation on a card. For the `EVENT_BASED` type, `date` is omitted and `cancel_date` is returned instead; for other types `date` is returned and `cancel_date` is omitted.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**points** | **BigDecimal** | Number of pending points to be activated. |
|**type** | [**TypeEnum**](#TypeEnum) | Pending points activation type from the card definition. |
|**date** | **LocalDate** | Activation date (&#x60;YYYY-MM-DD&#x60;). Present for all types except &#x60;EVENT_BASED&#x60;. |
|**cancelDate** | **LocalDate** | Date when the pending points are canceled if the activating event does not occur (&#x60;YYYY-MM-DD&#x60;). Present only for the &#x60;EVENT_BASED&#x60; type. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMMEDIATE | &quot;IMMEDIATE&quot; |
| PERIOD_BASED | &quot;PERIOD_BASED&quot; |
| FIXED_DATES | &quot;FIXED_DATES&quot; |
| EVENT_BASED | &quot;EVENT_BASED&quot; |




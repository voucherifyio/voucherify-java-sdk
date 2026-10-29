

# CardActivity

An activity recorded for a card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**createdAt** | **OffsetDateTime** | Timestamp when the activity was recorded (ISO 8601). |
|**groupId** | **String** | ID grouping activities recorded within the same request. |
|**source** | [**ActivitySource**](ActivitySource.md) |  |
|**id** | **String** | Unique activity ID. |
|**cardId** | **String** | ID of the card the activity relates to. |
|**type** | [**TypeEnum**](#TypeEnum) | Activity type. Allowed values: &#x60;vl.card.created&#x60;, &#x60;vl.card.assigned&#x60;, &#x60;vl.card.unassigned&#x60;, &#x60;vl.card.code_generation.succeeded&#x60;, and &#x60;vl.card.code_generation.failed&#x60;. |
|**data** | [**CardActivityData**](CardActivityData.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;vl.card.created&quot; |
| ASSIGNED | &quot;vl.card.assigned&quot; |
| UNASSIGNED | &quot;vl.card.unassigned&quot; |
| CODE_GENERATION_SUCCEEDED | &quot;vl.card.code_generation.succeeded&quot; |
| CODE_GENERATION_FAILED | &quot;vl.card.code_generation.failed&quot; |




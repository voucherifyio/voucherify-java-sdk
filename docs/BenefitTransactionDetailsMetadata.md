

# BenefitTransactionDetailsMetadata

Benefit transaction metadata written at fulfillment time.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**eventId** | **String** | Unique identifier of the event that triggered the fulfillment. Custom events use the &#x60;evcus_&#x60; prefix; other source events use their own ID formats. |
|**earningItemId** | **String** | Identifier of the earning item that produced the benefit (format &#x60;lernei_...&#x60;). &#x60;null&#x60; when the earning item is unknown. |




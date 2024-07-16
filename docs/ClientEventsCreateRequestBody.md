

# ClientEventsCreateRequestBody

Request body schema for **POST** `/events`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**event** | **String** | Event name. This is the same name that you used to define a custom event in the **Dashboard** &gt; **Project Settings** &gt; **Event Schema**. |
|**customer** | [**Customer**](Customer.md) |  |
|**referral** | [**ClientEventsCreateRequestBodyReferral**](ClientEventsCreateRequestBodyReferral.md) |  |
|**loyalty** | [**ClientEventsCreateRequestBodyLoyalty**](ClientEventsCreateRequestBodyLoyalty.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the event. A set of key/value pairs that you can attach to an event object. It can be useful for storing additional information about the event in a structured format. Event metadata schema is defined in the **Dashboard** &gt; **Project Settings** &gt; **Event Schema** &gt; **Edit particular event** &gt; **Metadata property definition**. |




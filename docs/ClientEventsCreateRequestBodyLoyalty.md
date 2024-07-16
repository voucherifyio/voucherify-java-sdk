

# ClientEventsCreateRequestBodyLoyalty

If an earning rule in a loyalty program is based on a custom event. This objects let's you specify the loyalty card to which the custom event should be attributed to.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**code** | **String** | Code of the loyalty card to receive points based on the calculation method defined in the related earning rule. An earning rule is triggered for the loyalty card when the event passed in the &#x60;event&#x60; parameter of the request payload gets sent along with this loyalty card code. |




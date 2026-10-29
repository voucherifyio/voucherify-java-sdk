

# CardSimple

A loyalty card in its simple representation, as embedded in member responses.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the card. |
|**cardDefinitionId** | **String** | Identifies the card definition. |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. Currently only &#x60;INDIVIDUAL&#x60; is supported. |
|**code** | **String** | Human-readable card code. Card code generation is asynchronous - this field is &#x60;null&#x60; right after member creation and is populated shortly after, once the background code generation completes. |
|**lifetimeBucket** | [**CardLifetimeBucket**](CardLifetimeBucket.md) |  |
|**balance** | [**CardBalance**](CardBalance.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type. Always &#x60;card&#x60;. |
|**nextExpiration** | [**CardNextExpiration**](CardNextExpiration.md) |  |
|**nextActivation** | [**CardNextActivation**](CardNextActivation.md) |  |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |




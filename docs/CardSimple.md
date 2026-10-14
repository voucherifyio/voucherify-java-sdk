

# CardSimple

A loyalty card in its simple representation, as embedded in member responses.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. Currently only &#x60;INDIVIDUAL&#x60; is supported. |
|**lifetimeBucket** | [**CardLifetimeBucket**](CardLifetimeBucket.md) |  |
|**balance** | [**CardBalance**](CardBalance.md) |  |
|**id** | **String** | Unique Voucherify ID of the card. |
|**cardDefinitionId** | **String** | Unique Voucherify ID of the card definition the card was created from. |
|**code** | **String** | Human-readable card code. Card code generation is asynchronous - this field is &#x60;null&#x60; right after member creation and is populated shortly after, once the background code generation completes. |
|**nextExpiration** | [**CardNextExpiration**](CardNextExpiration.md) |  |
|**nextActivation** | [**CardNextActivation**](CardNextActivation.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;card&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |




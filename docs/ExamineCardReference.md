

# ExamineCardReference

Card reference in examine results.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique card ID (&#x60;lcrd_...&#x60;). |
|**cardDefinitionId** | **String** | Unique card definition ID (&#x60;lcdef_...&#x60;). |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type. Currently only &#x60;INDIVIDUAL&#x60; exists. |
|**code** | **String** | Card code. May be &#x60;null&#x60; right after member creation because card codes are generated asynchronously. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;card&#x60;. |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |




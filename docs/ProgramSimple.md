

# ProgramSimple

A loyalty program in its simple representation, as embedded in membership responses.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique program identifier. |
|**name** | **String** | Program name. |
|**status** | [**StatusEnum**](#StatusEnum) | Program status. |
|**metadata** | **Object** | User-defined key-value metadata. Defaults to &#x60;{}&#x60;. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;program&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PROGRAM | &quot;program&quot; |




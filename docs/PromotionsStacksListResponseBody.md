

# PromotionsStacksListResponseBody

Response body schema for **GET** `v1/promotions/stacks` and for **GET** `v1/promotions/{campaignId}/stacks`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about promotion stacks in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of promotion stack objects. |
|**data** | [**List&lt;PromotionStack&gt;**](PromotionStack.md) | Contains array of promotion stack objects. |
|**total** | **Integer** | Total number of promotion stacks. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




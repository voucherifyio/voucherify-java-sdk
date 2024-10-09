

# ManagementProjectsWebhooksListResponseBody

Object containing a list of webhook configurations.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the webhook configurations in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of webhook objects. |
|**data** | [**List&lt;ManagementProjectsWebhook&gt;**](ManagementProjectsWebhook.md) | Array of webhook objects. |
|**total** | **Integer** | The total number of webhook objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




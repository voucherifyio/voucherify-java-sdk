

# SegmentsCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**name** | **String** | Segment name. |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**customers** | **List&lt;String&gt;** | Array of customer IDs. |
|**filter** | **Object** | Defines a set of criteria for an &#x60;auto-update&#x60; or &#x60;passive&#x60; segment type. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |
| AUTO_UPDATE | &quot;auto-update&quot; |
| PASSIVE | &quot;passive&quot; |




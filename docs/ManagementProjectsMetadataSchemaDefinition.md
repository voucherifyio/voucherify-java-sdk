

# ManagementProjectsMetadataSchemaDefinition

Custom definition name. This is also shown in **Project Settings** > **Metadata Schema** in the Voucherify Dashboard.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of metadata. Note that &#x60;\&quot;geopoint\&quot;&#x60; type is a paid feature. |
|**optional** | **Boolean** | Indicates if this definition is optional or not for the resource. |
|**array** | **Boolean** | Indicates if the definition is an array. |
|**deleted** | **Boolean** | Indicates if the definition has been deleted from the schema. |
|**objectType** | **String** | The name of the custom resource (i.e. a nested object) if the resource has been previously defined. Otherwise, it is &#x60;null&#x60; for other types. |
|**minLength** | **Integer** | Value indicating the minimum length. Available only for the &#x60;string&#x60; type. |
|**maxLength** | **Integer** | Value indicating the maximum length. Available only for the &#x60;string&#x60; type. |
|**exactLength** | **Integer** | Value indicating the exact length. Available only for the &#x60;string&#x60; type. |
|**eq** | **List&lt;Object&gt;** |  |
|**ne** | **List&lt;BigDecimal&gt;** | Array of values that are not allowed. Available only for the &#x60;number&#x60; type. |
|**lt** | **BigDecimal** | A property of the &#x60;number&#x60; type must have &#x60;less than&#x60; this value. The value should be up to two decimal places. |
|**lte** | **BigDecimal** | A property of the &#x60;number&#x60; type must be &#x60;less than or equal&#x60; to this value. The value should be up to two decimal places. |
|**gt** | **BigDecimal** | A property of &#x60;number&#x60; type must be &#x60;greater than&#x60; this value. The value should be up to two decimal places. |
|**gte** | **BigDecimal** | A property of &#x60;number&#x60; type must be &#x60;greater than or equal&#x60; to this value. The value should be up to two decimal places. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER | &quot;number&quot; |
| OBJECT | &quot;object&quot; |
| DATE | &quot;date&quot; |
| DATETIME | &quot;datetime&quot; |
| GEOPOINT | &quot;geopoint&quot; |
| BOOLEAN | &quot;boolean&quot; |
| IMAGE_URL | &quot;image_url&quot; |




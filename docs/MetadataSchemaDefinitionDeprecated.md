

# MetadataSchemaDefinitionDeprecated

Custom definition name. This is also shown in **Project Settings** > **Metadata Schema** in the Voucherify Dashboard.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**type** | [**TypeEnum**](#TypeEnum) |  |
|**array** | **Boolean** | Indicates whether the definition is an array. |
|**optional** | **Boolean** | Indicates whether this definition is optional or not optional for the resource. |
|**objectType** | **String** | Returns the name of the custom resource if the resource was previously defined in the Dashboard as a custom (non-standard) Nested object. |
|**eq** | **List&lt;Object&gt;** | Array of possible values when the setting for &#x60;is equal to any of&#x60; in the Dashboard is defined explicitly. |
|**ne** | **List&lt;Object&gt;** | Array of values that are not allowed when the setting for &#x60;is not equal to any of&#x60; in the Dashboard is defined explicitly. |
|**lt** | **Integer** | A property of &#x60;number&#x60; type must have &#x60;less than&#x60; this value. |
|**lte** | **Integer** | A property of &#x60;number&#x60; type must be &#x60;less than or equal&#x60; to this value. |
|**gt** | **Integer** | A property of &#x60;number&#x60; type must be &#x60;greater than&#x60; this value. |
|**gte** | **Integer** | A property of &#x60;number&#x60; type must be &#x60;greater than or equal&#x60; to this value. |
|**deleted** | **Boolean** | Indicates whether the definition was deleted from the schema. |
|**maxLength** | **Integer** | Value for maximum length when the setting for &#x60;has maximum length of&#x60; in the Dashboard is defined explicitly. |
|**minLength** | **Integer** | Value indicating minimum length when the setting for &#x60;has minimum length of&#x60; in the Dashboard is defined explicitly. |
|**exactLength** | **Integer** | Value indicating exact length when the setting for &#x60;has exact length of&#x60; in the Dashboard is defined explicitly. |



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




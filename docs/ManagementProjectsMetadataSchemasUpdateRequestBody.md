

# ManagementProjectsMetadataSchemasUpdateRequestBody



## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**allowDefinedOnly** | **Boolean** | Restricts the creation of metadata fields when set to &#x60;true&#x60;. In other words, it indicates whether or not you are allowed to create new metadata definitions; for example, in the campaign manager or publication manager. If it is set to true, then only the defined fields will be available for assigning values.  |
|**properties** | [**Map&lt;String, ManagementProjectsMetadataSchemaDefinition&gt;**](ManagementProjectsMetadataSchemaDefinition.md) | Contains metadata definitions. There can be many properties within this object.  Only the properties sent in the request will be updated. However, if you send a property, all its key-value pairs must be provided - otherwise, they will be overwritten to new values.  You cannot change the &#x60;\&quot;type\&quot;&#x60; property. However, it is required, so you need to add it to the request. |




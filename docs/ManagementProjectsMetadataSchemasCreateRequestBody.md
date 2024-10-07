

# ManagementProjectsMetadataSchemasCreateRequestBody



## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**relatedObject** | **String** | The resource type. You can define custom metadata schemas, which have a custom &#x60;\&quot;related_object\&quot;&#x60; resource type, or you can use standard resource types: &#x60;\&quot;campaign\&quot;&#x60;, &#x60;\&quot;customer\&quot;&#x60;, &#x60;\&quot;earning_rule\&quot;&#x60;, &#x60;\&quot;loyalty_tier\&quot;&#x60;, &#x60;\&quot;order\&quot;&#x60;, &#x60;\&quot;order_item\&quot;&#x60;, &#x60;\&quot;product\&quot;&#x60;, &#x60;\&quot;promotion_tier\&quot;&#x60;, &#x60;\&quot;publication\&quot;&#x60;, &#x60;\&quot;redemption\&quot;&#x60;, &#x60;\&quot;reward\&quot;&#x60;, &#x60;\&quot;voucher\&quot;&#x60;. |
|**allowDefinedOnly** | **Boolean** | Restricts the creation of metadata fields when set to &#x60;true&#x60;. In other words, it indicates whether or not you are allowed to create new metadata definitions; for example, in the campaign manager or publication manager. If it is set to true, then only the defined fields will be available for assigning values.  |
|**properties** | [**Map&lt;String, ManagementProjectsMetadataSchemaDefinition&gt;**](ManagementProjectsMetadataSchemaDefinition.md) | Contains metadata definitions. There can be many properties within this object.  Only the properties sent in the request will be created. |




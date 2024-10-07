

# MetadataSchema

Object representing a metadata schema.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique identifier of the metadata schema. |
|**relatedObject** | **String** | The resource type. You can define custom metadata schemas, which have a custom &#x60;\&quot;related_object\&quot;&#x60; resource type. The standard metadata schemas are: &#x60;\&quot;campaign\&quot;&#x60;, &#x60;\&quot;customer\&quot;&#x60;, &#x60;\&quot;earning_rule\&quot;&#x60;, &#x60;\&quot;loyalty_tier\&quot;&#x60;, &#x60;\&quot;order\&quot;&#x60;, &#x60;\&quot;order_item\&quot;&#x60;, &#x60;\&quot;product\&quot;&#x60;, &#x60;\&quot;promotion_tier\&quot;&#x60;, &#x60;\&quot;publication\&quot;&#x60;, &#x60;\&quot;redemption\&quot;&#x60;, &#x60;\&quot;reward\&quot;&#x60;, &#x60;\&quot;voucher\&quot;&#x60;. |
|**properties** | [**Map&lt;String, MetadataSchemaDefinition&gt;**](MetadataSchemaDefinition.md) | Contains metadata definitions. |
|**allowDefinedOnly** | **Boolean** | Restricts the creation of metadata fields when set to &#x60;true&#x60;. It indicates whether or not you can create new metadata definitions, e.g. in the campaign or publication manager. If set to &#x60;true&#x60;, then only the defined fields are available for assigning values. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the metadata schema was created. The value for this parameter is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing the date and time when the metadata schema was updated. The value for this parameter is shown in the ISO 8601 format. |
|**_object** | **String** | The type of the object represented by the JSON. This object stores information about the metadata schema. |






# PublicationsCreateRequestBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**voucher** | **String** | Code of the voucher being published. |
|**sourceId** | **String** | The merchant&#39;s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. If &#x60;source_id&#x60; is provided only 1 voucher can be published per request. |
|**customer** | [**Customer**](Customer.md) |  |
|**metadata** | **Object** | The metadata object stores all custom attributes assigned to the publication. A set of key/value pairs that you can attach to a publication object. It can be useful for storing additional information about the publication in a structured format. |
|**channel** | **String** | Specify the distribution channel. |
|**campaign** | [**CreatePublicationCampaign**](CreatePublicationCampaign.md) |  |




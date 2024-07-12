

# PublicationsListResponseBodyPublicationsItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique publication ID, assigned by Voucherify. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format. |
|**customerId** | **String** | Unique customer ID of the customer receiving the publication. |
|**trackingId** | **String** | Customer&#39;s &#x60;source_id&#x60;. |
|**metadata** | [**PublicationsListResponseBodyPublicationsItemMetadata**](PublicationsListResponseBodyPublicationsItemMetadata.md) |  |
|**channel** | **String** | How the publication was originated. It can be your own custom channel or an example value provided here. |
|**sourceId** | **String** | The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service.  |
|**customer** | [**CustomerWithSummaryLoyaltyReferrals**](CustomerWithSummaryLoyaltyReferrals.md) |  |
|**vouchers** | **List&lt;String&gt;** | Contains the voucher IDs that was assigned by Voucherify. and Contains the unique voucher codes that was assigned by Voucherify. |
|**vouchersId** | **List&lt;String&gt;** | Contains the unique internal voucher IDs that was assigned by Voucherify. |
|**result** | [**ResultEnum**](#ResultEnum) |  |
|**voucher** | [**ListPublicationsItemVoucher**](ListPublicationsItemVoucher.md) |  |
|**failureCode** | **String** | Generic reason as to why the create publication operation failed. |
|**failureMessage** | **String** | This parameter will provide more expanded reason as to why the create publication operation failed. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PUBLICATION | &quot;publication&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |




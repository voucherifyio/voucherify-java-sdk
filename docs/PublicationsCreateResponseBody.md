

# PublicationsCreateResponseBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique publication ID, assigned by Voucherify. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format. |
|**customerId** | **String** | Unique customer ID of the customer receiving the publication. |
|**trackingId** | **String** | Customer&#39;s &#x60;source_id&#x60;. |
|**metadata** | **Object** |  |
|**channel** | [**ChannelEnum**](#ChannelEnum) | How the publication was originated. It can be your own custom channel or an example value provided here. |
|**sourceId** | **String** | The merchant&#39;s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service.  |
|**result** | [**ResultEnum**](#ResultEnum) | Status of the publication attempt. |
|**customer** | [**CustomerWithSummaryLoyaltyReferrals**](CustomerWithSummaryLoyaltyReferrals.md) |  |
|**vouchersId** | **List&lt;String&gt;** | Contains the unique internal voucher ID that was assigned by Voucherify. |
|**voucher** | [**Voucher**](Voucher.md) |  |
|**vouchers** | **List&lt;String&gt;** | Contains the unique voucher codes that was assigned by Voucherify. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| PUBLICATION | &quot;publication&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |




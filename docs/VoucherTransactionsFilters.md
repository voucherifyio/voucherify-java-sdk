

# VoucherTransactionsFilters

List of available fields and filters that can be exported with gift card or loyalty card transactions along with the sorting order of the returned data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**order** | [**OrderEnum**](#OrderEnum) | How the export is filtered, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
|**fields** | [**List&lt;FieldsEnum&gt;**](#List&lt;FieldsEnum&gt;) | Array of strings containing the data in the export. These fields define the headers in the CSV file. The array can be a combination of any of the following available fields:  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique transaction ID. | vtx_0cb7811f1c07765800 | | type | Transaction type. | - &#x60;CREDITS_REMOVAL&#x60; &lt;br&gt; - &#x60;CREDITS_ADDITION&#x60; &lt;br&gt; - &#x60;CREDITS_REFUND&#x60; &lt;br&gt; - &#x60;CREDITS_REDEMPTION&#x60; &lt;br&gt; - &#x60;POINTS_ACCRUAL&#x60;&lt;br&gt; - &#x60;POINTS_REDEMPTION&#x60;&lt;br&gt; - &#x60;POINTS_REFUND&#x60;&lt;br&gt; - &#x60;POINTS_ADDITION&#x60;&lt;br&gt; - &#x60;POINTS_REMOVAL&#x60;&lt;br&gt; - &#x60;POINTS_EXPIRATION&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_IN&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_OUT&#x60; | | source_id | Unique transaction source ID. | 8638 | | reason | Contains the reason for the transaction if one was included originally. |  | | balance | The gift card or loyalty card balance after the transaction. |  | | amount | The amount of gift card or loyalty card credits being allocated during the transaction. This value can either be negative or positive depending on the nature of the transaction. |  | | created_at | Timestamp in ISO 8601 format representing the date and time when the transaction was created. | 2022-03-09T09:16:32.521Z  | | voucher_id | Unique Voucher ID. | v_dky7ksKfPX50Wb2Bxvcoeb1xT20b6tcp | | campaign_id | Parent campaign ID. | camp_FNYR4jhqZBM9xTptxDGgeNBV | | source|  Channel through which the transaction was initiated. | API | | details | More detailed information stored in the form of a JSON. | Provides more details related to the transaction in the form of an object. | | related_transaction_id | Unique transaction ID related to a receiver/donor card in the case of a points transfer from/to another card. | vtx_0c9afe802593b34b80 | |
|**filters** | [**VoucherTransactionsExportFilterConditions**](VoucherTransactionsExportFilterConditions.md) |  |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| _CREATED_AT | &quot;-created_at&quot; |
| CREATED_AT | &quot;created_at&quot; |



## Enum: List&lt;FieldsEnum&gt;

| Name | Value |
|---- | -----|
| ID | &quot;id&quot; |
| TYPE | &quot;type&quot; |
| SOURCE_ID | &quot;source_id&quot; |
| REASON | &quot;reason&quot; |
| BALANCE | &quot;balance&quot; |
| AMOUNT | &quot;amount&quot; |
| CREATED_AT | &quot;created_at&quot; |
| VOUCHER_ID | &quot;voucher_id&quot; |
| CAMPAIGN_ID | &quot;campaign_id&quot; |
| SOURCE | &quot;source&quot; |
| DETAILS | &quot;details&quot; |
| RELATED_TRANSACTION_ID | &quot;related_transaction_id&quot; |




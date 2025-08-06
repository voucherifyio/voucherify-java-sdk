

# LoyaltiesTransactionsExportCreateRequestBodyParameters

List of available parameters containing fields and filters that can be exported for transactions in a loyalty card campaign, along with the sorting order of the returned data.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**order** | [**OrderEnum**](#OrderEnum) | How the export is ordered, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order. |
|**fields** | [**List&lt;FieldsEnum&gt;**](#List&lt;FieldsEnum&gt;) | Data fields that will be exported for the transactions that are associated with balance movements on cards in a campaign. |
|**filters** | [**ExportCampaignTransactionsFilters**](ExportCampaignTransactionsFilters.md) |  |



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
| SOURCE | &quot;source&quot; |
| DETAILS | &quot;details&quot; |
| RELATED_TRANSACTION_ID | &quot;related_transaction_id&quot; |




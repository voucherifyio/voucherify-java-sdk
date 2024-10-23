

# QualificationsOption

Configure parameters returned in the response.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**limit** | **Integer** | The maximum number of redeemables to be returned in the API request. The actual number of returned redeemables will be determined by the API. The default value is set to 5 |
|**startingAfter** | **OffsetDateTime** | Cursor used for paging. |
|**filters** | [**QualificationsOptionFilters**](QualificationsOptionFilters.md) |  |
|**expand** | [**List&lt;ExpandEnum&gt;**](#List&lt;ExpandEnum&gt;) | The expand array lets you configure the parameters included in the response. Depending on the strings included in the array, the response will contain different details.   | **Expand Option** | **Response Body** | |:---|:---| | [&#x60;\&quot;redeemable\&quot;&#x60;] | Returns the redeemables&#39;:&lt;br&gt;- metadata&lt;br&gt;- redeemable name,&lt;br&gt;- campaign name,&lt;br&gt;- campaign ID| | [&#x60;\&quot;category\&quot;&#x60;] | - Returns an expanded &#x60;categories&#x60; object, showing details about the category. | | [&#x60;\&quot;validation_rules\&quot;&#x60;] | - Returns an expanded &#x60;validation_rules&#x60; object, showing details about the validation rules. | |
|**sortingRule** | [**SortingRuleEnum**](#SortingRuleEnum) | Is used to determine the order in which data is displayed in the result array.    - &#x60;DEFAULT&#x60; - Sorting descending by &#x60;created_at&#x60;   - &#x60;BEST_DEAL&#x60; - Sorting descending by &#x60;total_applied_discount_amount&#x60;   - &#x60;LEAST_DEAL&#x60; - Sorting ascending by &#x60;total_applied_discount_amount&#x60; |



## Enum: List&lt;ExpandEnum&gt;

| Name | Value |
|---- | -----|
| REDEEMABLE | &quot;redeemable&quot; |
| CATEGORY | &quot;category&quot; |
| VALIDATION_RULES | &quot;validation_rules&quot; |



## Enum: SortingRuleEnum

| Name | Value |
|---- | -----|
| BEST_DEAL | &quot;BEST_DEAL&quot; |
| LEAST_DEAL | &quot;LEAST_DEAL&quot; |
| DEFAULT | &quot;DEFAULT&quot; |




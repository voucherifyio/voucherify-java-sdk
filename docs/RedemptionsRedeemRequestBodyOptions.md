

# RedemptionsRedeemRequestBodyOptions

Configure response expansion and the language of custom validation-rule error messages.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**expand** | [**List&lt;ExpandEnum&gt;**](#List&lt;ExpandEnum&gt;) | Expand array lets you configure params included in the response. Depending on the strings included in the array, the response will contain different details.   | **Expand Option** | **Response Body** | |:---|:---| | [\&quot;order\&quot;] | - Same response as fallback response (without an options object).&lt;br /&gt;- Order data with calculated discounts are listed in each child redeemable object.&lt;br /&gt;- Metadata not included for each discount type. | | [\&quot;redeemable\&quot;] | Expands redeemable objects by including &#x60;metadata&#x60; for each discount type. | | [\&quot;order\&quot;, \&quot;redeemable\&quot;] | - Order data with calculated discounts are listed in each child redeemable object.&lt;br /&gt;- Includes &#x60;metadata&#x60; for each discount type. | | [\&quot;redeemable\&quot;, \&quot;redemption\&quot;, \&quot;category\&quot;] | - Returns each discount type&#39;s &#x60;metadata&#x60; in each child redemption object.&lt;br /&gt;- Returns redemption object &#x60;metadata&#x60;.&lt;br /&gt;- Returns an expanded &#x60;categories&#x60; object, showing details about the category. | |
|**language** | **String** | Selects the language for the custom validation-rule error message. Returns the message in this language when a validation rule fails. Falls back to the Error Message Library default language when omitted or when the requested language has no message. Omits the custom error when no message can be resolved. |



## Enum: List&lt;ExpandEnum&gt;

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |
| REDEMPTION | &quot;redemption&quot; |
| REDEEMABLE | &quot;redeemable&quot; |
| CATEGORY | &quot;category&quot; |




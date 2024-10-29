

# ExportsCreateResponseBodyParameters


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**order** | [**OrderEnum**](#OrderEnum) |  |
|**fields** | [**List&lt;FieldsEnum&gt;**](#List&lt;FieldsEnum&gt;) | Array of strings containing the data in the export. These fields define the headers in the CSV file. |
|**filters** | **Object** | Allowed additional properties must start with \&quot;metadata.\&quot; or \&quot;redemption.\&quot; and Allowed additional properties must start with \&quot;metadata.\&quot; and Allowed additional properties must start with \&quot;metadata.\&quot; or \&quot;address.\&quot; or \&quot;summary.\&quot; or \&quot;loyalty.\&quot; or \&quot;loyalty_tier.\&quot; or \&quot;loyalty_points.\&quot; or \&quot;system_metadata.\&quot; |



## Enum: OrderEnum

| Name | Value |
|---- | -----|
| _CREATED_AT | &quot;-created_at&quot; |
| CREATED_AT | &quot;created_at&quot; |
| _UPDATED_AT | &quot;-updated_at&quot; |
| UPDATED_AT | &quot;updated_at&quot; |
| _CODE | &quot;-code&quot; |
| CODE | &quot;code&quot; |
| _ID | &quot;-id&quot; |
| ID | &quot;id&quot; |
| _VOUCHER_CODE | &quot;-voucher_code&quot; |
| VOUCHER_CODE | &quot;voucher_code&quot; |
| _TRACKING_ID | &quot;-tracking_id&quot; |
| TRACKING_ID | &quot;tracking_id&quot; |
| _CUSTOMER_ID | &quot;-customer_id&quot; |
| CUSTOMER_ID | &quot;customer_id&quot; |
| _NAME | &quot;-name&quot; |
| NAME | &quot;name&quot; |
| _EMAIL | &quot;-email&quot; |
| EMAIL | &quot;email&quot; |
| _SOURCE_ID | &quot;-source_id&quot; |
| SOURCE_ID | &quot;source_id&quot; |
| _CHANNEL | &quot;-channel&quot; |
| CHANNEL | &quot;channel&quot; |
| _STATUS | &quot;-status&quot; |
| STATUS | &quot;status&quot; |
| _EXPIRES_AT | &quot;-expires_at&quot; |
| EXPIRES_AT | &quot;expires_at&quot; |



## Enum: List&lt;FieldsEnum&gt;

| Name | Value |
|---- | -----|
| CODE | &quot;code&quot; |
| VOUCHER_TYPE | &quot;voucher_type&quot; |
| VALUE | &quot;value&quot; |
| FORMULA | &quot;formula&quot; |
| DISCOUNT_TYPE | &quot;discount_type&quot; |
| CAMPAIGN | &quot;campaign&quot; |
| CATEGORY | &quot;category&quot; |
| START_DATE | &quot;start_date&quot; |
| EXPIRATION_DATE | &quot;expiration_date&quot; |
| GIFT_BALANCE | &quot;gift_balance&quot; |
| LOYALTY_BALANCE | &quot;loyalty_balance&quot; |
| REDEMPTION_QUANTITY | &quot;redemption_quantity&quot; |
| REDEMPTION_COUNT | &quot;redemption_count&quot; |
| ACTIVE | &quot;active&quot; |
| QR_CODE | &quot;qr_code&quot; |
| BAR_CODE | &quot;bar_code&quot; |
| METADATA | &quot;metadata&quot; |
| ID | &quot;id&quot; |
| IS_REFERRAL_CODE | &quot;is_referral_code&quot; |
| CREATED_AT | &quot;created_at&quot; |
| UPDATED_AT | &quot;updated_at&quot; |
| VALIDITY_TIMEFRAME_INTERVAL | &quot;validity_timeframe_interval&quot; |
| VALIDITY_TIMEFRAME_DURATION | &quot;validity_timeframe_duration&quot; |
| VALIDITY_DAY_OF_WEEK | &quot;validity_day_of_week&quot; |
| DISCOUNT_AMOUNT_LIMIT | &quot;discount_amount_limit&quot; |
| CAMPAIGN_ID | &quot;campaign_id&quot; |
| ADDITIONAL_INFO | &quot;additional_info&quot; |
| CUSTOMER_ID | &quot;customer_id&quot; |
| DISCOUNT_EFFECT | &quot;discount_effect&quot; |
| DISCOUNT_UNIT_TYPE | &quot;discount_unit_type&quot; |
| DISCOUNT_UNIT_EFFECT | &quot;discount_unit_effect&quot; |
| VALIDATION_RULES_ID | &quot;validation_rules_id&quot; |
| CUSTOMER_SOURCE_ID | &quot;customer_source_id&quot; |
| OBJECT | &quot;object&quot; |
| DATE | &quot;date&quot; |
| VOUCHER_CODE | &quot;voucher_code&quot; |
| PROMOTION_TIER_ID | &quot;promotion_tier_id&quot; |
| CUSTOMER_NAME | &quot;customer_name&quot; |
| TRACKING_ID | &quot;tracking_id&quot; |
| ORDER_ID | &quot;order_id&quot; |
| ORDER_AMOUNT | &quot;order_amount&quot; |
| GIFT_AMOUNT | &quot;gift_amount&quot; |
| LOYALTY_POINTS | &quot;loyalty_points&quot; |
| RESULT | &quot;result&quot; |
| FAILURE_CODE | &quot;failure_code&quot; |
| FAILURE_MESSAGE | &quot;failure_message&quot; |
| NAME | &quot;name&quot; |
| DESCRIPTION | &quot;description&quot; |
| EMAIL | &quot;email&quot; |
| SOURCE_ID | &quot;source_id&quot; |
| ADDRESS_CITY | &quot;address_city&quot; |
| ADDRESS_STATE | &quot;address_state&quot; |
| ADDRESS_LINE_1 | &quot;address_line_1&quot; |
| ADDRESS_LINE_2 | &quot;address_line_2&quot; |
| ADDRESS_COUNTRY | &quot;address_country&quot; |
| ADDRESS_POSTAL_CODE | &quot;address_postal_code&quot; |
| REDEMPTIONS_TOTAL_REDEEMED | &quot;redemptions_total_redeemed&quot; |
| REDEMPTIONS_TOTAL_FAILED | &quot;redemptions_total_failed&quot; |
| REDEMPTIONS_TOTAL_SUCCEEDED | &quot;redemptions_total_succeeded&quot; |
| REDEMPTIONS_TOTAL_ROLLED_BACK | &quot;redemptions_total_rolled_back&quot; |
| REDEMPTIONS_TOTAL_ROLLBACK_FAILED | &quot;redemptions_total_rollback_failed&quot; |
| REDEMPTIONS_TOTAL_ROLLBACK_SUCCEEDED | &quot;redemptions_total_rollback_succeeded&quot; |
| ORDERS_TOTAL_AMOUNT | &quot;orders_total_amount&quot; |
| ORDERS_TOTAL_COUNT | &quot;orders_total_count&quot; |
| ORDERS_AVERAGE_AMOUNT | &quot;orders_average_amount&quot; |
| ORDERS_LAST_ORDER_AMOUNT | &quot;orders_last_order_amount&quot; |
| ORDERS_LAST_ORDER_DATE | &quot;orders_last_order_date&quot; |
| LOYALTY_REFERRED_CUSTOMERS | &quot;loyalty_referred_customers&quot; |
| PHONE | &quot;phone&quot; |
| BIRTHDAY | &quot;birthday&quot; |
| BIRTHDATE | &quot;birthdate&quot; |
| CHANNEL | &quot;channel&quot; |
| IS_WINNER | &quot;is_winner&quot; |
| STATUS | &quot;status&quot; |
| AMOUNT | &quot;amount&quot; |
| DISCOUNT_AMOUNT | &quot;discount_amount&quot; |
| ITEMS_DISCOUNT_AMOUNT | &quot;items_discount_amount&quot; |
| TOTAL_DISCOUNT_AMOUNT | &quot;total_discount_amount&quot; |
| TOTAL_AMOUNT | &quot;total_amount&quot; |
| REFERRER_ID | &quot;referrer_id&quot; |
| VOUCHER_ID | &quot;voucher_id&quot; |
| POINTS | &quot;points&quot; |
| EXPIRES_AT | &quot;expires_at&quot; |
| TYPE | &quot;type&quot; |
| REASON | &quot;reason&quot; |
| SOURCE | &quot;source&quot; |
| BALANCE | &quot;balance&quot; |
| RELATED_TRANSACTION_ID | &quot;related_transaction_id&quot; |
| DETAILS | &quot;details&quot; |




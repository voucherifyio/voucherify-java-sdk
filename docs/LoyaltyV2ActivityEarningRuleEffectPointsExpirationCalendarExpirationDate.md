

# LoyaltyV2ActivityEarningRuleEffectPointsExpirationCalendarExpirationDate

A calendar expiration date. The maximum `day` depends on `month`: 29 for February (month 2), 30 for April/June/September/November (4, 6, 9, 11), 31 for the remaining months. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**day** | **Integer** | Day of month (1-31; validated against the month length). |
|**month** | **Integer** | Month number (1-12). |




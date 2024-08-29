

# EarningRuleBaseLoyaltyOrderTotalAmount

Defines the ratio based on the property defined in the calculation_type parameter. For every set of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every calculation_type, give points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**every** | **Integer** | Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 order amount is written as 1000. |
|**points** | **Integer** | Number of points to be awarded, i.e. how many points to be added to the loyalty card. |




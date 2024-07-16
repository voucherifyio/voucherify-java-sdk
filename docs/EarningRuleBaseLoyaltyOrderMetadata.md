

# EarningRuleBaseLoyaltyOrderMetadata

Defines the ratio based on the property defined in the calculation_type parameter. For every given increment of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every order metadata property value, give points.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**every** | **Integer** | For how many increments of the order metadata property to grant points for. |
|**points** | **Integer** | Number of points to be awarded, i.e. how many points to be added to the loyalty card. |
|**property** | **String** | Order metadata property. |




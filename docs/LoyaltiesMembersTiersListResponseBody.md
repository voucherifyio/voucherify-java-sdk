

# LoyaltiesMembersTiersListResponseBody

Response body schema for **GET** `v1/loyalties/members/{memberId}/tiers`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about loyalty tiers in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of loyalty tier objects. |
|**data** | [**List&lt;LoyaltyTier&gt;**](LoyaltyTier.md) |  |
|**total** | **Integer** | Total number of loyalty tier objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




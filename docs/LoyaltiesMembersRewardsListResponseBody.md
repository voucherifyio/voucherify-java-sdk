

# LoyaltiesMembersRewardsListResponseBody

Response body schema for **GET** `v1/loyalties/members/{memberId}/rewards`

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of loyalty reward objects. |
|**data** | [**List&lt;LoyaltiesMembersRewardsListResponseBodyDataItem&gt;**](LoyaltiesMembersRewardsListResponseBodyDataItem.md) | Contains array of loyalty reward objects. |
|**total** | **Integer** | Total number of loyalty reward objects. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




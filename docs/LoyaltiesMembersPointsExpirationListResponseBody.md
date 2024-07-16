

# LoyaltiesMembersPointsExpirationListResponseBody

Response body schema for **GET** `/loyalties/{campaignId}/members/{memberId}/points-expiration`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about loyalty points expiration buckets in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of loyalty points expiration bucket objects. |
|**data** | [**List&lt;LoyaltiesMembersPointsExpirationListResponseBodyDataItem&gt;**](LoyaltiesMembersPointsExpirationListResponseBodyDataItem.md) | Contains array of loyalty points expiration buckets. |
|**total** | **Integer** | Total number of point expiration buckets. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |




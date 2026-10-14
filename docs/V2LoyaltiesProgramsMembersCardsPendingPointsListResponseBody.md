

# V2LoyaltiesProgramsMembersCardsPendingPointsListResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/members/{memberId}/cards/{cardId}/pending-points`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**data** | [**List&lt;CardPendingPointsBucket&gt;**](CardPendingPointsBucket.md) | Pending point buckets on the current page. |
|**cursor** | [**ListCursor**](ListCursor.md) |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;list&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |




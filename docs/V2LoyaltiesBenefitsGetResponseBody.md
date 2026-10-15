

# V2LoyaltiesBenefitsGetResponseBody

Response body schema for **GET** `/v2/loyalties/benefits/{benefitId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique benefit ID, prefixed with &#x60;lben_&#x60;. |
|**name** | **String** | Benefit name, unique within the project. |
|**type** | [**TypeEnum**](#TypeEnum) | Benefit type. |
|**status** | [**StatusEnum**](#StatusEnum) | Current benefit status. &#x60;DELETED&#x60; appears only in the response of the delete endpoint and in activity snapshots. |
|**stock** | [**V2LoyaltiesBenefitsGetResponseBodyStock**](V2LoyaltiesBenefitsGetResponseBodyStock.md) |  |
|**points** | [**V2LoyaltiesBenefitsGetResponseBodyPoints**](V2LoyaltiesBenefitsGetResponseBodyPoints.md) |  |
|**pointsProportional** | [**V2LoyaltiesBenefitsGetResponseBodyPointsProportional**](V2LoyaltiesBenefitsGetResponseBodyPointsProportional.md) |  |
|**material** | **Object** |  |
|**digital** | **Object** |  |
|**createdAt** | **OffsetDateTime** | Timestamp of when the benefit was created, in ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp of the last update, in ISO 8601 format. &#x60;null&#x60; when the benefit was never updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Type of the object. Always &#x60;benefit&#x60;. |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINTS | &quot;POINTS&quot; |
| POINTS_PROPORTIONAL | &quot;POINTS_PROPORTIONAL&quot; |
| MATERIAL | &quot;MATERIAL&quot; |
| DIGITAL | &quot;DIGITAL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BENEFIT | &quot;benefit&quot; |




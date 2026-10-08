

# Member

A loyalty program member.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the member. |
|**customerId** | **String** | Identifies the enrolled customer. |
|**programId** | **String** | Identifies the loyalty program. |
|**status** | [**StatusEnum**](#StatusEnum) | Current member status. Allowed values: &#x60;ACTIVE&#x60;, &#x60;INACTIVE&#x60;, &#x60;DELETED&#x60;. &#x60;INACTIVE&#x60; members cannot earn points or redeem rewards. |
|**metadata** | **Object** | Stores custom member metadata. Empty object when none is set. |
|**createdAt** | **OffsetDateTime** | Records when the member was created (ISO 8601). |
|**updatedAt** | **OffsetDateTime** | Records the last update (ISO 8601). &#x60;null&#x60; if the member has never been updated. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type. Always &#x60;member&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| MEMBER | &quot;member&quot; |




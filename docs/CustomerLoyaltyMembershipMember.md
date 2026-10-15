

# CustomerLoyaltyMembershipMember

Loyalty v2 member recorded on the customer membership.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Identifies the Loyalty v2 program member. |
|**status** | [**StatusEnum**](#StatusEnum) | Member status. List responses include only ACTIVE memberships. INACTIVE and DELETED remain so existing SDK callers keep compiling. |
|**createdAt** | **OffsetDateTime** | Timestamp representing when the member was created. The value is shown in the ISO 8601 format. |
|**updatedAt** | **OffsetDateTime** | Timestamp representing when the member was updated. The value is shown in the ISO 8601 format. &#x60;null&#x60; when not set. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |




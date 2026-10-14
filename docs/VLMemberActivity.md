

# VLMemberActivity

An activity recorded for a member.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**createdAt** | **OffsetDateTime** | Timestamp when the activity was recorded (ISO 8601). |
|**groupId** | **String** | ID grouping activities recorded within the same request. |
|**source** | [**ActivitySource**](ActivitySource.md) |  |
|**id** | **String** | Unique activity ID. |
|**memberId** | **String** | ID of the member the activity relates to. |
|**type** | [**TypeEnum**](#TypeEnum) | Activity type. Allowed values: &#x60;vl.member.created&#x60;, &#x60;vl.member.updated&#x60;, &#x60;vl.member.deleted&#x60;, &#x60;vl.member.activated&#x60;, &#x60;vl.member.deactivated&#x60;, &#x60;vl.member.card.assigned&#x60;, and &#x60;vl.member.card.unassigned&#x60;. |
|**data** | [**VLMemberActivityData**](VLMemberActivityData.md) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;vl.member.created&quot; |
| UPDATED | &quot;vl.member.updated&quot; |
| DELETED | &quot;vl.member.deleted&quot; |
| ACTIVATED | &quot;vl.member.activated&quot; |
| DEACTIVATED | &quot;vl.member.deactivated&quot; |
| CARD_ASSIGNED | &quot;vl.member.card.assigned&quot; |
| CARD_UNASSIGNED | &quot;vl.member.card.unassigned&quot; |




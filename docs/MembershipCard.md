

# MembershipCard

A membership's loyalty card - the member's assignment to the card (`member_role`, `created_at`) combined with the card details in the `card` object and the member's tier progress on this card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**memberRole** | [**MemberRoleEnum**](#MemberRoleEnum) | Role of the member on this card. Currently, loyalty program members can have only the &#x60;OWNER&#x60; role. |
|**createdAt** | **OffsetDateTime** | Timestamp when the card was assigned to the member (ISO 8601). |
|**card** | **Object** |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;member_card&#x60;. |
|**tierProgress** | [**MemberTierProgress**](MemberTierProgress.md) |  |



## Enum: MemberRoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;OWNER&quot; |
| MEMBER | &quot;MEMBER&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| MEMBER_CARD | &quot;member_card&quot; |




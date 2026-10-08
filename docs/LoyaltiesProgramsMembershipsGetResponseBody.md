

# LoyaltiesProgramsMembershipsGetResponseBody

Response body schema for **GET** `/v2/loyalties/programs/{programId}/memberships/{customerId}`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**member** | [**Member**](Member.md) |  |
|**program** | [**ProgramSimple**](ProgramSimple.md) |  |
|**cards** | [**List&lt;MembershipCard&gt;**](MembershipCard.md) | Member&#39;s loyalty cards, one per card definition assigned to the program. &#x60;tier_progress&#x60; is present when that card definition has a tier structure and the member has a tier on the card. Otherwise it is omitted. &#x60;card.code&#x60; can be &#x60;null&#x60; right after member creation, while code generation is still running. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker, always &#x60;membership&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| MEMBERSHIP | &quot;membership&quot; |




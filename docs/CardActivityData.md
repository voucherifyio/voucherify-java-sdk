

# CardActivityData

Snapshots of the objects involved at the time of the activity. Always contains `card` and `program`. For `vl.card.assigned` and `vl.card.unassigned`, also contains `member` and `member_card`. For `vl.card.code_generation.failed`, also contains `result`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**card** | [**Card**](Card.md) |  |
|**program** | [**Program**](Program.md) |  |
|**member** | [**Member**](Member.md) |  |
|**memberCard** | [**MemberCard**](MemberCard.md) |  |
|**result** | [**CardCodeGenerationFailureResult**](CardCodeGenerationFailureResult.md) |  |




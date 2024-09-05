

# MemberActivity

This is an object representing member activity.    This is a general object which presents moments from members' activity. There are all types of different events that members perform during their journey once they participate in a loyalty program. Events describe moments when the members redeem loyalty cards and earn points or rewards. The list of all types of activities is listed below.  The details describing the activity are collected in an array property named `data`. In this object, software integrators can find all further information explaining the event context.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique event ID, assigned by Voucherify. |
|**type** | **String** | Event type. |
|**data** | **Object** | Contains details about the event. The objects that are returned in the data attribute differ based on the context of the event type. |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the member activity occurred in ISO 8601 format. |
|**groupId** | **String** | Unique identifier of the request that caused the event. |




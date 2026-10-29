

# V2LoyaltiesProgramsMembersCreateRequestBody

Request body schema for **POST** `/v2/loyalties/programs/{programId}/members`.  No additional properties are allowed.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**customerIdentification** | **Object** |  |
|**status** | [**StatusEnum**](#StatusEnum) | Sets the initial member status. Allowed values are &#x60;ACTIVE&#x60; and &#x60;INACTIVE&#x60;. Defaults to &#x60;ACTIVE&#x60; when omitted or &#x60;null&#x60;. |
|**metadata** | **Object** | Stores custom metadata on the member. Validated against the metadata schema for the &#x60;vl_member&#x60; related object when one is configured. Defaults to an empty object when omitted or &#x60;null&#x60;. |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| INACTIVE | &quot;INACTIVE&quot; |




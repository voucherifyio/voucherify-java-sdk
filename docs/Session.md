

# Session


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**key** | [**KeyEnum**](#KeyEnum) | The session unique ID assigned by Voucherify or your own unique session ID. Sending an existing ID will result in overwriting an existing session. If no session key is provided, then a new ID will be generated. |
|**type** | [**TypeEnum**](#TypeEnum) | This parameter is required to establish a new session. The session locks the redemption quantity by 1. |
|**ttl** | **BigDecimal** | Value for the period of time that the session is active. Units for this parameter are defined by the session.ttl_unit parameter. |
|**ttlUnit** | [**TtlUnitEnum**](#TtlUnitEnum) | Defines the type of unit in which the session time is counted. |



## Enum: KeyEnum

| Name | Value |
|---- | -----|
| LOCK | &quot;LOCK&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOCK | &quot;LOCK&quot; |



## Enum: TtlUnitEnum

| Name | Value |
|---- | -----|
| DAYS | &quot;DAYS&quot; |
| HOURS | &quot;HOURS&quot; |
| MICROSECONDS | &quot;MICROSECONDS&quot; |
| MILLISECONDS | &quot;MILLISECONDS&quot; |
| MINUTES | &quot;MINUTES&quot; |
| NANOSECONDS | &quot;NANOSECONDS&quot; |
| SECONDS | &quot;SECONDS&quot; |




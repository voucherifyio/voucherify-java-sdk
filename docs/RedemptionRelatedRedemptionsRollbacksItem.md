

# RedemptionRelatedRedemptionsRollbacksItem


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**id** | **String** | Unique rollback redemption ID. |
|**date** | **OffsetDateTime** | Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format. |
|**rollbackOrderMode** | [**RollbackOrderModeEnum**](#RollbackOrderModeEnum) | Defines the rollback mode for the order. &#x60;WITH_ORDER&#x60; is a default setting. The redemption is rolled back together with the data about the order, including related discount values. &#x60;WITHOUT_ORDER&#x60; allows rolling the redemption back without affecting order data, including the applied discount values. This is returned only in GET &#x60;v1/redemptions/&#x60; and GET &#x60;v1/redemptions/{redemptionId}&#x60; endpoints. |



## Enum: RollbackOrderModeEnum

| Name | Value |
|---- | -----|
| WITH_ORDER | &quot;WITH_ORDER&quot; |
| WITHOUT_ORDER | &quot;WITHOUT_ORDER&quot; |




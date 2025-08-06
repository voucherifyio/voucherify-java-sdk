

# OrdersListResponseBody

Response body schema representing **GET** `v1/orders`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about orders in a dictionary. |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of order objects. |
|**orders** | [**List&lt;OrdersListResponseBodyOrdersItem&gt;**](OrdersListResponseBodyOrdersItem.md) | Contains array of order objects. |
|**total** | **Integer** | Total number of orders. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| ORDERS | &quot;orders&quot; |




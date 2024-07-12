

# VouchersTransactionsListResponseBody

Response body schema for **GET** `/vouchers/{code}/transactions`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of transaction objects. |
|**data** | [**List&lt;VoucherTransaction&gt;**](VoucherTransaction.md) | A dictionary that contains an array of transactions. Each entry in the array is a separate transaction object. |
|**hasMore** | **Boolean** | As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request (with a different page or a different start date filter) to get more records returned in the results. |




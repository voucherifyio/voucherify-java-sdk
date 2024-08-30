

# VouchersUpdateResponseBodyPublish

Stores a summary of publication events: an event counter and endpoint to return details of each event. Publication is an assignment of a code to a customer, e.g. through a distribution.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented is by default &#x60;list&#x60;. To get this list, you need to make a call to the endpoint returned in the &#x60;url&#x60; attribute. |
|**count** | **Integer** | Publication events counter. |
|**url** | **String** | The endpoint where this list of publications can be accessed using a GET method. &#x60;/v1/vouchers/{voucher_code}/publications&#x60; |






# PublicationsListResponseBody

Response body schema for listing publications using **GET** `/publications`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented by JSON. This object stores information about publications in a dictionary. |
|**dataRef** | **String** | Identifies the name of the attribute that contains the array of publications. |
|**publications** | [**List&lt;PublicationsListResponseBodyPublicationsItem&gt;**](PublicationsListResponseBodyPublicationsItem.md) | Response schema model for publishing vouchers to a specific customer. |
|**total** | **Integer** | Total number of publications. |




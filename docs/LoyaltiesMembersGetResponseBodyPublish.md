

# LoyaltiesMembersGetResponseBodyPublish

This object stores a summary of publish events: an events counter and an endpoint which can be called to return details of each event.  A publication is required for loyalty cards and referral codes. This object gets updated whenever a voucher has been published. Publication means assigning a code to a particular customer. Typically, a publication is made by distributing your codes to your customers, e.g. through Export to MailChimp or <!-- [publish voucher](OpenAPI.json/paths/~1publications/post) -->[publish voucher](ref:create-publication) API method.   <!-- title: My Table Title -->  | Required | Optional | | -------- | :------: | | `type`:`LOYALTY_CARD` |  `type`:`DISCOUNT_VOUCHER`   |  | `is_referral_code`:`true`      |    `type`:`GIFT_VOUCHER`   | 

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | **String** | The type of the object represented is by default &#x60;list&#x60;. To get this list, you need to make a call to the endpoint returned in the &#x60;url&#x60; attribute. |
|**count** | **Integer** | Publication event counter. |
|**url** | **String** | The endpoint where this list of publications can be accessed using a GET method. &#x60;/v1/vouchers/{voucher_code}/publications&#x60; |




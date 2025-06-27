

# MemberActivityDataRedemptionChannel

Defines the details of the channel through which the redemption was issued.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**channelId** | **String** | Unique channel ID of the user performing the redemption. This is either a user ID from a user using the Voucherify Dashboard, an X-APP-Id of a user using the API, or the reward assignment ID for automatic reward redemption. |
|**channelType** | [**ChannelTypeEnum**](#ChannelTypeEnum) | The source of the channel for the redemption: &#x60;USER&#x60; - the redemption was made in the Voucherify Dashboard by a user,  &#x60;API&#x60; - redemption was made through the API, &#x60;AUTO_REDEEM&#x60; - the redemption was made automatically for a reward. |



## Enum: ChannelTypeEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| AUTO_REDEEM | &quot;AUTO_REDEEM&quot; |
| USER | &quot;USER&quot; |




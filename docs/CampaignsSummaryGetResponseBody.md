

# CampaignsSummaryGetResponseBody


## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object, which is &#x60;campaign_summary&#x60;. |
|**campaign** | [**CampaignBase**](CampaignBase.md) |  |
|**redemptions** | **Integer** | Total number of redemptions, which includes successful and failed redemptions. |
|**redemptionsSucceeded** | **Integer** | Total number of successful redemptions. |
|**redemptionsFailed** | **Integer** | Total number of failed redemptions. |
|**rollbacks** | **Integer** | Total number of rollbacks, which includes successful and failed rollbacks. |
|**rollbacksSucceeded** | **Integer** | Total number of successful rollbacks. |
|**rollbacksFailed** | **Integer** | Total number of failed rollbacks. |
|**validations** | **Integer** | Total number of validations, which includes successful and failed validations. |
|**validationsSucceeded** | **Integer** | Total number of successful validations. |
|**validationsFailed** | **Integer** | Total number of failed validations. |
|**ordersAmount** | **Integer** | Total amount of orders related to the campaign. This amount is not reduced by &#x60;orders_rolledback_amount&#x60;. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**ordersRolledbackAmount** | **Integer** | Total amount of orders that were rolled back and are related to the campaign. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**vouchersCreated** | **Integer** | Total number of vouchers created within the campaign. Includes vouchers generated when the campaign was created, vouchers added manually, or vouchers generated automatically when a new customer joined the campaign. |
|**vouchersDeleted** | **Integer** | Total number of vouchers deleted within the campaign. Includes vouchers moved to the bin and vouchers deleted permanently. Vouchers moved to the bin and then deleted permanently are counted once. |
|**publications** | **Integer** | Total number of publications, which includes successful and failed publications. |
|**publicationsSucceeded** | **Integer** | Total number of successful publications. |
|**publicationsFailed** | **Integer** | Total number of failed publications. |
|**discountedAmount** | **Integer** | Total amount of discounts related to the campaign. This amount is not reduced by the &#x60;rolledback_discounted_amount&#x60;. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**rolledbackDiscountedAmount** | **Integer** | Total amount of discounts orders that were rolled back and are related to the campaign. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**createdVouchersAmount** | **Integer** | The total credit amount for all created gift cards. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**amountAdded** | **Integer** | The total credit amount that was added. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**amountDeleted** | **Integer** | The total credit amount that was deleted by deleting gift cards. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**amountRedeemed** | **Integer** | The total credit amount that was redeemed. This amount is not reduced by the &#x60;amount_rolledback&#x60;. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**amountRolledback** | **Integer** | The total credit amount that was rolled back. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**amountSubtracted** | **Integer** | The total credit amount that was subtracted. The value is multiplied by &#x60;100&#x60; to precisely represent 2 decimal places. For example, &#x60;$10&#x60; is represented as &#x60;1000&#x60;. |
|**createdVouchersPoints** | **Integer** | Total number of points added to newly created loyalty cards. This also counts points added for the loyalty cards which are created by importing a CSV file to a campaign. |
|**pointsDeleted** | **Integer** | Total number of points that were deleted. |
|**pointsSubtracted** | **Integer** | Total number of points that were subtracted. |
|**pointsAdded** | **Integer** | Total number of points that were added. This includes points added manually or automatically by redeeming a reward that adds loyalty points to cards in this campaign. |
|**pointsRewarded** | **Integer** | Total number of points that were rewarded to loyalty cards through earning rules. This includes pending points that were activated. |
|**pointsRedeemed** | **Integer** | Total number of points that were redeemed for rewards. |
|**pointsRolledback** | **Integer** | Total number of points that were rolled back for reward redemptions. |
|**pointsExpired** | **Integer** | Total number of points that have expired. |
|**pointsTransferredOut** | **Integer** | Total number of points transferred out of loyalty cards covered by the campaign. |
|**pointsTransferredIn** | **Integer** | Total number of points transferred into loyalty cards covered by the campaign. |
|**pendingPointsAdded** | **Integer** | Total number of pending points that were added either as part of earning rules or added manually to an existing pending point bucket. Pending points that were activated manually or automatically or that were canceled do not affect this number. |
|**pendingPointsSubtracted** | **Integer** | Total number of pending points that were subtracted from existing pending point buckets. |
|**pendingPointsActivated** | **Integer** | Total number of pending points that were activated manually or automatically. |
|**pendingPointsCanceled** | **Integer** | Total number of pending points that were canceled. |
|**referredCustomers** | **Integer** | Total number of all referred customers. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN_SUMMARY | &quot;campaign_summary&quot; |




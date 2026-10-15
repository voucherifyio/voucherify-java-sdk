

# CardLifetimeBucketPoints

Lifetime counters of regular points. All counters default to 0. The available balance is calculated as: `total` - `subtracted` - `expired` - `spent` - `refunded` + `returned` - `locked` + `unlocked` - `purchased_reversed`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**total** | **BigDecimal** | Total accumulated points, including points added manually, earned by fulfilling earning rules and activated from pending points (excluding returned points). |
|**earned** | **BigDecimal** | Total points earned by fulfilling earning rules (does not include activated pending points or points added manually). |
|**added** | **BigDecimal** | Total manually added points. |
|**purchased** | **BigDecimal** | Total points purchased via a &#x60;LOYALTY_CARD_POINTS&#x60; reward (credited to the target card). |
|**purchasedReversed** | **BigDecimal** | Total purchased points reversed via reward refund. |
|**subtracted** | **BigDecimal** | Total manually subtracted points. |
|**expired** | **BigDecimal** | Total expired points. |
|**spent** | **BigDecimal** | Total points spent on rewards. |
|**refunded** | **BigDecimal** | Total refunded points (points that were earned by products which were later returned). |
|**returned** | **BigDecimal** | Total returned points (by returning a purchased reward). |
|**locked** | **BigDecimal** | Total locked points (by locking a purchased reward). |
|**unlocked** | **BigDecimal** | Total unlocked points (by unlocking a purchased reward). |




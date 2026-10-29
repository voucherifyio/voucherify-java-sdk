

# LoyaltiesExamineEarningRulesExamineResponseBodyCardEstimation

Point estimation for a single card.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**card** | [**ExamineCardReference**](ExamineCardReference.md) |  |
|**pointsEstimation** | **BigDecimal** | Total estimated points for the card across matching earning rules. |
|**earningRules** | [**List&lt;LoyaltiesExamineEarningRulesExamineResponseBodyCardEarningRuleEstimation&gt;**](LoyaltiesExamineEarningRulesExamineResponseBodyCardEarningRuleEstimation.md) | Per-earning-rule estimations contributing to the total. |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type marker. Always &#x60;card_estimation&#x60;. |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD_ESTIMATION | &quot;card_estimation&quot; |




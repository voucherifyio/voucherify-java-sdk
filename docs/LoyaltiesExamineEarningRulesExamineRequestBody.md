

# LoyaltiesExamineEarningRulesExamineRequestBody

Request body schema for **POST** `/v2/loyalties/examine/earning-rules`.  When `trigger.type` is `SPECIFIC`, the context object matching the specific event is required and the other context objects must not be present: `customer.order.paid` > `customer_order_paid`, `customer.segment.entered` > `customer_segment_entered`, `customer.custom_event` > `customer_custom_event`. The API validates field combinations that this schema does not express.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**trigger** | [**LoyaltiesExamineEarningRulesExamineRequestBodyTrigger**](LoyaltiesExamineEarningRulesExamineRequestBodyTrigger.md) |  |
|**customerIdentification** | [**ExamineCustomerIdentification**](ExamineCustomerIdentification.md) |  |
|**customerOrderPaid** | [**LoyaltiesExamineEarningRulesExamineRequestBodyCustomerOrderPaid**](LoyaltiesExamineEarningRulesExamineRequestBodyCustomerOrderPaid.md) |  |
|**customerSegmentEntered** | [**LoyaltiesExamineEarningRulesExamineRequestBodyCustomerSegmentEntered**](LoyaltiesExamineEarningRulesExamineRequestBodyCustomerSegmentEntered.md) |  |
|**customerCustomEvent** | [**LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEvent**](LoyaltiesExamineEarningRulesExamineRequestBodyCustomerCustomEvent.md) |  |




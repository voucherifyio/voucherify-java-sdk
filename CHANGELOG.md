Voucherify Java SDK - Changelog
===============================

- **2017-04-21** - `4.2.0` - Moved validation to a separate module.
- **2017-04-20** - `4.1.0` - Added method to validate voucher.
- **2017-04-11** - `4.0.0` - Fixed redemptions list filter and response format.
- **2016-12-02** - `3.6.1` - Added gift balance. Enhanced utils to support gift vouchers.
- **2016-09-06** - `3.6.0` - Added a method to publish voucher for given code or campaign name.
- **2016-09-06** - `3.5.0` - Added order items.
- **2016-07-19** - `3.4.0` - Voucher code config.
- **2016-07-18** - `3.3.0` - Added a method to update voucher.
- **2016-06-21** - `3.2.0` - Added support for gift vouchers.
  - vouchers has a type now - `VoucherType`: `DISCOUNT_VOUCHER` or `GIFT_VOUCHER`
  - gift vouchers have an amount limit defined in `gift.amount`
  - redeeming a gift voucher requires to provide amount value (`VoucherRedemptionContext.order.amount`)
  - you can redeem gift vouchers multiple times but the total amount cannot exceed the gift amount
- **2016-06-10** - `3.1.0` - Added methods to SDK for supporting Customer API.
- **2016-06-02** - `3.0.0` - New customer model. Customers are now a separate entity in Voucherify, thus there are a few changes in the model:
  - `Customer`: added `source_id` (previously `id` which is now a generated value), `created_at` and `object`
  - `VoucherRedemptionResult` - added `customer_id`
  - `RedemptionEntry` - added `customer_id`
  - `RedemptionDetails` - changed type of  `customer` from `String` to `Customer`
- **2016-05-30** - `2.6.0` - New publish model.
- **2016-04-27** - `2.5.0` - Redemption rollback.
- **2016-04-13** - `2.4.1` - Added customer_id to vouchers and redemption filter.
- **2016-04-12** - `2.4.0` - Create, disable and enable voucher
- **2016-04-04** - `2.3.1` - Updated API URL, HTTPS enabled by default
- **2016-03-11** - `2.3.0` - List vouchers which meet specified filters
- **2016-02-22** - `2.2.0` - List redemptions across all vouchers
- **2015-12-14** - `2.1.0` - New discount model, new discount type: UNIT
- **2015-11-23** - `2.0.1` - Added X-Voucherify-Channel header
- **2015-11-18** - `2.0.0` - New model for voucher redemption result
- **2015-11-18** - `1.9.2` - Added `category` to `Voucher`
- **2015-11-10** - `1.9.0` - Added `VoucherifyUtils` which includes `calculatePrice` for computing product/cart price
                             after discount and `calculateDiscount`.
- **2015-11-09** - `1.8.1` - Changed discount type from double to integer
- **2015-11-06** - `1.8.0` - Added an id to RedemptionEntry

Voucherify Java SDK - Changelog
===============================

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

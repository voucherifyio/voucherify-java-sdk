<p align="center">
  <img src="./voucherify-ruby-sdk.png"/>
</p>

<h3 align="center">Official <a href="http://voucherify.io?utm_source=github&utm_medium=sdk&utm_campaign=acq">Voucherify</a> SDK for Java</h3>

<p align="center">
<a href="https://codeclimate.com/github/voucherifyio/voucherify-ruby-sdk"><img src="https://codeclimate.com/github/voucherifyio/voucherify-ruby-sdk/badges/gpa.svg" /></a>
  <a href="https://travis-ci.org/voucherifyio/voucherify-ruby-sdk"><img src="https://travis-ci.org/voucherifyio/voucherify-ruby-sdk.svg?branch=master" alt="Build Status"/></a>
  <a href="https://rubygems.org/gems/voucherify"><img src="https://img.shields.io/gem/v/voucherify.svg" alt="Gem Version"/></a>
  <a href="https://rubygems.org/gems/voucherify"><img src="https://img.shields.io/gem/dt/voucherify.svg" alt="Gem Downloads"/></a>
</p>
<hr />

<p align="center">
<b><a href="#migration-to-5-x">Migration to 5.x</a></b>
|
<b><a href="#setup">Setup</a></b>
|
<b><a href="#error-handling">Error handling</a></b>
|
<b><a href="#development">Development</a></b>
|
<b><a href="#contributing">Contributing</a></b>
|
<b><a href="#changelog">Changelog</a></b>
</p>

<p align="center">
API:
<a href="#vouchers-api">Vouchers</a>
|
<a href="#campaigns-api">Campaigns</a>
|
<a href="#distributions-api">Distributions</a>
|
<a href="#validations-api">Validations</a>
|
<a href="#redemptions-api">Redemptions</a>
|
<a href="#customers-api">Customers</a>
|
<a href="#products-api">Products</a>
|
<a href="#utils">Utils</a>
</p>

---

## Setup

Grab via Maven:

```xml
<dependency>
  <groupId>pl.rspective.voucherify.client</groupId>
  <artifactId>voucherify-java-sdk</artifactId>
  <version>4.2.0</version>
</dependency>
```

or via Gradle
```groovy
compile 'pl.rspective.voucherify.client:voucherify-java-sdk:5.0.0'

```

[Log-in](http://app.voucherify.io/?utm_source=github&utm_medium=sdk&utm_campaign=acq#/login) to Voucherify web interface and obtain your Application Keys from [Configuration](https://app.voucherify.io/?utm_source=github&utm_medium=sdk&utm_campaign=acq#/app/configuration):

```java
VoucherifyClient voucherify = new VoucherifyClient.Builder()
            .setAppId("YOUR-APPLICATION-ID")
            .setClientSecretKey("YOUR-CLIENT-SECRET-KEY")
            .build();
```

## API

This SDK is fully consistent with restful API Voucherify provides.
Detailed descriptions and example responses you will find at [official docs](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq).
Method headers point to more detailed params description you can use.

### Vouchers API
Methods are provided within `voucherify.vouchers().*` namespace.
- [Create Voucher](#create-voucher)
- [Get Voucher](#get-voucher)
- [Update Voucher](#update-voucher)
- [Delete Voucher](#delete-voucher)
- [List Vouchers](#list-vouchers)
- [Enable Voucher](#enable-voucher)
- [Disable Voucher](#disable-voucher)

#### [Create Voucher]
```java
voucherify.vouchers().create(CreateVoucher createVoucher);
```
Check [voucher object](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#the-voucher-object).
#### [Get Voucher]
```java
voucherify.vouchers().get(String code);
```
#### [Update Voucher]
```java
voucherify.vouchers().update(String code, VoucherUpdate update)
```
#### [Delete Voucher]
```java
voucherify.vouchers().delete(String code, boolean force)
```
#### [List Vouchers]
```java
voucherify.vouchers().list(VouchersFilter filter);
```
#### [Enable Voucher]
```java
voucherify.vouchers().enable(String code);
```
#### [Disable Voucher]
```java
voucherify.vouchers().disable(String code);
```
---

### Campaigns API
Methods are provided within `voucherify.campaigns().*` namespace.
- [Create Campaign](#create-campaign)
- [Add Voucher to Campaign](#add-voucher-to-campaign)
- [Delete Campaign](#delete-campaign)

#### [Create Campaign]
```java
voucherify.campaigns().create(CreateCampaign campaign);
```
#### [Add Voucher to Campaign]
```java
voucherify.campaigns().addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaing);
voucherify.campaigns().addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaing);
```
#### [Delete Campaign]
```java
voucherify.campaigns().delete(String campaignName, DeleteCampaignParams params);
```

---

### Distributions API
Methods are provided within `voucherify.distributions().*` namespace.

- [Publish Vouchers](#publish-vouchers)

#### [Publish Vouchers]
```java
voucherify.distributions().publish(PublishVoucher publishVoucher);
```

---

### Validations API
Methods are provided within `voucherify.validations().*` namespace.

- [Validate Voucher](#validate-voucher)

#### [Validate Voucher]
```java
voucherify.validations().validate(String code, VoucherValidation voucherValidation);
```

---

### Redemptions API
Methods are provided within `voucherify.redemptions.*` namespace.

- [Redeem Voucher](#redeem-voucher)
- [List Redemptions](#list-redemptions)
- [Get Voucher's Redemptions](#get-vouchers-redemptions)
- [Get Redemption](#get-redemption)
- [Rollback Redemption](#rollback-redemption)

#### [Redeem Voucher]
```java
voucherify.redemptions().redeem(String code, RedeemVoucher redeemVoucher);
```
#### [List Redemptions]
```java
voucherify.redemptions().list(RedemptionsFilter filter);
```
#### [Get Voucher's Redemptions]
```java
voucherify.redemptions().getForVoucher(String code);
```
#### [Get Redemption]
```java
voucherify.redemptions().get(String id);
```
#### [Rollback Redemption]
```java
voucherify.redemptions().rollback(String id, String reason, RollbackRedemption rollbackRedemption);
```
Check [redemption rollback object](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#the-redemption-rollback-object).

---

### Customers API
Methods are provided within `voucherify.customers().*` namespace.

- [Create Customer](#create-customer)
- [Get Customer](#get-customer)
- [Update Customer](#update-customer)
- [Delete Customer](#delete-customer)

#### [Create Customer]
```java
voucherify.customers().create(Customer customer);
```
Check [customer object](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#the-customer-object).
#### [Get Customer]
```java
voucherify.customers().get(String id);
```
#### [Update Customer]
```java
voucherify.customers().update(Customer customer);
```
#### [Delete Customer]
```java
voucherify.customers().delete(String id);
```

### Products API
Methods are provided within `voucherify.products().*` namespace.

- [Create Product](#create-product)
- [Get Product](#get-product)
- [Update Product](#update-product)
- [Delete Product](#delete-product)
- [List Products](#list-products)
- [Create SKU](#create-sku)
- [Get SKU](#get-sku)
- [Update SKU](#update-sku)
- [Delete SKU](#delete-sku)
- [List all product SKUs](#list-all-product-skus)

#### [Create Product]
```java
voucherify.products().create(Product product);
```
Check [product object](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#the-product-object).
#### [Get Product]
```java
voucherify.products().get(String id);
```
#### [Update Product]
```java
voucherify.products().update(Product product);
```
#### [Delete Product]
```java
voucherify.products().delete(String id, DeleteProductParams params);
```
#### [List Products]
```java
voucherify.products().list(ProductsFilter filter);
```
#### [Create SKU]
```java
voucherify.products().createSKU(String productId, SKU sku);
```
Check [SKU object](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#the-sku-object).
#### [Get SKU]
```java
voucherify.products().getSKU(String productId, String skuId);
```
#### [Update SKU]
```java
voucherify.products().updateSKU(String product_id, SKU sku);
```
#### [Delete SKU]
```java
voucherify.products().deleteSKU(String productId, String skuId, DeleteSKUParams params);
```
#### [List all product SKUs]
```java
voucherify.products().listSKU(String productId)
```

---

### Validation Rules API
Methods are provided within `voucherify.validationRules().*` namespace.

- [Create Validation Rules](#create-validation-rules)
- [Get Validation Rules](#get-validation-rules)
- [Update Validation Rules](#update-validation-rules)
- [Delete Validation Rules](#delete-validation-rules)

#### [Create Validation Rules]
```java
voucherify.validationRules().create(ValidationRules rules);
```
#### [Get Validation Rules]
```java
voucherify.validationRules().get(String id);
```
#### [Update Validation Rules]
```java
voucherify.validationRules().update(ValidationRules rules);
```
#### [Delete Validation Rules]
```java
voucherify.validationRules().delete(String id);
```

---

### Segments API
Methods are provided within `voucherify.segments().*` namespace.

- [Create Segment](#create-segment)
- [Get Segment](#get-segment)
- [Delete Validation Rules](#delete-segment)

#### [Create Segment]
```java
voucherify.segments().create(Segment segment);
```
#### [Get Segment]
```java
voucherify.segments().get(String id);
```
#### [Delete Segment]
```java
voucherify.segments().delete(String id);
```

---

### Migration from 0.x

Version 1.x of the SDK is not backwards compatible with versions 0.x.
Changes made in version 1.x mostly relate to grouping methods within namespaces.
So all you need to do is to follow the list bellow and just replace methods
with their namespaced equivalent.


---

### Utils

#### Available methods

- `Voucherify::Utils.round_money(value)`
- `Voucherify::Utils.validate_percent_discount(discount)`
- `Voucherify::Utils.validate_amount_discount(discount)`
- `Voucherify::Utils.validate_unit_discount(discount)`
- `Voucherify::Utils.calculate_price(base_price, voucher, [unit_price])`
- `Voucherify::Utils.calculate_discount(base_price, voucher, [unit_price])`

---

## Error handling

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/rspective/voucherify-java-sdk.

## Changelog
* 2017-05-10 - 5.0.0 - Separate modules, general refactoring, updated models.
* 2017-04-21 - 4.2.0 - Moved validation to a separate module.
* 2017-04-20 - 4.1.0 - Added method to validate voucher.
* 2017-04-11 - 4.0.0 - Fixed redemptions list filter and response format.
* 2016-12-02 - 3.6.1 - Added gift balance. Enhanced utils to support gift vouchers.
* 2016-10-07 - 3.6.0 - Added a method to publish voucher.

See more in [Changelog](CHANGELOG.md)

## License

The gem is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).

[Create Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#create-voucher
[Get Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#vouchers-get
[Update Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#update-voucher
[Delete Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#delete-voucher
[List Vouchers]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#list-vouchers
[Enable Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#enable-voucher
[Disable Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#disable-voucher
[Import Vouchers]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#import-vouchers-1

[Create Campaign]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#create-campaign
[Delete Campaign]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#delete-campaign
[Add Voucher to Campaign]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#add-voucher-to-campaign
[Import Vouchers to Campaign]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#import-vouchers

[Publish Vouchers]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#publish-voucher

[Validate Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#validate-voucher

[Redeem Voucher]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#redeem-voucher
[List Redemptions]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#list-redemptions
[Get Voucher's Redemptions]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#vouchers-redemptions
[Get Redemption]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#get-redemption
[Rollback Redemption]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#rollback-redemption

[Create Customer]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#create-customer
[Get Customer]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#read-customer
[Update Customer]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#update-customer
[Delete Customer]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#delete-customer

[Create Product]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#create-product
[Get Product]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#get-product
[Update Product]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#update-product
[Delete Product]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#delete-product
[List Products]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#list-products
[Create SKU]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#create-sku
[Get SKU]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#get-sku
[Update SKU]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#update-sku
[Delete SKU]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#delete-sku
[List all product SKUs]: https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq#list-skus

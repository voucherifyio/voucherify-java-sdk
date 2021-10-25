<p align="center">
  <img src="./voucherify-java-sdk.png"/>
</p>

<h3 align="center">Official <a href="http://voucherify.io?utm_source=github&utm_medium=sdk&utm_campaign=acq">Voucherify</a> SDK for Java</h3>

<p align="center">
<b><a href="#migration-to-5-x">Migration to 5.x</a></b>
|
<b><a href="#setup">Setup</a></b>
|
<b><a href="#synchronous-rx-or-async">Synchronous, Rx or Async?</a></b>
|
<b><a href="#error-handling">Error handling</a></b>
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
<a href="#orders-api">Orders</a>
|
<a href="#loyalties-api">Loyalties</a>
|
<a href="#rewards-api">Rewards</a>
|
<a href="#products-api">Products</a>
|
<a href="#validation-rules-api">Validation Rules</a>
|
<a href="#segments-api">Segments</a>
|
<a href="#promotions-api">Promotions</a>
|
<a href="#events-api">Events</a>
|
<a href="#utils">Utils</a>
</p>

---

## Supported JRE versions
* 8, 9, 10

---

## Setup

Grab via Maven:

```xml
<dependency>
  <groupId>io.voucherify.client</groupId>
  <artifactId>voucherify-java-sdk</artifactId>
  <version>11.0.0</version>
</dependency>
```

or via Gradle
```groovy
compile 'io.voucherify.client:voucherify-java-sdk:11.0.0'

```

[Log-in](http://app.voucherify.io///login) to Voucherify web interface and obtain your Application Keys from [Configuration](https://app.voucherify.io///app/configuration):

```java
VoucherifyClient voucherify = new VoucherifyClient.Builder()
            .setAppId("YOUR-APPLICATION-ID")
            .setClientSecretKey("YOUR-CLIENT-SECRET-KEY")
            .build();
```

### API Endpoint

You can also specify additional client options - like API version or a different endpoint:
```java
VoucherifyClient.Builder()
            .apiVersion(ApiVersion.V_2018_08_01)
            .setEndpoint("api.voucherify.io")
            .build();
```

## Synchronous, Rx or Async?

All the methods in SDK are provided directly or in asynchronous or rx version:

Every method has a corresponding asynchronous extension which can be accessed through the `async()` or `rx()` method of the vouchers module.

```java
try {
    VoucherResponse voucher = client.vouchers.create(createVoucher);
} catch (VoucherifyError e) {
    // error
}
```

or asynchronously:

```java
client.vouchers().async().create(createVoucher, new VoucherifyCallback<VoucherResponse>() {
    @Override
    public void onSuccess(VoucherResponse result) {
    }

    @Override
    public void onFailure(VoucherifyError error) {
    // error
  }
});
```

or using RxJava:

```java
client.vouchers()
        .rx()
        .create(createVoucher)
        .subscribe(new Action1<VoucherResponse>() {
            @Override
            public void call(VoucherResponse voucher) {

            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
            }
        });
```

## API

This SDK is fully consistent with restful API Voucherify provides.
Detailed descriptions and example responses you will find at [official docs](https://docs.voucherify.io/reference?utm_source=github&utm_medium=sdk&utm_campaign=acq).
Method headers point to more detailed params description you can use.

Each namespace provides method equivalents for RxJava and Async/callback style API calls.

### Vouchers API
Methods are provided within `voucherify.vouchers().*` namespace.
- [Create Voucher](#create-voucher)
- [Get Voucher](#get-voucher)
- [Update Voucher](#update-voucher)
- [Delete Voucher](#delete-voucher)
- [List Vouchers](#list-vouchers)
- [Enable Voucher](#enable-voucher)
- [Disable Voucher](#disable-voucher)
- [Add Gift Voucher Balance](#add-gift-voucher-balance)
- [Import Vouchers](#import-vouchers)

#### [Create Voucher]
```java
voucherify.vouchers().create(CreateVoucher createVoucher);
```
Check [voucher object](https://docs.voucherify.io/reference/the-voucher-object).
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
#### [Add Gift Voucher Balance]
```java
voucherify.vouchers().addBalance(String code, AddBalance addBalance);
```
#### [Import Vouchers]
```java
voucherify.vouchers().importVouchers(ImportVouchers importVouchers);
```
#### [Get Qualified Vouchers]
```java
voucherify.vouchers().getQualified(QualificationContext context, QualifiedResourceFilter filter);
```
---

### Campaigns API
Methods are provided within `voucherify.campaigns().*` namespace.
- [Create Campaign](#create-campaign)
- [Add Voucher to Campaign](#add-voucher-to-campaign)
- [Delete Campaign](#delete-campaign)
- [Update Campaign](#update-campaign)
- [Import Vouchers to Campaign](#import-vouchers-to-campaign)

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
#### [Update Campaign]
```java
voucherify.campaigns().update(String name, UpdateCampaign updateCampaign);
```
#### [Import Vouchers to Campaign]
```java
voucherify.campaigns().importVouchers(String campaignName, String campaignName, CampaignImportVouchers importVouchers);
```
#### [Get Qualified Campaigns]
```java
voucherify.campaigns().getQualified(QualificationContext context, QualifiedResourceFilter filter);
```
---

### Distributions API
Methods are provided within `voucherify.distributions().*` namespace.

- [Publish Vouchers](#publish-vouchers)
- [Create Export](#create-export)
- [Get Export](#get-export)
- [Delete Export](#delete-export)
- [List publications](#list-publications)

#### [Publish Vouchers]
```java
voucherify.distributions().publish(PublishVoucher publishVoucher);
```
#### [Create Export]
```java
voucherify.distributions().createExport(CreateExport createExport);
```
#### [Get Export]
```java
voucherify.distributions().getExport(String id);
```
#### [Delete Export]
```java
voucherify.distributions().deleteExport(String id);
```
#### [List publications]
```java
voucherify.distributions.list()
voucherify.distributions.list(ListPublicationsFilter filter)
```

---

### Validations API
Methods are provided within `voucherify.validations().*` namespace.

- [Validate Voucher](#validate-voucher)
- [Validate Promotion Campaign](#validate-promotion-campaign)

#### [Validate Voucher]
```java
voucherify.validations().validate(String code, VoucherValidation voucherValidation);
```

#### [Validate Promotion Campaign]
```java
voucherify.validations().validate(PromotionValidation promotionValidation);
```

---

### Redemptions API
Methods are provided within `voucherify.redemptions.()*` namespace.

- [Redeem Voucher](#redeem-voucher)
- [Redeem Promotion](#redeem-promotion)
- [List Redemptions](#list-redemptions)
- [Get Voucher's Redemptions](#get-vouchers-redemptions)
- [Get Redemption](#get-redemption)
- [Rollback Redemption](#rollback-redemption)

#### [Redeem Voucher]
```java
voucherify.redemptions().redeem(String code, RedeemVoucher redeemVoucher);
```
#### [Redeem Promotion]
```java
voucherify.redemptions().redeem(String id, RedeemPromotion redeemPromotion);
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
Check [redemption rollback object](https://docs.voucherify.io/reference/the-redemption-rollback-object).

---

### Customers API
Methods are provided within `voucherify.customers().*` namespace.

- [Create Customer](#create-customer)
- [Get Customer](#get-customer)
- [Update Customer](#update-customer)
- [Delete Customer](#delete-customer)
- [List Customers](#list-customers)

#### [Create Customer]
```java
voucherify.customers().create(Customer customer);
```
Check [customer object](https://docs.voucherify.io/reference/the-customer-object).
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
#### [List Customers]
```java
voucherify.customers.list()
voucherify.customers.list(CustomersFilter filter)
```

---

### Orders API
Methods are provided within `voucherify.orders.*` namespace.

- [Create Order](#create-order)
- [Get Order](#get-order)
- [Update Order](#update-order)
- [List Orders](#list-orders)

#### [Create Order]
```java
voucherify.orders().create(CreateOrder order)
```
Check [the order object](https://docs.voucherify.io/reference/the-order-object).
#### [Get Order]
```java
voucherify.orders().get(String orderId)
```
#### [Update Order]
```java
voucherify.orders().update(UpdateOrder order)
```
#### [List Orders]
```java
voucherify.orders().list()
voucherify.orders().list(OrdersFilter filter)
```

---


### Rewards API

 #### [Create Rewards]
```java
voucherify.rewards().create(reward);
```
#### [Get Reward]
```java
voucherify.rewards().get(id);
```
#### [Update Reward]
```java
voucherify.rewards().update(id, reward);
```
#### [List Rewards]
```java
voucherify.rewards().list(params);
```
#### [Delete Reward]
```java
voucherify.rewards().delete(id);
```

 #### [List Reward Assignments]
```java
voucherify.rewards().listAssignments(reward_id, query);
```
#### [Create Reward Assignment]
```java
voucherify.rewards().createAssignment(reward_id, assignment);
```
#### [Update Reward Assignment]
```java
voucherify.rewards().updateAssignment(reward_id, assignment_id, assignment);
```
#### [Delete Reward Assignment]
```java
voucherify.rewards().deleteAssignment(reward_id, assignment_id);
```
---

 ### Loyalties API

 #### [List Loyalties]
```java
voucherify.loyalties().list(filter);
```
#### [Create Loyalty]
```java
voucherify.loyalties().create(loyalty);
```
#### [Get Loyalty]
```java
voucherify.loyalties().get(id);
```
#### [Update Loyalty]
```java
voucherify.loyalties().update(id, loyalty);
```
#### [Delete Loyalty]
```java
voucherify.loyalties().delete(id, params);
```

 #### [List Loyalty Reward Assignments]
```java
voucherify.loyalties().listRewardAssignments(loyalty_id, query);
```
#### [Create Loyalty Reward Assignment]
```java
voucherify.loyalties().createRewardAssignment(loyalty_id, assignment);
```
#### [Update Loyalty Reward Assignment]
```java
voucherify.loyalties().updateRewardAssignment(loyalty_id, assignment_id, assignment);
```
#### [Delete Loyalty Reward Assignment]
```java
voucherify.loyalties().deleteRewardAssignment(loyalty_id, assignment_id);
```

 #### [List Loyalty Earning Rules]
```java
voucherify.loyalties().listEarningRules(loyalty_id, query);
```
#### [Create Loyalty Earning Rule]
```java
voucherify.loyalties().createEarningRules(loyalty_id, earning_rule);
```
#### [Update Loyalty Earning Rule]
```java
voucherify.loyalties().updateEarningRule(loyalty_id, earning_rule_id, earning_rule);
```
#### [Delete Loyalty Earning Rule]
```java
voucherify.loyalties().deleteEarningRule(loyalty_id, earning_rule_id);
```

 #### [List Loyalty Members]
```java
voucherify.loyalties().listMembers(loyalty_id, query);
```
#### [Add Loyalty Member]
```java
voucherify.loyalties().addMember(loyalty_id, member);
```
#### [Get Loyalty Member]
```java
voucherify.loyalties().getMember(loyalty_id, member_id);
```
#### [Add Loyalty Card Balance]
```java
voucherify.loyalties().redeemReward(loyalty_id, member_id, add_balance);
```
#### [Redeem Loyalty Reward]
```java
voucherify.loyalties().addLoyaltyCardBalance(loyalty_id, member_id, redeem_reward);
```
---

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
Check [product object](https://docs.voucherify.io/reference/the-product-object).
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
Check [SKU object](https://docs.voucherify.io/reference/the-sku-object).
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

- [Create Validation Rule](#create-validation-rule)
- [Get Validation Rule](#get-validation-rule)
- [Update Validation Rule](#update-validation-rule)
- [List Validation Rules](#list-validation-rules)
- [Delete Validation Rule](#delete-validation-rule)
- [Create Validation Rule Assignment](#create-validation-rule-assignment)
- [List Validation Rule Assignments](#list-validation-rule-assignments)
- [Delete Validation Assignment](#delete-validation-rule-assignment)

#### [Create Validation Rule]
```java
voucherify.validationRules().create(CreateBusinessValidationRule rules);
```
#### [Get Validation Rule]
```java
voucherify.validationRules().get(String id);
```
#### [Update Validation Rule]
```java
voucherify.validationRules().update(UpdateBusinessValidationRule rule);
```
#### [List Validation Rules]
```java
voucherify.validationRules().list(BusinessValidationRuleFilter filer);
```
#### [Delete Validation Rule]
```java
voucherify.validationRules().delete(String id);
```
#### [Create Validation Rule Assignment]
```java
voucherify.validationRules().createAssignment(String ruleId, CreateBusinessValidationRuleAssignment assignment);
```
#### [List Validation Rule Assignments]
```java
voucherify.validationRules().listAssignments(String ruleId, BusinessValidationRuleAssignmentFilter filer);
```
#### [Delete Validation Rule Assignment]
```java
voucherify.validationRules().delete(String ruleId, String assignmentId);
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

### Promotions API
Methods are provided within `voucherify.promotions().*` namespace.

- [Create Promotion Campaign](#create-promotion-campaign)
- [List Promotion Tiers](#list-promotion-tiers)
- [Add Promotion Tier](#add-promotion-tier)
- [Update Promotion Tier](#update-promotion-tier)
- [Delete Promotion Tier](#delete-promotion-tier)

#### [Create Promotion Campaign]
```java
voucherify.promotions().create(CreatePromotionCampaign campaign);
```
#### [List Promotion Tiers]
```java
voucherify.promotions().list(String campaignId);
```
#### [Add Promotion Tier]
```java
voucherify.promotions().addPromotionTier(String tierId, Tier tier);
```
#### [Update Promotion Tier]
```java
voucherify.promotions().updatePromotionTier(String tierId, Tier tier);
```
#### [Delete Promotion Tier]
```java
voucherify.promotions().deletePromotionTier(String tierId);
```

---

### Events API
Methods are provided within `voucherify.events.*` namespace.

- [Create Events](#create-custom-event)

#### [Create event]
Check [customer object](https://docs.voucherify.io/v1/reference#the-customer-object).
```java
voucherify.events.track(CustomEvent customEvent)
```

### Async Actions API
Methods are provided within `voucherify.asyncActions().*` namespace.
- [Get Async Action](#get-async-action)
- [List Async Actions](#list-async-actions)

#### [Get Async Action]
```java
voucherify.asyncActions().get(String id);
```

#### [List Async Actions]
```java
voucherify.asyncActions().list(AsyncActionsFilter filter);
```

---

### Migration to 6.0

Version 6.0 of the SDK is not backwards compatible with previous version
Changes made in version 6.0 relate to `PublishVoucherResponse` class and `RollbackRedemptionResponse` class.

#### Classes changes

* `RollbackRedemptionResponse` class uses `VoucherResponse` class as type for `voucher` field instead of `PublishVoucherResponse`
* `PublishVoucherResponse` class has additional fields to be compatible with API version - `2017-04-20`:

  * `id`
  * `object`
  * `createdAt`
  * `customerId`
  * `trackingId`
  * `voucher`

  When API version `2017-04-05` is used, the `PublishVoucherResponse` object returned from `distributions().publish` call will use older structure and new fields will be set to null.
  Developers using API version `2017-04-05` can still safely access returned fields as before.  
  When API version `2017-04-20` is used, the `PublisherVoucherResponse` object returned from `distributions().publish` call will use new structure and new fields will be set to proper values.
---

### Migration to 5.0

Version 5.x of the SDK is not backwards compatible with previous version
Changes made in version 5.x mostly relate to grouping methods within namespaces.

#### Methods changes:
* `voucherify.customers().getCustomer(String customerId)` - [voucherify.customers().get()](#get-customer)
* `voucherify.customers().createCustomer(Customer customer)` - [voucherify.customers().create()](#create-customer)
* `voucherify.customers().updateCustomer(Customer customer)` - [voucherify.customers().update()](#update-customer)
* `voucherify.customers().deleteCustomer(String customerId)` - [voucherify.customers().delete()](#delete-customers)

* `voucherify.validations().validateVoucher(String code, VoucherValidationContext validityContext)` - [voucherify.validations().validate()](#validate-voucher)

* `voucherify.vouchers().listVouchers(VouchersFilter filter)` - [voucherify.vouchers().list()](#list-vouchers)
* `voucherify.vouchers().fetchVoucher(String identifier)` - [voucherify.vouchers().list()](#get-voucher)
* `voucherify.vouchers().createVoucher(Voucher voucher)` - [voucherify.vouchers().create()](#create-voucher)
* `voucherify.vouchers().updateVoucher(String code, VoucherUpdate voucherUpdate)` - [voucherify.vouchers().update()](#update-voucher)
* `voucherify.vouchers().publishVoucher(String code)` - [voucherify.distributions().publish()](#create-voucher)
* `voucherify.vouchers().disableVoucher(String code)` - [voucherify.vouchers().disable()](#disable-voucher)
* `voucherify.vouchers().enableVoucher(String code)` - [voucherify.vouchers().enable()](#enable-voucher)
* `voucherify.vouchers().redeem(String identifier, String trackingId)` - [voucherify.redemptions().redeem()](#redeem-voucher)
* `voucherify.vouchers().redeem(String identifier, VoucherRedemptionContext redemptionContext)` -  - [voucherify.redemptions().redeem()](#redeem-voucher)
* `voucherify.vouchers().redemption(String identifier)` - [voucherify.redemptions().get()](#get-redemption)
* `voucherify.vouchers().listRedemptions(RedemptionsFilter filter)` - [voucherify.redemptions().list()](#list-redemptions)
* `voucherify.vouchers().rollbackRedemption(String redemptionId, String trackingId, String reason)` - [voucherify.redemptions().rollback()](#rollback-redemption)
* `voucherify.vouchers().validate(String code, VoucherValidationContext validityContext)` - [voucherify.validations().validate()](#validate-voucher)

#### Package changes:

* `pl.rspective.voucherify.client` -> `io.voucherify.client`

#### Classes changes

Most of the classes were moved under the `model/moduleName` package. For example:

* `model/customer` and `model/customer/response` (which contains only response classes)

#### Builders

In most cases invoking builders has changed in the following way:

* `new Customer.Builder()` -> `Customer.builder()`

---

### Utils

#### Available methods

- `VoucherifyUtils.calculatePrice(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`
- `VoucherifyUtils.calculateDiscount(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`

---

## Error handling

When an abnormal situation (http calls return 4xx or 5xx, network issues, )a VoucherifyError. It contains following properties:

* code - HTTP status code.
* message - a human-readable message providing short description about the error.
* details - a human-readable message providing more details about the error, usually includes a hint on how to fix the error.
* key - a short string describing the kind of error that occurred.

###Examples

#### Synchronous
```java
try {
    voucherify.vouchers().create(createVoucher);
  } catch(VoucherifyError e) {
    // Error handling
  }
```

#### RX java
```java
voucherify.vouchers().rx().create(createVoucher)
  .doOnError(new Action1<VoucherifyError>() {
    
    @Override
    public void call(VoucherifyError error) {
     // Error handling
    }
  });
```

#### Async
```java
voucherify.vouchers().async().create(createVoucher, new VoucherifyCallback<VoucherResponse>() {
  
  @Override
  public void onFailure(VoucherifyError error) {
     // Error handling
  }
});
```

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/rspective/voucherify-java-sdk.

## Changelog
* 2021-10-25 - 11.0.0 - Dropped `VoucherifyUtils`. Changed `Integer` to `Long` for amount/quantity/total alike fields. Added discount/gift effects. Aligned OkHttp3 version.
* 2021-07-27 - 10.2.0 - Add support for Async Actions in vouchers import.
* 2021-07-16 - 10.1.0 - Add support for Async Actions
* 2020-10-14 - 10.0.0 - Drop old versions usage. Changed properties type from `Integer` to `Long` in some classes. Add `campaign` and `campaign_id` in Voucher validation response.
* 2020-07-22 - 9.1.1 - Fixed previous release version and improved publishing artifacts
* 2020-07-14 - 9.1.0 - Added possibility to specify points as reward when redeeming loyalty card, fixed UpdateOrder status field
* 2019-09-30 - 9.0.0 - Updated retrofit and rxjava to version >= 2.x. Dropped support for JDK 1.6 and 1.7

See more in [Changelog](CHANGELOG.md)

## License

The SDK is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).

[Get Async Action]: https://docs.voucherify.io/reference/get-async-actions-1
[List Async Actions]: https://docs.voucherify.io/reference/list-async-actions

[Create Voucher]: https://docs.voucherify.io/reference/create-voucher
[Get Voucher]: https://docs.voucherify.io/reference/vouchers-get
[Update Voucher]: https://docs.voucherify.io/reference/update-voucher
[Delete Voucher]: https://docs.voucherify.io/reference/delete-voucher
[List Vouchers]: https://docs.voucherify.io/reference/list-vouchers
[Enable Voucher]: https://docs.voucherify.io/reference/enable-voucher
[Disable Voucher]: https://docs.voucherify.io/reference/disable-voucher
[Add Gift Voucher Balance]: https://docs.voucherify.io/reference/add-gift-voucher-balance
[Import Vouchers]: https://docs.voucherify.io/reference/import-vouchers-1

[Create Campaign]: https://docs.voucherify.io/reference/create-campaign
[Delete Campaign]: https://docs.voucherify.io/reference/delete-campaign
[Add Voucher to Campaign]: https://docs.voucherify.io/reference/add-voucher-to-campaign
[Update Campaign]: https://docs.voucherify.io/reference/update-campaign
[Import Vouchers to Campaign]: https://docs.voucherify.io/reference/import-vouchers

[Publish Vouchers]: https://docs.voucherify.io/reference/publish-voucher
[Create Export]: https://docs.voucherify.io/reference/create-export
[Get Export]: https://docs.voucherify.io/reference/get-export
[Delete Export]: https://docs.voucherify.io/reference/elete-export
[List publications]: https://docs.voucherify.io/reference/list-publications

[Validate Voucher]: https://docs.voucherify.io/reference/validate-voucher

[Redeem Voucher]: https://docs.voucherify.io/reference/redeem-voucher
[List Redemptions]: https://docs.voucherify.io/reference/list-redemptions
[Get Voucher's Redemptions]: https://docs.voucherify.io/reference/vouchers-redemptions
[Get Redemption]: https://docs.voucherify.io/reference/get-redemption
[Rollback Redemption]: https://docs.voucherify.io/reference/rollback-redemption

[Create Customer]: https://docs.voucherify.io/reference/create-customer
[Get Customer]: https://docs.voucherify.io/reference/read-customer
[Update Customer]: https://docs.voucherify.io/reference/update-customer
[Delete Customer]: https://docs.voucherify.io/reference/delete-customer
[List Customers]: https://docs.voucherify.io/reference/list-customers

[Create Product]: https://docs.voucherify.io/reference/create-product
[Get Product]: https://docs.voucherify.io/reference/get-product
[Update Product]: https://docs.voucherify.io/reference/update-product
[Delete Product]: https://docs.voucherify.io/reference/delete-product
[List Products]: https://docs.voucherify.io/reference/list-products
[Create SKU]: https://docs.voucherify.io/reference/create-sku
[Get SKU]: https://docs.voucherify.io/reference/get-sku
[Update SKU]: https://docs.voucherify.io/reference/update-sku
[Delete SKU]: https://docs.voucherify.io/reference/delete-sku
[List all product SKUs]: https://docs.voucherify.io/reference/list-skus

[Create Validation Rule]: https://docs.voucherify.io/reference/create-validation-rules
[Get Validation Rule]: https://docs.voucherify.io/reference/get-validation-rules
[Update Validation Rule]: https://docs.voucherify.io/reference/update-validation-rules
[Delete Validation Rule]: https://docs.voucherify.io/reference/delete-validation-rules

[Create Segment]: https://docs.voucherify.io/reference/create-segment
[Get Segment]: https://docs.voucherify.io/reference/get-segment
[Delete Segment]: https://docs.voucherify.io/reference/delete-segment

[Create Promotion Campaign]: http://docs.voucherify.io/reference/create-promotion-campaign
[Validate Promotion Campaign]: http://docs.voucherify.io/reference/validate-promotions-1
[List Promotion Tiers]: http://docs.voucherify.io/reference/get-promotions
[Add Promotion Tier]: http://docs.voucherify.io/reference/add-promotion-tier-to-campaign
[Redeem Promotion]: http://docs.voucherify.io/reference/redeem-promotion
[Update Promotion Tier]: http://docs.voucherify.io/reference/update-promotion
[Delete Promotion Tier]: http://docs.voucherify.io/reference/delete-promotion

[Create Order]: https://docs.voucherify.io/reference/create-order
[Get Order]: https://docs.voucherify.io/reference/get-order
[Update Order]: https://docs.voucherify.io/reference/update-order
[List Orders]: https://docs.voucherify.io/reference/list-orders

[Create Event]: http://docs.voucherify.io/reference/the-custom-event-object

[Create Order]: https://docs.voucherify.io/reference/create-order
[Get Order]: https://docs.voucherify.io/reference/get-order
[Update Order]: https://docs.voucherify.io/reference/update-order
[List orders]: https://docs.voucherify.io/reference/list-orders

[Create Rewards]:https://docs.voucherify.io/reference/create-reward
[Get Reward]:https://docs.voucherify.io/reference/get-reward
[Update Reward]:https://docs.voucherify.io/reference/update-reward
[List Rewards]:https://docs.voucherify.io/reference/list-rewards
[Delete Reward]:https://docs.voucherify.io/reference/delete-reward
[List Reward Assignments]:https://docs.voucherify.io/reference/list-reward-assignments
[Create Reward Assignment]:https://docs.voucherify.io/reference/create-reward-assgnment
[Update Reward Assignment]:https://docs.voucherify.io/reference/update-reward-assignment
[Delete Reward Assignment]:https://docs.voucherify.io/reference/delete-reward-assignment

 [List Loyalties]:https://docs.voucherify.io/reference/list-loyalty-programs
[Create Loyalty]:https://docs.voucherify.io/reference/create-loyalty-program
[Get Loyalty]:https://docs.voucherify.io/reference/get-loyalty-program
[Update Loyalty]:https://docs.voucherify.io/reference/update-loyalty-program
[Delete Loyalty]:https://docs.voucherify.io/reference/delete-loyalty-program

[List Loyalty Reward Assignments]:https://docs.voucherify.io/reference/list-reward-assignments-1
[Create Loyalty Reward Assignment]:https://docs.voucherify.io/reference/create-reward-assignment-1
[Update Loyalty Reward Assignment]:https://docs.voucherify.io/reference/update-reward-assignment-1
[Delete Loyalty Reward Assignment]:https://docs.voucherify.io/reference/delete-reward-assignment-1

[List Loyalty Earning Rules]:https://docs.voucherify.io/reference/list-earning-rules
[Create Loyalty Earning Rule]:https://docs.voucherify.io/reference/create-earning-rule
[Update Loyalty Earning Rule]:https://docs.voucherify.io/reference/update-earning-rule
[Delete Loyalty Earning Rule]:https://docs.voucherify.io/reference/delete-earning-rule

[List Loyalty Members]:https://docs.voucherify.io/reference/list-members
[Add Loyalty Member]:https://docs.voucherify.io/reference/create-member
[Get Loyalty Member]:https://docs.voucherify.io/reference/get-member
[Add Loyalty Card Balance]:https://docs.voucherify.io/reference/add-loyalty-card-balance
[Redeem Loyalty Reward]:https://docs.voucherify.io/reference/redeem-loyalty-card

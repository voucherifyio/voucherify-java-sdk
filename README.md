<p align="center">
  <img src="./voucherify-java-sdk.png"/>
</p>

<h3 align="center">Official <a href="https://voucherify.io">Voucherify</a> SDK for Java</h3>

<p align="center">
<b><a href="#sdk-versions">SDK Versions</a></b>
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
<a href="#rewards-api">Rewards</a>
|
<a href="#loyalties-api">Loyalties</a>
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
<a href="#async-actions-api">Async Actions</a>
|
<a href="#utils">Utils</a>
</p>

---

## SDK Versions

- See the [MVN Repository](https://mvnrepository.com/artifact/io.voucherify.client/voucherify-java-sdk) for a list of available Java clients
- Version specific notes
  - <a href="#5.0">Migration to 5.x</a>
  - <a href="#6.0">Migration to 6.x</a>

---

## Supported JRE versions

- 8, 9, 10

---

## Setup

Grab via Maven:

```xml
<dependency>
  <groupId>io.voucherify.client</groupId>
  <artifactId>voucherify-java-sdk</artifactId>
  <version>11.1.0</version>
</dependency>
```

or via Gradle

```groovy
compile 'io.voucherify.client:voucherify-java-sdk:11.1.0'

```

[Log-in](https://app.voucherify.io/#/login) to Voucherify web interface and obtain your Application Keys from [Configuration](https://app.voucherify.io/#/app/core/projects/current/general):

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

## Examples

Navigate to the example directory [here](https://github.com/voucherifyio/voucherify-java-sdk/tree/master/src/main/java/io/voucherify/example) to get a head start on using the methods in the below namespaces.

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
- [Get Qualified Vouchers](#get-qualified-vouchers)
- [Release Session](#release-session)

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

#### [Release Session]

```java
voucherify.vouchers().releaseSession(String code, String sessionKey);
```

---

### Campaigns API

Methods are provided within `voucherify.campaigns().*` namespace.

- [Create Campaign](#create-campaign)
- [Add Voucher to Campaign](#add-voucher-to-campaign)
- [Delete Campaign](#delete-campaign)
- [Update Campaign](#update-campaign)
- [Import Vouchers to Campaign](#import-vouchers-to-campaign)
- [Get Qualified Campaigns](#get-qualified-campaigns)

#### [Create Campaign]

```java
voucherify.campaigns().create(CreateCampaign campaign);
```

Check [campaign object](https://docs.voucherify.io/reference/the-campaign-object).

#### [Add Voucher to Campaign]

```java
voucherify.campaigns().addVoucher(String campaignName, AddVoucherToCampaign addVoucherToCampaign);
voucherify.campaigns().addVoucherWithCode(String campaignName, String code, AddVoucherToCampaign addVoucherToCampaign);
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

Check [export object](https://docs.voucherify.io/reference/the-export-object).

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

Methods are provided within `voucherify.rewards().*` namespace.

- [Create Rewards](#create-rewards)
- [Get Reward](#get-reward)
- [Update Reward](#update-reward)
- [List Rewards](#list-rewards)
- [Delete Reward](#delete-reward)
- [List Reward Assignments](#list-reward-assignments)
- [Create Reward Assignment](#create-reward-assignment)
- [Update Reward Assignment](#update-reward-assignment)
- [Delete Reward Assignment](#delete-reward-assignment)

#### [Create Rewards]

```java
voucherify.rewards().create(reward);
```

Check [reward object](https://docs.voucherify.io/reference/the-reward-object).

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

Check [reward assignment object](https://docs.voucherify.io/reference/the-reward-assignment-object).

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

Methods are provided within `voucherify.loyalties().*` namespace.

- [List Loyalties](#list-loyalties)
- [Create Loyalty](#create-loyalty)
- [Get Loyalty](#get-loyalty)
- [Update Loyalty](#update-loyalty)
- [Delete Loyalty](#delete-loyalty)
- [List Loyalty Reward Assignments](#list-loyalty-reward-assignments)
- [Create Loyalty Reward Assignment](#create-loyalty-reward-assignment)
- [Update Loyalty Reward Assignment](#update-loyalty-reward-assignment)
- [Delete Loyalty Reward Assignment](#delete-loyalty-reward-assignment)
- [List Loyalty Earning Rules](#list-loyalty-earning-rules)
- [Create Loyalty Earning Rule](#create-loyalty-earning-rule)
- [Update Loyalty Earning Rule](#update-loyalty-earning-rule)
- [Delete Loyalty Earning Rule](#delete-loyalty-earning-rule)
- [List Loyalty Members](#list-loyalty-members)
- [Add Loyalty Member](#add-loyalty-member)
- [Get Loyalty Member](#get-loyalty-member)
- [Add Loyalty Card Balance](#add-loyalty-card-balance)
- [Redeem Loyalty Reward](#redeem-loyalty-reward)

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

Check [earning rule object](https://docs.voucherify.io/reference/the-earning-rule-object).

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
- [Delete Validation Rule Assignment](#delete-validation-rule-assignment)

#### [Create Validation Rule]

```java
voucherify.validationRules().create(CreateBusinessValidationRule rules);
```

Check the [validation rule object](https://docs.voucherify.io/reference/the-validation-rule-object).

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
- [Delete Segment](#delete-segment)

#### [Create Segment]

```java
voucherify.segments().create(Segment segment);
```

Check [segment object](https://docs.voucherify.io/reference/the-segment-object).

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

Check [promotion tier object](https://docs.voucherify.io/reference/the-promotion-object).

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

- [Create Event](#create-event)

#### [Create event]

Check [event object](https://docs.voucherify.io/reference/the-custom-event-object).

```java
voucherify.events.track(CustomEvent customEvent)
```

---

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

### Utils

#### Available methods

- `VoucherifyUtils.calculatePrice(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`
- `VoucherifyUtils.calculateDiscount(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`

---

## Error handling

When an abnormal situation occurs (http calls return 4xx or 5xx, network issues, and so on), a VoucherifyError is returned. It contains the following properties:

- `code` - HTTP status code.
- `message` - a human-readable message providing a short description about the error.
- `details` - a human-readable message providing more details about the error, usually includes a hint on how to fix the error.
- `key` - a short string describing the kind of error that occurred.

### Example error handling

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

---

### Migration to 6.0<a id='6.0'></a>

Version 6.0 of the SDK is not backwards compatible with previous version
Changes made in version 6.0 relate to `PublishVoucherResponse` class and `RollbackRedemptionResponse` class.

#### Class changes

- `RollbackRedemptionResponse` class uses `VoucherResponse` class as type for `voucher` field instead of `PublishVoucherResponse`
- `PublishVoucherResponse` class has additional fields to be compatible with API version - `2017-04-20`:

  - `id`
  - `object`
  - `createdAt`
  - `customerId`
  - `trackingId`
  - `voucher`

  When API version `2017-04-05` is used, the `PublishVoucherResponse` object returned from `distributions().publish` call will use older structure and new fields will be set to null.
  Developers using API version `2017-04-05` can still safely access returned fields as before.  
  When API version `2017-04-20` is used, the `PublisherVoucherResponse` object returned from `distributions().publish` call will use new structure and new fields will be set to proper values.

---

### Migration to 5.0<a id='5.0'></a>

Version 5.x of the SDK is not backwards compatible with previous version
Changes made in version 5.x mostly relate to grouping methods within namespaces.

#### Method changes

- `voucherify.customers().getCustomer(String customerId)` - [voucherify.customers().get()](#get-customer)
- `voucherify.customers().createCustomer(Customer customer)` - [voucherify.customers().create()](#create-customer)
- `voucherify.customers().updateCustomer(Customer customer)` - [voucherify.customers().update()](#update-customer)
- `voucherify.customers().deleteCustomer(String customerId)` - [voucherify.customers().delete()](#delete-customers)

- `voucherify.validations().validateVoucher(String code, VoucherValidationContext validityContext)` - [voucherify.validations().validate()](#validate-voucher)

- `voucherify.vouchers().listVouchers(VouchersFilter filter)` - [voucherify.vouchers().list()](#list-vouchers)
- `voucherify.vouchers().fetchVoucher(String identifier)` - [voucherify.vouchers().list()](#get-voucher)
- `voucherify.vouchers().createVoucher(Voucher voucher)` - [voucherify.vouchers().create()](#create-voucher)
- `voucherify.vouchers().updateVoucher(String code, VoucherUpdate voucherUpdate)` - [voucherify.vouchers().update()](#update-voucher)
- `voucherify.vouchers().publishVoucher(String code)` - [voucherify.distributions().publish()](#create-voucher)
- `voucherify.vouchers().disableVoucher(String code)` - [voucherify.vouchers().disable()](#disable-voucher)
- `voucherify.vouchers().enableVoucher(String code)` - [voucherify.vouchers().enable()](#enable-voucher)
- `voucherify.vouchers().redeem(String identifier, String trackingId)` - [voucherify.redemptions().redeem()](#redeem-voucher)
- `voucherify.vouchers().redeem(String identifier, VoucherRedemptionContext redemptionContext)` - - [voucherify.redemptions().redeem()](#redeem-voucher)
- `voucherify.vouchers().redemption(String identifier)` - [voucherify.redemptions().get()](#get-redemption)
- `voucherify.vouchers().listRedemptions(RedemptionsFilter filter)` - [voucherify.redemptions().list()](#list-redemptions)
- `voucherify.vouchers().rollbackRedemption(String redemptionId, String trackingId, String reason)` - [voucherify.redemptions().rollback()](#rollback-redemption)
- `voucherify.vouchers().validate(String code, VoucherValidationContext validityContext)` - [voucherify.validations().validate()](#validate-voucher)

#### Package changes

- `pl.rspective.voucherify.client` -> `io.voucherify.client`

#### Class changes

Most of the classes were moved under the `model/moduleName` package. For example:

- `model/customer` and `model/customer/response` (which contains only response classes)

#### Builders

In most cases, invoking builders has changed in the following way:

- `new Customer.Builder()` -> `Customer.builder()`

---

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/rspective/voucherify-java-sdk.

## Changelog

- 2021-12-21 - 11.1.0 - Add support for Session on Voucher validation & redemption as well as session release
- 2021-10-25 - 11.0.0 - Dropped `VoucherifyUtils`. Changed `Integer` to `Long` for amount/quantity/total alike fields. Added missing `FIXED` discount type. Added discount/gift effects. Changed `CampaignType` -> `CampaignExtenstionType`, `CampaignType` now contains actual campaign types like `REFERRAL_PROGRAM`. Aligned OkHttp3 version.
- 2021-07-27 - 10.2.0 - Add support for Async Actions in vouchers import.
- 2021-07-16 - 10.1.0 - Add support for Async Actions
- 2020-10-14 - 10.0.0 - Drop old versions usage. Changed properties type from `Integer` to `Long` in some classes. Add `campaign` and `campaign_id` in Voucher validation response.
- 2020-07-22 - 9.1.1 - Fixed previous release version and improved publishing artifacts
- 2020-07-14 - 9.1.0 - Added possibility to specify points as reward when redeeming loyalty card, fixed UpdateOrder status field
- 2019-09-30 - 9.0.0 - Updated retrofit and rxjava to version >= 2.x. Dropped support for JDK 1.6 and 1.7

See more in [Changelog](CHANGELOG.md)

## License

The SDK is available as open source under the terms of the [MIT License](https://opensource.org/licenses/MIT).

[get async action]: https://docs.voucherify.io/reference/get-async-actions-1
[list async actions]: https://docs.voucherify.io/reference/list-async-actions
[create voucher]: https://docs.voucherify.io/reference/create-voucher
[get voucher]: https://docs.voucherify.io/reference/vouchers-get
[update voucher]: https://docs.voucherify.io/reference/update-voucher
[delete voucher]: https://docs.voucherify.io/reference/delete-voucher
[list vouchers]: https://docs.voucherify.io/reference/list-vouchers
[enable voucher]: https://docs.voucherify.io/reference/enable-voucher
[disable voucher]: https://docs.voucherify.io/reference/disable-voucher
[add gift voucher balance]: https://docs.voucherify.io/reference/add-gift-voucher-balance
[import vouchers]: https://docs.voucherify.io/reference/import-vouchers-1
[release session]: https://docs.voucherify.io/reference/release-validation-session
[create campaign]: https://docs.voucherify.io/reference/create-campaign
[delete campaign]: https://docs.voucherify.io/reference/delete-campaign
[add voucher to campaign]: https://docs.voucherify.io/reference/add-voucher-to-campaign
[update campaign]: https://docs.voucherify.io/reference/update-campaign
[import vouchers to campaign]: https://docs.voucherify.io/reference/import-vouchers
[publish vouchers]: https://docs.voucherify.io/reference/publish-voucher
[create export]: https://docs.voucherify.io/reference/create-export
[get export]: https://docs.voucherify.io/reference/get-export
[delete export]: https://docs.voucherify.io/reference/delete-export
[list publications]: https://docs.voucherify.io/reference/list-publications
[validate voucher]: https://docs.voucherify.io/reference/validate-voucher
[redeem voucher]: https://docs.voucherify.io/reference/redeem-voucher
[list redemptions]: https://docs.voucherify.io/reference/list-redemptions
[get voucher's redemptions]: https://docs.voucherify.io/reference/vouchers-redemptions
[get redemption]: https://docs.voucherify.io/reference/get-redemption
[rollback redemption]: https://docs.voucherify.io/reference/rollback-redemption
[create customer]: https://docs.voucherify.io/reference/create-customer
[get customer]: https://docs.voucherify.io/reference/read-customer
[update customer]: https://docs.voucherify.io/reference/update-customer
[delete customer]: https://docs.voucherify.io/reference/delete-customer
[list customers]: https://docs.voucherify.io/reference/list-customers
[create product]: https://docs.voucherify.io/reference/create-product
[get product]: https://docs.voucherify.io/reference/get-product
[update product]: https://docs.voucherify.io/reference/update-product
[delete product]: https://docs.voucherify.io/reference/delete-product
[list products]: https://docs.voucherify.io/reference/list-products
[create sku]: https://docs.voucherify.io/reference/create-sku
[get sku]: https://docs.voucherify.io/reference/get-sku
[update sku]: https://docs.voucherify.io/reference/update-sku
[delete sku]: https://docs.voucherify.io/reference/delete-sku
[list all product skus]: https://docs.voucherify.io/reference/list-skus
[create validation rule]: https://docs.voucherify.io/reference/create-validation-rules
[get validation rule]: https://docs.voucherify.io/reference/get-validation-rules
[update validation rule]: https://docs.voucherify.io/reference/update-validation-rules
[delete validation rule]: https://docs.voucherify.io/reference/delete-validation-rules
[create segment]: https://docs.voucherify.io/reference/create-segment
[get segment]: https://docs.voucherify.io/reference/get-segment
[delete segment]: https://docs.voucherify.io/reference/delete-segment
[create promotion campaign]: https://docs.voucherify.io/reference/create-promotion-campaign
[validate promotion campaign]: https://docs.voucherify.io/reference/validate-promotions-1
[list promotion tiers]: https://docs.voucherify.io/reference/get-promotions
[add promotion tier]: https://docs.voucherify.io/reference/add-promotion-tier-to-campaign
[redeem promotion]: https://docs.voucherify.io/reference/redeem-promotion
[update promotion tier]: https://docs.voucherify.io/reference/update-promotion
[delete promotion tier]: https://docs.voucherify.io/reference/delete-promotion
[create order]: https://docs.voucherify.io/reference/create-order
[get order]: https://docs.voucherify.io/reference/get-order
[update order]: https://docs.voucherify.io/reference/update-order
[list orders]: https://docs.voucherify.io/reference/list-orders
[create event]: https://docs.voucherify.io/reference/create-custom-event
[create order]: https://docs.voucherify.io/reference/create-order
[get order]: https://docs.voucherify.io/reference/get-order
[update order]: https://docs.voucherify.io/reference/update-order
[list orders]: https://docs.voucherify.io/reference/list-orders
[create rewards]: https://docs.voucherify.io/reference/create-reward
[get reward]: https://docs.voucherify.io/reference/get-reward
[update reward]: https://docs.voucherify.io/reference/update-reward
[list rewards]: https://docs.voucherify.io/reference/list-rewards
[delete reward]: https://docs.voucherify.io/reference/delete-reward
[list reward assignments]: https://docs.voucherify.io/reference/list-reward-assignments
[create reward assignment]: https://docs.voucherify.io/reference/create-reward-assignment
[update reward assignment]: https://docs.voucherify.io/reference/update-reward-assignment
[delete reward assignment]: https://docs.voucherify.io/reference/delete-reward-assignment
[list loyalties]: https://docs.voucherify.io/reference/list-loyalty-programs
[create loyalty]: https://docs.voucherify.io/reference/create-loyalty-program
[get loyalty]: https://docs.voucherify.io/reference/get-loyalty-program
[update loyalty]: https://docs.voucherify.io/reference/update-loyalty-program
[delete loyalty]: https://docs.voucherify.io/reference/delete-loyalty-program
[list loyalty reward assignments]: https://docs.voucherify.io/reference/list-reward-assignments-1
[create loyalty reward assignment]: https://docs.voucherify.io/reference/create-reward-assignment-1
[update loyalty reward assignment]: https://docs.voucherify.io/reference/update-reward-assignment-1
[delete loyalty reward assignment]: https://docs.voucherify.io/reference/delete-reward-assignment-1
[list loyalty earning rules]: https://docs.voucherify.io/reference/list-earning-rules
[create loyalty earning rule]: https://docs.voucherify.io/reference/create-earning-rule
[update loyalty earning rule]: https://docs.voucherify.io/reference/update-earning-rule
[delete loyalty earning rule]: https://docs.voucherify.io/reference/delete-earning-rule
[list loyalty members]: https://docs.voucherify.io/reference/list-members
[add loyalty member]: https://docs.voucherify.io/reference/create-member
[get loyalty member]: https://docs.voucherify.io/reference/get-member
[add loyalty card balance]: https://docs.voucherify.io/reference/add-loyalty-card-balance
[redeem loyalty reward]: https://docs.voucherify.io/reference/redeem-loyalty-card
[get qualified vouchers]: https://docs.voucherify.io/reference/push-qualification-request
[get qualified campaigns]: https://docs.voucherify.io/reference/create-qualification-request
[list validation rules]: https://docs.voucherify.io/reference/list-validation-rules
[create validation rule assignment]: https://docs.voucherify.io/reference/create-validation-rules-assignment
[list validation rule assignments]: https://docs.voucherify.io/reference/list-validation-rule-assignments
[delete validation rule assignment]: https://docs.voucherify.io/reference/delete-validation-rules-assignment

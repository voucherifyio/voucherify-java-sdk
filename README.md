voucherify-java-sdk
===============

###Version: 2.1.0

Java SDK for Voucherify API.

Manage your voucher campaigns, boost ROI & spread awareness. API-FIRST VOUCHER MANAGEMENT

You can browse the [javadoc](http://rspective.github.io/voucherify-java-sdk/apidocs/index.html) for more information,

Setup
=====

Grab via Maven:
```xml
<dependency>
  <groupId>pl.rspective.voucherify.client</groupId>
  <artifactId>voucherify-java-sdk</artifactId>
  <version>VERSION</version>
</dependency>
```
or via Gradle:
```groovy
compile 'pl.rspective.voucherify.client:voucherify-java-sdk:VERSION'
```

NOTE:
The SDK requires at least Java 6 or Android 2.3.3 (API 10)


### Default Client

The Voucherify SDK uses [Retrofit](http://square.github.io/retrofit/) under the hood as a REST client, which detects [OkHttp](http://square.github.io/okhttp/) in your classpath and uses it if it's available, otherwise falls back to the default `HttpURLConnection`.
If you want you can also specify a custom client to be used (see javadoc).


### Proguard
```
-keepattributes Signature
-dontwarn rx.**
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keep class com.rspective.voucherify.client.** { *; }
-keep class * extends com.rspective.voucherify.client.model.** { *; }
-keep class com.google.gson.** { *; }
-keep class sun.misc.Unsafe { *; }
```

Usage
=====
The `VoucherifyClient` manages all your interaction with the Voucherify API.

```java
VoucherifyClient client = new VoucherifyClient.Builder()
                                .setAppId("YOUR-APPLICATION-ID")
                                .setAppToken("YOUR-APPLICATION-TOKEN")
                                .build();
```

Current list of features:
- fetch one voucher based on his code
- consume the voucher based on his code with consumer trackingId (optional, pass null if you want to disable trackingId)
- fetch voucher usage details based on his code

Every method has a corresponding asynchronous extension which can be accessed through the `async()` or 'rx()' method of the vouchers module.

Fetch a voucher details
===

```java
try {
    Voucher voucher = client.vouchers().fetchVoucher(VOUCHER_CODE);
} catch (RetrofitError e) {
    // error
}
```

or asynchronously:

```java
client.vouchers().async().fetchVoucher("VOUCHER_CODE", new VoucherifyCallback<Voucher>() {
    @Override
    public void onSuccess(Voucher result) {
    }

    @Override
    public void onFailure(RetrofitError error) {
    // error
  }
});
```

or using RxJava:

```java
client.vouchers()
        .rx()
        .fetchVoucher("VOUCHER_CODE")
        .subscribeOn(Schedulers.io())
        .subscribe(new Action1<Voucher>() {
            @Override
            public void call(Voucher vouchers) {

            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
            }
        });
```

Fetch a voucher redemption details
===
```java
try {
    VoucherRedemption voucherRedemption = client.vouchers().redemption(VOUCHER_CODE);
} catch (RetrofitError e) {
    // error
}

client.vouchers().async().redemption(VOUCHER_CODE, new VoucherifyCallback<VoucherRedemption>() {
    @Override
    public void onSuccess(VoucherRedemption voucherRedemption) {
    }
});


client.vouchers().rx().redemption(VOUCHER_CODE)
    .subscribeOn(Schedulers.io())
    .subscribe(new Subscriber<VoucherRedemption>() {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable throwable) {
        }

        @Override
        public void onNext(VoucherRedemption voucherRedemption) {
        }
});

```

Redeem a voucher
===

Synchronously:

```java
try {
    VoucherRedemptionResult result = client.vouchers().redeem(VOUCHER_CODE, TRACKING_ID);
} catch (RetrofitError e) {
    // error
}
```
or asynchronously

```java
client.vouchers().async().redeem(VOUCHER_CODE, TRACKING_ID, new VoucherifyCallback<Voucher>() {
    @Override
    public void onSuccess(VoucherRedemptionResult result) {
    }

    @Override
    public void onFailure(RetrofitError retrofitError) {
        super.onFailure(retrofitError);
    }
});
```

or using RxJava:

```java
client.vouchers().rx().redeem(VOUCHER_CODE, TRACKING_ID)
    .subscribeOn(Schedulers.io())
    .subscribe(new Subscriber<VoucherRedemptionResult>() {
        @Override
        public void onCompleted() {
        }

    @Override
        public void onError(Throwable throwable) {
    }

    @Override
    public void onNext(VoucherRedemptionResult result) {
    }
    });
```

Instead of just tracking id you can provide a detailed customer profile which can be later used for analytics:

```java
  VoucherRedemptionResult result = client.vouchers().redeem("w7DWc", new VoucherRedemptionContext(
          new Customer.Builder()
                .setId("alice.morgan")
                .setName("Alice Morgan")
                .setEmail("alice@morgan.com")
                .setDescription("")
                .addMetadata("locale", "en-GB")
                .addMetadata("shoeSize", 5)
                .addMetadata("favouriteBrands", new String[]{"Armani", "L’Autre Chose", "Vicini"})
                .build()));
```

Utils
===

You can use `VoucherifyUtils` to calculate actual discount and price after discount.

- `BigDecimal calculatePrice(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`
- `BigDecimal calculateDiscount(BigDecimal basePrice, Voucher voucher, BigDecimal unitPrice)`

For example you can redeem a 10% off voucher and calculate the final price.

```java
BigDecimal initialPrice = new BigDecimal("25.00");
try {
    VoucherRedemptionResult result = client.vouchers().redeem(VOUCHER_CODE, TRACKING_ID);
    BigDecimal finalPrice = VoucherifyUtils.calculatePrice(initialPrice, result.getVoucher());
    // finalPrice == 22.50
} catch (RetrofitError e) {
    // handle errors
}
```

Changelog
=========

- **2015-12-14** - `2.1.0` - New discount model, new discount type: UNIT
- **2015-11-23** - `2.0.1` - Added X-Voucherify-Channel header
- **2015-11-18** - `2.0.0` - New model for voucher redemption result
- **2015-11-18** - `1.9.2` - Added `category` to `Voucher`
- **2015-11-10** - `1.9.0` - Added `VoucherifyUtils` which includes `calculatePrice` for computing product/cart price
                             after discount and `calculateDiscount`.
- **2015-11-09** - `1.8.1` - Changed discount type from double to integer
- **2015-11-06** - `1.8.0` - Added an id to RedemptionEntry

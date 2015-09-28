voucherify-java-sdk
===============

###Version: 1.5.0

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

Fetch a voucher usage details
===
```java
try {
    VoucherUsage voucher = client.vouchers().usageVoucher(VOUCHER_CODE);
} catch (RetrofitError e) {
    // error
}

client.vouchers().async().usageVoucher(VOUCHER_CODE, new VoucherifyCallback<VoucherUsage>() {
    @Override
    public void onSuccess(VoucherUsage result) {
    }
});


client.vouchers().rx().usageVoucher(VOUCHER_CODE)
    .subscribeOn(Schedulers.io())
    .subscribe(new Subscriber<VoucherUsage>() {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable throwable) {
        }

        @Override
        public void onNext(VoucherUsage voucherUsage) {
        }
});

```

Consume a voucher
===

Synchronously:

```java
try {
    Voucher voucher = client.vouchers().consumeVoucher(VOUCHER_CODE, TRACKINGID);
} catch (RetrofitError e) {
    // error
}
```
or asynchronously

```java
client.vouchers().async().consumeVoucher(VOUCHER_CODE, TRACKINGID, new VoucherifyCallback<Voucher>() {
    @Override
    public void onSuccess(Voucher voucher) {
    }

    @Override
    public void onFailure(RetrofitError retrofitError) {
        super.onFailure(retrofitError);
    }
});
```

or using RxJava:

```java
client.vouchers().rx().consumeVoucher(VOUCHER_CODE, TRACKINGID)
    .subscribeOn(Schedulers.io())
    .subscribe(new Subscriber<Voucher>() {
        @Override
        public void onCompleted() {
        }

    @Override
        public void onError(Throwable throwable) {
    }

    @Override
    public void onNext(Voucher voucher) {
    }
    });
```

Instead of just tracking id you can provide a detailed customer profile which can be later used for analytics:

```java
  Voucher voucher = client.vouchers().consumeVoucher("w7DWc", new VoucherUsageContext(
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

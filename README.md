voucherify-java-sdk
===============

###Version: 1.0.0

Java SDK for Voucherify API.

Voucherify is a....

Setup
=====

Grab via Maven:
```xml
<dependency>
  <groupId></groupId>
  <artifactId></artifactId>
  <version></version>
</dependency>
```
or via Gradle:
```groovy
compile ''
```

NOTE:
The SDK requires at least Java 6 or Android 2.3.3 (API 10)


### Default Client

The Voucherify SDK uses Retrofit under the hood as a REST client, which detects [OkHttp][http://square.github.io/okhttp/] in your classpath and uses it if it's available, otherwise falls back to the default `HttpURLConnection`.
If you want you can also specify a custom client to be used (see javadoc).


### Proguard
```
-keepattributes Signature
-dontwarn rx.**
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keep class com.contentful.java.cda.** { *; }
-keep class * extends com.contentful.java.cda.model.** { *; }
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
- fetch all vouchers
- fetch one voucher based on his code
- consume the voucher base on his code

Every method has a corresponding asynchronous extension which can be accessed through the `async()` or 'rx()' method of the vouchers module.

```java
try {
    Voucher voucher = client.vouchers().fetchOne(VOUCHER_CODE);
} catch (RetrofitError e) {
    // error
}
```

or asynchronously:

```java
client.vouchers().async().fetchOne("VOUCHER_CODE", new VoucherifyCallback<Voucher>() {
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
        .fetchOne("VOUCHER_CODE")
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


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


Usage
=====




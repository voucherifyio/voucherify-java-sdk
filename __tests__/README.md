## Introductions

This is the test suite for the Voucherify Java SDK, which is based on the OpenAPI specification.
Instead of relying on an automatically generated SDK tests, this test suite has been manually crafted.
The primary reason for this approach is to ensure that the most critical aspects of the SDK function flawlessly.

## Running tests

We strongly recommend running the tests using the `Dockerfile` provided in [main README.md](../README.md).
If you prefer to run tests locally, [here are the steps you need to follow](#running-locally).

### Requirements

- all elements described in [main README.md](../README.md) like Java and Maven
- filled up `.env` file

### Running locally

1. Go into `root` directory
2. Run `mvn clean install` for build `jar` file 
3. Run `mvn install:install-file -Dfile=./target/voucherify-java-sdk-12.0.0.jar -DgroupId=local -DartifactId=voucherify-java-sdk -Dversion=12.0.0 -Dpackaging=jar` for export `jar` file to local maven repository
4. Go into `__tests__` directory
5. Run `mvn -f ./__tests__ clean install` command for install dependencies
6. Run `mvn -f ./__tests__ test` for start the test suit

**!!! Note that running tests will affect your Voucherify project data. Run tests only on development projects. !!!**

## Contributing

All new tests should be added to the `src/test/java/org/example` directory.
All data necessary for tests like `campaign_ids` etc. could be store in `Voucherify` singleton.

**Please note that in the current state of the test suite, some tests are interdependent. All tests run in order defined by `@Order(x)` annotation.**

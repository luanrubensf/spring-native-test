# spring-native-test

This is a sample project to test [Spring Native](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#overview)
with GraalVM native-image compiler, for compile and run native spring
applications.

This project uses:

- spring-boot-starter-actuator
- micrometer-registry-prometheus
- spring-boot-starter-data-jpa

### Running project
The GraalVM native-image compiler should be installed and configured on your machine, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.10.1/reference/htmlsingle/#getting-started-native-build-tools).

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:
```
$ target/spring-native-test
```

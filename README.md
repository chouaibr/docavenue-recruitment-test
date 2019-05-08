# docavenue-recruitment-test-back
## Docavenue Recruitment Test

[Docavenue Recuitment Test Back API](https://github.com/chouaibr/docavenue-recruitment-test-front).

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.docavenue.recruitmenttest.RecruitmentTestApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
After starting the application, the service interface will be available via the URL http://localhost:8093/swagger-ui.html
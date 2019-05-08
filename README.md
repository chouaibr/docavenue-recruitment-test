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

## Build a single JAR (Back + Front)
Clone the [front project](https://github.com/chouaibr/docavenue-recruitment-test-front) on the same directory, then build it.

Use [maven resources plugin](https://maven.apache.org/plugins/maven-resources-plugin/) and spring boot jar packaging to build and deploy as single unit.

```shell
mvn clean package --settings ./settings.xml
```
Run the the jar produced in the previous step

After starting the application, the front page will be available via the URL [http://localhost:8093](http://localhost:8093/)
# TropiPay Demo based on Spring Boot
Simple demo web API with client credential authentication for TropiPay based on Spring Boot over JDK 8. This is an example that shows an example of obtaining the user profile data from the authentication with an apikey.

**Note:** the credentials are specified in the ```src/main/resources/application.properties``` file, using the key named ClientId and ClientSecret.

## Install steps
- Make sure JDK is installed and the **JAVA_HOME** system variable is configured.
- Download [maven](https://maven.apache.org/download.cgi)
- Add a **MAVEN_HOME** system variables, and point it to the Maven folder.
- Add %MAVEN_HOME%\bin To PATH
- mvn -version
- For further reference, please consider [the following sections](https://maven.apache.org/guides/getting-started/index.html)

## Develop steps
- Create [project skeleton](https://start.spring.io/)
- mvn package
- mvn spring-boot:run
- http://localhost:8080/api/profile

## Reference Documentation
For further reference, please consider the following sections:
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)


**Link to JEP: https://openjdk.java.net/jeps/418**

Source: https://blogs.oracle.com/javamagazine/post/java-18-gems-jdks

Prior to Java 18, the `java.net.InetAddress` package relied on the operating system's native resolver to identify host names and their IP addresses. With Java 18, you can define a SPI (Service-provider interface) that determines how hosts and their IP addresses are resolved. There are 4 new classes located within the `java.net.spi` package: `InetAddressResolverProvider`, `InetAddressResolver`, `InetAddressResolver.LookupPolicy`, and `InetAddressResolverProvider.Configuration`. This demo shows how you can create a very simple resolver.

Usage
---
```
mvn clean package
java -jar .\target\java18-new-features-internet-address-resolution-spi-1.0-SN
APSHOT.jar
```
---

Java 11 in Action
=================

Please refer https://winterbe.com/posts/2018/08/29/migrate-maven-projects-to-java-11-jigsaw/ first.

# Official features

* Nest-based access control
* Dynamic class-file constraints
* Improve Aarch64 Intrinsics
* Epsilon: A No-Op Garbage Collector
* Remove enterprise APIs: JAXB, JAX-WS, JAX-WS Annotations, CORBA, JTA, JAF
* JavaFX: no longer bundled with Java 11, and with OpenJFX and added as dependency
* HTTP Client (Standard)
* Local variable syntax for lambda parameters
* Key agreement with Curve25519 and Curve448
* Unicode 10 support
* Flight recorder
* ChaCha20 and Poly1305 cryptographic algorithms
* Launch single-file source-code programs
* Low-overhead heap profiling
* TLS 1.3 support
* ZGC: A scalable low-latency garbage collector (Experimental)
* Removed: Applets, Java Web Start
* Deprecate the Nashorn JavaScript Engine, replaced with Graal.js
* Deprecate the Pack200 Tools and API

# Demo

* Project Amber:

   * JEP 302 Lambda Leftovers
   * JEP 305 Pattern Matching
   * JEP 323 Local-Variable Syntax for Lambda Parameters
   * JEP 325 Switch Expressions
   * JEP 326 Raw String Literals
* Type inference
* Http Client: BodyHandlers with various useful handlers  http://openjdk.java.net/groups/net/httpclient/intro.html  https://download.java.net/java/early_access/jdk11/docs/api/java.net.http/java/net/http/HttpResponse.BodyHandlers.html
* Enhanced Enum
* data class
* Launch Single-File Source-Code Programs
```
java --source 11 src/main/java/org/mvnsearch/App.java
```

# References

* <<Java 11 Quick Start>>
* JDK 11: http://openjdk.java.net/projects/jdk/11/
* JDK 11 Download: http://jdk.java.net/11/
* Project Amber: http://openjdk.java.net/projects/amber/

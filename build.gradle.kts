plugins {
        id("org.springframework.boot") version "3.2.3"
        id("io.spring.dependency-management") version "1.1.4"
        id("java")
        }

        group = "org.atlas"
        version = "0.0.1-SNAPSHOT"

        java {
        toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        }
        }

        repositories {
        mavenCentral()
        }

        dependencies {
        // Spring Data JPA
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")

        // Spring Web
        implementation("org.springframework.boot:spring-boot-starter-web")

        // MySQL Connector
        runtimeOnly("com.mysql:mysql-connector-j")

        // Lombok
        compileOnly("org.projectlombok:lombok:1.18.32")
        annotationProcessor("org.projectlombok:lombok:1.18.32")

        // Spring Boot Test
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        }

        tasks.withType<Test> {
    useJUnitPlatform()
    }

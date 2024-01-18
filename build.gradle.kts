import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.spring") version "1.9.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    //스웨거 설치
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0")

    //트랜잭션 사용
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    //테스트 DB
    implementation("com.h2database:h2")
    // Jakarta Persistence API (JPA)
    implementation( "jakarta.persistence:jakarta.persistence-api:3.0.0") // 사용 가능한 최신 버전으로 업데이트하세요

    // Hibernate JPA 구현체
    implementation("org.hibernate:hibernate-core:5.6.3.Final") // 사용 가능한 최신 버전으로 업데이트하세요

    // 코틀린과 JPA를 함께 사용하는 경우 아래 의존성도 추가합니다
//    implementation ("org.jetbrains.kotlin:kotlin-reflect:${kotlin_version}") // 코틀린 버전에 맞게 업데이트하세요
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

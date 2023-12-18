import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "ru.perm.v"
// change to publishing on change version
version = "0.0.2"
description = "shop_kotlin_extdto"

java.sourceCompatibility = JavaVersion.VERSION_11

buildscript {
    var kotlinVersion: String? by extra; kotlinVersion = "1.1.51"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

plugins {
    val kotlinVersion = "1.8.21"
//    id("org.springframework.boot") version "2.5.6"
    kotlin("jvm") version kotlinVersion
//    kotlin("plugin.spring") version kotlinVersion
    id("maven-publish")
//    kotlin("kapt") version "1.7.0"
    idea
//    id("org.sonarqube") version "3.4.0.2513"
}

//apply(plugin = "kotlin-kapt")

repositories {
    mavenCentral()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
    gradlePluginPortal()
}

java.sourceSets["main"].java {
    srcDir("build/classes/java/main")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
// validator
//    implementation("org.hibernate.validator:hibernate-validator")
    implementation("javax.validation:validation-api:2.0.1.Final")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
// for use JUnit, not Jupiter
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
//    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.8.2")
//    kapt("jakarta.annotation:jakarta.annotation-api")

//    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

tasks.withType<Test> {
    useJUnitPlatform()
}

//// remove suffix 'plain' in sonar repository
tasks.jar {
    enabled = true
    // Remove `plain` postfix from jar file name
    archiveClassifier.set("")
}

publishing {
    repositories {
        maven {
            url = uri("http://v.perm.ru:8082/repository/ru.perm.v/")
            isAllowInsecureProtocol = true
            credentials {
                username = System.getenv("NEXUS_CRED_USR")
                password = System.getenv("NEXUS_CRED_PSW")
            }
        }
    }
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}


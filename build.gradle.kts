import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "ru.perm.v"
// change to publishing on change version
version = "0.0.5"
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
    kotlin("jvm") version kotlinVersion
    id("maven-publish")
    idea
}

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
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.hibernate.validator:hibernate-validator:6.2.0.Final")
    implementation("org.glassfish:javax.el:3.0.1-b08")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.2")
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
                username = "admin"
                password = "pass"
            }
        }
    }
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}


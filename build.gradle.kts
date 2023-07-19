import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val springBootVersion = "3.1.1"
val lombokVersion = "1.18.28"

group = "io.github.dqualizer"

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
    kotlin("plugin.lombok") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"

    id("io.freefair.lombok") version "8.1.0"
    id("net.researchgate.release") version "3.0.2"
    id("maven-publish")
    id("idea")
    id("eclipse")
}

idea { //allows downloading sources and javadoc for IntelliJ with gradle cleanIdea idea
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

eclipse {
    classpath {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

release {
    //see https://github.com/researchgate/gradle-release for options
    git { requireBranch.set("") }
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/dqualizer/dqlang")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
        publications {
            register("jar", MavenPublication::class) {
                from(components["java"])
                pom {
                    url.set("https://github.com/dqualizer/dqlang.git")
                }
            }
        }
    }
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
    implementation("org.springframework.boot:spring-boot:$springBootVersion")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.5.1")

    annotationProcessor("org.projectlombok:lombok:$lombokVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

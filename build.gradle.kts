import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.github.dqualizer"

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

plugins {
    kotlin("jvm") version "1.9.10"
    kotlin("plugin.spring") version "1.9.10"
    kotlin("plugin.lombok") version "1.9.10"
    kotlin("plugin.serialization") version "1.9.10"

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
        mavenLocal()
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
    //spring boot bom
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.4"))
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.9.10"))
    implementation(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.7.3"))
    implementation(platform("org.jetbrains.kotlinx:kotlinx-serialization-bom:1.6.0"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation("org.springframework.data:spring-data-mongodb")
    implementation("org.springframework:spring-web")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("javax.validation:validation-api:2.0.1.Final")

    annotationProcessor("org.projectlombok:lombok")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.jeasy:easy-random-core:5.0.0")
    testImplementation("org.mockito.kotlin:mockito-kotlin:5.1.0")
    testImplementation("org.reflections:reflections:0.10.2")
    testImplementation("org.projectlombok:lombok")

}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
    kotlin.srcDirs("src/main/java", "src/main/kotlin")
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

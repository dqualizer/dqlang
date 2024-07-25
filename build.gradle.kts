group = "io.github.dqualizer"

plugins {
  kotlin("jvm") version "2.0.0"
  kotlin("plugin.spring") version "2.0.0"
  kotlin("plugin.serialization") version "2.0.0"

  id("net.researchgate.release") version "3.0.2"
  id("maven-publish")
  id("idea")
  id("eclipse")
}

java {
  withSourcesJar()
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
  implementation(platform("org.springframework.boot:spring-boot-dependencies:3.3.1"))
  implementation(platform("org.jetbrains.kotlin:kotlin-bom:2.0.0"))
  implementation(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.8.1"))
  implementation(platform("org.jetbrains.kotlinx:kotlinx-serialization-bom:1.6.3"))

  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.springframework.boot:spring-boot-starter-amqp")
  implementation("org.springframework.data:spring-data-mongodb")
  implementation("org.springframework:spring-web")

  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm")
  implementation("com.google.code.findbugs:jsr305:3.0.2")
  implementation("javax.validation:validation-api:2.0.1.Final")
  implementation("io.github.oshai:kotlin-logging:6.0.3")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("org.junit.jupiter:junit-jupiter-engine")
  testImplementation("org.testcontainers:junit-jupiter")
  testImplementation("org.jeasy:easy-random-core:5.0.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:5.2.0")
  testImplementation("org.reflections:reflections:0.10.2")
}

kotlin {
  compilerOptions {
    freeCompilerArgs.addAll("-Xjsr305=strict")
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.withType<JavaCompile> {
  options.compilerArgs.add("-parameters")
}

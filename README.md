[![](https://img.shields.io/badge/-Documentation-blue)](https://dqualizer.github.io/dqlang/)
[![](https://img.shields.io/github/v/tag/dqualizer/dqlang?label=version&logo=Apache)](https://github.com/dqualizer/dqlang/packages/1816902)

# dqlang

The dqlang is a collection of languages utilized by [dqualizer](https://dqualizer.github.io/) e.g., the DST extension for domain-level RQA specification or the language for defining mappings in dqedit. This repository contains the domain specific language (DSL) in the from of json-schema files, which describe the exchange objects' structure used by the components of dqualizer.

A more detailed description of this component's architecture is provided in the [arc42 document](https://dqualizer.github.io/dqualizer).

Feel free to have a look at the [documentation](https://dqualizer.github.io/dqlang/) which includes examples.

## Usage

This package is published via [Github Packages](https://github.com/features/packages).

### Maven

To setup your maven for using this package, have a look the
"[Authenticating to GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry)" guide.


In short:
1. Copy the template from the guide to your `~/.m2/settings.xml` or `%userprofile%\.m2\settings.xml`.
1. Replace the repository url with `https://maven.pkg.github.com/dqualizer/dqlang`. **Do not use uppercase letters here!**
1. Create a [(classic) personal access token (PAT) ](https://github.com/settings/tokens) with `read:packages` permissions.
1. Enter your GitHub user name and PAT (as password) for the 'github' server.

Then you can use:

```
 <dependency>
    <groupId>dqualizer</groupId>
    <artifactId>dqlang</artifactId>
    <version>${dqlang.version}</version>
</dependency>
```

### Gradle

The gradle setup is very similar to the maven setup:

1. Create a `gradle.properties` file in `%userprofile%\.gradle\`.
2. Create a [(classic) personal access token (PAT) ](https://github.com/settings/tokens) with `read:packages` permissions.
3. Paste the following content into your gradle.properties:
   ```
   gprUsername=YOUR_GITHUB_USERNAME
   gprPassword=YOUR_GITHUB_ACCESS_TOKEN
   ```
5. Paste the following code into your projects build.gradle or build.gradle.kts file:

Groovy:

    ```
    repositories {
     maven {
        name = 'gpr'
        credentials(PasswordCredentials)
        url = uri("https://maven.pkg.github.com/dqualizer/dqlang")
     }
    }

    ```

 Kotlin:
 ```
repositories {
	 maven {
        name="gpr"
		url = uri("https://maven.pkg.github.com/dqualizer/dqlang")
		credentials(PasswordCredentials::class)
	 }
}
```

Then you can use dqlang in your gradle dependency declaration:

Groovy:
```groovy
dependencies {
    implementation("io.github.dqualizer:dqlang:{version}")
}
```

Kotlin:
```kotlin
dependencies {
	implementation("io.github.dqualizer:dqlang:{version}")

}
```

## How to build
### Locally
* Set your credentials `gprUsername=YOUR_GITHUB_USERNAME` and `gprPassword=YOUR_GITHUB_ACCESS_TOKEN` in either `$GRADLE_USER_HOME/gradle.properties` or `gradle.properties` (be careful not to publish your GitHub Token to Git)
* If you set the credentials build with `./gradlew build -x test`
* If you didn't set your credentials build with `./gradlew build -x test -PgprUsername=YOUR_GITHUB_USERNAME PgprPassword=YOUR_GITHUB_ACCESS_TOKEN`

## Contribution

Feel free to fork this repository and create pull requests towards the main branch.
When working on this project, as a developer, ensure that you work on a feature branch and create a pull request to the main branch.

Python packages used to check and generate the documentation are:
- human-friendly-json-schema
- jsonschema
- requests (for loading json-schema files)


And for Java code generation:
- jsonschema2pojo (as maven plugin)


If you plan on implementing additional generators, you can finde inspiration [on the official json-schema website](https://json-schema.org/implementations.html#code-generators).

## License

See [LICENSE](LICENSE).


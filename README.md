[![](https://img.shields.io/badge/-Documentation-blue)](https://dqualizer.github.io/dqlang/)
[![](https://img.shields.io/github/v/tag/dqualizer/dqlang?label=version&logo=Apache)](https://github.com/dqualizer/dqlang/packages/1816902)

# dqlang

The dqlang is a collection of languages utilized by [dqualizer](https://dqualizer.github.io/) e.g., the DST extension for domain-level RQA specification or the language for defining mappings in dqedit. This repository contains the domain specific language (DSL) in the from of json-schema files, which describe the exchange objects' structure used by the components of dqualizer.

A more detailed description of this component's architecture is provided in the [arc42 document](https://github.com/dqualizer/dqualizer/tree/main/docs/asciidoc). 

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

1. Create a `init.gradle` file in `~/.gradle/` or `%userprofile%\.gradle\`.
1. Create a [(classic) personal access token (PAT) ](https://github.com/settings/tokens) with `read:packages` permissions.
1. Paste the following code into the `init.gradle` file:
    ```groovy
    allprojects {
        repositories {
            maven {
                url = uri("https://maven.pkg.github.com/dqualizer/dqlang")
                credentials {
                    username = "<your github username>"
                    password = "<your github personal access token with read:packages>"
                }
            }	
        }
    }
    ```
1. Replace the placeholders with your GitHub user name and PAT.

Then you can use dqlang in your gradle build file:

```groovy
dependencies {
    implementation("dqualizer:dqlang:${dqlangVersion}")
}
```

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


plugins {
    java
    checkstyle
    distribution
    maven
    id("org.omegat.gradle") version "1.5.3"
}

version = "0.0.1"

omegat {
    version = "5.5.0"
    pluginClass = "org.omegat.plugin.machinetranslators.Google2Translate"
}

dependencies {
    packIntoJar("org.slf4j:slf4j-api:1.7.21")
    implementation("commons-io:commons-io:2.5")
    implementation("commons-lang:commons-lang:2.6")
    implementation("org.slf4j:slf4j-nop:1.7.21")
    testImplementation("junit:junit:4.12")
}

checkstyle {
    isIgnoreFailures = true
    toolVersion = "7.1"
}

distributions {
    main {
        contents {
            from("README.md", "COPYING", "CHANGELOG.md")
        }
    }
}

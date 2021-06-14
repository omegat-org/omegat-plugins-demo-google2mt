plugins {
    java
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
}

distributions {
    main {
        contents {
            from("README.md", "COPYING")
        }
    }
}

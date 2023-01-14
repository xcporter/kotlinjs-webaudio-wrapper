plugins {
    kotlin("js") version "1.7.0"
    id("maven-publish")
    "kotlin-dsl"
}

group = "com.xcporter"
version = "1.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    js(BOTH) {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}

publishing {
    repositories {
        maven {
            name = "github"
            url = uri("https://maven.pkg.github.com/xcporter/kotlinjs-webaudio-wrapper")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("kotlinjs-webaudio-wrapper") {
            from(components["kotlin"])
        }
    }
}

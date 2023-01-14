plugins {
    kotlin("multiplatform") version "1.7.0"
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

    
    sourceSets {
        val jsMain by getting
        val jsTest by getting
    }
}

publishing {
}

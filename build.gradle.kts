plugins {
    kotlin("multiplatform") version "1.5.10"
    id("maven-publish")
}

group = "com.github.nisstfast"
version = "1.0.1"

repositories {
    mavenCentral()f
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    sourceSets {
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

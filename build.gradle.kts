plugins {
    kotlin("multiplatform") version "1.5.10"
}

group = "org.syntrofos"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {

            }
        }
    }
}

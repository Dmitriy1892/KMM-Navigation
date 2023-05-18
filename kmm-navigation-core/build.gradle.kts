plugins {
    id("multiplatform-setup")
    kotlin("native.cocoapods")

    id("publication-settings")
    id("maven-publish")
}

group = "io.github.dmitriy1892.kmm"
version = libs.versions.kmm.navigation.get()

kotlin {
    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        name = "KmmNavigationCore"
        framework {
            baseName = "KmmNavigationCore"
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(libs.kmm.utils)
                implementation(libs.kotlinx.coroutines.core)
            }
        }
    }
}

android {
    namespace = "com.coldfier.kmm.navigation.core"
}
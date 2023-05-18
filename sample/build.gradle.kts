plugins {
    id("multiplatform-compose-setup")
    kotlin("native.cocoapods")
}

kotlin {
    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        name = "SampleSDK"
        framework {
            isStatic = true
            baseName = "SampleSDK"
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.koin.core)
                implementation(libs.koin.annotations)
            }
        }
    }
}

android {
    namespace = "com.coldfier.kmm.navigation.sample"
}
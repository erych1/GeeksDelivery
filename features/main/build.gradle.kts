plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.myself223.main"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }

}

dependencies {
    implementation ("com.github.kirich1409:viewbindingpropertydelegate-full:1.5.9")
    implementation(libs.bundles.ui.component)
    implementation(libs.bundles.navigaion.component)
    implementation(libs.bundles.koin.component)
    implementation(libs.bundles.network.component)
    implementation(libs.bundles.test.component)
    implementation (project(":core"))
    api(project(":features:main:data"))

}
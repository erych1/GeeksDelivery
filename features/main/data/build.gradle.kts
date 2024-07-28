plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.myself223.data"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
        buildConfigField("String","BASE_URL","\"https://www.themealdb.com/api/json/v1/1/\"")


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
        buildConfig = true
        viewBinding = true
    }
}

dependencies {
    implementation(libs.bundles.network.component)
    implementation ("com.github.kirich1409:viewbindingpropertydelegate-full:1.5.9")
    implementation(libs.bundles.koin.component)
    implementation(libs.bundles.test.component)
    implementation(platform(libs.okhttp.bom))
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)
    api(project(":features:main:domain"))
}
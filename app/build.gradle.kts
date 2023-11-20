plugins {
    kotlin("android")
    kotlin("kapt")
    id("com.android.application")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "dev.yjyoon.template"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.yjyoon.template"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
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
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.bundles.androidx)

    implementation(platform(libs.compose.bom))
    implementation(libs.bundles.compose)

    implementation(libs.bundles.retrofit)
    implementation(libs.datastore.preferences)

    implementation(libs.google.hilt.android)
    kapt(libs.google.hilt.compiler)

    implementation(libs.coil.compose)

    debugImplementation(libs.compose.ui.tooling)

    coreLibraryDesugaring(libs.android.tools.desugar)
}
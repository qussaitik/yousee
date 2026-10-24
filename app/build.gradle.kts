plugins {
    id("com.android.application")
}

android {
    namespace = "com.talini.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.talini.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            // For Google Play, configure signing secrets and a release signingConfig
            // before publishing. This template intentionally does not embed private keys.
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.wizardgenerator"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.wizardgenerator"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.1")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.compose.ui:ui-tooling-preview:1.4.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.4.2")
    implementation("androidx.compose.ui:ui:1.4.2")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:1.4.2")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:1.4.2")
    // Material Design
    implementation("androidx.compose.material:material:1.4.2")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:1.4.2")
    implementation("androidx.compose.material:material-icons-extended:1.4.2")
    // Integration with observables
    implementation("androidx.compose.runtime:runtime-livedata:1.4.2")
    implementation("androidx.compose.runtime:runtime-rxjava2:1.4.2")
    //implementation "androidx.compose.material3:material3:1.0.1"
    //implementation "androidx.compose.material3:material3-window-size-class:1.0.1"
    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.2")

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.11.3")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.11.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.1")
}
plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.lotsto_do"
    compileSdk = 34

    buildFeatures{
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.example.lotsto_do"
        minSdk = 24
        targetSdk = 34
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
}

dependencies {
    val lifecycle_version = "2.5.0-alpha02"
    val arch_version = "2.1.0"
    val room_version = "2.4.1"

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    //ViewModel utilities for Compose
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")
    //LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    //Annotation processor
    annotationProcessor ("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor ("androidx.room:room-compiler:$room_version")

}
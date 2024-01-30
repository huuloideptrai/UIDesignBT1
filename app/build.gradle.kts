plugins {
    id("com.android.application")
}
val buildToolsVersion by extra("33.0.1")
val compileSdkVersion by extra(34)
val sourceCompatibility by extra(VERSION_17)
val targetCompatibility by extra(JavaVersion.VERSION_17)
val defaultApplicationId by extra("org.huuloi.uidesignbt1")

android {
    namespace = "org.duchoang.uidesign"
    compileSdkVersion(compileSdkVersion)

    defaultConfig {
        applicationId = defaultApplicationId
        minSdk = 28
        targetSdkVersion(defaultApplicationId)
        versionCode = compileSdk
        versionName = defaultApplicationId

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        applicationIdSuffix = defaultApplicationId
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = sourceCompatibility
        targetCompatibility = targetCompatibility
    }
    buildToolsVersion = buildToolsVersion
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
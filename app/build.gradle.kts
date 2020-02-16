plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")
    defaultConfig {
        applicationId = "com.akastudio.aks"
        minSdkVersion(22)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.kotlin_std_lib)
    implementation(Deps.androidx_appcompat)
    implementation(Deps.androidx_coreKtx)
    implementation(Deps.androidx_constraintLayout)
    implementation(Deps.material)

    // retrofit 2
    implementation(Deps.retrofit)
    implementation(Deps.retrofit_convertor)

    //lifecycle
    implementation(Deps.androidx_lifecycle_extensions)

    //coroutines
    implementation(Deps.kotlinx_coroutines_core)
    implementation(Deps.kotlinx_coroutines_android)

    testImplementation(Deps.test_junit)
    androidTestImplementation(Deps.test_androidx_junit)
}

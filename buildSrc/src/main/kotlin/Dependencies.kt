import org.gradle.api.JavaVersion

object Config {
    val minSdk = 21
    val compileSdk = 29
    val targetSdk = 29
    val javaVersion = JavaVersion.VERSION_1_8
    val buildTools = "29.0.2"
}

object Versions {
    //region Google
    val androidx_appcompat = "1.1.0"
    val androidx_annotation = "1.1.0"
    val androidx_constraintLayout = "1.1.3"
    val androidx_recyclerview = "1.1.0"
    val androidx_coreKtx = "1.1.0"
    val androidx_lifecyle = "2.2.0"
    val androidx_room = "2.2.3"
    val androidx_preferences = "1.1.0"
    val material = "1.0.0"
    //endregion

    val firebase_config_ktx = "19.0.3"

    val kotlinx_coroutines = "1.3.3"
    val firebase_crashlytics = "2.10.1"
    val firebase_messaging = "20.1.0"
    val firebase_analytics = "17.2.2"
    val mixpanel_analytics = "5.6.8"
    val comscore_analytics = "5.7.3"

    val kotlinx_serialization = "0.14.0"
    val retrofit2_kotlinx_serialization = "0.4.0"
    val lifecycle_runtime_ktx = "2.2.0"
    val fragment_ktx = "1.2.0"
    val nav_version = "2.1.0"

    val dagger = "2.25.4"
    val glide = "4.11.0"
    val okhttp = "4.3.1"
    val retrofit = "2.7.1"
    val timber = "4.7.1"

    val facebook_soloader = "0.5.1"
    val facebook_flipper = "0.31.0"
    val ktlint = "0.36.0"
    val performance_debug_overlay = "1.1.3"

    //region Testing
    val androidx_test_junit = "1.1.1"
    val junit = "4.12"
    val mockito = "2.23.0"
    val mockito_kotlin = "2.0.0-RC3"
    //endregion


    //region Tools
    val kotlin = "1.3.61"
    val gradle_android = "3.5.3"
    val gradle_versions = "0.27.0"
    val tools_fabric = "1.31.2"
    val google_services = "4.3.0"
    //endregion

    val square_leakcanary = "2.2"
}

object Deps {
    val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat}"
    val androidx_annotation = "androidx.annotation:annotation:${Versions.androidx_annotation}"
    val androidx_constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
    val androidx_recyclerview =
        "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"
    val androidx_coreKtx = "androidx.core:core-ktx:${Versions.androidx_coreKtx}"
    val androidx_lifecycle_viewmodel =
        "androidx.lifecycle:lifecycle-viewmodel:${Versions.androidx_lifecyle}"
    val androidx_lifecycle_livedata_ktx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidx_lifecyle}"
    val androidx_lifecycle_extensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.androidx_lifecyle}"
    val androidx_lifecycle_viewmodel_ktx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidx_lifecyle}"
    val androidx_room = "androidx.room:room-runtime:${Versions.androidx_room}"
    val androidx_room_compiler = "androidx.room:room-compiler:${Versions.androidx_room}"
    val androidx_room_ktx = "androidx.room:room-ktx:${Versions.androidx_room}"
    val androidx_preferences = "androidx.preference:preference:${Versions.androidx_preferences}"
    val material = "com.google.android.material:material:${Versions.material}"

    val firebase_config_ktx =
        "com.google.firebase:firebase-config-ktx:${Versions.firebase_config_ktx}"

    val kotlin_std_lib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlinx_coroutines_core =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_coroutines}"
    val kotlinx_coroutines_android =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinx_coroutines}"
    val kotlinx_serialization =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinx_serialization}"
    val retrofit2_kotlinx_serialization =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.retrofit2_kotlinx_serialization}"

    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"

    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
    val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val dagger_and_proccessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    val dagger_and_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val okhttp_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_convertor = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    val facebook_soloader = "com.facebook.soloader:soloader:${Versions.facebook_soloader}"
    val facebook_flipper = "com.facebook.flipper:flipper:${Versions.facebook_flipper}"
    val facebook_flipper_network_plugin =
        "com.facebook.flipper:flipper-network-plugin:${Versions.facebook_flipper}"
    val facebook_flipper_no_op = "com.facebook.flipper:flipper-noop:${Versions.facebook_flipper}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    val test_androidx_junit = "androidx.test.ext:junit:${Versions.androidx_test_junit}"
    val test_junit = "junit:junit:${Versions.junit}"

    val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradle_android}"
    val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val tools_kotlin_serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    val tools_google_services = "com.google.gms:google-services:${Versions.google_services}"
    val tools_fabric = "io.fabric.tools:gradle:${Versions.tools_fabric}"
    val tools_gradle_versions =
        "com.github.ben-manes:gradle-versions-plugin:${Versions.gradle_versions}"

    val firebase_crashlytics =
        "com.crashlytics.sdk.android:crashlytics:${Versions.firebase_crashlytics}"
    val firebase_messaging = "com.google.firebase:firebase-messaging:${Versions.firebase_messaging}"
    val firebase_analytics = "com.google.firebase:firebase-analytics:${Versions.firebase_analytics}"
    val mixpanel_analytics = "com.mixpanel.android:mixpanel-android:${Versions.mixpanel_analytics}"
    val comscore_analytics = "com.comscore:android-analytics:${Versions.comscore_analytics}"

    val performance_debug_overlay =
        "com.ms-square:debugoverlay:${Versions.performance_debug_overlay}"

    val lifecycle_runtime_ktx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_runtime_ktx}"
    val fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.fragment_ktx}"

    val navigation_fragment_ktx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"

    val square_leakcanary =
        "com.squareup.leakcanary:leakcanary-android:${Versions.square_leakcanary}"

}
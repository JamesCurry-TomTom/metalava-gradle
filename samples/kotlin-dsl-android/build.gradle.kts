plugins {
    id("com.android.library")
    alias(libs.plugins.metalavaGradle)
}

android {
    namespace = "me.tylerbwong.gradle.metalava.sample"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}

metalava {
    filename.set("api/$name-api.txt")
}

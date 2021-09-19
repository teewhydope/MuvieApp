plugins {
    id(Plugins.androidApplication)
    kotlin(KotlinPlugins.android)
    kotlin(KotlinPlugins.kapt)
    id(Plugins.hilt)
    id(Plugins.parcelize)
    kotlin(KotlinPlugins.serialization) version Kotlin.version
    id(Plugins.safeArgs)
}

android {
    compileSdk = (Application.compileSdk)
    defaultConfig {
        applicationId = Application.appId
        minSdk = (Application.minSdk)
        targetSdk = (Application.targetSdk)
        versionCode = Application.versionCode
        versionName = Application.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
}

dependencies {
    implementation(project(":shared"))

    implementation(Accompanist.accompanistNavigation)
    implementation(Accompanist.accompanistPager)
    implementation(Accompanist.accompanistPlaceholder)
    implementation(Accompanist.accompanistSystemUiController)



    implementation(AndroidX.appCompat)

    implementation(Compose.runtime)
    implementation(Compose.runtimeLiveData)
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiTooling)
    implementation(Compose.foundation)
    implementation(Compose.compiler)
    implementation(Compose.constraintLayout)
    implementation(Compose.activity)
    implementation(Compose.navigation)
    implementation(Compose.uiUtil)


    implementation(Google.material)

    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltNavigation)
    kapt(Hilt.hiltCompiler)

    implementation(ImageLoaders.coil)
    implementation(ImageLoaders.landscapistCoil)

    implementation(Ktor.android)

    implementation(Kotlinx.datetime)

    debugImplementation(SquareUp.leakCanary)
}
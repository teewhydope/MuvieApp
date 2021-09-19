object Build {
    private const val gradleBuildTools = "7.0.2"
    const val buildTools = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"

    private const val nav_safe_args_version = "2.3.5"
    const val navSafeArgs =  "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_safe_args_version"

    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Hilt.version}"
}
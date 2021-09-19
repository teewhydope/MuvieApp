package com.teewhydope.muvieapp.android

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


//Base Application class extends the Application class

//The Application class provides the application context

//The application Context represents a global or base configuration of your application and an Activity or Service can build upon it and represents a configuration instance of your Application or a transitive state for it.

//The Application context lives throughout the application lifecycle until it's destroyed

/** Be sure to add
android:name=".BaseApplication" to the Application section in Manifest.xml

 **/

@HiltAndroidApp
class BaseApplication : Application() {
}
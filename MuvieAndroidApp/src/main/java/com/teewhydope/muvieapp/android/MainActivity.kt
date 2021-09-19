package com.teewhydope.muvieapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.core.view.WindowCompat
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.teewhydope.muvieapp.android.presentation.navigation.Navigation
import com.teewhydope.muvieapp.android.presentation.theme.MuvieAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Inject


//Compose is not fully stable so a lot of experimental features are available which can be removed anytime
//so it's okay to come across a lot of @Experimental annotations

//An android app must have at least one Activity, to properly initialize necessary variables
//The main activity is the android entry point

@InternalCoroutinesApi
@ExperimentalCoilApi
@ExperimentalPagerApi
@ExperimentalAnimationApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    /** initializing coil Image Loader
    ImageLoaders are service objects that execute ImageRequests.
    They handle caching, data fetching, image decoding, request management, bitmap pooling, memory
    management, and more.
    https://coil-kt.github.io/coil/image_loaders/ **/

    @Inject
    lateinit var imageLoader: ImageLoader

    //initializing the application context
    @Inject
    lateinit var application: BaseApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         Use WindowCompat.setDecorFitsSystemWindows(window, false)
        to lay out your app behind the system bars

         Then head to your values folder, open colors.xml and create
         <color name="transparent">#00000000</color>

         Go to themes open themes.xml and themes.xml(night) and place
         this code in the two files, in one of the style tags that has colors in it.

         <item name="android:statusBarColor">@android:color/transparent</item>
         <item name="android:navigationBarColor">@android:color/transparent</item>

         Go to Manifest.xml and place
         android:theme="@style/Theme.<YOUR_APP_NAME>" in the ManActivity Section
         **/
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            BoxWithConstraints {
                MuvieAppTheme {
                    //This is used to change the global text color
                    CompositionLocalProvider(
                        LocalContentColor.provides(
                            MaterialTheme.colors.primary
                        )
                    ) {
                        //Initial Composable Entry
                        //passing arguments to the class constructor
                        Navigation(
                            width = constraints.maxWidth / 2,
                            imageLoader = imageLoader,
                            application = application
                        )
                    }
                }
            }
        }

    }
}

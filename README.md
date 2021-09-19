# MuvieApp (KMM)
 A Kotlin Multiplatform Mobile Project that demonstrates code sharing between iOS and Android apps.
 
 - Android Specific Components: Jetpack Compose, Coil, Hilt, Accompanist Plugins
 - Shared: Ktor, SQL Delight
 - iOS Specific Components: SwiftUI

<img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181136.jpg" width="200" height="400"> <img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181101.jpg" width="200" height="400"> <img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181159.jpg" width="200" height="400">




 
### Getting started
  1. Create an API Key from The Movie Database web site https://www.themoviedb.org/documentation/api.
  2. Set your api key in 
     #### shared/src/commonMain/kotlin/com/teewhydope/muvieapp/datasource/network/MovieServiceImpl.kt
     before making any api call, very important
 
 
 
 
### Easy Hilt ViewModel Template
 #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import androidx.lifecycle.ViewModel


@HiltViewModel
#set($capitalizedFilename = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))
class $capitalizedFilename
@Inject
constructor(
  private val savedStateHandle: SavedStateHandle
):ViewModel() {

}


### Easy Composable Function Template
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")

import androidx.compose.runtime.Composable

@Composable
#set($capitalizedFilename = $NAME.substring(0,1).toUpperCase() + $NAME.substring(1))
fun $capitalizedFilename() {

}


   #### The Repository will be updated weekly with new features added, feel free to explore the project, it's well documented




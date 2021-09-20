# MuvieApp (KMM)
 A Kotlin Multiplatform Mobile Project that demonstrates code sharing between iOS and Android apps.
 
 - Android Specific Components: Jetpack Compose, Coil, Hilt, Accompanist Plugins
 - Shared: Ktor, SQL Delight
 - iOS Specific Components: SwiftUI

# Make sure to check each branch readme and root assets folder for latest features/additions

<img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181136.jpg" width="200" height="400"> <img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181101.jpg" width="200" height="400"> <img src="https://github.com/teewhydope/MuvieApp/blob/main/assets/Screenshot_20210919-181159.jpg" width="200" height="400">


 
### Getting started
  1. Create an API Key from The Movie Database web site https://www.themoviedb.org/documentation/api.
  2. Set your api key in 
     #### shared/src/commonMain/kotlin/com/teewhydope/muvieapp/datasource/network/MovieServiceImpl.kt
     before making any api call, very important
     
     
# Features/RoadMap

1. Kotlin
2. Clean Architecture
3. Jetpack Compose
4. SwiftUi (Proposed)
5. Hilt Dependency Injection
6. Ktor (Networking)
7. Database Caching with SqlDelight (Proposed)
8. MutableState (Might Change to StateFlow Later, If Neccessary)
9. Theming for both Android & Ios (Proposed)
10. Animations(Proposed)
11. Usecases/Interactors
12. MVI (Perfect for declarative UI) (Proposed)
13. Light Theme (Not Necessary But Might Consider Adding in Future Release)
14. Shimmer Loading Animation (Proposed)
15. Modularization for code reusablity (Test)
16. Online & Offline Video Streaming with Exo Player2 (Proposed)
17. Background Services, notification Services and Broadcast receiver (Proposed)
18. Video and Audio Download (Proposed)
19. Unit Testing, Ui Testing, Hilt Testing
20. #### etc...
21. #### Why not make feature request??? :)
 
 
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



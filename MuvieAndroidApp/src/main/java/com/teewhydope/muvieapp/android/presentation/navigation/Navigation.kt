package com.teewhydope.muvieapp.android.presentation.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.navArgument
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.navigation
import com.google.accompanist.pager.ExperimentalPagerApi
import com.teewhydope.muvieapp.android.BaseApplication
import com.teewhydope.muvieapp.android.presentation.coming_soon.ComingSoonScreen
import com.teewhydope.muvieapp.android.presentation.components.ScaffoldBottomBar
import com.teewhydope.muvieapp.android.presentation.downloads.DownloadsScreen
import com.teewhydope.muvieapp.android.presentation.getting_started.GettingStartedScreen
import com.teewhydope.muvieapp.android.presentation.movie_detail.MovieDetailScreen
import com.teewhydope.muvieapp.android.presentation.movie_detail.MovieDetailViewModel
import com.teewhydope.muvieapp.android.presentation.movie_list.MovieDbMovieListScreen
import com.teewhydope.muvieapp.android.presentation.movie_list.MovieListViewModel
import com.teewhydope.muvieapp.android.presentation.movie_list.NetflixMovieListScreen
import com.teewhydope.muvieapp.android.presentation.splash.SplashScreen
import kotlinx.coroutines.InternalCoroutinesApi

//Compose is not fully stable so a lot of experimental features are available which can be removed anytime
//so it's okay to come across a lot of @Experimental annotations

/***
This Application uses the Accompanist Navigation component because of
it's support for navigation animation
https://github.com/google/accompanist/tree/main/navigation-animation
 ***/

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalCoilApi
@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
internal fun Navigation(
    hasSoftKey: Boolean,
    navController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    application: BaseApplication
) {
    //https://developer.android.com/jetpack/compose/navigation
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Splash.route,
        builder = {
            addLandingTopLevel(
                navController = navController,
                width = width,
                imageLoader = imageLoader,
                hasSoftKey = hasSoftKey
            )
            addHomeTopLevel(
                navController = navController,
                navHostController = navController,
                width = width,
                imageLoader = imageLoader,
                hasSoftKey = hasSoftKey,
                application = application

            )
            addComingSoonTopLevel(
                navController = navController,
                navHostController = navController,
                width = width,
                imageLoader = imageLoader,
                hasSoftKey = hasSoftKey,
            )
            addDownloadsTopLevel(
                navController = navController,
                navHostController = navController,
                width = width,
                imageLoader = imageLoader,
                hasSoftKey = hasSoftKey,
            )
        }
    )
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addLandingTopLevel(
    navController: NavController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean,
) {
    navigation(
        route = Screen.Splash.route,
        startDestination = LeafScreen.Splash.route
    ) {
        addSplash(navController)
        addGettingStarted(navController, width, imageLoader, hasSoftKey)
    }
}


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addHomeTopLevel(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean,
    application: BaseApplication
) {
    navigation(
        route = Screen.Home.route,
        startDestination = LeafScreen.MovieDbMovieList.route
    ) {
        addMovieDbMovieList(
            navController,
            navHostController,
            width,
            imageLoader,
            application,
            hasSoftKey
        )
        addNetflixMovieList(
            navController,
            navHostController,
            width,
            imageLoader,
            application,
            hasSoftKey
        )
        addMovieDetail(width, imageLoader)
    }
}


@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addComingSoonTopLevel(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean
) {
    navigation(
        route = Screen.ComingSoon.route,
        startDestination = LeafScreen.ComingSoon.route
    ) {
        addComingSoon(navController, navHostController, width, imageLoader, hasSoftKey)
    }
}

@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addDownloadsTopLevel(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean
) {
    navigation(
        route = Screen.Downloads.route,
        startDestination = LeafScreen.Downloads.route
    ) {
        addDownloads(navController, navHostController, width, imageLoader, hasSoftKey)
    }
}


@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addSplash(
    navController: NavController,
) {
    //Animation Settings
    composable(
        route = LeafScreen.Splash.route,
    ) {
        SplashScreen(navController = navController)
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addGettingStarted(
    navController: NavController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean,
) {
    //Animation Settings
    composable(
        route = LeafScreen.GettingStarted.route,
    ) {
        GettingStartedScreen(
            hasSoftKey = hasSoftKey,
            onServiceClick = { serviceType ->
                navController.navigate(
                    route = if (serviceType == 0)
                        LeafScreen.MovieDbMovieList.route
                    else
                        LeafScreen.NetflixMovieList.route
                ) {
                    popUpTo(LeafScreen.GettingStarted.route) { inclusive = true }
                }
            }
        )
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addNetflixMovieList(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    application: BaseApplication,
    hasSoftKey: Boolean,
) {
    //Animation Settings
    composable(
        route = LeafScreen.NetflixMovieList.route,
    ) {

        ScaffoldBottomBar(
            navController = navController,
            hasSoftKey = hasSoftKey,
            navHostController = navHostController,
        ) { paddingValues ->
            //view model is supplied to the MovieList Screen
            //old compose versions uses the factory method
            //use navigation-compose for this project
            //check out buildSrc/scr/.../Compose folder for more info
            val viewModel: MovieListViewModel = hiltViewModel()
            NetflixMovieListScreen(
                paddingValues = paddingValues,
                hasSoftKey = hasSoftKey,
                application = application,
                imageLoader = imageLoader,
                navigateToDetailScreen = { movieId ->
                    navController.navigate(
                        route = LeafScreen.MovieDetails.createRoute(movieId)
                    )
                },
                trendingMovies = viewModel.trendingMovies.value,
                popularMovies = viewModel.popularMovies.value,
                playingNow = viewModel.playingNow.value,
                comingSoon = viewModel.comingSoon.value,
                topRated = viewModel.topRated.value,
            )
        }
    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addMovieDbMovieList(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    application: BaseApplication,
    hasSoftKey: Boolean,
) {
    //Animation Settings
    composable(
        route = LeafScreen.MovieDbMovieList.route,
    ) {
        ScaffoldBottomBar(
            navController = navController,
            hasSoftKey = hasSoftKey,
            navHostController = navHostController,
        ) { paddingValues ->
            //view model is supplied to the MovieList Screen
            //old compose versions uses the factory method
            //use navigation-compose for this project
            //check out buildSrc/scr/.../Compose folder for more info
            val viewModel: MovieListViewModel = hiltViewModel()
            MovieDbMovieListScreen(
                paddingValues = paddingValues,
                hasSoftKey = hasSoftKey,
                application = application,
                imageLoader = imageLoader,
                navigateToDetailScreen = { movieId ->
                    navController.navigate(
                        route = LeafScreen.MovieDetails.createRoute(movieId)
                    )
                },
                trendingMovies = viewModel.trendingMovies.value,
                popularMovies = viewModel.popularMovies.value,
                playingNow = viewModel.playingNow.value,
                comingSoon = viewModel.comingSoon.value,
                topRated = viewModel.topRated.value,
            )
        }
    }
}

@ExperimentalAnimationApi
fun NavGraphBuilder.addMovieDetail(
    width: Int,
    imageLoader: ImageLoader,
) {
    //Animation Settings
    composable(
        route = LeafScreen.MovieDetails.route,
        arguments = listOf(
            navArgument("movieId") { type = NavType.IntType }
        ),
        enterTransition = { _, _ ->
            slideInHorizontally(
                initialOffsetX = { width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            )
        },
        popExitTransition = { _, target ->
            slideOutHorizontally(
                targetOffsetX = { width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            )
        }
    ) {
        //view model is supplied to the MovieList Screen
        //old compose versions uses the factory method
        //use navigation-compose for this project
        //check out buildSrc/scr/.../Compose folder for more info
        val viewModel: MovieDetailViewModel = hiltViewModel()
        MovieDetailScreen(
            movieId = viewModel.movieId.value
        )
    }
}

@ExperimentalAnimationApi
fun NavGraphBuilder.addDownloads(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean
) {
    //Animation Settings
    composable(
        route = LeafScreen.Downloads.route,
    ) {

        ScaffoldBottomBar(
            navController = navController,
            hasSoftKey = hasSoftKey,
            navHostController = navHostController,
        ) { paddingValues ->
            //view model is supplied to the MovieList Screen
            //old compose versions uses the factory method
            //use navigation-compose for this project
            //check out buildSrc/scr/.../Compose folder for more info
            DownloadsScreen()
        }
    }
}

@ExperimentalAnimationApi
fun NavGraphBuilder.addComingSoon(
    navController: NavController,
    navHostController: NavHostController,
    width: Int,
    imageLoader: ImageLoader,
    hasSoftKey: Boolean
) {
    //Animation Settings
    composable(
        route = LeafScreen.ComingSoon.route,

        ) {

        ScaffoldBottomBar(
            navController = navController,
            hasSoftKey = hasSoftKey,
            navHostController = navHostController,
        ) { paddingValues ->
            //view model is supplied to the MovieList Screen
            //old compose versions uses the factory method
            //use navigation-compose for this project
            //check out buildSrc/scr/.../Compose folder for more info
            ComingSoonScreen()
        }
    }
}

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}





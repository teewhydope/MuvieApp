package com.teewhydope.muvieapp.android.presentation.navigation

import androidx.compose.animation.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.teewhydope.muvieapp.android.BaseApplication
import com.teewhydope.muvieapp.android.presentation.movie_detail.MovieDetailScreen
import com.teewhydope.muvieapp.android.presentation.movie_detail.MovieDetailViewModel
import com.teewhydope.muvieapp.android.presentation.movie_list.MovieListScreen
import com.teewhydope.muvieapp.android.presentation.movie_list.MovieListViewModel
import kotlinx.coroutines.InternalCoroutinesApi

//Compose is not fully stable so a lot of experimental features are available which can be removed anytime
//so it's okay to come across a lot of @Experimental annotations

/***
 This Application uses the Accompanist Navigation component because of
it's support for navigation animation
https://github.com/google/accompanist/tree/main/navigation-animation
 ***/

@InternalCoroutinesApi
@ExperimentalCoilApi
@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun Navigation(
    width: Int,
    imageLoader: ImageLoader,
    application: BaseApplication
) {
    //https://developer.android.com/jetpack/compose/navigation
    val navController = rememberAnimatedNavController() //the central API for the Navigation component.
    // It is stateful and keeps track of the back stack of composables that
    // make up the screens in your app and the state of each screen.
    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.MovieList.route,
        builder = {
            addMovieList(
                navController = navController,
                width = width,
                imageLoader = imageLoader,
                application = application
            )
            addMovieDetail(
                width = width,
                imageLoader = imageLoader,
            )
        }

    )
}

@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
fun NavGraphBuilder.addMovieList(
    navController: NavController,
    width: Int,
    imageLoader: ImageLoader,
    application: BaseApplication
) {
    //Animation Settings
    composable(
        route = Screen.MovieList.route,
        exitTransition = { _, _ ->
            slideOutHorizontally(
                targetOffsetX = { -width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            ) + fadeOut(animationSpec = tween(300))
        },
        popEnterTransition = { initial, _ ->
            slideInHorizontally(
                initialOffsetX = { -width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            ) + fadeIn(animationSpec = tween(300))
        },
    ) {
        //view model is supplied to the MovieList Screen
        //old compose versions uses the factory method
        //use navigation-compose for this project
        //check out buildSrc/scr/.../Compose folder for more info
        val viewModel: MovieListViewModel = hiltViewModel()
        MovieListScreen(
            application = application,
            imageLoader = imageLoader,
            navigateToDetailScreen = { movieId ->
                navController.navigate(
                    route = "${Screen.MovieDetail.route}/$movieId"
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

@ExperimentalAnimationApi
fun NavGraphBuilder.addMovieDetail(
    width: Int,
    imageLoader: ImageLoader,
) {
    //Animation Settings
    composable(
        route = Screen.MovieDetail.route + "/{movieId}",
        arguments = Screen.MovieDetail.arguments,
        enterTransition = { _, _ ->
            slideInHorizontally(
                initialOffsetX = { width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            ) + fadeIn(animationSpec = tween(300))
        },
        popExitTransition = { _, target ->
            slideOutHorizontally(
                targetOffsetX = { width },
                animationSpec = tween(
                    durationMillis = 300,
                    easing = FastOutSlowInEasing
                )
            ) + fadeOut(animationSpec = tween(300))
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




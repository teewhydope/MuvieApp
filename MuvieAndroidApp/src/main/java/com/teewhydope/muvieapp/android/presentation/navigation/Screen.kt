package com.teewhydope.muvieapp.android.presentation.navigation

//Sealed classes and interfaces represent restricted hierarchies,
// which means hierarchies with a concrete set of classes known in advance.
//An advanced enum class

//Two navigation screen classes are provided below
//MovieListScreen and Movie Detail Screen, which accepts two arguments
//the route navigation route name of type string
// and the navigation route parameter(s) if any is supplied


sealed class Screen(val route: String) {
    object Splash : Screen("landingRoot")
    object Home : Screen("homeRoot")
    object ComingSoon : Screen("comingSoonRoot")
    object Downloads : Screen("downloadsRoot")
    object Extras : Screen("extrasRoot")

}


sealed class LeafScreen(
    val route: String,
) {
    object Splash : LeafScreen(route = "splash")

    object GettingStarted : LeafScreen(route = "gettingStarted")

    object NetflixMovieList : LeafScreen(route = "netflixMovieList")

    object MovieDbMovieList : LeafScreen(route = "movieDbMovieList")

    object MovieDetails : LeafScreen(route = "movie/{movieId}") {
        fun createRoute(movieId: Int): String = "movie/$movieId"
    }

    object ComingSoon : LeafScreen(route = "comingSoon")

    object Downloads : LeafScreen(route = "downloads")

    object Extras : LeafScreen(route = "extras")

}
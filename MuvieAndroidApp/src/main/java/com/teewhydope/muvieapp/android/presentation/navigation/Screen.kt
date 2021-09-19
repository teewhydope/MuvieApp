package com.teewhydope.muvieapp.android.presentation.navigation

import androidx.navigation.NavType
import androidx.navigation.compose.NamedNavArgument
import androidx.navigation.compose.navArgument

//Sealed classes and interfaces represent restricted hierarchies,
// which means hierarchies with a concrete set of classes known in advance.
//An advanced enum class

//Two navigation screen classes are provided below
//MovieListScreen and Movie Detail Screen, which accepts two arguments
//the route navigation route name of typr string
// and the navigation route parameter(s) if any is supplied
sealed class Screen(
    val route: String,
    val arguments: List<NamedNavArgument>
){
    object MovieList: Screen(
        route = "movieList",
        arguments = emptyList()
    )

    object MovieDetail: Screen(
        route = "movieDetail",
        arguments = listOf(navArgument(name = "movieId") {
            type = NavType.IntType //explicitly specify argument type
        })
    )

}
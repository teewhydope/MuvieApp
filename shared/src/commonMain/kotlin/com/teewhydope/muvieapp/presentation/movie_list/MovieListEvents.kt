package com.teewhydope.muvieapp.presentation.movie_list

sealed class MovieListEvents {

    object LoadMovies : MovieListEvents()

    object SearchMovies : MovieListEvents()

}
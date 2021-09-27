package com.teewhydope.muvieapp.presentation.movie_list

import com.teewhydope.muvieapp.domain.model.Movie

actual data class MovieListState(
    val isLoading: Boolean = false,
    val searchQuery: String = "", // search feature to be added later
    val movies: List<Movie> = listOf(),
) {
    // Need secondary constructor to initialize with no args in SwiftUI
    constructor() : this(
        isLoading = false,
        searchQuery = "",
        movies = listOf(),
    )

}
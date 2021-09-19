package com.teewhydope.muvieapp.datasource.network

import com.teewhydope.muvieapp.domain.model.Movie

interface MovieService {
    suspend fun getTrending(
    ):List<Movie>

    suspend fun getOtherCategories(
        query: String
    ):List<Movie>

    suspend fun getSingleMovie(
        id: Int
    ):Movie
}
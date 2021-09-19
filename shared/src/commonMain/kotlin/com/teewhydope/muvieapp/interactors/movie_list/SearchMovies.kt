package com.teewhydope.muvieapp.interactors.movie_list

import com.teewhydope.muvieapp.datasource.network.MovieService
import com.teewhydope.muvieapp.domain.model.Movie
import com.teewhydope.muvieapp.domain.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SearchMovies(
    private val movieService: MovieService
) {
    fun executeGetTrending(): Flow<DataState<List<Movie>>> = flow {
        emit(DataState.loading())
        try {
            val movies = movieService.getTrending()
            emit(DataState.data(data = movies))
        } catch (e: Exception) {
            emit(DataState.error(message = e.message ?: "Unknown Error"))
        }
    }


    fun executeOtherCategories(
        query: String
    ): Flow<DataState<List<Movie>>> = flow {
        emit(DataState.loading())
        try {
            val movies = movieService.getOtherCategories(
                query = query
            )
            emit(DataState.data(data = movies))
        } catch (e: Exception) {
            emit(DataState.error(message = e.message ?: "Unknown Error"))
        }
    }
}
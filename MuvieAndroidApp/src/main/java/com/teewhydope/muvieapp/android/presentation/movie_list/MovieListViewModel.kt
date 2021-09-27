package com.teewhydope.muvieapp.android.presentation.movie_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teewhydope.muvieapp.interactors.movie_list.SearchMovies
import com.teewhydope.muvieapp.presentation.movie_list.MovieListEvents
import com.teewhydope.muvieapp.presentation.movie_list.MovieListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject


@HiltViewModel
class MovieListViewModel
@Inject
constructor(
    private val searchMovies: SearchMovies
) : ViewModel() {

    val trendingMovies: MutableState<MovieListState> = mutableStateOf(MovieListState())
    val popularMovies: MutableState<MovieListState> = mutableStateOf(MovieListState())
    val playingNow: MutableState<MovieListState> = mutableStateOf(MovieListState())
    val comingSoon: MutableState<MovieListState> = mutableStateOf(MovieListState())
    val topRated: MutableState<MovieListState> = mutableStateOf(MovieListState())

    //The ViewModel initialize the functions which makes sure the the body functions
// are always triggered whenever the screen is launched
    init {
        loadAllMovieCategories()
    }

    fun onTriggerEvent(event: MovieListEvents) {
        when (event) {
            MovieListEvents.LoadMovies -> {
                loadAllMovieCategories()
            }
            MovieListEvents.SearchMovies -> {
                //searchMovies()
            }
        }
    }


    //the dataState emit loading, and either data success response or an error msg response
    //this usecase lives in the shared module to make it available for the ios client

    //all five usecases are covered

    private fun loadAllMovieCategories() {
        getTrending()
        getPopular()
        getPlayingNow()
        getComingSoon()
        getTopRated()
    }

    private fun getTrending() {
        searchMovies.executeGetTrending().onEach { dataState ->
            trendingMovies.value = trendingMovies.value.copy(isLoading = dataState.isLoading)
            dataState.data?.let { movies ->
                trendingMovies.value = trendingMovies.value.copy(movies = movies)  //result
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg") //error
            }

        }.launchIn(viewModelScope)
    }

    private fun getPopular() {
        searchMovies.executeOtherCategories("popular").onEach { dataState ->
            popularMovies.value = popularMovies.value.copy(isLoading = dataState.isLoading)

            dataState.data?.let { movies ->
                popularMovies.value = popularMovies.value.copy(movies = movies)
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getPlayingNow() {
        searchMovies.executeOtherCategories("now_playing").onEach { dataState ->
            playingNow.value = playingNow.value.copy(isLoading = dataState.isLoading)

            dataState.data?.let { movies ->
                playingNow.value = playingNow.value.copy(movies = movies)
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getComingSoon() {
        searchMovies.executeOtherCategories("upcoming").onEach { dataState ->
            comingSoon.value = comingSoon.value.copy(isLoading = dataState.isLoading)

            dataState.data?.let { movies ->
                comingSoon.value = comingSoon.value.copy(movies = movies)
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getTopRated() {
        searchMovies.executeOtherCategories("top_rated").onEach { dataState ->
            topRated.value = topRated.value.copy(isLoading = dataState.isLoading)

            dataState.data?.let { movies ->
                topRated.value = topRated.value.copy(movies = movies)
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

}
package com.teewhydope.muvieapp.android.presentation.movie_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teewhydope.muvieapp.domain.model.Movie
import com.teewhydope.muvieapp.interactors.movie_list.SearchMovies
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel
@Inject
constructor(
    private val savedStateHandle: SavedStateHandle,
    private val searchMovies: SearchMovies
) : ViewModel() {

    val trendingMovies: MutableState<List<Movie>> = mutableStateOf(listOf())
    val popularMovies: MutableState<List<Movie>> = mutableStateOf(listOf())
    val playingNow: MutableState<List<Movie>> = mutableStateOf(listOf())
    val comingSoon: MutableState<List<Movie>> = mutableStateOf(listOf())
    val topRated: MutableState<List<Movie>> = mutableStateOf(listOf())

//The ViewModel initialize the functions which makes sure the the body functions
// are always triggerd whenever the screen is launched
    init {
        getTrending()
        getPopular()
        getPlayingNow()
        getComingSoon()
        getTopRated()
    }

    //the dataState emit loading, and either data success response or an error msg response
    //this usecase lives in the shared module to make it available for the ios client

    //all five usecases are covered


    private fun getTrending() {
        searchMovies.executeGetTrending().onEach { dataState ->
            println("MovieListVM: ${dataState.isLoading}") //loading state

            dataState.data?.let { movies ->
                this.trendingMovies.value = movies //result
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg") //error
            }

        }.launchIn(viewModelScope)
    }

    private fun getPopular() {
        searchMovies.executeOtherCategories("popular").onEach { dataState ->
            println("MovieListVM: ${dataState.isLoading}")
            dataState.data?.let { movies ->
                this.popularMovies.value = movies
                println("MovieListVM: $movies")
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getPlayingNow() {
        searchMovies.executeOtherCategories("now_playing").onEach { dataState ->
            println("MovieListVM: ${dataState.isLoading}")
            dataState.data?.let { movies ->
                this.playingNow.value = movies
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getComingSoon() {
        searchMovies.executeOtherCategories("upcoming").onEach { dataState ->
            println("MovieListVM: ${dataState.isLoading}")
            dataState.data?.let { movies ->
                this.comingSoon.value = movies
                println("MovieListVM: $movies")
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }

    private fun getTopRated() {
        searchMovies.executeOtherCategories("top_rated").onEach { dataState ->
            println("MovieListVM: ${dataState.isLoading}")
            dataState.data?.let { movies ->
                this.topRated.value = movies
                println("MovieListVM: $movies")
            }

            dataState.message?.let { msg ->
                println("MovieListVM: $msg")
            }

        }.launchIn(viewModelScope)
    }


}
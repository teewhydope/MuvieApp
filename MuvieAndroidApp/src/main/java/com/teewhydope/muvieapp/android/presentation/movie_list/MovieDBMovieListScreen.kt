package com.teewhydope.muvieapp.android.presentation.movie_list


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.pager.ExperimentalPagerApi
import com.teewhydope.muvieapp.android.BaseApplication
import com.teewhydope.muvieapp.android.presentation.movie_list.components.MovieCarousel
import com.teewhydope.muvieapp.android.presentation.movie_list.components.MovieCategories
import com.teewhydope.muvieapp.domain.model.Movie
import com.teewhydope.muvieapp.presentation.movie_list.MovieListEvents
import com.teewhydope.muvieapp.presentation.movie_list.MovieListState
import kotlinx.coroutines.InternalCoroutinesApi


@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@Composable
fun MovieDbMovieListScreen(
    imageLoader: ImageLoader,
    navigateToDetailScreen: (Int) -> Unit,
    application: BaseApplication,
    trendingMovies: MovieListState,
    popularMovies: MovieListState,
    playingNow: MovieListState,
    comingSoon: MovieListState,
    topRated: MovieListState,
    hasSoftKey: Boolean,
    paddingValues: PaddingValues,
    //onTriggerEvent: (MovieListEvents) -> Unit,
) {
    //LazyColumn for scrollable List Items
    LazyColumn(
        Modifier
            .background(Color.Black) //Page background color
            .padding(paddingValues)
    ) {
        item {

            MovieCarousel(
                trendingMovies = trendingMovies.movies,
                imageLoader = imageLoader,
                application = application, //meant for backdrop blur effect
                // but didn't give expected result
            )
            Spacer(Modifier.height(20.dp))
            MovieCategories(
                imageLoader = imageLoader,
                popularMovies = popularMovies.movies,
                playingNow = playingNow.movies,
                comingSoon = comingSoon.movies,
                trendingMovies = trendingMovies.movies,
                topRated = topRated.movies
            )

        }
    }
}









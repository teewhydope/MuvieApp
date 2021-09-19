package com.teewhydope.muvieapp.android.presentation.movie_list


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import kotlinx.coroutines.InternalCoroutinesApi


@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@Composable
fun MovieListScreen(
    imageLoader: ImageLoader,
    navigateToDetailScreen: (Int) -> Unit,
    application: BaseApplication,
    trendingMovies: List<Movie>,
    popularMovies: List<Movie>,
    playingNow: List<Movie>,
    comingSoon: List<Movie>,
    topRated: List<Movie>
) {
    //LazyColumn for scrollable List Items
    LazyColumn(
        Modifier
            .background(Color.Black) //Page background color
    ) {
        item {

            MovieCarousel(
                trendingMovies = trendingMovies,
                imageLoader = imageLoader,
                application = application, //meant for backdrop blur effect
                // but didn't give expected result
            )
            Spacer(Modifier.height(20.dp))
            MovieCategories(
                imageLoader = imageLoader,
                popularMovies = popularMovies,
                playingNow = playingNow,
                comingSoon = comingSoon,
                trendingMovies = trendingMovies,
                topRated = topRated
            )
            Spacer(Modifier.height(40.dp))
        }
    }
}









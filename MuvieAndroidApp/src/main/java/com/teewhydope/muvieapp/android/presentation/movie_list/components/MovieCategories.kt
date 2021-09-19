package com.teewhydope.muvieapp.android.presentation.movie_list.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import com.teewhydope.muvieapp.domain.model.Movie

@ExperimentalCoilApi
@Composable
fun MovieCategories(
    imageLoader: ImageLoader,
    trendingMovies: List<Movie>,
    popularMovies: List<Movie>,
    playingNow: List<Movie>,
    comingSoon: List<Movie>,
    topRated: List<Movie>
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
    ) {
        MovieCategoryItem(
            title = "POPULAR MOVIES",
            movie = popularMovies,
            imageLoader = imageLoader
        )
        MovieCategoryItem(
            title = "COMING SOON",
            movie = comingSoon,
            imageLoader = imageLoader
        )
        MovieCategoryItem(
            title = "TRENDING MOVIES",
            movie = trendingMovies,
            imageLoader = imageLoader
        )
        MovieCategoryItem(
            title = "TOP RATED MOVIES",
            movie = topRated,
            imageLoader = imageLoader
        )
        MovieCategoryItem(
            title = "PLAYING NOW",
            movie = playingNow,
            imageLoader = imageLoader
        )
    }
}
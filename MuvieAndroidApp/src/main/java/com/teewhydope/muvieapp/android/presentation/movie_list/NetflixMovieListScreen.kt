package com.teewhydope.muvieapp.android.presentation.movie_list


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.placeholder
import com.google.accompanist.placeholder.shimmer
import com.teewhydope.muvieapp.android.BaseApplication
import com.teewhydope.muvieapp.android.R
import com.teewhydope.muvieapp.android.presentation.movie_list.components.MovieCategories
import com.teewhydope.muvieapp.datasource.network.MovieServiceImpl
import com.teewhydope.muvieapp.presentation.movie_list.MovieListState
import kotlinx.coroutines.InternalCoroutinesApi


@InternalCoroutinesApi
@ExperimentalPagerApi
@ExperimentalCoilApi
@Composable
fun NetflixMovieListScreen(
    imageLoader: ImageLoader,
    navigateToDetailScreen: (Int) -> Unit,
    application: BaseApplication,
    trendingMovies: MovieListState,
    popularMovies: MovieListState,
    playingNow: MovieListState,
    comingSoon: MovieListState,
    topRated: MovieListState,
    hasSoftKey: Boolean,
    paddingValues: PaddingValues
) {
    val context = LocalContext.current.resources //provides the current context
    val displayMetrics = context.displayMetrics
    val screenWidth = displayMetrics.widthPixels / displayMetrics.density //Calculated screen Width
    val screenHeight =
        displayMetrics.heightPixels / displayMetrics.density //Calculated screen Height

    //LazyColumn for scrollable List Items
    LazyColumn(
        Modifier
            .background(Color.Black) //Page background color
            .padding(paddingValues)
    ) {
        item {
            Card(
                Modifier
                    .height(screenHeight.dp / 2)
                    .width(screenWidth.dp)
                    .placeholder(
                        visible = trendingMovies.isLoading && trendingMovies.movies.isEmpty(),
                        highlight = PlaceholderHighlight.shimmer(Color.LightGray.copy(alpha = 0.4f)),
                        color = Color.White
                    )
            ) {
                Box {
                    if (trendingMovies.isLoading && trendingMovies.movies.isEmpty()) {
                        Column(
                            Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            CircularProgressIndicator()
                        }
                    } else if (trendingMovies.movies.isEmpty()) {
                        //NothingHere()
                    } else {
                        Box {
                            Image(
                                painter = rememberImagePainter(
                                    imageLoader = imageLoader,
                                    data = "${MovieServiceImpl.IMAGE_BASE_URL}${trendingMovies.movies[3].posterPath}",
                                    builder = {
                                        R.drawable.black_background
                                        crossfade(false)
                                    }
                                ),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .drawWithCache {
                                        val gradient = Brush.verticalGradient(
                                            colors = listOf(Color.Transparent, Color.Black),
                                            startY = size.height / 3,
                                            endY = size.height
                                        )
                                        //Draw a dark gradient color on the bottom of the backdrop
                                        onDrawWithContent {
                                            drawContent()
                                            drawRect(gradient, blendMode = BlendMode.Multiply)
                                        }
                                    }

                            )
                            Text(
                                text = trendingMovies.movies[3].title,
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier
                                    .fillMaxWidth(0.8f)
                                    .align(Alignment.BottomCenter)

                            )
                        }
                    }
                }
            }
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









package com.teewhydope.muvieapp.android.presentation.movie_list.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.teewhydope.muvieapp.android.BaseApplication
import com.teewhydope.muvieapp.android.R
import com.teewhydope.muvieapp.datasource.network.MovieServiceImpl
import com.teewhydope.muvieapp.domain.model.Movie
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import kotlin.math.absoluteValue


@InternalCoroutinesApi
@ExperimentalCoilApi
@ExperimentalPagerApi
@Composable
fun MovieCarousel(
    trendingMovies: List<Movie>,
    imageLoader: ImageLoader,
    application: BaseApplication,
) {

    val context = LocalContext.current.resources //provides the current context
    val displayMetrics = context.displayMetrics
    val screenWidth = displayMetrics.widthPixels / displayMetrics.density //Calculated screen Width
    val screenHeight =
        displayMetrics.heightPixels / displayMetrics.density ////Calculated screen Height

    //Accompanist Pager Configuration
    //be sure to check
    //https://google.github.io/accompanist/pager/
    //for more information
    val pagerState = rememberPagerState(
        pageCount = trendingMovies.size,
        infiniteLoop = true,
        initialOffscreenLimit = 3,
        initialPage = 0
    )

    var backdropUrl by remember { mutableStateOf("null") }
    var title by remember { mutableStateOf("null") }
    var postPath by remember { mutableStateOf("null") }

    Box(
        Modifier
            .height(screenHeight.dp / 2)
            .width(screenWidth.dp)
    ) {

        MovieBackdrop(
            backdropUrl = backdropUrl,
            imageLoader = imageLoader,
        )


        //Updating the backdrop amd movie title

        postPath = trendingMovies.getOrNull(pagerState.targetPage)
            ?.posterPath.toString()


        LaunchedEffect(postPath) {
            title = trendingMovies.getOrNull(pagerState.targetPage)
                ?.title.toString()

            backdropUrl = trendingMovies.getOrNull(pagerState.targetPage)
                ?.backdropPath.toString()

        }

        HorizontalPager(
            state = pagerState,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f)
                .align(Alignment.BottomCenter),
            itemSpacing = 20.dp
        )
        { page ->

            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

            val painter = rememberImagePainter(
                data = "${MovieServiceImpl.IMAGE_BASE_URL}${trendingMovies[page].posterPath}",
                imageLoader = imageLoader,
                builder = {
                    R.drawable.black_background
                    crossfade(true)
                }
            )

            MovieCarouselImage(
                painter = painter,
                pageOffset = pageOffset,
                title = title
            )

            /**Automatic Pager Scrolling
            Check https://cdmana.com/2021/09/20210911031827248f.html
            to grasp more about the overall working flow  **/

            /**
            pagerState.currentPage only updates after scrolling has finished.
            which is not suitable for this usecase

            so use Pager.targetPage instead

            Issue Tracker: https://github.com/google/accompanist/issues/726

            Might be fixed in the future release
             */
            LaunchedEffect(pagerState.currentPage) {
                if (pagerState.pageCount > 0) {
                    delay(3000)
                    pagerState.animateScrollToPage(
                        page = pagerState.currentPage + 1,
                        animationSpec = tween(
                            durationMillis = 500,
                            easing = FastOutSlowInEasing
                        )

                    )
                }
            }


        }

    }

}




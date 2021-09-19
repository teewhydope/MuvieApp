package com.teewhydope.muvieapp.android.presentation.movie_list.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.teewhydope.muvieapp.android.R
import com.teewhydope.muvieapp.datasource.network.MovieServiceImpl
import com.teewhydope.muvieapp.domain.model.Movie

@ExperimentalCoilApi
@Composable
fun MovieCategoryItem(
    title: String,
    movie: List<Movie>,
    imageLoader: ImageLoader
) {
    Column {
        Text(
            title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(10.dp))
        LazyRow {
            itemsIndexed(
                items = movie
            ) { index, mov ->
                Card(
                    modifier = if (title == "TOP RATED MOVIES") Modifier
                        .height(320.dp)
                        .width(350.dp)
                        .padding(
                            end = 10.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        ) else
                        Modifier
                            .height(220.dp)
                            .width(150.dp)
                            .padding(
                                end = 10.dp,
                                top = 10.dp,
                                bottom = 10.dp
                            )
                ) {
                    Image(
                        painter = rememberImagePainter(
                            imageLoader = imageLoader,
                            data = "${MovieServiceImpl.IMAGE_BASE_URL}${mov.posterPath}",
                            onExecute = ImagePainter.ExecuteCallback { _, _ -> true },
                            builder = {
                                R.drawable.black_background
                                crossfade(true)
                            }
                        ),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                    )
                }
            }
        }
        Spacer(Modifier.height(30.dp))
    }
}



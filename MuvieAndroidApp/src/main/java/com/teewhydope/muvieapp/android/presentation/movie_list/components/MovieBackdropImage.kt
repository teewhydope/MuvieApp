package com.teewhydope.muvieapp.android.presentation.movie_list.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.teewhydope.muvieapp.android.R
import com.teewhydope.muvieapp.datasource.network.MovieServiceImpl.Companion.IMAGE_BASE_URL


@ExperimentalCoilApi
@Composable
fun MovieBackdrop(
    backdropUrl: String, //unique backdrop url
    imageLoader: ImageLoader,
) {
//Backdrop Image

    Image(
        painter = rememberImagePainter(
            imageLoader = imageLoader,
            data = "${IMAGE_BASE_URL}$backdropUrl",
            onExecute = ImagePainter.ExecuteCallback { _, _ -> true },
            builder = {
                R.drawable.black_background
                crossfade(true)
            }
        ),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
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
            .blur(30.dp) //this blur implementation is only available for android 12
            //and higher, future release will implement an alternative
            .clip(RoundedCornerShape(15.dp)),
    )
}
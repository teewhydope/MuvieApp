package com.teewhydope.muvieapp.android.presentation.getting_started


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import com.teewhydope.muvieapp.android.R

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun GettingStartedScreen(
    hasSoftKey: Boolean,
    onServiceClick: (Int) -> Unit
) {
    val serviceList = listOf(
        R.drawable.movie_db_icon,
        R.drawable.netflix_icon,
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Choose a service",
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(Modifier.height(15.dp))
        LazyRow(
        ) {
            itemsIndexed(serviceList) { index, service ->
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .padding(10.dp)
                        .clickable {
                            onServiceClick(index)
                        },
                    border = BorderStroke(2.dp, Color.White),
                    backgroundColor = Color.Black,
                ) {
                    Image(
                        modifier = Modifier
                            .padding(10.dp),
                        painter = painterResource(id = service),
                        contentDescription = "",
                        contentScale = ContentScale.Inside
                    )

                }
                Spacer(Modifier.width(10.dp))
            }
        }

    }
}
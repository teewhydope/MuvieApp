package com.teewhydope.muvieapp.android.presentation.movie_detail


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.teewhydope.muvieapp.android.di.Dummy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel
@Inject
constructor(
    private val savedStateHandle: SavedStateHandle,
    private val dummy: Dummy
):ViewModel() {

     val movieId: MutableState<Int?> = mutableStateOf(null)

    init {
        savedStateHandle.get<Int>("movieId")?.let {
            movieId.value = it
            println(dummy.description())
        }
    }

}
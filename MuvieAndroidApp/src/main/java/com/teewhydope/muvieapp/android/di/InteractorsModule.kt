package com.teewhydope.muvieapp.android.di

import com.teewhydope.muvieapp.datasource.network.MovieService
import com.teewhydope.muvieapp.interactors.movie_list.SearchMovies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Hilt Interactors/Usecases Module Setup
//Interactor Module includes the Network Service Module as part of the setup
//Future Release will also include cache Module with SqlDelight for
// offline storage/database caching

@Module
@InstallIn(SingletonComponent::class)
object InteractorsModule {

    @Singleton
    @Provides
    fun provideSearchMovies(
        movieService: MovieService
    ): SearchMovies {
        return SearchMovies(movieService = movieService)
    }
}
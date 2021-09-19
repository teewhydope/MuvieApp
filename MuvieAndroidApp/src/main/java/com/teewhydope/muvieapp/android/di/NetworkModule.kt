package com.teewhydope.muvieapp.android.di

import com.teewhydope.muvieapp.datasource.network.KtorClientFactory
import com.teewhydope.muvieapp.datasource.network.MovieService
import com.teewhydope.muvieapp.datasource.network.MovieServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*
import javax.inject.Singleton

//Hilt Network Module Setup
//Newtwork module gets the Ktor http client as part of it's setup
//There will be a Cache Module in future release which uses SqlDelight


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule{

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return KtorClientFactory().build()
    }

    @Singleton
    @Provides
    fun provideMovieService(
        httpClient: HttpClient,
    ): MovieService {
        return MovieServiceImpl(
            httpClient = httpClient,
        )
    }
}
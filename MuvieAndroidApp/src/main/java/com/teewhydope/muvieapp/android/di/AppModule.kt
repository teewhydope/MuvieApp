package com.teewhydope.muvieapp.android.di

import android.content.Context
import com.teewhydope.muvieapp.android.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Hilt AppModule Setup
@Module
@InstallIn(SingletonComponent::class) //allow usage of Hilt in non-Android Gradle modules
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }

}
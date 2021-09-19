package com.teewhydope.muvieapp.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/teewhydope/muvieapp/android/di/InteractorsModule;", "", "()V", "provideSearchMovies", "Lcom/teewhydope/muvieapp/interactors/movie_list/SearchMovies;", "movieService", "Lcom/teewhydope/muvieapp/datasource/network/MovieService;", "MuvieAndroidApp_debug"})
@dagger.Module()
public final class InteractorsModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.teewhydope.muvieapp.android.di.InteractorsModule INSTANCE = null;
    
    private InteractorsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.teewhydope.muvieapp.interactors.movie_list.SearchMovies provideSearchMovies(@org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.datasource.network.MovieService movieService) {
        return null;
    }
}
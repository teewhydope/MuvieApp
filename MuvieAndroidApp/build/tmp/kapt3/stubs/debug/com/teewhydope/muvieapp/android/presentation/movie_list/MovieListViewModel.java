package com.teewhydope.muvieapp.android.presentation.movie_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0015H\u0002J\b\u0010\u000e\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0012\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/movie_list/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "searchMovies", "Lcom/teewhydope/muvieapp/interactors/movie_list/SearchMovies;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/teewhydope/muvieapp/interactors/movie_list/SearchMovies;)V", "comingSoon", "Landroidx/compose/runtime/MutableState;", "", "Lcom/teewhydope/muvieapp/domain/model/Movie;", "getComingSoon", "()Landroidx/compose/runtime/MutableState;", "playingNow", "getPlayingNow", "popularMovies", "getPopularMovies", "topRated", "getTopRated", "trendingMovies", "getTrendingMovies", "", "getPopular", "getTrending", "MuvieAndroidApp_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.teewhydope.muvieapp.interactors.movie_list.SearchMovies searchMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> trendingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> popularMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> playingNow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> comingSoon = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> topRated = null;
    
    @javax.inject.Inject()
    public MovieListViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.interactors.movie_list.SearchMovies searchMovies) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> getTrendingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> getPlayingNow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> getComingSoon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.teewhydope.muvieapp.domain.model.Movie>> getTopRated() {
        return null;
    }
    
    private final void getTrending() {
    }
    
    private final void getPopular() {
    }
    
    private final void getPlayingNow() {
    }
    
    private final void getComingSoon() {
    }
    
    private final void getTopRated() {
    }
}
package com.teewhydope.muvieapp.android.presentation.movie_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0012H\u0002J\b\u0010\u000b\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u000f\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/movie_list/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "searchMovies", "Lcom/teewhydope/muvieapp/interactors/movie_list/SearchMovies;", "(Lcom/teewhydope/muvieapp/interactors/movie_list/SearchMovies;)V", "comingSoon", "Landroidx/compose/runtime/MutableState;", "Lcom/teewhydope/muvieapp/presentation/movie_list/MovieListState;", "getComingSoon", "()Landroidx/compose/runtime/MutableState;", "playingNow", "getPlayingNow", "popularMovies", "getPopularMovies", "topRated", "getTopRated", "trendingMovies", "getTrendingMovies", "", "getPopular", "getTrending", "loadAllMovieCategories", "onTriggerEvent", "event", "Lcom/teewhydope/muvieapp/presentation/movie_list/MovieListEvents;", "MuvieAndroidApp_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel {
    private final com.teewhydope.muvieapp.interactors.movie_list.SearchMovies searchMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> trendingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> popularMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> playingNow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> comingSoon = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> topRated = null;
    
    @javax.inject.Inject()
    public MovieListViewModel(@org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.interactors.movie_list.SearchMovies searchMovies) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> getTrendingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> getPlayingNow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> getComingSoon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.teewhydope.muvieapp.presentation.movie_list.MovieListState> getTopRated() {
        return null;
    }
    
    public final void onTriggerEvent(@org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.presentation.movie_list.MovieListEvents event) {
    }
    
    private final void loadAllMovieCategories() {
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
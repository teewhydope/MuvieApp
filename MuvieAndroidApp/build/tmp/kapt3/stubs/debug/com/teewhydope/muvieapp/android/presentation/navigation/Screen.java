package com.teewhydope.muvieapp.android.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "", "route", "", "arguments", "", "Landroidx/navigation/compose/NamedNavArgument;", "(Ljava/lang/String;Ljava/util/List;)V", "getArguments", "()Ljava/util/List;", "getRoute", "()Ljava/lang/String;", "MovieDetail", "MovieList", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$MovieList;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$MovieDetail;", "MuvieAndroidApp_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<androidx.navigation.compose.NamedNavArgument> arguments = null;
    
    private Screen(java.lang.String route, java.util.List<androidx.navigation.compose.NamedNavArgument> arguments) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.navigation.compose.NamedNavArgument> getArguments() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$MovieList;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class MovieList extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.MovieList INSTANCE = null;
        
        private MovieList() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$MovieDetail;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class MovieDetail extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.MovieDetail INSTANCE = null;
        
        private MovieDetail() {
            super(null, null);
        }
    }
}
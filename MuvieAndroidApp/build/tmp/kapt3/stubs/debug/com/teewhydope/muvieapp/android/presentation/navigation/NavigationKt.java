package com.teewhydope.muvieapp.android.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a,\u0010\n\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\r"}, d2 = {"Navigation", "", "width", "", "imageLoader", "Lcoil/ImageLoader;", "application", "Lcom/teewhydope/muvieapp/android/BaseApplication;", "addMovieDetail", "Landroidx/navigation/NavGraphBuilder;", "addMovieList", "navController", "Landroidx/navigation/NavController;", "MuvieAndroidApp_debug"})
public final class NavigationKt {
    
    /**
     * *
     * This Application uses the Accompanist Navigation component because of
     * it's support for navigation animation
     * https://github.com/google/accompanist/tree/main/navigation-animation
     */
    @androidx.compose.runtime.Composable()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @coil.annotation.ExperimentalCoilApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void Navigation(int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addMovieList(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addMovieList, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application) {
    }
    
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addMovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addMovieDetail, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader) {
    }
}
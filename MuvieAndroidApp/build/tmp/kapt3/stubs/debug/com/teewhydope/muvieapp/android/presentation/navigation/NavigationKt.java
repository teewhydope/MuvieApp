package com.teewhydope.muvieapp.android.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a4\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a4\u0010\u0012\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a4\u0010\u0013\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a4\u0010\u0014\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a,\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a<\u0010\u0016\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a,\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a<\u0010\u0018\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0019\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a<\u0010\u001a\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H\u0007\u00a8\u0006\u001c"}, d2 = {"Navigation", "", "hasSoftKey", "", "navController", "Landroidx/navigation/NavHostController;", "width", "", "imageLoader", "Lcoil/ImageLoader;", "application", "Lcom/teewhydope/muvieapp/android/BaseApplication;", "currentRoute", "", "addComingSoon", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavController;", "navHostController", "addComingSoonTopLevel", "addDownloads", "addDownloadsTopLevel", "addGettingStarted", "addHomeTopLevel", "addLandingTopLevel", "addMovieDbMovieList", "addMovieDetail", "addNetflixMovieList", "addSplash", "MuvieAndroidApp_debug"})
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
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void Navigation(boolean hasSoftKey, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void addLandingTopLevel(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addLandingTopLevel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void addHomeTopLevel(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addHomeTopLevel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void addComingSoonTopLevel(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addComingSoonTopLevel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    public static final void addDownloadsTopLevel(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addDownloadsTopLevel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addSplash(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addSplash, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void addGettingStarted(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addGettingStarted, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void addNetflixMovieList(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addNetflixMovieList, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application, boolean hasSoftKey) {
    }
    
    @coil.annotation.ExperimentalCoilApi()
    @com.google.accompanist.pager.ExperimentalPagerApi()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.foundation.ExperimentalFoundationApi()
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void addMovieDbMovieList(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addMovieDbMovieList, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, @org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication application, boolean hasSoftKey) {
    }
    
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addMovieDetail(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addMovieDetail, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader) {
    }
    
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addDownloads(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addDownloads, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @androidx.compose.animation.ExperimentalAnimationApi()
    public static final void addComingSoon(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavGraphBuilder $this$addComingSoon, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navHostController, int width, @org.jetbrains.annotations.NotNull()
    coil.ImageLoader imageLoader, boolean hasSoftKey) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.compose.runtime.Composable()
    public static final java.lang.String currentRoute(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
        return null;
    }
}
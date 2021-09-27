package com.teewhydope.muvieapp.android;

import java.lang.System;

@com.google.accompanist.pager.ExperimentalPagerApi()
@coil.annotation.ExperimentalCoilApi()
@kotlinx.coroutines.InternalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/teewhydope/muvieapp/android/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "application", "Lcom/teewhydope/muvieapp/android/BaseApplication;", "getApplication", "()Lcom/teewhydope/muvieapp/android/BaseApplication;", "setApplication", "(Lcom/teewhydope/muvieapp/android/BaseApplication;)V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "MuvieAndroidApp_debug"})
@dagger.hilt.android.AndroidEntryPoint()
@androidx.compose.animation.ExperimentalAnimationApi()
@androidx.compose.material.ExperimentalMaterialApi()
@androidx.compose.foundation.ExperimentalFoundationApi()
public final class MainActivity extends androidx.activity.ComponentActivity {
    
    /**
     * initializing coil Image Loader
     *   ImageLoaders are service objects that execute ImageRequests.
     *   They handle caching, data fetching, image decoding, request management, bitmap pooling, memory
     *   management, and more.
     *   https://coil-kt.github.io/coil/image_loaders/
     */
    @javax.inject.Inject()
    public coil.ImageLoader imageLoader;
    @javax.inject.Inject()
    public com.teewhydope.muvieapp.android.BaseApplication application;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final coil.ImageLoader getImageLoader() {
        return null;
    }
    
    public final void setImageLoader(@org.jetbrains.annotations.NotNull()
    coil.ImageLoader p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.teewhydope.muvieapp.android.BaseApplication getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    com.teewhydope.muvieapp.android.BaseApplication p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}
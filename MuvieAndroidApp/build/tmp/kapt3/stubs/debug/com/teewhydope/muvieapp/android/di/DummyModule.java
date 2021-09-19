package com.teewhydope.muvieapp.android.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/teewhydope/muvieapp/android/di/DummyModule;", "", "()V", "provideDummyAge1", "", "provideDummyAge2", "", "provideDummyObject", "Lcom/teewhydope/muvieapp/android/di/Dummy;", "age", "name", "MuvieAndroidApp_debug"})
@dagger.Module()
public final class DummyModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.teewhydope.muvieapp.android.di.DummyModule INSTANCE = null;
    
    private DummyModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final int provideDummyAge1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideDummyAge2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.teewhydope.muvieapp.android.di.Dummy provideDummyObject(int age, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}
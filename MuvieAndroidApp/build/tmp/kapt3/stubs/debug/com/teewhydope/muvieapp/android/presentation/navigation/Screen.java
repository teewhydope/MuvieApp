package com.teewhydope.muvieapp.android.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "ComingSoon", "Downloads", "Extras", "Home", "Splash", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Splash;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Home;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$ComingSoon;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Downloads;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Extras;", "MuvieAndroidApp_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Splash;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class Splash extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.Splash INSTANCE = null;
        
        private Splash() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Home;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class Home extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.Home INSTANCE = null;
        
        private Home() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$ComingSoon;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class ComingSoon extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.ComingSoon INSTANCE = null;
        
        private ComingSoon() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Downloads;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class Downloads extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.Downloads INSTANCE = null;
        
        private Downloads() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen$Extras;", "Lcom/teewhydope/muvieapp/android/presentation/navigation/Screen;", "()V", "MuvieAndroidApp_debug"})
    public static final class Extras extends com.teewhydope.muvieapp.android.presentation.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.teewhydope.muvieapp.android.presentation.navigation.Screen.Extras INSTANCE = null;
        
        private Extras() {
            super(null);
        }
    }
}
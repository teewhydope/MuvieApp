// Generated by Dagger (https://dagger.dev).
package com.teewhydope.muvieapp.android.presentation.movie_detail;

import androidx.lifecycle.SavedStateHandle;
import com.teewhydope.muvieapp.android.di.Dummy;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieDetailViewModel_Factory implements Factory<MovieDetailViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<Dummy> dummyProvider;

  public MovieDetailViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<Dummy> dummyProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.dummyProvider = dummyProvider;
  }

  @Override
  public MovieDetailViewModel get() {
    return newInstance(savedStateHandleProvider.get(), dummyProvider.get());
  }

  public static MovieDetailViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider, Provider<Dummy> dummyProvider) {
    return new MovieDetailViewModel_Factory(savedStateHandleProvider, dummyProvider);
  }

  public static MovieDetailViewModel newInstance(SavedStateHandle savedStateHandle, Dummy dummy) {
    return new MovieDetailViewModel(savedStateHandle, dummy);
  }
}

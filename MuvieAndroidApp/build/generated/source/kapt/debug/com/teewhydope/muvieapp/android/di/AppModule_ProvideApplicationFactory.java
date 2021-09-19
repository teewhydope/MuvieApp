// Generated by Dagger (https://dagger.dev).
package com.teewhydope.muvieapp.android.di;

import android.content.Context;
import com.teewhydope.muvieapp.android.BaseApplication;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApplicationFactory implements Factory<BaseApplication> {
  private final Provider<Context> appProvider;

  public AppModule_ProvideApplicationFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public BaseApplication get() {
    return provideApplication(appProvider.get());
  }

  public static AppModule_ProvideApplicationFactory create(Provider<Context> appProvider) {
    return new AppModule_ProvideApplicationFactory(appProvider);
  }

  public static BaseApplication provideApplication(Context app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApplication(app));
  }
}

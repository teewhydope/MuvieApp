// Generated by Dagger (https://dagger.dev).
package com.teewhydope.muvieapp.android.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DummyModule_ProvideDummyAge2Factory implements Factory<String> {
  @Override
  public String get() {
    return provideDummyAge2();
  }

  public static DummyModule_ProvideDummyAge2Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideDummyAge2() {
    return Preconditions.checkNotNullFromProvides(DummyModule.INSTANCE.provideDummyAge2());
  }

  private static final class InstanceHolder {
    private static final DummyModule_ProvideDummyAge2Factory INSTANCE = new DummyModule_ProvideDummyAge2Factory();
  }
}

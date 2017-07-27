package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import android.app.Application;
import dagger.Module;
import dagger.Provides;

@Module public final class ApplicationModule {
  private final Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }

  @Provides Application application() {
    return application;
  }
}

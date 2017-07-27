package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;

@Module public final class ActivityModule {
  private final Activity activity;

  public ActivityModule(Activity activity) {
    this.activity = activity;
  }

  @Provides Activity activity() {
    return activity;
  }
}

package com.benoitquenaudon.daggerbundleinjectiondemo;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.DaggerApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {
  @Override public void onCreate() {
    super.onCreate();
  }

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerApplicationComponent.builder().create(this);
  }
}

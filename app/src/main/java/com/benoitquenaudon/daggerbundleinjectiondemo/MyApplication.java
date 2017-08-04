package com.benoitquenaudon.daggerbundleinjectiondemo;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.DaggerMyApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    return DaggerMyApplicationComponent.builder().create(this);
  }
}

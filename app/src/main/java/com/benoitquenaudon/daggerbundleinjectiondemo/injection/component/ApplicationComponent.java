package com.benoitquenaudon.daggerbundleinjectiondemo.injection.component;

import com.benoitquenaudon.daggerbundleinjectiondemo.MyApplication;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ApplicationModule;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

@Singleton @Component(modules = { ApplicationModule.class, AndroidSupportInjectionModule.class })
public interface ApplicationComponent extends AndroidInjector<MyApplication> {
  @Component.Builder abstract class Builder extends AndroidInjector.Builder<MyApplication> {
  }
}
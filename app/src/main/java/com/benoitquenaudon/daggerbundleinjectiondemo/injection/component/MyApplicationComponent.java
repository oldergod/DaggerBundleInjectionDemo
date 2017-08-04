package com.benoitquenaudon.daggerbundleinjectiondemo.injection.component;

import com.benoitquenaudon.daggerbundleinjectiondemo.MyApplication;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.MyApplicationModule;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

@Singleton @Component(modules = { MyApplicationModule.class, AndroidSupportInjectionModule.class })
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
  @Component.Builder abstract class MyApplicationComponentBuilder extends Builder<MyApplication> {
  }
}
package com.benoitquenaudon.daggerbundleinjectiondemo.injection.component;

import com.benoitquenaudon.daggerbundleinjectiondemo.MyApplication;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ActivityModule;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ApplicationModule;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
    ApplicationModule.class, AndroidInjectionModule.class, ActivityModule.class
}) //
public interface ApplicationComponent {
  void inject(MyApplication myApplication);
}

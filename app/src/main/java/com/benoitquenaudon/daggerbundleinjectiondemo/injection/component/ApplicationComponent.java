package com.benoitquenaudon.daggerbundleinjectiondemo.injection.component;

import com.benoitquenaudon.daggerbundleinjectiondemo.MyApplication;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ActivityModule;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ApplicationModule;
import dagger.Component;

@Component(modules = { ApplicationModule.class }) //
public interface ApplicationComponent {
  void inject(MyApplication myApplication);

  ActivityComponent plus(ActivityModule activityModule);
}

package com.benoitquenaudon.daggerbundleinjectiondemo;

import android.app.Application;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.ApplicationComponent;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.DaggerApplicationComponent;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ApplicationModule;

public class MyApplication extends Application {
  private ApplicationComponent applicationComponent;

  @Override public void onCreate() {
    super.onCreate();

    this.applicationComponent =
        DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
}

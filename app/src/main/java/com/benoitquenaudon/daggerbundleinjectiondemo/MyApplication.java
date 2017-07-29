package com.benoitquenaudon.daggerbundleinjectiondemo;

import android.app.Activity;
import android.app.Application;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.DaggerApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import javax.inject.Inject;

public class MyApplication extends Application implements HasActivityInjector {
  @Inject DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Override public void onCreate() {
    super.onCreate();

    DaggerApplicationComponent.create().inject(this);
  }

  @Override public AndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }
}

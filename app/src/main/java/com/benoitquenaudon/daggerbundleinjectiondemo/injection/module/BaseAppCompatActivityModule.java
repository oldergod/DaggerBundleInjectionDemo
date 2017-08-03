package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import dagger.Binds;
import dagger.Module;

@Module public interface BaseAppCompatActivityModule<A extends BaseAppCompatActivity> {
  @Binds BaseAppCompatActivity activity(A activity);
}

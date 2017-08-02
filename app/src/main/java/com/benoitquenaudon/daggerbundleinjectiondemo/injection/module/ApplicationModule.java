package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.input.InputActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.output.OutputActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module public abstract class ApplicationModule {
  @ScopeActivity @ContributesAndroidInjector(modules = { InputActivityModule.class, BundleModule.class })
  abstract InputActivity contributeInputActivityInjector();

  @ScopeActivity @ContributesAndroidInjector(modules = { OutputActivityModule.class, BundleModule.class })
  abstract OutputActivity contributeOutputActivityInjector();
}
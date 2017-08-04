package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.output.OutputActivity;
import dagger.Module;
import dagger.Provides;

@Module public abstract class OutputActivityModule implements BaseAppCompatActivityModule<OutputActivity> {
  public static final String EXTRA_SOME_INPUT = "com.benoitquenaudon.demo.SOME_INPUT";

  @ScopeActivity @SomeInput @Provides static String someInput(BundleService bundleService) {
    return bundleService.has(EXTRA_SOME_INPUT) ? (String) bundleService.get(EXTRA_SOME_INPUT) : "Null";
  }
}

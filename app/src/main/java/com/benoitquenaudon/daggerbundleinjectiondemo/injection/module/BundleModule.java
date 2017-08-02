package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import dagger.Module;
import dagger.Provides;

@Module public abstract class BundleModule {
  public static final String EXTRA_SOME_INPUT = "com.benoitquenaudon.demo.SOME_INPUT";

 /*
  @Provides public Bundle provideBundle(Activity context) {
    return context.getIntent().getExtras() == null ? new Bundle() : context.getIntent().getExtras();
  }

  @Provides public Intent provideIntent(Activity context) {
    return context.getIntent() == null ? new Intent() : context.getIntent();
  }
  */

  @Provides @ScopeActivity static BundleService provideBundleService(BaseAppCompatActivity context) {
    return context.getBundleService();
  }

  @Provides @ScopeActivity @SomeInput static String provideSomeInput(BundleService bundleService) {
    String style = (String) bundleService.get(EXTRA_SOME_INPUT);
    return style == null ? "Null" : style;
  }
}
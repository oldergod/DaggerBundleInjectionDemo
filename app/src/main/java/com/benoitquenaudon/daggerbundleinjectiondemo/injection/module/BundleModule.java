package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import dagger.Module;
import dagger.Provides;

@Module public final class BundleModule {
  public static final String EXTRA_SOME_INPUT = "com.benoitquenaudon.demo.SOME_INPUT";

  @Provides public Bundle provideBundle(Activity context) {
    return context.getIntent().getExtras() == null ? new Bundle() : context.getIntent().getExtras();
  }

  @Provides public Intent provideIntent(Activity context) {
    return context.getIntent() == null ? new Intent() : context.getIntent();
  }

  @Provides @ScopeActivity public BundleService provideBundleService(Activity context) {
    return ((BaseAppCompatActivity) context).getBundleService();
  }

  @Provides @ScopeActivity @SomeInput public String provideSomeInput(BundleService bundleService) {
    String style = (String) bundleService.get(EXTRA_SOME_INPUT);
    return style == null ? "Null" : style;
  }
}
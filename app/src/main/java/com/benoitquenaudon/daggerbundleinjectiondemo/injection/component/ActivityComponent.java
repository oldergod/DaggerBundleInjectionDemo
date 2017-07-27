package com.benoitquenaudon.daggerbundleinjectiondemo.injection.component;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ActivityModule;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.BundleModule;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.InputActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.OutputActivity;
import dagger.Subcomponent;

@ScopeActivity @Subcomponent(modules = { ActivityModule.class, BundleModule.class }) //
public interface ActivityComponent {
  void inject(InputActivity inputActivity);

  void inject(OutputActivity outputActivity);
}

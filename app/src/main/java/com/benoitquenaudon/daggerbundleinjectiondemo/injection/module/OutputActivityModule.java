package com.benoitquenaudon.daggerbundleinjectiondemo.injection.module;

import android.app.Activity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.output.OutputActivity;
import dagger.Binds;
import dagger.Module;

@Module public abstract class OutputActivityModule {
  @Binds abstract Activity activity(OutputActivity outputActivity);
}

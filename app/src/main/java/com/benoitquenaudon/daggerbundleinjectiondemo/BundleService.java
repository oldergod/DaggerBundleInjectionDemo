package com.benoitquenaudon.daggerbundleinjectiondemo;

import android.os.Bundle;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.scope.ScopeActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import javax.inject.Inject;

@ScopeActivity public class BundleService {
  private final Bundle all = new Bundle();

  @Inject BundleService(BaseAppCompatActivity activity) {
    all.putAll(activity.getBundles());
  }

  public boolean has(String key) {
    return all.containsKey(key);
  }

  public Object get(String key) {
    return all.get(key);
  }

  public Bundle getAll() {
    return all;
  }
}
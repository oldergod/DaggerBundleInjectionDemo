package com.benoitquenaudon.daggerbundleinjectiondemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity {
  private BundleService bundleService;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    bundleService = new BundleService(savedInstanceState, getIntent().getExtras());
    super.onCreate(savedInstanceState);
  }

  public BundleService getBundleService() {
    return bundleService;
  }

  @Override protected void onSaveInstanceState(Bundle outState) {
    outState.putAll(bundleService.getAll());
    super.onSaveInstanceState(outState);
  }
}

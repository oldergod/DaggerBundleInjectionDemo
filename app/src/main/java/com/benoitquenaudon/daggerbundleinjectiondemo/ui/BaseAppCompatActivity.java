package com.benoitquenaudon.daggerbundleinjectiondemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import dagger.android.support.DaggerAppCompatActivity;
import javax.inject.Inject;

public abstract class BaseAppCompatActivity extends DaggerAppCompatActivity {
  @Inject BundleService bundleService;
  private Bundle savedInstanceState;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    this.savedInstanceState = savedInstanceState;
    super.onCreate(savedInstanceState);
  }

  protected void onSaveInstanceState(Bundle outState) {
    outState.putAll(bundleService.getAll());
    super.onSaveInstanceState(outState);
  }

  public Bundle getBundles() {
    Bundle extras = getIntent().getExtras();
    if (extras == null) extras = new Bundle();
    if (savedInstanceState != null) extras.putAll(savedInstanceState);
    return extras;
  }
}

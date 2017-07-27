package com.benoitquenaudon.daggerbundleinjectiondemo.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.BundleService;
import com.benoitquenaudon.daggerbundleinjectiondemo.MyApplication;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.component.ActivityComponent;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.ActivityModule;

@SuppressLint("Registered") //
public class BaseAppCompatActivity extends AppCompatActivity {
  private BundleService bundleService;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    bundleService = new BundleService(savedInstanceState, getIntent().getExtras());
  }

  public BundleService getBundleService() {
    return bundleService;
  }

  protected ActivityComponent getActivityComponent() {
    return ((MyApplication) getApplication()).getApplicationComponent()
        .plus(new ActivityModule(this));
  }

  protected void onSaveInstanceState(Bundle outState) {
    outState.putAll(bundleService.getAll());
    super.onSaveInstanceState(outState);
  }
}

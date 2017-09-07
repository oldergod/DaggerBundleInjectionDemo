package com.benoitquenaudon.daggerbundleinjectiondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class BundleService {
  private final Bundle data;

  public BundleService(@Nullable Bundle savedState, @Nullable Bundle intentExtras) {
    data = new Bundle();

    if (savedState != null) {
      data.putAll(savedState);
    }
    if (intentExtras != null) {
      data.putAll(intentExtras);
    }
  }

  public Object get(String key) {
    return data.get(key);
  }

  public boolean contains(String key) {
    return data.containsKey(key);
  }

  public Bundle getAll() {
    return data;
  }
}
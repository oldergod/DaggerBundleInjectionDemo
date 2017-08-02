package com.benoitquenaudon.daggerbundleinjectiondemo.ui.output;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import javax.inject.Inject;

class OutputPresenter {
  @Inject @SomeInput String inputText;
  @Inject OutputActivity activity;

  @Inject OutputPresenter() {
  }

  void onStart() {
    activity.showText(inputText);
  }
}

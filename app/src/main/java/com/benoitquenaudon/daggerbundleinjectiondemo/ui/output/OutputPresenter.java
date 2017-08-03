package com.benoitquenaudon.daggerbundleinjectiondemo.ui.output;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import javax.inject.Inject;

class OutputPresenter {
  private final OutputActivity activity;
  private final String inputText;

  @Inject OutputPresenter(OutputActivity activity, @SomeInput String inputText) {
    this.activity = activity;
    this.inputText = inputText;
  }

  void onStart() {
    activity.showText(inputText);
  }
}

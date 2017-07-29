package com.benoitquenaudon.daggerbundleinjectiondemo.ui.output;

import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import javax.inject.Inject;

public class OutputPresenter {
  @Inject @SomeInput String inputText;
  private final OutputActivity activity;

  @Inject public OutputPresenter(OutputActivity activity) {
    this.activity = activity;
  }

  void onStart() {
    activity.showText(inputText);
  }
}

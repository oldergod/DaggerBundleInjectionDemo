package com.benoitquenaudon.daggerbundleinjectiondemo.ui.output;

import android.os.Bundle;
import android.widget.TextView;
import com.benoitquenaudon.daggerbundleinjectiondemo.R;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import javax.inject.Inject;

public class OutputActivity extends BaseAppCompatActivity {
  @Inject OutputPresenter presenter;
  TextView textView;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActivityComponent().inject(this);

    setContentView(R.layout.activity_output);

    textView = findViewById(R.id.text_view);
  }

  @Override protected void onStart() {
    super.onStart();
    presenter.onStart();
  }

  void showText(String text) {
    textView.setText(text);
  }
}

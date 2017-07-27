package com.benoitquenaudon.daggerbundleinjectiondemo.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.benoitquenaudon.daggerbundleinjectiondemo.R;
import com.benoitquenaudon.daggerbundleinjectiondemo.injection.SomeInput;
import javax.inject.Inject;

public class OutputActivity extends BaseAppCompatActivity {
  @Inject @SomeInput String inputText;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActivityComponent().inject(this);

    setContentView(R.layout.activity_output);

    TextView textView = findViewById(R.id.text_view);
    textView.setText(inputText);
  }
}

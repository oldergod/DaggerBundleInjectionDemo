package com.benoitquenaudon.daggerbundleinjectiondemo.ui.input;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.benoitquenaudon.daggerbundleinjectiondemo.R;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.BaseAppCompatActivity;
import com.benoitquenaudon.daggerbundleinjectiondemo.ui.output.OutputActivity;
import dagger.android.AndroidInjection;

import static com.benoitquenaudon.daggerbundleinjectiondemo.injection.module.BundleModule.EXTRA_SOME_INPUT;

public class InputActivity extends BaseAppCompatActivity {
  @Override public void onCreate(Bundle savedInstanceState) {
    AndroidInjection.inject(this);
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_input);

    final EditText editText = findViewById(R.id.edit_text);
    findViewById(R.id.button).setOnClickListener(v -> {
      Intent intent = new Intent(InputActivity.this, OutputActivity.class);
      intent.putExtra(EXTRA_SOME_INPUT, editText.getText().toString());
      InputActivity.this.startActivity(intent);
    });
  }
}

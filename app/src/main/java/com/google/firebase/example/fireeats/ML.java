package com.google.firebase.example.fireeats;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ML extends Activity {

    private static final String TAG = "ML";

    @BindView(R.id.dynamic_text)
    TextView mDynamicText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ml);
        ButterKnife.bind(this);

        mDynamicText.setText("Testing...");
    }

    @OnClick(R.id.ml_back_button)
    public void onBackArrowClicked(View view) {
        Log.i(TAG, "back pressed");
        onBackPressed();
    }

}

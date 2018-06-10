package com.bh.android.lifecycle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BActivity extends AppCompatActivity {

    final String TAG = "BH_Activity_B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Activity B");

        Log.v(TAG, "+++ onCreate() +++");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "+++ onStart() +++");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "+++ onRestart() +++");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "+++ onResume() +++");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "+++ onStop() +++");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "+++ onDestroy() +++");
    }
}

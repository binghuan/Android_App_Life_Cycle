package com.bh.android.lifecycle;

import android.support.v7.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {

    final String TAG = "BH_Activity_A";

    private Button btn2LaunchActivityB = null;

    private Context mContext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;

        setContentView(R.layout.activity_a);
        Log.v(TAG, "+++ onCreate() +++");

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Activity A");

        btn2LaunchActivityB = findViewById(R.id.btn_launch_activity_b);
        btn2LaunchActivityB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(mContext, BActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "+++ onRestart() +++");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "+++ onStart() +++");
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

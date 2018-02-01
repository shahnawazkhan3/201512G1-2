package com.zaaviyah.alpha_intent_16_1_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "welcome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate()",msg);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart()",msg);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause()",msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume()",msg);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(" onStop() ",msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("  onDestroy() ",msg);
    }
}

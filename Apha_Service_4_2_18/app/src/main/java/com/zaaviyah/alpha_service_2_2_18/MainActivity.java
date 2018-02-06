package com.zaaviyah.alpha_service_2_2_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String msg ="Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("onCreate()",msg);

    }

    public void startService(View view){

        startService(new Intent(getBaseContext(),myService.class));
      //Log.d("startService()",msg);
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
    }

    public void stopService(View view){
        stopService(new Intent(getBaseContext(),myService.class));
        //Log.d("endService()",msg);
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
    }
}

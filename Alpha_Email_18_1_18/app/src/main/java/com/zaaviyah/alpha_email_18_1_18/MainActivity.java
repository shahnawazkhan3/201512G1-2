package com.zaaviyah.alpha_email_18_1_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1SEND;
    EditText etEMAIL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1SEND= (Button)findViewById(R.id.btSend);
        etEMAIL =(EditText)findViewById(R.id.etEmail);

        b1SEND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"yes",Toast.LENGTH_SHORT).show();
            }
        });


    }


}

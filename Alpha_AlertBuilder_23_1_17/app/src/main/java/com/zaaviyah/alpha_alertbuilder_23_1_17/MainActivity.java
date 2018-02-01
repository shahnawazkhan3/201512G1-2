package com.zaaviyah.alpha_alertbuilder_23_1_17;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button  b1Alert;
    TextView tvWellcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Alert =(Button)findViewById(R.id.btLogin);
        tvWellcome =(TextView)findViewById(R.id.tvWelcome);


        b1Alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alertbuilder();
            }
        });

    }

    private void Alertbuilder() {

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setMessage("welcome here login");

        alertBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent  LoginINTENT = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(LoginINTENT);
            }
        });

        alertBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this,"no data",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertdailog = alertBuilder.create();
        alertdailog.show();
    }
}

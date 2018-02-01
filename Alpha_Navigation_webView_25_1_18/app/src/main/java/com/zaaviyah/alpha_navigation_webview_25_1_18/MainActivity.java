package com.zaaviyah.alpha_navigation_webview_25_1_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1web ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1web= (Button)findViewById(R.id.btNext);


        b1web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent webView= new Intent(MainActivity.this, WebviewActivity.class);
                startActivity(webView);
            }
        });
    }
}

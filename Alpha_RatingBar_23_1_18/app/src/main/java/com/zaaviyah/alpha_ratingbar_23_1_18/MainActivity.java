package com.zaaviyah.alpha_ratingbar_23_1_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rtBar;
    Button b1Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1Show=(Button)findViewById(R.id.btRating);


        b1Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ratingBar();
            }
        });

    }

    private void ratingBar() {

        rtBar= (RatingBar)findViewById(R.id.rtBar);

        String rating = String.valueOf(rtBar.getRating());

        Toast.makeText(getApplicationContext(),rating.toString(),Toast.LENGTH_SHORT).show();
    }
}

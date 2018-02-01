package com.zaaviyah.alpha_ui_ndroid_20_1_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tg1, tg2;
    Button b1Show ,btCheck;
    CheckBox pizza, burger, iceCream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      addClicklistenerToggle();
        addclickListenrCheck();

    }

    private void addclickListenrCheck() {

        btCheck = (Button)findViewById(R.id.btChck);

        pizza= (CheckBox)findViewById(R.id.ckPIzza);
        burger= (CheckBox)findViewById(R.id.ckBurger);
        iceCream= (CheckBox)findViewById(R.id.ckIce_Cream);

        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalamount=0;

                StringBuilder result = new StringBuilder();

                result.append("SELECT ITEMA");

                if(pizza.isChecked()){
                     result.append("\n pizaa Rs 100:");
                    totalamount+=100;
                }
                if(iceCream.isChecked()){
                    result.append("\nCoffe 50Rs");
                    totalamount+=50;
                }
                if(burger.isChecked()){
                    result.append("\nBurger 120Rs");
                    totalamount+=120;
                }

                result.append("\n TOTAL"+totalamount+"RS");

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();


            }
        });

    }

    private void addClicklistenerToggle() {

        b1Show=(Button)findViewById(R.id.btshToggle);
        tg1= (ToggleButton)findViewById(R.id.tg1);
        tg2= (ToggleButton)findViewById(R.id.tg2);

        b1Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder result = new StringBuilder();

                result.append("Toggle 1 :").append(tg1.getText());
                result.append("Toggle 2 :").append(tg2.getText());

               // Toast.makeText(MainActivity.this,"yes here",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}

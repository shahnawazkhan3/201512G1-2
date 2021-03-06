package com.zaaviyah.alpha_progressbar_27_1_18;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1DownloAD;

    private ProgressDialog progressBar;
    private int progressbarStatus=0;
    private Handler progressBarHendler = new Handler();
    private long fileSize= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1DownloAD=(Button)findViewById(R.id.btDownload);

        b1DownloAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar=new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("downloading ..");
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressBar.setMax(100);
                progressBar.show();
                progressbarStatus=0;

                fileSize=0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {


                        while (progressbarStatus < 100){
                            progressbarStatus= downloadFile();

                            try {
                                 Thread.sleep(1000);
                            }catch (InterruptedException e ){
                                e.printStackTrace();
                            }

                            progressBarHendler.post(new Runnable() {
                                @Override
                                public void run() {
                                  progressBar.setProgress(progressbarStatus);
                                }
                            });
                        }
                        if (progressbarStatus >=100){
                             try {
                                 Thread.sleep(2000);
                             }catch (InterruptedException e){
                                 e.printStackTrace();
                             }
                             progressBar.dismiss();
                        }

                    }
                }).start();


            }
        });

    }

    private int downloadFile() {

        while (fileSize <= 1000000){
            fileSize++;
            if (fileSize == 100000) {
                return 10;
            }else if (fileSize == 200000) {
                return 20;
            }else if (fileSize == 300000) {
                return 30;
            }else if (fileSize == 400000) {
                return 40;
            }else if (fileSize == 500000) {
                return 50;
            }else if (fileSize == 700000) {
                return 70;
            }else if (fileSize == 800000) {
                return 80;
            }
        }

        return 100;
    }


}

package com.example.splashscreenactivity;

import static java.lang.Thread.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Thread thread=new Thread(){
//
//            public void start(){
//
//                try {
//                    sleep(3000);
//                }
//                catch (Exception e){
//                    e.printStackTrace();
//                }
//                final
//
//                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent);
//            }
//        };thread.start();

          Intent intent=new Intent(MainActivity.this,MainActivity2.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(intent);
                finish();

            }
        },3000);
    }
}
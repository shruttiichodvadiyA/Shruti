package com.example.alertdialogactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id();
        button1();
        button2();
        button3();
        button4();
        button5();
    }
    private void id() {

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
    }

    private void button5() {

        btn5.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Reset Setting");
            builder.setMessage("this will reset your device to it's default setting");
            builder.setPositiveButton("cancle", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "canclling..", Toast.LENGTH_SHORT).show();

                }
            });
            builder.setNegativeButton("confirm", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "reset start now..", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();

        });
    }

    private void button4() {

        btn4.setOnClickListener(view -> {
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Application Message");
            builder.setMessage("Username or password is incorrect");
            builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "ok", Toast.LENGTH_SHORT).show();

                }
            });
            builder.setCancelable(false);
            builder.show();
        });
    }

    private void button3() {
        btn3.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Alert");
            builder.setMessage("Are You Sure ,You Want To delete ?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();

                }
            });
            builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "no", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();

        });
    }



    private void button2() {

        btn2.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("LoginAlert");
            builder.setMessage("Are You Sure,You Want To Continue ?");
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "yes,i m sure..", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "no,i m not sure..", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setNeutralButton("Log in", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "login please", Toast.LENGTH_SHORT).show();
                }
            });

            builder.setCancelable(false);
            builder.show();
        });
    }




    private void button1() {

        btn1.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("AlertDialog");
            builder.setMessage("Would You Like to Continue Learning How To use Android Alerts ?");
            builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "please continue", Toast.LENGTH_SHORT).show();

                }
            });
            builder.setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "Alert cancle", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();

        });



    }
}
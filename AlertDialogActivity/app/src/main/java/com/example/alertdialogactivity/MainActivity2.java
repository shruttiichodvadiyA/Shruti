package com.example.alertdialogactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    String[] listarr={"pizza","burger","browny","cake"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        id();
        onclick();
    }
    private void id() {

        btn=findViewById(R.id.btn);
    }
    private void onclick() {

        btn.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);
            builder.setTitle("choose item");
            builder.setSingleChoiceItems(listarr, 1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    String selecteditem=listarr[i];
                }
            });

            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity2.this, "sure..", Toast.LENGTH_SHORT).show();
                }
            });

            builder.setCancelable(false);
            builder.show();
        });
    }


}
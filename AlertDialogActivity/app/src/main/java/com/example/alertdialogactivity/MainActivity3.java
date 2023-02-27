package com.example.alertdialogactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button btnn;
    String[]listarr={"gujarati","chienese","punjabi","italian"};
    boolean[] listboolean={true,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        id();
        output();
    }

    private void id() {

        btnn=findViewById(R.id.btnn);
    }

    private void output() {

        btnn.setOnClickListener(view -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity3.this);
            builder.setTitle("choose items");
            builder.setMultiChoiceItems(listarr, listboolean, new DialogInterface.OnMultiChoiceClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                    String selecteditem=listarr[i];
                }
            });
            builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity3.this, "confirm..", Toast.LENGTH_SHORT).show();
                }
            });
            builder.setCancelable(false);
            builder.show();
        });

    }
}
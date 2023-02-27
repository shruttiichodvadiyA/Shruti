package com.example.informationform;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    registration();



    }
    void registration(){

        Button btnr=findViewById(R.id.btnr);
        EditText edtname=findViewById(R.id.edtname);


        btnr.setOnClickListener(view -> {

            String name=edtname.getText().toString();



            Toast.makeText(this, "submit", Toast.LENGTH_SHORT).show();

            Log.e( "registration: ","click button" );
            Log.e( "registration: ","name:" +name );
        });



    }
}
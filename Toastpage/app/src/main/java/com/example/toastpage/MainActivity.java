package com.example.toastpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtvalue;
    Button btnsubmit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiview();

    }

    private void intiview() {

        edtvalue=findViewById(R.id.edtvalue);
        btnsubmit=findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(view -> {
            int age=Integer.parseInt(edtvalue.getText().toString());
            if(age<18){
                Toast.makeText(this, "not eligble for vote ", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "eligble for vote", Toast.LENGTH_SHORT).show();
            }

            //Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();

//        Toast.makeText(this, "submit", Toast.LENGTH_SHORT).show();
        });
    }
}
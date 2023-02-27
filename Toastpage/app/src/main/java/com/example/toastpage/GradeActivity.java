package com.example.toastpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GradeActivity extends AppCompatActivity {
    EditText edtvalue;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        intiview();
    }

    private void intiview() {

        edtvalue=findViewById(R.id.edtvalue);
        btnsubmit=findViewById(R.id.btnsubmit);
        btnsubmit.setOnClickListener(view -> {
            int marks=Integer.parseInt(edtvalue.getText().toString());
            if(marks<35 ){
                Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show();
            }
            else if (marks>=35 && marks <50){
                Toast.makeText(this, "d grade", Toast.LENGTH_SHORT).show();
            }
            else if (marks>=50 && marks <75) {
                Toast.makeText(this, "c grade", Toast.LENGTH_SHORT).show();
            }
            else if (marks>=75 && marks < 85){
                Toast.makeText(this, "b grade", Toast.LENGTH_SHORT).show();
            }
            else if (marks>=85 && marks <90){
                Toast.makeText(this, "a grade", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "a+grade", Toast.LENGTH_SHORT).show();
            }


        });
    }
}


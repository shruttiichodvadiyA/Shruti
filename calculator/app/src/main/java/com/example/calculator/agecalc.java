package com.example.calculator;

import static android.text.method.TextKeyListener.clear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class agecalc extends AppCompatActivity {

    EditText edtd1,edtd2,edtd3,edtb1,edtb2,edtb3;
    AppCompatButton btncal,btnclear;
    TextView txtdate,txtmonth,txtyear;
    ImageView imgperson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agecalc);


        image();
        button();
        calculate();
        clear();
    }


    private void image() {

        imgperson=findViewById(R.id.imgperson);

        imgperson.setOnClickListener(view -> {

            Toast.makeText(this, "enter your name", Toast.LENGTH_SHORT).show();


        });

    }

    private void button() {

        edtd1=findViewById(R.id.edtd1);
        edtd2=findViewById(R.id.edtd2);
        edtd3=findViewById(R.id.edtd3);

        edtb1=findViewById(R.id.edtb1);
        edtb2=findViewById(R.id.edtb2);
        edtb3=findViewById(R.id.edtb3);

        txtdate=findViewById(R.id.txtdate);
        txtmonth=findViewById(R.id.txtmonth);
        txtyear=findViewById(R.id.txtyear);

        btncal=findViewById(R.id.btncal);
        btnclear=findViewById(R.id.btnclear);
    }

    private void calculate() {
        btncal.setOnClickListener(view -> {

            int date1=Integer.parseInt(edtd1.getText().toString());
            int date2=Integer.parseInt(edtb1.getText().toString());
            int ans1;
            ans1=date1-date2;
            txtdate.setText(ans1+"");

            int month1=Integer.parseInt(edtd2.getText().toString());
            int month2=Integer.parseInt(edtb2.getText().toString());
            int ans2;
            ans2=month1-month2;
            txtmonth.setText(ans2+"");

            int year1=Integer.parseInt(edtd3.getText().toString());
            int year2=Integer.parseInt(edtb3.getText().toString());
            int ans3;
            ans3=year1-year2;
            txtyear.setText(ans3+"");


        });
    }

    private void clear() {

        btnclear.setOnClickListener(view -> {

            edtd1.setText("");
            edtd2.setText("");
            edtd3.setText("");

            edtb1.setText("");
            edtb2.setText("");
            edtb3.setText("");


            txtdate.setText("");
            txtmonth.setText("");
            txtyear.setText("");

        });
    }
}
package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    //variable define

    EditText edtvalue1, edtvalue2, edtvalue3, edtvalue4, edtvalue5;
    TextView txtresult;
    Button btnplus, btnminus, btndivide, btnmulti, btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new class define

        button();

    }

    //class define

    private void button() {

        edtvalue1 = findViewById(R.id.edtvalue1);
        edtvalue2 = findViewById(R.id.edtvalue2);
        edtvalue3 = findViewById(R.id.edtvalue3);
        edtvalue4 = findViewById(R.id.edtvalue4);
        edtvalue5 = findViewById(R.id.edtvalue5);
        txtresult = findViewById(R.id.txtresult);
        btnplus = findViewById(R.id.btnplus);
        btnminus = findViewById(R.id.btnminus);
        btndivide = findViewById(R.id.btndivide);
        btnmulti = findViewById(R.id.btnmulti);
        btnclear = findViewById(R.id.btnclear);

        Addition();
        Substration();
        multiplication();
        Divide();
        clear();

    }


    private void Addition() {


        btnplus.setOnClickListener(view -> {

            String value1 = edtvalue1.getText().toString();
            String value2 = edtvalue2.getText().toString();
            String value3 = edtvalue3.getText().toString();
            String value4 = edtvalue4.getText().toString();
            String value5 = edtvalue5.getText().toString();

            int v1 = Integer.parseInt(value1);
            int v2 = Integer.parseInt(value2);
            int v3 = Integer.parseInt(value3);
            int v4 = Integer.parseInt(value4);
            int v5 = Integer.parseInt(value5);
            int result;
            result = v1 + v2 + v3 + v4 + v5;
            txtresult.setText(result + "");

        });

    }

    private void Substration() {

        btnminus.setOnClickListener(v -> {

            String value1 = edtvalue1.getText().toString();
            String value2 = edtvalue2.getText().toString();
            String value3 = edtvalue3.getText().toString();
            String value4 = edtvalue4.getText().toString();
            String value5 = edtvalue5.getText().toString();

            int v1 = Integer.parseInt(value1);
            int v2 = Integer.parseInt(value2);
            int v3 = Integer.parseInt(value3);
            int v4 = Integer.parseInt(value4);
            int v5 = Integer.parseInt(value5);
            int result;
            result = v1-v2-v3-v4-v5;
            txtresult.setText(result + "");
        });
    }

    private void Divide() {

        btndivide.setOnClickListener(D -> {

            String value1 = edtvalue1.getText().toString();
            String value2 = edtvalue2.getText().toString();
            String value3 = edtvalue3.getText().toString();
            String value4 = edtvalue4.getText().toString();
            String value5 = edtvalue5.getText().toString();

            int v1 = Integer.parseInt(value1);
            int v2 = Integer.parseInt(value2);
            int v3 = Integer.parseInt(value3);
            int v4 = Integer.parseInt(value4);
            int v5 = Integer.parseInt(value5);
            int result;
            result = v1/v2/v3/v4/v5;
            txtresult.setText(result + "");
        });

    }

    private void multiplication() {

        btnmulti.setOnClickListener(M -> {

            String value1 = edtvalue1.getText().toString();
            String value2 = edtvalue2.getText().toString();
            String value3 = edtvalue3.getText().toString();
            String value4 = edtvalue4.getText().toString();
            String value5 = edtvalue5.getText().toString();

            int v1 = Integer.parseInt(value1);
            int v2 = Integer.parseInt(value2);
            int v3 = Integer.parseInt(value3);
            int v4 = Integer.parseInt(value4);
            int v5 = Integer.parseInt(value5);
            int result;
            result = v1*v2*v3*v4*v5;
             txtresult.setText(result + "");
        });
    }

    private void clear() {

        btnclear.setOnClickListener(c -> {

            edtvalue1.setText("");
            edtvalue2.setText("");
            edtvalue3.setText("");
            edtvalue4.setText("");
            edtvalue5.setText("");
            txtresult.setText("");
        });
    }

}

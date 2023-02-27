package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, ans;
    AppCompatButton zero, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnaddition, btnSub, btnmulti, btndivide, btnAc;
    TextView txtans, btnans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttons_0to9();
    }

    private void Buttons_0to9() {

        zero = findViewById(R.id.zero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnaddition = findViewById(R.id.btnaddition);
        btnSub = findViewById(R.id.btnsub);
        btnmulti = findViewById(R.id.btnmulti);
        btndivide = findViewById(R.id.btndivide);
        txtans = findViewById(R.id.txtans);
        btnAc = findViewById(R.id.btnAc);
        btnans = findViewById(R.id.btnans);


        number_1();

    }

    private void number_1() {

        zero.setOnClickListener(a -> n0 = 0);
        btn1.setOnClickListener(b -> n1 = 1);
        btn2.setOnClickListener(c -> n2 = 2);
        btn3.setOnClickListener(d -> n3 = 3);
        btn4.setOnClickListener(d -> n4 = 4);
        btn5.setOnClickListener(d -> n5 = 5);
        btn6.setOnClickListener(d -> n6 = 6);
        btn7.setOnClickListener(d -> n7 = 7);
        btn8.setOnClickListener(d -> n8 = 8);
        btn9.setOnClickListener(d -> n9 = 9);

        btnaddition.setOnClickListener(s -> {
            ans = n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
            txtans.setText(ans + " ");
        });

        btnSub.setOnClickListener(s -> {
            ans = n0 - n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9;
            txtans.setText(ans + " ");
        });

        btnmulti.setOnClickListener(s -> {
            ans = n0 * n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 * n9;
            txtans.setText(ans + " ");
        });

        btndivide.setOnClickListener(s -> {
            ans = n0 / n1 / n2 / n3 / n4 / n5 / n6 / n7 / n8 / n9;
            txtans.setText(ans + " ");
        });

        ac();
        answer();

    }

    private void answer() {
    }

    private void ac() {
        btnAc.setOnClickListener(a -> {

            n0 = 0;
            n1 = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
            n6 = 0;
            n7 = 0;
            n8 = 0;
            n9 = 0;


            txtans.setText("");
        });
    }
}
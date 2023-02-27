package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerviewapp.databinding.ActivityMain2Binding;
import com.example.recyclerviewapp.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding main3Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main3Binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(main3Binding.getRoot());

        display();
        show();
    }

    private void show() {
        String dogname=getIntent().getStringExtra("dogname");
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int dogimage=bundle.getInt("dogimg");
            main3Binding.imguser1.setImageResource(dogimage);
        }
        main3Binding.txtuser1.setText(dogname);
    }

    private void display() {
        String name=getIntent().getStringExtra("name");

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int image=bundle.getInt("image");
            main3Binding.imguser.setImageResource(image);
        }
        main3Binding.txtuser.setText(name);

    }
}
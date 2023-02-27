package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recyclerapp.databinding.ActivityMain2Binding;
import com.example.recyclerapp.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding main2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(main2Binding.getRoot());

        show();
    }

    private void show() {
        String name=getIntent().getStringExtra("name");
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int image=bundle.getInt("image");
            main2Binding.img1.setImageResource(image);
        }
        main2Binding.txt1.setText(name);
    }
}
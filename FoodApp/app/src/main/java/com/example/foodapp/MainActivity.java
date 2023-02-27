package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.foodapp.databinding.ActivityMainBinding;
import com.example.foodapp.databinding.ActivitySplashScreenBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        pizza();
    }

    private void pizza() {
        activityMainBinding.layoutpizza.setOnClickListener(view -> {
            Intent intent=new Intent(this,PizzaActivity.class);
            startActivity(intent);
        });
    }
}
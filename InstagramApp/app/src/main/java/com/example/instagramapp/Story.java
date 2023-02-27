package com.example.instagramapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.instagramapp.databinding.ActivityStoryBinding;

public class Story extends AppCompatActivity {
    ActivityStoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        display();
    }

    private void display() {
        String name=getIntent().getStringExtra("name");
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int photo=bundle.getInt("photo");
            binding.imagestory.setImageResource(photo);
        }
        binding.textstory.setText(name);
    }
}
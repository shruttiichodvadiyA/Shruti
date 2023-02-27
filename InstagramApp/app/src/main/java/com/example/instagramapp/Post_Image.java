package com.example.instagramapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.instagramapp.databinding.ActivityMainBinding;
import com.example.instagramapp.databinding.ActivityPostImageBinding;

public class Post_Image extends AppCompatActivity {

    ActivityPostImageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostImageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        postshow();
    }

    private void postshow() {
        String name=getIntent().getStringExtra("username");
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            int photo=bundle.getInt("userphoto");
            binding.imguser.setImageResource(photo);
        }
        binding.txtuser.setText(name);

        Bundle b=getIntent().getExtras();
        if (b!=null){
            int photo=bundle.getInt("postphoto");
            binding.imgpost.setImageResource(photo);
        }

    }
}
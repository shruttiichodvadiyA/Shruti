package com.example.musics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musics.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        search();
        playalist();
        options();
        heatwaves();
        unholy();

    }

    private void unholy() {
        MediaPlayer mp1=MediaPlayer.create(this,R.raw.unholy);
        binding.btnplay.setOnClickListener(view -> {
           if (mp1.isPlaying())
            {
                mp1.stop();
                recreate();
            }
            else{
                binding.btnplay.setImageResource(R.drawable.pause);
                mp1.start();
            }
        });
    }

    private void heatwaves() {
        binding.layoutheat.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,HeatWavesActivity.class);
            startActivity(intent);

        });
    }

    private void options() {
        binding.options.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,MainActivity5.class);
            startActivity(intent);
            finish();
        });
    }

    private void playalist() {
        binding.playalist.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
            startActivity(intent);
            finish();
        });
    }


    private void search() {

        binding.search.setOnClickListener(view -> {

            Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
            finish();

        });
    }



}
package com.example.musics;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.musics.databinding.ActivityHeatWavesBinding;
import com.example.musics.databinding.ActivityMain2Binding;

public class HeatWavesActivity extends AppCompatActivity {

    ActivityHeatWavesBinding heatWavesBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        heatWavesBinding= ActivityHeatWavesBinding.inflate(getLayoutInflater());
        setContentView(heatWavesBinding.getRoot());

    playpause();

    }



    private void playpause() {
        MediaPlayer mp1=MediaPlayer.create(this,R.raw.heatwaves);
        heatWavesBinding.btnplay.setOnClickListener(view -> {
            mp1.start();
        });

//
//        MediaPlayer mp1=MediaPlayer.create(this,R.raw.heatwaves);
        heatWavesBinding.btnpause.setOnClickListener(view -> {
            mp1.stop();
        });
    }

}
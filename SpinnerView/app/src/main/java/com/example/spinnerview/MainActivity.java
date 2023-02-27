package com.example.spinnerview;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.spinnerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String[] colorar = {"white", "red", "yellow", "black", "green", "blue","gray","pink","sky","orange","parrot","purple","voilet","magenta"};
    String[] weekar={"sunday","monday","wednesday","thursday","friday","saturday"};
    String[] languagrsar={"english","hindi","guajrati","marathi","tamil"};
    String[] weatherar={"winter","summer","monsoon"};
    String[] namear={"shruti","vensi","him..","sanjay","dixit"};
    String[] documentar={"aadharcard","photo"};
    int imagear[]={R.drawable.addhar,R.drawable.photo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initview();
        week();
        languages();
        weather();
        name();
        image();

    }

    private void image() {
        DocumentAdapter adapter5=new DocumentAdapter(imagear,documentar,MainActivity.this);
        binding.spinner5.setAdapter(adapter5);
    }

    private void name() {
        NameAdapter adapter4=new NameAdapter(namear,MainActivity.this);
        binding.spinner4.setAdapter(adapter4);
    }

    private void weather() {
        WeatherAdapter adapter3=new WeatherAdapter(weatherar,MainActivity.this);
        binding.spinner3.setAdapter(adapter3);
    }

    private void languages() {
        LanguagesAdapter adapter2=new LanguagesAdapter(languagrsar,MainActivity.this);
        binding.spinner2.setAdapter(adapter2);
    }

    private void week() {
        WeekAdapter adapter1=new WeekAdapter(weekar,MainActivity.this);
        binding.spinner1.setAdapter(adapter1);
    }

    private void initview() {
        ColorAdapter adapter = new ColorAdapter(colorar, MainActivity.this);
        binding.spinner.setAdapter(adapter);

        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


}

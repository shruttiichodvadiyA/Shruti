package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recycler.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<QuestionModelClass> modelClasses = new ArrayList<>();
    ArrayList<String> questionid = new ArrayList<>();
    ArrayList<Integer> answerid = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        question1();


    }

    private void question1() {

        for (int i = 0; i < 4; i++) {

        }
        setdata();
    }

    private void setdata() {

        questionid.add("What is 2 + 2 ?");


        answerid.add(2);
        answerid.add(3);
        answerid.add(4);
        answerid.add(1);


    }
}
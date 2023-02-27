package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gridview.databinding.ActivityGridViewBinding;
import com.example.gridview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    ActivityGridViewBinding gridViewBinding;
    ArrayList<Integer>image=new ArrayList<>();
    ArrayList<String>countryname=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gridViewBinding = ActivityGridViewBinding.inflate(getLayoutInflater());
        setContentView(gridViewBinding.getRoot());

        country();

    }

    private void country() {

    }
}
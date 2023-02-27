package com.example.instagramapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.instagramapp.AdapterClass.SearchAdapterClass;
import com.example.instagramapp.databinding.ActivityMainBinding;
import com.example.instagramapp.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;

public class SearchView extends AppCompatActivity {
    ActivitySearchViewBinding searchViewBinding;
    ArrayList<Integer> image=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchViewBinding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(searchViewBinding.getRoot());

        search();

    }

    private void search() {
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);
        image.add(R.drawable.img2);

        SearchAdapterClass searchAdapterClass=new SearchAdapterClass(image,this);
        searchViewBinding.gridview.setAdapter(searchAdapterClass);


    }
}
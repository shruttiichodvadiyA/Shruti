package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.recyclerapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<FolwerModelClass> folwerModelClasses = new ArrayList<>();
    ArrayList<Integer> flowerimage = new ArrayList<>();
    ArrayList<String> flowername = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        flower();
    }

    private void flower() {
        setdata();
        FlowerInterfaceClass interfaceClass=new FlowerInterfaceClass() {
            @Override
            public void clickflower(int image, String name) {

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("image",image);
                i.putExtra("name",name);
                startActivity(i);
            }
        };
        for (int i=0;i<flowername.size();i++)
        {
            FolwerModelClass modelClass=new FolwerModelClass();
            modelClass.setImage(flowerimage.get(i));
            modelClass.setName(flowername.get(i));
            folwerModelClasses.add(modelClass);


            FlowerAdapterClass adapterClass=new FlowerAdapterClass(folwerModelClasses,interfaceClass);
            LinearLayoutManager manager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
            binding.recyclerview.setLayoutManager(manager);
            binding.recyclerview.setAdapter(adapterClass);


        }

    }

    private void setdata() {

        flowerimage.add(R.drawable.rose);
        flowerimage.add(R.drawable.daisy);
        flowerimage.add(R.drawable.lilly);
        flowerimage.add(R.drawable.marigold);
        flowerimage.add(R.drawable.orchid);
        flowerimage.add(R.drawable.poppy);
        flowerimage.add(R.drawable.sunflower);
        flowerimage.add(R.drawable.violet);
        flowerimage.add(R.drawable.flax);
        flowerimage.add(R.drawable.lotus);

        flowername.add("rose");
        flowername.add("daisy");
        flowername.add("lilly");
        flowername.add("marigold");
        flowername.add("orchid");
        flowername.add("poppy");
        flowername.add("sunflower");
        flowername.add("violet");
        flowername.add("flax");
        flowername.add("lotus");

    }
}
package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recyclerviewapp.AdapterClass.UserAdapterClass;
import com.example.recyclerviewapp.ModelClass.UserModelClass;
import com.example.recyclerviewapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    ArrayList<UserModelClass> list = new ArrayList<>();
    ArrayList<Integer> idlist = new ArrayList<>();
    ArrayList<String> namelist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        recycle();
    }

    private void recycle() {

        setdatalist();

        for (int i = 0; i < 7; i++) {

            UserModelClass model = new UserModelClass();
            model.setUserid(idlist.get(i));
            model.setUsername(namelist.get(i));
            list.add(model);

            UserAdapterClass adapterClass = new UserAdapterClass(list);
            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            binding.rcvitem.setLayoutManager(manager);
            binding.rcvitem.setAdapter(adapterClass);
        }
    }

    private void setdatalist() {
        namelist.add("shruti");
        namelist.add("venc");
        namelist.add("him..");
        namelist.add("sanjay");
        namelist.add("dixit");
        namelist.add("sanjay");
        namelist.add("akshay");

        idlist.add(101);
        idlist.add(102);
        idlist.add(103);
        idlist.add(104);
        idlist.add(105);
        idlist.add(106);
        idlist.add(107);
    }
}
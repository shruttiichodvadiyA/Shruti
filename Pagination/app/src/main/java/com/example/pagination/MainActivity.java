package com.example.pagination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pagination.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<String> name=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        rcv1();
    }

    private void rcv1() {
        data();
        for (int i=0;i< name.size();i++){

            RcvAdapterClass adapterClass=new RcvAdapterClass(name);
            LinearLayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
            binding.rcv1.setLayoutManager(layoutManager);
            binding.rcv1.setAdapter(adapterClass);
        }
    }

    private void data() {
        name.add("S");
        name.add("h");
        name.add("r");
        name.add("u");
        name.add("t");
        name.add("i");
    }
}
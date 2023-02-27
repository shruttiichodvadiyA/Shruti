package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gridview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> number=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        contacts();

    }

    private void contacts() {
        name.add("shruti");
        name.add("himanshu");
        name.add("deep");
        name.add("venc");
        name.add("sanajy");
        name.add("dixit");
        name.add("akshay");
        name.add("purvish");
        name.add("himanshi");
        name.add("rohit");
        name.add("virat");
        name.add("modi");
        name.add("ridhhi");
        name.add("nandini");
        name.add("khushi");

        number.add("9316870143");
        number.add("99998888833");
        number.add("1234567890");
        number.add("0987654321");
        number.add("345678329");
        number.add("9315723854");
        number.add("9987345162");
        number.add("9123456789");
        number.add("9345672389");
        number.add("9876543201");
        number.add("9234568710");
        number.add("3518350951");
        number.add("9123560976");
        number.add("9163452678");
        number.add("9876543210");

        ContactsAdapter adapter=new ContactsAdapter(name,number,MainActivity.this);
        binding.listview.setAdapter(adapter);

    }
}
package com.example.optionmenu;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.optionmenu.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<String> aList1= new ArrayList<String>();

        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(40);

        aList.get(0);
        aList.get(1);
        aList.get(3);

        aList1.add("shruti");
        aList1.add("vensi");
        aList1.add("sanjay");
        aList1.add("himanshu");

        aList1.get(0);
        aList1.get(1);
        aList1.get(2);
        aList1.get(3);

        for (int i=0;i<4;i++){
            Log.e("TAG", "onCreate: "+aList1.get(i) );
        }

        for (int i=0;i<4;i++){

            Log.e("TAG", "onCreate: "+aList.get(i) );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.search:
                Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.newgroup:
                Toast.makeText(this, "newgroup", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.newbroadcast:
                Toast.makeText(this, "newbroadcast", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.linkdevices:
                Toast.makeText(this, "linkdevices", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.messages:
                Toast.makeText(this, "messages", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Payments:
                Toast.makeText(this, "Payments", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return true;
        }

    }
}
package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.listview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    //    String[] week={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    String[] flagar = {"india", "china", "us", "german", "pakistan", "new Zeland", "japan", "uk", "russia"};
    int imagear[] = {R.drawable.india, R.drawable.china, R.drawable.us, R.drawable.german, R.drawable.pakistan, R.drawable.newzeland, R.drawable.japan, R.drawable.uk, R.drawable.russia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        flaglist();


//        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,week);
//        binding.listview.setAdapter(adapter);
    }

    private void flaglist() {
        FlagAdapter adapter = new FlagAdapter(flagar, imagear, MainActivity.this);
        binding.listview.setAdapter(adapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Toast.makeText(MainActivity.this, "India", Toast.LENGTH_SHORT).show();
                } else if (i == 1) {

                    Toast.makeText(MainActivity.this, "china", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Toast.makeText(MainActivity.this, "us", Toast.LENGTH_SHORT).show();
                } else if (i == 3) {
                    Toast.makeText(MainActivity.this, "german", Toast.LENGTH_SHORT).show();
                } else if (i == 4) {
                    Toast.makeText(MainActivity.this, "pakistan", Toast.LENGTH_SHORT).show();
                } else if (i == 5) {
                    Toast.makeText(MainActivity.this, "new zeland", Toast.LENGTH_SHORT).show();
                } else if (i == 6) {
                    Toast.makeText(MainActivity.this, "japan", Toast.LENGTH_SHORT).show();
                } else if (i == 7) {
                    Toast.makeText(MainActivity.this, "uk", Toast.LENGTH_SHORT).show();
                } else if (i == 8) {
                    Toast.makeText(MainActivity.this, "russia", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
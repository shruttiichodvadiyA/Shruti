package com.example.modelclassarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.modelclassarraylist.databinding.ActivityMainBinding;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<ContactModelClass> details = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        contact();
    }

    private void contact() {
        ContactModelClass c1=new ContactModelClass();
        c1.setContactname("shruti");
        c1.setcontactnumber(345643345);
        details.add(c1);

        ContactModelClass c2=new ContactModelClass();
        c2.setContactname("himanshu");
        c2.setcontactnumber(987654323);
        details.add(c2);

        ContactModelClass c3=new ContactModelClass();
        c3.setContactname("shaili");
        c3.setcontactnumber(876543212);
        details.add(c3);

        ContactModelClass c4=new ContactModelClass();
        c4.setContactname("drashti");
        c4.setcontactnumber(123456876);
        details.add(c4);

        ContactModelClass c5=new ContactModelClass();
        c5.setContactname("sanjay");
        c5.setcontactnumber(123456876);
        details.add(c5);

        ContactModelClass c6=new ContactModelClass();
        c6.setContactname("dixit");
        c6.setcontactnumber(123456876);
        details.add(c6);

        ContactModelClass c7=new ContactModelClass();
        c7.setContactname("sahil");
        c7.setcontactnumber(123456876);
        details.add(c7);

        ContactModelClass c8=new ContactModelClass();
        c8.setContactname("riddhi");
        c8.setcontactnumber(123456876);
        details.add(c8);

        ContactModelClass c9=new ContactModelClass();
        c9.setContactname("nandini");
        c9.setcontactnumber(123456876);
        details.add(c9);

        ContactModelClass c10=new ContactModelClass();
        c10.setContactname("akshay");
        c10.setcontactnumber(123456876);
        details.add(c10);

        ContactModelClass c11=new ContactModelClass();
        c11.setContactname("sandy");
        c11.setcontactnumber(123456876);
        details.add(c11);

        ContactModelClass c12=new ContactModelClass();
        c12.setContactname("dhruvi");
        c12.setcontactnumber(123456876);
        details.add(c12);

        ContactModelClass c13=new ContactModelClass();
        c13.setContactname("mitul");
        c13.setcontactnumber(123456876);
        details.add(c13);

        ContactModelClass c14=new ContactModelClass();
        c14.setContactname("maitri");
        c14.setcontactnumber(123456876);
        details.add(c14);

        ContactModelClass c15=new ContactModelClass();
        c15.setContactname("kriyan");
        c15.setcontactnumber(123456876);
        details.add(c15);

        ContactModelClass c16=new ContactModelClass();
        c16.setContactname("jinal");
        c16.setcontactnumber(123456876);
        details.add(c16);

        ContactModelClass c17=new ContactModelClass();
        c17.setContactname("deep");
        c17.setcontactnumber(123456876);
        details.add(c17);

        ContactModelClass c18=new ContactModelClass();
        c18.setContactname("jiya");
        c18.setcontactnumber(123456876);
        details.add(c18);


        ContactAdapterClass adapterClass=new ContactAdapterClass(details,MainActivity.this);
        binding.listview.setAdapter(adapterClass);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ContactModelClass v=details.get(i);
                Log.e("TAG", "onItemClick: " + i);
                Toast.makeText(MainActivity.this, " "+v.getContactname()+" - "+v.getContactnumber(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
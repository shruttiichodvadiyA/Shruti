package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.recyclerviewapp.AdapterClass.DogAdapterClass;
import com.example.recyclerviewapp.AdapterClass.DogImagesAdapterClass;
import com.example.recyclerviewapp.Interface.ClickListner;
import com.example.recyclerviewapp.Interface.DogClick;
import com.example.recyclerviewapp.ModelClass.DogImagesModelClass;
import com.example.recyclerviewapp.ModelClass.DogModelClass;
import com.example.recyclerviewapp.databinding.ActivityMain2Binding;
import com.example.recyclerviewapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding main2Binding;

    ArrayList<DogImagesModelClass> images = new ArrayList<>();
    ArrayList<Integer> dogimages = new ArrayList<>();
    ArrayList<String> dogname = new ArrayList<>();

    ArrayList<DogModelClass> model = new ArrayList<>();
    ArrayList<Integer> dimage = new ArrayList<>();
    ArrayList<String> dname = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(main2Binding.getRoot());

        dog();
        dogimg();
    }

    private void dogimg() {
        setdog();
        for (int i = 0; i < 13; i++) {
            DogModelClass modelClass = new DogModelClass();
            modelClass.setDimage(dimage.get(i));
            modelClass.setDname(dname.get(i));
            model.add(modelClass);

            ClickListner listner = new ClickListner() {
                @Override
                public void onclick(int image, String name) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("image", image);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            };

            DogAdapterClass adapterClass = new DogAdapterClass(model, listner);
            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            main2Binding.rcv2.setLayoutManager(manager);
            main2Binding.rcv2.setAdapter(adapterClass);


        }

    }

    private void setdog() {

        dimage.add(R.drawable.beagle);
        dimage.add(R.drawable.astro);
        dimage.add(R.drawable.beezy);
        dimage.add(R.drawable.brewery);
        dimage.add(R.drawable.charile);
        dimage.add(R.drawable.chuvava);
        dimage.add(R.drawable.cooper);
        dimage.add(R.drawable.jack);
        dimage.add(R.drawable.jubily);
        dimage.add(R.drawable.lucy);
        dimage.add(R.drawable.mochi);
        dimage.add(R.drawable.monty);
        dimage.add(R.drawable.toby);

        dname.add("beagle");
        dname.add("astro");
        dname.add("beezy");
        dname.add("brewery");
        dname.add("charile");
        dname.add("chuvava");
        dname.add("cooper");
        dname.add("jack");
        dname.add("jubile");
        dname.add("lucy");
        dname.add("mochi");
        dname.add("monty");
        dname.add("toby");
    }

    private void dog() {

        setimages();

        for (int i = 0; i < 13; i++) {
            DogImagesModelClass imagesModelClass = new DogImagesModelClass();
            imagesModelClass.setDogimages(dogimages.get(i));
            imagesModelClass.setDogname(dogname.get(i));
            images.add(imagesModelClass);

            DogClick dclick = new DogClick() {
                @Override
                public void click(int dogimg, String dogname) {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    i.putExtra("dogimg", dogimg);
                    i.putExtra("dogname", dogname);
                    startActivity(i);
                }
            };

            DogImagesAdapterClass imagesAdapterClass = new DogImagesAdapterClass(images, dclick);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
            main2Binding.rcv1.setLayoutManager(layoutManager);
            main2Binding.rcv1.setAdapter(imagesAdapterClass);

        }
    }

    private void setimages() {

        dogimages.add(R.drawable.monty);
        dogimages.add(R.drawable.jubily);
        dogimages.add(R.drawable.beezy);
        dogimages.add(R.drawable.mochi);
        dogimages.add(R.drawable.brewery);
        dogimages.add(R.drawable.lucy);
        dogimages.add(R.drawable.astro);
        dogimages.add(R.drawable.toby);
        dogimages.add(R.drawable.charile);
        dogimages.add(R.drawable.cooper);
        dogimages.add(R.drawable.jack);
        dogimages.add(R.drawable.chuvava);
        dogimages.add(R.drawable.beagle);

        dogname.add("monty");
        dogname.add("jubilee");
        dogname.add("beezy");
        dogname.add("mochi");
        dogname.add("brewery");
        dogname.add("lucy");
        dogname.add("astro");
        dogname.add("toby");
        dogname.add("charile");
        dogname.add("cooper");
        dogname.add("jack");
        dogname.add("chuvava");
        dogname.add("beagle");
    }
}
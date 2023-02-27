package com.example.instagramapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.instagramapp.AdapterClass.PostAdapterClass;
import com.example.instagramapp.AdapterClass.StoryAdapterClass;
import com.example.instagramapp.InterfaceClass.PostInterface;
import com.example.instagramapp.InterfaceClass.StoryInterface;
import com.example.instagramapp.ModelClass.PostModelClass;
import com.example.instagramapp.ModelClass.StoryModelClass;
import com.example.instagramapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    /*         story         */
    ArrayList<StoryModelClass> storylist = new ArrayList<>();
    ArrayList<Integer> images = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();

    /* post      */
    ArrayList<PostModelClass> postlist = new ArrayList<>();
    ArrayList<Integer> upic = new ArrayList<>();
    ArrayList<Integer> postpic = new ArrayList<>();
    ArrayList<String> username = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        story();
        post();
        dialog();
        search();
    }

    private void search() {

        
        binding.imgsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SearchView.class);
                startActivity(i);
            }
        });
    }

    private void dialog() {
        binding.dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dropdown_dialog);
                dialog.getWindow().setGravity(Gravity.TOP);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
                dialog.show();
            }
        });
    }

    private void post() {
        setpost();
        PostInterface postInterface=new PostInterface() {

            @Override
            public void setpostdata(String username, int userphoto, int postphoto) {
                Intent i =new Intent(MainActivity.this,Post_Image.class);
                i.putExtra("username",username);
                i.putExtra("userphoto",userphoto);
                i.putExtra("postphoto",postphoto);
                startActivity(i);
            }
        };

        for (int i=0;i<postpic.size();i++){
            PostModelClass postModelClass=new PostModelClass();
            postModelClass.setUserpic(upic.get(i));
            postModelClass.setUsername(username.get(i));
            postModelClass.setPostpic(postpic.get(i));
            postlist.add(postModelClass);

            PostAdapterClass adapterClass=new PostAdapterClass(postlist,postInterface);
            LinearLayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
            binding.rcvvertical.setLayoutManager(layoutManager);
            binding.rcvvertical.setAdapter(adapterClass);
        }
    }

    private void setpost() {
        upic.add(R.drawable.mili);
        upic.add(R.drawable.kruti);
        upic.add(R.drawable.him);
        upic.add(R.drawable.venc);
        upic.add(R.drawable.omi);
        upic.add(R.drawable.me);

        username.add("m.i.l.i__");
        username.add("krutii.__");
        username.add("Him_4_.uuu_");
        username.add("ven_c._");
        username.add("o_m_i_");
        username.add("ven_c._");

        postpic.add(R.drawable.img2);
        postpic.add(R.drawable.img2);
        postpic.add(R.drawable.img2);
        postpic.add(R.drawable.img2);
        postpic.add(R.drawable.img2);
        postpic.add(R.drawable.img2);

    }

    private void story() {

        setstory();
        StoryInterface storyInterface = new StoryInterface() {
            @Override
            public void setstorydata(String name, int photo) {
                Intent i = new Intent(MainActivity.this, Story.class);
                i.putExtra("name", name);
                i.putExtra("photo", photo);
                startActivity(i);
            }
        };
        for (int i = 0; i < images.size(); i++) {
            StoryModelClass modelClass = new StoryModelClass();
            modelClass.setImage(images.get(i));
            modelClass.setName(name.get(i));
            storylist.add(modelClass);

            StoryAdapterClass adapterClass = new StoryAdapterClass(storylist, storyInterface);
            LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            binding.rcvhorizontal.setLayoutManager(manager);
            binding.rcvhorizontal.setAdapter(adapterClass);

        }
    }

    private void setstory() {
        images.add(R.drawable.me);
        images.add(R.drawable.venc);
        images.add(R.drawable.mili);
        images.add(R.drawable.him);
        images.add(R.drawable.kruti);
        images.add(R.drawable.omi);
        images.add(R.drawable.venc);
        images.add(R.drawable.venc);
        images.add(R.drawable.venc);
        images.add(R.drawable.venc);
        images.add(R.drawable.venc);

        name.add("Your story");
        name.add("ven_c._");
        name.add("m.i.l.i__");
        name.add("Him_4_.uuu_");
        name.add("krutii.__");
        name.add("o_m_i_");
        name.add("ven_c._");
        name.add("ven_c._");
        name.add("ven_c._");
        name.add("ven_c._");
        name.add("ven_c._");

    }
}
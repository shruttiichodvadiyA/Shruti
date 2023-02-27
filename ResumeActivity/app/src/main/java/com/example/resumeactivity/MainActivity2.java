package com.example.resumeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    TextView txtfirstname,txtlastname,txtmobilenumber,txtemailid,txtaddress,

    txthoby,

    txtgender,txtmarrid,

    txt10pr,txt12pr,txtgraduatpr,txtyer10,txtyer12,txtgraduatyer,

    txtjob,txtintreset,

    txtlanguage;

    ImageView profileimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intiview();

    }

    private void intiview() {

        txtgender=findViewById(R.id.txtgender);
        txtmarrid=findViewById(R.id.txtmarrid);

        txthoby=findViewById(R.id.txthoby);

        txtfirstname=findViewById(R.id.txtfirstname);
        txtlastname=findViewById(R.id.txtlastname);
        txtaddress=findViewById(R.id.txtaddress);
        txtemailid=findViewById(R.id.txtemailid);
        txtmobilenumber=findViewById(R.id.txtmobilenumber);

        txt10pr=findViewById(R.id.txt10pr);
        txt12pr=findViewById(R.id.txt12pr);
        txtgraduatpr=findViewById(R.id.txtgraduatepr);
        txtyer10=findViewById(R.id.txtyer10);
        txtyer12=findViewById(R.id.txtyer12);
        txtgraduatyer=findViewById(R.id.txtgraduatyer);

        txtjob=findViewById(R.id.txtjob);
        txtintreset=findViewById(R.id.txtintreset);

        txtlanguage=findViewById(R.id.txtlanguage);

        profileimg=findViewById(R.id.profileimg);


        String firstname=getIntent().getStringExtra("firstname");
        String lastname=getIntent().getStringExtra("lastname");
        String address=getIntent().getStringExtra("address");
        String mobilenumber=getIntent().getStringExtra("mobilenumber");
        String emailid=getIntent().getStringExtra("emailid");

        String gender=getIntent().getStringExtra("gender");
        String marrid=getIntent().getStringExtra("marrid");

        String hoby=getIntent().getStringExtra("hoby");

        String pr10=getIntent().getStringExtra("pr10");
        String pr12=getIntent().getStringExtra("pr12");
        String graduatepr=getIntent().getStringExtra("graduatepr");
        String graduatyer=getIntent().getStringExtra("graduatyer");
        String year10=getIntent().getStringExtra("year10");
        String year12=getIntent().getStringExtra("year12");

        String job=getIntent().getStringExtra("job");
        String intreset=getIntent().getStringExtra("intreset");

        String language=getIntent().getStringExtra("language");

        txtfirstname.setText("     ✦  FIRSTNAME : " +firstname);
        txtlastname.setText("     ✦  LASTNAME : " +lastname);
        txtaddress.setText("     ✦  ADDRESS : " +address);
        txtmobilenumber.setText("     ✦  MOBILENUMBER : " +mobilenumber);
        txtemailid.setText("     ✦  EMAILID : " +emailid);

        txtgender.setText("     ✦  GENDER : "  +gender);
        txtmarrid.setText("     ✦  MARRID STATUS : "+marrid);

        txthoby.setText("     ✦  HOBBIES : "+hoby);

        txt10pr.setText("     ✦  PR10 : " +pr10);
        txt12pr.setText("     ✦  PR12 : " +pr12);
        txtgraduatpr.setText("     ✦  GRADUATEPR : " +graduatepr);
        txtyer10.setText("     ✦  YEAR10 : " +year10);
        txtgraduatyer.setText("     ✦  GRADUATEYEAR : " +graduatyer);
        txtyer12.setText("     ✦  YEAR12 : " +year12);

        txtjob.setText("     ✦   " +job);
        txtintreset.setText("     ✦   " +intreset);

        txtlanguage.setText("     ✦   " +language);

//        Glide.with(this).load("https://source.unsplash.com/user/c_v_r/1900x800").placeholder(R.drawable.myprofile).into(profileimg);

//        Picasso.get().load("https://source.unsplash.com/user/c_v_r/1900x800").into(profileimg);


    }
}
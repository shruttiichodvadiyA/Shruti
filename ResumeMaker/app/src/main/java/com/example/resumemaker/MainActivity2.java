package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtfirstname,txtlastname,txtmobilenumber,txtemailid,txtaddress,

            txthoby,txthoby1,txthoby2,txthoby3,txthoby4,

            txtgender,txtmarrid,

            txt10pr,txt12pr,txtgraduatpr,txtyer10,txtyer12,txtgraduatyer,

            txtjob,txtintreset,

            txtlanguage,txtlanguage1,txtlanguage2,txtlanguage3,txtlanguage4,txtlanguage5,txtlanguage6,
            txtlanguage7,txtlanguage8,txtlanguage9;

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
//        txthoby1=findViewById(R.id.txthoby1);
//        txthoby2=findViewById(R.id.txthoby2);
//        txthoby3=findViewById(R.id.txthoby3);
//        txthoby4=findViewById(R.id.txthoby4);

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
//        txtlanguage1=findViewById(R.id.txtlanguage1);
//        txtlanguage2=findViewById(R.id.txtlanguage2);
//        txtlanguage3=findViewById(R.id.txtlanguage3);
//        txtlanguage4=findViewById(R.id.txtlanguage4);
//        txtlanguage5=findViewById(R.id.txtlanguage5);
//        txtlanguage6=findViewById(R.id.txtlanguage6);
//        txtlanguage7=findViewById(R.id.txtlanguage7);
//        txtlanguage8=findViewById(R.id.txtlanguage8);
//        txtlanguage9=findViewById(R.id.txtlanguage9);

        String firstname=getIntent().getStringExtra("firstname");
        String lastname=getIntent().getStringExtra("lastname");
        String address=getIntent().getStringExtra("address");
        String mobilenumber=getIntent().getStringExtra("mobilenumber");
        String emailid=getIntent().getStringExtra("emailid");

        String gender=getIntent().getStringExtra("gender");
        String marrid=getIntent().getStringExtra("marrid");

        String hoby=getIntent().getStringExtra("hoby");
       /* String hoby1=getIntent().getStringExtra("hoby1");
        String hoby2=getIntent().getStringExtra("hoby2");
        String hoby3=getIntent().getStringExtra("hoby3");
        String hoby4=getIntent().getStringExtra("hoby4");
*/
        String pr10=getIntent().getStringExtra("pr10");
        String pr12=getIntent().getStringExtra("pr12");
        String graduatepr=getIntent().getStringExtra("graduatepr");
        String graduatyer=getIntent().getStringExtra("graduatyer");
        String year10=getIntent().getStringExtra("year10");
        String year12=getIntent().getStringExtra("year12");

        String job=getIntent().getStringExtra("job");
        String intreset=getIntent().getStringExtra("intreset");

        String language=getIntent().getStringExtra("language");
//        String language1=getIntent().getStringExtra("language1");
//        String language2=getIntent().getStringExtra("language2");
//        String language3=getIntent().getStringExtra("language3");
//        String language4=getIntent().getStringExtra("language4");
//        String language5=getIntent().getStringExtra("language5");
//        String language6=getIntent().getStringExtra("language6");
//        String language7=getIntent().getStringExtra("language7");
//        String language8=getIntent().getStringExtra("language8");
//        String language9=getIntent().getStringExtra("language9");

        txtfirstname.setText("     ✦  FIRSTNAME : " +firstname);
        txtlastname.setText("     ✦  LASTNAME : " +lastname);
        txtaddress.setText("     ✦  ADDRESS : " +address);
        txtmobilenumber.setText("     ✦  MOBILENUMBER : " +mobilenumber);
        txtemailid.setText("     ✦  EMAILID : " +emailid);

        txthoby.setText("     ✦  HOBBIES : "+hoby);
   /*     txthoby1.setText(hoby1);
        txthoby2.setText(hoby2);
        txthoby3.setText(hoby3);
        txthoby4.setText(hoby4);
*/
        txtgender.setText("     ✦  GENDER : "  +gender);
        txtmarrid.setText("     ✦  MARRID STATUS : "+marrid);

        txt10pr.setText("     ✦  PR10 : " +pr10);
        txt12pr.setText("     ✦  PR12 : " +pr12);
        txtgraduatpr.setText("     ✦  GRADUATEPR : " +graduatepr);
        txtyer10.setText("     ✦  YEAR10 : " +year10);
        txtgraduatyer.setText("     ✦  GRADUATEYEAR : " +graduatyer);
        txtyer12.setText("     ✦  YEAR12 : " +year12);

        txtjob.setText("     ✦   " +job);
        txtintreset.setText("     ✦   " +intreset);

        txtlanguage.setText("     ✦   " +language);
//        txtlanguage1.setText(language1);
//        txtlanguage2.setText(language2);
//        txtlanguage3.setText(language3);
//        txtlanguage4.setText(language4);
//        txtlanguage5.setText(language5);
//        txtlanguage6.setText(language6);
//        txtlanguage7.setText(language7);
//        txtlanguage8.setText(language8);
//        txtlanguage9.setText(language9);


    }
}
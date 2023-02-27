package com.example.resumemaker;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtfirstname, edtlastname, edtmobilenumber, edtemailid, edtaddress,/* for personal details*/
            edt10pr, edt12pr, edtgraduatpr, edt10yer, edt12yer, edtgraduatyer,/* for education details*/
            edtjob, edtintreset;/* for job and intreset*/

    //    RadioButton radiomarrid, radiounmarrid, radiomale, radiofemale, radioother;
    RadioGroup radiogroup1, radiogroup2;/* for gender*/

    CheckBox chkcod, chkdance, chkread, chkmovie, chktravell,/* for hobbies*/
            chkc, chkcplus, chkcgaming, chkjava, chkandroid, chkkotlin, chkphp, chkhtml, chkcss, chkweb;/* for languages*/


    AppCompatButton btnsubmit;
    String gender, marrid, hoby, hoby1, hoby2, hoby3, hoby4,
            language, language1, language2, language3, language4, language5, language6, language7, language8, language9;
    StringBuilder sb = new StringBuilder();
    StringBuilder sb1 = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resume();
        output();


    }


    private void resume() {

        edtfirstname = findViewById(R.id.edtfirstname);
        edtlastname = findViewById(R.id.edtlastname);
        edtmobilenumber = findViewById(R.id.edtmobilenumber);
        edtemailid = findViewById(R.id.edtemailid);
        edtaddress = findViewById(R.id.edtaddress);

        edtjob = findViewById(R.id.edtjob);
        edtintreset = findViewById(R.id.edtintreset);
        edt10pr = findViewById(R.id.edt10pr);
        edt12pr = findViewById(R.id.edt12pr);
        edtgraduatpr = findViewById(R.id.edtgraduatpr);
        edt10yer = findViewById(R.id.edt10yer);
        edt12yer = findViewById(R.id.edt12yer);
        edtgraduatyer = findViewById(R.id.edtgraduatyer);

//        radiomale = findViewById(R.id.radiomale);
//        radiofemale = findViewById(R.id.radiofemale);
//        radioother = findViewById(R.id.radioother);
//        radiomarrid = findViewById(R.id.radiomarrid);
//        radiounmarrid = findViewById(R.id.radiounmarrid);
        radiogroup1 = findViewById(R.id.radiogroup1);
        radiogroup2 = findViewById(R.id.radiogroup2);

        chkcod = findViewById(R.id.chkcode);
        chkdance = findViewById(R.id.chkdance);
        chkread = findViewById(R.id.chkread);
        chkmovie = findViewById(R.id.chkmovie);
        chktravell = findViewById(R.id.chktravell);


        chkc = findViewById(R.id.chkc);
        chkcplus = findViewById(R.id.chkcplus);
        chkcgaming = findViewById(R.id.chkcgaming);
        chkjava = findViewById(R.id.chkjava);
        chkkotlin = findViewById(R.id.chkkotlin);
        chkandroid = findViewById(R.id.chkandroid);
        chkhtml = findViewById(R.id.chkhtml);
        chkcss = findViewById(R.id.chkcss);
        chkphp = findViewById(R.id.chkphp);
        chkweb = findViewById(R.id.chkweb);

        btnsubmit = findViewById(R.id.btnsubmit);

    }

    private void output() {


        btnsubmit.setOnClickListener(view -> {

            String firstname = edtfirstname.getText().toString();
            String lastname = edtlastname.getText().toString();
            String email = edtemailid.getText().toString();
            String mobilenumber = edtmobilenumber.getText().toString();
            String address = edtaddress.getText().toString();
            String job = edtjob.getText().toString();
            String intreset = edtintreset.getText().toString();
            String pr10 = edt10pr.getText().toString();
            String pr12 = edt12pr.getText().toString();
            String graduatpr = edtgraduatpr.getText().toString();
            String year10 = edt10yer.getText().toString();
            String year12 = edt12yer.getText().toString();
            String graduatyer = edtgraduatyer.getText().toString();

//***********for gender*************
            int selectedId = radiogroup1.getCheckedRadioButtonId();
            RadioButton rb1 = findViewById(selectedId);

            if (selectedId != -1) {
                gender = rb1.getText().toString();
            }
            if (chkcod.isChecked()) {

                sb.append(chkcod.getText().toString());
            }

            if (chkdance.isChecked()) {

                sb.append(" "+chkdance.getText().toString());
            }

            if (chkread.isChecked()) {

                sb.append(" "+chkread.getText().toString());
            }

            if (chkmovie.isChecked()) {

                sb.append(" "+chkmovie.getText().toString());            }

            if (chktravell.isChecked()) {

                sb.append(" "+chktravell.getText().toString());
            }

            int selectedid1 = radiogroup2.getCheckedRadioButtonId();
            RadioButton rb2 = findViewById(selectedid1);

            if (selectedid1 != -1) {

                marrid = rb2.getText().toString();

            }
            if (chkc.isChecked()) {

                sb1.append(" "+chkc.getText().toString());
            }

            if (chkcplus.isChecked()) {

                sb1.append(" "+chkcplus.getText().toString());
            }

            if (chkcgaming.isChecked()) {

                sb1.append(" "+chkcgaming.getText().toString());
            }

            if (chkjava.isChecked()) {

                sb1.append(" "+chkjava.getText().toString());
            }

            if (chkkotlin.isChecked()) {

                sb1.append(" "+chkkotlin.getText().toString());
            }
            if (chkandroid.isChecked()) {

                sb1.append(" "+chkandroid.getText().toString());
            }
            if (chkweb.isChecked()) {

                sb1.append(" "+chkweb.getText().toString());            }
            if (chkhtml.isChecked()) {

                sb1.append(" "+chkhtml.getText().toString());            }
            if (chkphp.isChecked()) {

                sb1.append(" "+chkphp.getText().toString());            }
            if (chkcss.isChecked()) {

                sb1.append(" "+chkcss.getText().toString());            }


            if (firstname.isEmpty()) {
                Toast.makeText(this, "please entre your first name", Toast.LENGTH_SHORT).show();
            } else if (firstname.length() < 3 || firstname.length() > 8) {
                Toast.makeText(this, "entre firstname more than 3 letter & less than 8 letter " , Toast.LENGTH_SHORT).show();
            } else if (lastname.isEmpty()) {
                Toast.makeText(this, "please entre your last name", Toast.LENGTH_SHORT).show();
            } else if (lastname.length() < 4 || lastname.length() >10) {
                Toast.makeText(this, "entre lastname more than 4 letter & less than 10 letter", Toast.LENGTH_SHORT).show();
            } else if (mobilenumber.isEmpty()) {
                Toast.makeText(this, "please enter your mobile number", Toast.LENGTH_SHORT).show();
            } else if (mobilenumber.length() < 10) {
                Toast.makeText(this, "please entre more than 9 letter", Toast.LENGTH_SHORT).show();
            } else if (email.isEmpty()) {
                Toast.makeText(this, "please entre your email", Toast.LENGTH_SHORT).show();
            } else if (address.isEmpty()) {
                Toast.makeText(this, "please entre your address", Toast.LENGTH_SHORT).show();
            } else if (gender == null) {
                Toast.makeText(this, "please entre your gender", Toast.LENGTH_SHORT).show();
            }
            else if (sb == null){
//                    && hoby1 == null && hoby2 == null && hoby3 == null && hoby4 == null) {
                Toast.makeText(this, "please entre your hoby", Toast.LENGTH_SHORT).show();
            }
            else if (marrid == null) {
                Toast.makeText(this, "please entre your marrid status", Toast.LENGTH_SHORT).show();
            } else if (pr10.isEmpty()) {
                Toast.makeText(this, "please entre your 10th pr.", Toast.LENGTH_SHORT).show();
            } else if (pr12.isEmpty()) {
                Toast.makeText(this, "please entre your 12th pr.", Toast.LENGTH_SHORT).show();
            } else if (graduatpr.isEmpty()) {
                Toast.makeText(this, "please entre your graduat pr. ", Toast.LENGTH_SHORT).show();
            } else if (year10.isEmpty()) {
                Toast.makeText(this, "please entre your 10year", Toast.LENGTH_SHORT).show();
            } else if (year12.isEmpty()) {
                Toast.makeText(this, "please enter your 12year", Toast.LENGTH_SHORT).show();
            } else if (graduatyer.isEmpty()) {
                Toast.makeText(this, "please enter your graduat year", Toast.LENGTH_SHORT).show();
            } else if (job.isEmpty()) {
                Toast.makeText(this, "please entre your job exprience", Toast.LENGTH_SHORT).show();
            } else if (intreset.isEmpty()) {
                Toast.makeText(this, "please enter your intrest area", Toast.LENGTH_SHORT).show();
            } else if (sb1 == null ){
                  /*  && language1 == null && language2 == null && language3 == null && language4 == null &&
                    language5 == null && language6 == null && language7 == null && language8 == null && language9 ==*/
                Toast.makeText(this, "please enter your known language", Toast.LENGTH_SHORT).show();
            }
            else{
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("firstname", firstname);
                i.putExtra("lastname", lastname);
                i.putExtra("emailid", email);
                i.putExtra("mobilenumber", mobilenumber);
                i.putExtra("address", address);
                i.putExtra("gender", gender);
                i.putExtra("job", job);
                i.putExtra("intreset", intreset);
                i.putExtra("hoby"," "+sb);
               /* i.putExtra("hoby1", hoby1);
                i.putExtra("hoby2", hoby2);
                i.putExtra("hoby3", hoby3);
                i.putExtra("hoby4", hoby4);*/
                i.putExtra("marrid", marrid);
                i.putExtra("pr10", pr10);
                i.putExtra("pr12", pr12);
                i.putExtra("graduatepr", graduatpr);
                i.putExtra("graduatyer", graduatyer);
                i.putExtra("year10", year10);
                i.putExtra("year12", year12);
                i.putExtra("language"," "+sb1);
               /* i.putExtra("language1", language1);
                i.putExtra("language2", language2);
                i.putExtra("language3", language3);
                i.putExtra("language4", language4);
                i.putExtra("language5", language5);
                i.putExtra("language6", language6);
                i.putExtra("language7", language7);
                i.putExtra("language8", language8);
                i.putExtra("language9", language9);
*/
                startActivity(i);

            }
        });
    }
}
package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkmusic,chkdancing,chkreading;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registration();


    }


    void registration() {

        Button btnsubmit = findViewById(R.id.btnsubmit);
//        EditText edtname = findViewById(R.id.edtname);
        chkmusic=findViewById(R.id.chkmusic);
        chkdancing=findViewById(R.id.chkdancing);
        chkreading=findViewById(R.id.chkreading);
        radiogroup=findViewById(R.id.radiogroup);

        radiogroup.setOnCheckedChangeListener((radiogroup,i)->{

            RadioButton btn=findViewById(i);
            Log.e( "registration: ",""+btn.getText() );
        });


        btnsubmit.setOnClickListener(view -> {
//
//            String name=edtname.getText().toString();
//            Toast.makeText(this, "submit", Toast.LENGTH_SHORT).show();
//            Log.e( "registration: ","click button" );
//            Log.e( "registration: ","name:" +name );

//            boolean b=chkmusic.isChecked();
//            Toast.makeText(this, "music", Toast.LENGTH_SHORT).show();
//            Log.e( "registration: ","music"+b );
//
//            boolean b1=chkdancing.isChecked();
//            Log.e( "registration: ","dancing"+b1 );
//
//            boolean b2=chkreading.isChecked();
//            Log.e( "registration: ","reading"+b2 );

            if (chkmusic.isChecked()){
                Log.e( "registration: ",""+chkmusic.getText().toString() );
            }

            if (chkdancing.isChecked()){
                Log.e( "registration: ",""+chkdancing.getText().toString() );
                Toast.makeText(this, "dance", Toast.LENGTH_SHORT).show();
            }

            if (chkreading.isChecked()){
                Log.e( "registration: ",""+chkreading.getText().toString() );
            }



            int selectedId=radiogroup.getCheckedRadioButtonId();
            RadioButton rb=findViewById(selectedId);

            Log.e( "registration: ",""+rb.getText() );

        });


    }
}




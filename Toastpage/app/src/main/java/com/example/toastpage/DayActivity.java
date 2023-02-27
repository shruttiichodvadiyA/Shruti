 package com.example.toastpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class DayActivity extends AppCompatActivity {
     EditText edtvalue;
     Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        intiview();
    }

     private void intiview() {

         edtvalue=findViewById(R.id.edtvalue);
         btnsubmit=findViewById(R.id.btnsubmit);
         btnsubmit.setOnClickListener(view -> {
             int number=Integer.parseInt(edtvalue.getText().toString());

             switch (number){
                 case 1:
                     Toast.makeText(this, "Monday", Toast.LENGTH_SHORT).show();
                     break;

                 case 2:
                     Toast.makeText(this, "Tuesday", Toast.LENGTH_SHORT).show();
                     break;

                 case 3:
                     Toast.makeText(this, "Wednesday", Toast.LENGTH_SHORT).show();
                     break;

                 case 4:
                     Toast.makeText(this, "Thursday", Toast.LENGTH_SHORT).show();
                     break;

                 case 5:
                     Toast.makeText(this, "Friday", Toast.LENGTH_SHORT).show();
                     break;

                 case 6:
                     Toast.makeText(this, "Saturday", Toast.LENGTH_SHORT).show();
                     break;

                 case 7:
                     Toast.makeText(this, "Sunday", Toast.LENGTH_SHORT).show();
                     break;

                 default:
                     Toast.makeText(this, "Invalid number", Toast.LENGTH_SHORT).show();
             }


         });
     }
 }
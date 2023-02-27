package com.example.customdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.customdialog.databinding.ActivityMainBinding;
import com.example.customdialog.databinding.Customdialog2Binding;
import com.example.customdialog.databinding.Customdialog3Binding;
import com.example.customdialog.databinding.Customdialog4Binding;
import com.example.customdialog.databinding.CustomdialogBinding;
import com.example.customdialog.databinding.Cusyomdialog5Binding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        id();
        dialog2();
        dialog3();
        dialog4();
        dialog5();
    }

    private void dialog5() {

        binding.btn5.setOnClickListener(view -> {
            Dialog dialog=new Dialog(MainActivity.this);
            Cusyomdialog5Binding binding=Cusyomdialog5Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnokay.setOnClickListener(e->{
                Toast.makeText(this, "Okay...", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);


            dialog.show();


        });
    }

    private void dialog4() {
        binding.btn4.setOnClickListener(view -> {
            Dialog dialog=new Dialog(MainActivity.this);
            Customdialog4Binding binding=Customdialog4Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btndismiss.setOnClickListener(e->{
                Toast.makeText(this, "oops !! dismiss...", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            dialog.show();


        });
    }

    private void dialog3() {
        binding.btn3.setOnClickListener(view -> {
            Dialog dialog=new Dialog(MainActivity.this);
            Customdialog3Binding binding=Customdialog3Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btndeny.setOnClickListener(c->{
                Toast.makeText(this, "Deny..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
            binding.btnallow.setOnClickListener(d->{
                Toast.makeText(this, "Allow..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            dialog.show();
        });
    }

    private void dialog2() {
        binding.btn2.setOnClickListener(view -> {

            Dialog dialog=new Dialog(MainActivity.this);
            Customdialog2Binding binding=Customdialog2Binding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btndone.setOnClickListener(b->{
                Toast.makeText(this, "Done..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            dialog.show();
        });
    }

    private void id() {

        binding.btn1.setOnClickListener(view -> {

            Dialog dialog = new Dialog(MainActivity.this);
            CustomdialogBinding binding = CustomdialogBinding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.btnok.setOnClickListener(a -> {

                Toast.makeText(this, "ok..", Toast.LENGTH_SHORT).show();
                dialog.dismiss();

            });
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            dialog.show();

        });
    }
}
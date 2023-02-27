package com.example.cameragallery;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.app.Instrumentation;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.cameragallery.databinding.ActivityMainBinding;
import com.example.cameragallery.databinding.ActivityPhotosBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        gallery();
        camera();
        choosephoto();
    }

    private void choosephoto() {
        binding.photos.setOnClickListener(view -> {
            Dialog dialog=new Dialog(MainActivity.this);

            ActivityPhotosBinding binding=ActivityPhotosBinding.inflate(getLayoutInflater());
            dialog.setContentView(binding.getRoot());

            binding.camera.setOnClickListener(v -> {
                Intent camera = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                cameralanchuar.launch(camera);
                dialog.dismiss();

            });
            binding.photoingallery.setOnClickListener(g -> {
                Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                Gallerylanchuar.launch(gallery);
                dialog.dismiss();

            });
            binding.cancel.setOnClickListener( z -> {

                Toast.makeText(this, "cancelable....", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            });

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);

            dialog.show();
        });

    }

    ActivityResultLauncher<Intent> Gallerylanchuar = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Uri uri = data.getData();
                        binding.img.setImageURI(uri);
                    }
                }
            });
    ActivityResultLauncher<Intent> cameralanchuar = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        Bitmap b = (Bitmap) data.getExtras().get("data");
                        binding.img.setImageBitmap(b);
                    }
                }
            });

    private void camera() {
        binding.camera.setOnClickListener(view -> {
            Intent camera = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            cameralanchuar.launch(camera);
        });
    }

    private void gallery() {
        binding.gallery.setOnClickListener(view -> {
            Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            Gallerylanchuar.launch(gallery);
        });
    }
}

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == pickimage && resultCode == RESULT_OK) {
//            Uri uri = data.getData();
//            binding.img.setImageURI(uri);
//        } else if (requestCode == getimage) {
//            Bitmap b = (Bitmap) data.getExtras().get("data");
//            binding.img.setImageBitmap(b);
//        }
//    }
//}
package com.example.recyclerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class FlowerAdapterClass extends RecyclerView.Adapter<FlowerAdapterClass.myviewholder> {

    ArrayList<FolwerModelClass> folwerModelClasses;
    Context context;
    FlowerInterfaceClass interfaceClass;

    public FlowerAdapterClass(ArrayList<FolwerModelClass> folwerModelClasses, FlowerInterfaceClass interfaceClass ) {
        this.folwerModelClasses = folwerModelClasses;
        this.interfaceClass=interfaceClass;

    }


    @NonNull
    @Override
    public FlowerAdapterClass.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       context= parent.getContext();
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.flowerimages,parent,false);
       myviewholder myviewholder=new myviewholder(view);

        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerAdapterClass.myviewholder holder, int position) {
        holder.imgflower.setImageResource(folwerModelClasses.get(position).getImage());
        holder.txtflowername.setText(folwerModelClasses.get(position).getName());

        holder.layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceClass.clickflower(folwerModelClasses.get(position).getImage(),folwerModelClasses.get(position).getName());

            }
        });

    }

    @Override
    public int getItemCount() {
        return folwerModelClasses.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        ShapeableImageView imgflower;
        TextView txtflowername;
        LinearLayout layout1;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            imgflower = itemView.findViewById(R.id.imgflower);
            txtflowername = itemView.findViewById(R.id.txtflowername);
            layout1=itemView.findViewById(R.id.layout1);
        }
    }
}

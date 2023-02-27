package com.example.recyclerviewapp.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.Interface.ClickListner;
import com.example.recyclerviewapp.ModelClass.DogModelClass;
import com.example.recyclerviewapp.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class DogAdapterClass extends RecyclerView .Adapter<DogAdapterClass.myviewholder> {
    ArrayList<DogModelClass> model;
    Context context;
    ClickListner listner;

    public DogAdapterClass(ArrayList<DogModelClass>model, ClickListner listner){
        this.model=model;
        this.listner=listner;
    }
    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_details,parent,false);
        myviewholder myviewholder=new myviewholder(view);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull DogAdapterClass.myviewholder holder, int position) {
        holder.imgdog1.setImageResource(model.get(position).getDimage());
        holder.txtdogname1.setText(model.get(position).getDname());
        holder.laout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listner.onclick(model.get(position).getDimage(),model.get(position).getDname());
            }
        });



    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        ShapeableImageView imgdog1;
        TextView txtdogname1;
        LinearLayout laout1;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imgdog1=itemView.findViewById(R.id.imgdog1);
            txtdogname1=itemView.findViewById(R.id.txtdogname1);
            laout1=itemView.findViewById(R.id.laout1);

        }
    }
}

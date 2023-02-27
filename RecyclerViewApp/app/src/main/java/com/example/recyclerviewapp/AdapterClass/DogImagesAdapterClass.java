package com.example.recyclerviewapp.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.Interface.DogClick;
import com.example.recyclerviewapp.ModelClass.DogImagesModelClass;
import com.example.recyclerviewapp.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class DogImagesAdapterClass extends RecyclerView.Adapter<DogImagesAdapterClass.MyviewHolder> {
    ArrayList<DogImagesModelClass> images;
    DogClick dclick;
    Context context;

    public DogImagesAdapterClass(ArrayList<DogImagesModelClass> images, DogClick dclick){
        this.images=images;
        this.dclick=dclick;
    }
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_list_,parent,false);
        MyviewHolder myviewHolder=new MyviewHolder(view);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DogImagesAdapterClass.MyviewHolder holder, int position) {

        holder.imgdog.setImageResource(images.get(position).getDogimages());
        holder.txtdogname.setText(images.get(position).getDogname());
        holder.layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dclick.click(images.get(position).getDogimages(),images.get(position).getDogname());
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView imgdog;
        TextView txtdogname;
        LinearLayout layout2;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            imgdog=itemView.findViewById(R.id.imgdog);
            txtdogname=itemView.findViewById(R.id.txtdogname);
            layout2=itemView.findViewById(R.id.layout2);


        }
    }
}

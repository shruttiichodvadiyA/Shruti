package com.example.instagramapp.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramapp.InterfaceClass.StoryInterface;
import com.example.instagramapp.R;
import com.example.instagramapp.ModelClass.StoryModelClass;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapterClass extends RecyclerView.Adapter<StoryAdapterClass.myviewholder> {
    StoryInterface storyInterface;
    ArrayList<StoryModelClass> storylist;



    public StoryAdapterClass(ArrayList<StoryModelClass> storylist, StoryInterface storyInterface) {
        this.storylist = storylist;
        this.storyInterface=storyInterface;
    }

    @NonNull
    @Override
    public StoryAdapterClass.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_view, parent, false);
        myviewholder viewholder = new myviewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapterClass.myviewholder holder, int position) {
        holder.imgstory.setImageResource(storylist.get(position).getImage());
        holder.txtstory.setText(storylist.get(position).getName());

        holder.layoutstory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storyInterface.setstorydata(storylist.get(position).getName(),storylist.get(position).getImage());
            }
        });
    }

    @Override
    public int getItemCount() {
        return storylist.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        CircleImageView imgstory;
        TextView txtstory,textstory;
        LinearLayout layoutstory;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imgstory = itemView.findViewById(R.id.imgstory);
            txtstory = itemView.findViewById(R.id.txtstory);
            textstory = itemView.findViewById(R.id.textstory);
            layoutstory = itemView.findViewById(R.id.layoutstory);

        }
    }
}

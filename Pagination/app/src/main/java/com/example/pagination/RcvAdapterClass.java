package com.example.pagination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RcvAdapterClass extends RecyclerView.Adapter<RcvAdapterClass.myviewholder> {
    ArrayList<String> name;

    public RcvAdapterClass(ArrayList<String> name) {
        this.name=name;

    }

    @NonNull
    @Override
    public RcvAdapterClass.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_itemfile, parent, false);
        myviewholder myviewholder = new myviewholder(view);
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.txt1.setText(name.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView txt1;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            txt1=itemView.findViewById(R.id.txt1);
        }
    }
}

package com.example.recyclerviewapp.AdapterClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewapp.ModelClass.UserModelClass;
import com.example.recyclerviewapp.R;

import java.util.ArrayList;

public class UserAdapterClass extends RecyclerView.Adapter<UserAdapterClass.MyViewHolder> {
    ArrayList<UserModelClass> list;

    public UserAdapterClass(ArrayList<UserModelClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_data, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtid.setText(String.valueOf(list.get(position).getUserid()));
        holder.txtname.setText(list.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtid;
        TextView txtname;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtid = itemView.findViewById(R.id.txtid);
            txtname = itemView.findViewById(R.id.txtname);
        }
    }
}
